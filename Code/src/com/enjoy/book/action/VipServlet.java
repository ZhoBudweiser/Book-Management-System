package com.enjoy.book.action;

import com.alibaba.fastjson.JSON;
import com.enjoy.book.bean.Client;
import com.enjoy.book.bean.Vip;
import com.enjoy.book.biz.ClientBiz;
import com.enjoy.book.biz.RecordBiz;
import com.enjoy.book.biz.VipBiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/vip.let")
public class VipServlet extends HttpServlet {
    VipBiz vipBiz = new VipBiz();
    ClientBiz  clientBiz = new ClientBiz();
    RecordBiz recordBiz = new RecordBiz();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //字符编码
         req.setCharacterEncoding("utf-8");
         resp.setContentType("text/html;charset=utf-8");
        //out
        PrintWriter  out  = resp.getWriter();
        HttpSession session = req.getSession();
        if(session.getAttribute("user")==null){
            out.println("<script>alert('请登录');parent.window.location.href='login.html';</script>");
            return;
        }

        //请求类型
        String type = req.getParameter("type");
        //判断类型
        switch (type){
            case "addpre":
                //获取所有的会员类型
                List<Vip> vips = vipBiz.getAll();
                //存request
                req.setAttribute("Vips",vips);
                //转发
                req.getRequestDispatcher("mem_add.jsp").forward(req,resp);
                break;
            case "add":
                String name =  req.getParameter("name");
                String sex =  req.getParameter("sex");
//                String pwd =  req.getParameter("pwd");
                String vipType = req.getParameter("vipType");
//                double  balance = Double.parseDouble(req.getParameter("balance"));
                String tel =  req.getParameter("tel");
//                String idNumber =  req.getParameter("idNumber");
                int count = clientBiz.add(tel,name,sex,vipType,0.0,"正常",0);
                if(count>0){
                    out.println("<script>alert('会员开卡成功'); location.href='vip.let?type=query';</script>");
                }else{
                    out.println("<script>alert('会员开卡失败'); location.href='vip.let?type=query';</script>");
                }
                break;
            case "modifypre":
                //类型&会员的信息
                String id = req.getParameter("id");
                Client member = clientBiz.getById(id);

                //获取所有的会员类型
                List<Vip> memberTypes2 = vipBiz.getAll();

                req.setAttribute("member",member);
                req.setAttribute("Vips",memberTypes2);

                req.getRequestDispatcher("mem_modify.jsp").forward(req,resp);


                break;
            case "modify":
                String name2 =  req.getParameter("name");
                String sex2 =  req.getParameter("sex");
                String vipType2 = req.getParameter("vipType");
                String tel2 =  req.getParameter("tel");
                Client client = clientBiz.getById(tel2);
                Vip vip = vipBiz.getById(vipType2);
                if (client.getClientBorrowNum() > vip.getVipBorrowNum()) {
                    out.println("<script>alert('当前借阅超过会员借阅上限！'); location.href='vip.let?type=query';</script>");
                } else {
                    int count3 = clientBiz.modify(tel2,name2,sex2,vipType2);
                    if(count3>0){
                        out.println("<script>alert('会员修改成功'); location.href='vip.let?type=query';</script>");
                    }else{
                        out.println("<script>alert('会员修改失败'); location.href='vip.let?type=query';</script>");
                    }
                }
                break;
            case "remove":
                 String memId = req.getParameter("id");
                try {
                    int count2 = clientBiz.remove(memId);
                    if(count2>0){
                        out.println("<script>alert('会员注销成功'); location.href='vip.let?type=query';</script>");
                    }else{
                        out.println("<script>alert('会员注销失败'); location.href='vip.let?type=query';</script>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    out.println("<script>alert('"+e.getMessage()+"'); location.href='vip.let?type=query';</script>");
                }
                break;
            case "activate":
                String memId2 = req.getParameter("id");
                try {
                    int count2 = clientBiz.activate(memId2);
                    if(count2>0){
                        out.println("<script>alert('会员激活成功'); location.href='vip.let?type=query';</script>");
                    }else{
                        out.println("<script>alert('会员激活失败'); location.href='vip.let?type=query';</script>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    out.println("<script>alert('"+e.getMessage()+"'); location.href='vip.let?type=query';</script>");
                }
                break;
            case "query":
                List<Client> clientList = clientBiz.getAll();
                req.setAttribute("clientList",clientList);
                req.getRequestDispatcher("mem_list.jsp").forward(req,resp);
                break;
            case "modifyrecharge":
                //获取手机号和金额
                String idNumber3 = req.getParameter("idNumber");
                double amount = Double.parseDouble(req.getParameter("amount"));
                Client client2 = clientBiz.getById(idNumber3);
                if (client2 == null) {
                    out.println("<script>alert('查无此人，操作失败！'); location.href='vip.let?type=query';</script>");
                } else if (amount < 0 && client2.getClientBalance() < -amount) {
                    out.println("<script>alert('超出余额，操作失败！'); location.href='vip.let?type=query';</script>");
                } else {
                    int count4 = clientBiz.modifyBalance(idNumber3,amount);
                    if(count4>0){
                        out.println("<script>alert('操作成功'); location.href='vip.let?type=query';</script>");
                    }else{
                        out.println("<script>alert('操作失败'); location.href='vip.let?type=query';</script>");
                    }
                }
                break;
            case "doajax":
                //1.获取手机
                String idNum = req.getParameter("idn");
                //2.获取 member对象
                Client member1 = clientBiz.getByIdNumber(idNum);
                if (null != member1) {
                    Vip vip2 = vipBiz.getById(member1.getClientGrade());
                    member1.setClientVip(vip2);
                    //2.2 修改member借书数量
                    {
                        long size = vip2.getVipBorrowNum()-member1.getClientBorrowNum();
                        member1.setClientBorrowNum(size);
                    }
                }

                //3. member1 --> json字符串
                String memberJson = JSON.toJSONString(member1);
                //4.响应客户端 注意：out.打印不能换行*****
                out.print(memberJson);
                break;
            default:
                resp.sendError(404,"请求的地址不存在");
        }

    }
}
