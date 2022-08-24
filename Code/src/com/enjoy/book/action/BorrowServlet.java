package com.enjoy.book.action;

import com.alibaba.fastjson.JSON;
import com.enjoy.book.bean.Borrow;
import com.enjoy.book.bean.Client;
import com.enjoy.book.bean.User;
import com.enjoy.book.biz.BorrowBiz;
import com.enjoy.book.biz.ClientBiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/borrow.let")
public class BorrowServlet extends HttpServlet {
    BorrowBiz recordBiz = new BorrowBiz();
    ClientBiz memberBiz = new ClientBiz();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    /**
     * /record.let?type=add&mid=1&ids=5_4_9_10 图书借阅
     * /record.let?type=queryback&idn=xx:根据会员的身份证号查询会员信息及借阅信息
     * /record.let?type=back&mid=1&ids_5_4 图书归还
     * /record.let?type=keep&id=x 书籍续借
     * /record.let?type=doajax&typeId=x&keyword=xx ajax查询
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String type = req.getParameter("type");
        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();
        User user = (User)session.getAttribute("user");

        if(user==null){
            out.println("<script>alert('请登录');parent.window.location.href='login.html';</script>");
            return;
        }

        switch(type){
            case "add":
                //1.借阅的会员编号
                String memberId = req.getParameter("mid");
                //2.借阅的书籍编号
                String ids = req.getParameter("ids");
                String []strs= ids.split("_");
                List<String> bookIds = new ArrayList<String>();
                for(String s:strs){
                    bookIds.add(s);
                }
                //4.调用biz
               int count=  recordBiz.add(memberId,bookIds);
               if(count>0){
                   out.println("<script>alert('图书借阅成功');location.href='main.jsp';</script>");
               }else{
                   out.println("<script>alert('图书借阅失败');location.href='main.jsp';</script>");
               }
                break;
            case "queryback":
                //1.获取会员的身份证号
                String idn = req.getParameter("idn");
                //2.获取会员对象和所有的未还的记录
                Client member = memberBiz.getByIdNumber(idn);
                List<Borrow> records = recordBiz.getRecordsByMemberId(member.getClientPhone());
                //3.存request
                req.setAttribute("member",member);
                req.setAttribute("records",records);
                //4.转发
                req.getRequestDispatcher("returnnew_list.jsp").forward(req,resp);
                break;
            case "back":
                //1.会员编号
                String memberId2 = req.getParameter("mid");
                //2.获取记录编号
                String idStr = req.getParameter("ids");
                String []idStrs = idStr.split("_");
                List<String>  recordIds = new ArrayList<String>();
                for(String s:idStrs){
                    recordIds.add(s);
                }
                //3.获取操作的用户编号
                long userId2 = user.getId();
                //4.调用biz
                int count2 = recordBiz.modify(memberId2, recordIds);
//                int count2 = 2;
                //5.归还
                if(count2>0){
                    out.println("<script>alert('归还成功');location.href='main.jsp';</script>");
                }else{
                    out.println("<script>alert('归还失败');location.href='main.jsp';</script>");
                }
                break;
//            case "keep":
//                long recordId = Long.parseLong(req.getParameter("id"));
//                int count3 = recordBiz.modify(recordId);
//                if(count3>0){
//                    out.println("<script>alert('续借成功');location.href='main.jsp';</script>");
//                }else{
//                    out.println("<script>alert('续借失败');location.href='main.jsp';</script>");
//                }
//                break;
            case "doajax":
                 int typeId = Integer.parseInt(req.getParameter("typeId"));
                 //没有输入: keyword: 空串""  null:没有找到 keyword
                 String keyword = req.getParameter("keyword");
                  keyword = keyword.isEmpty()?null:keyword;
                  //获取数据
                  List<Map<String,Object>> rows  = recordBiz.query(typeId,keyword);
                  //转成json
                 out.print(JSON.toJSONString(rows));
                break;
            default:
                resp.sendError(404,"请求的地址不存在");
        }

    }
}
