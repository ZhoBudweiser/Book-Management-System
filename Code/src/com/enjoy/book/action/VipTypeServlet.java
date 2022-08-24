package com.enjoy.book.action;

import com.enjoy.book.bean.Vip;
import com.enjoy.book.biz.VipBiz;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/viptype.let")
public class VipTypeServlet extends HttpServlet {
    VipBiz vipBiz = new VipBiz();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    /**
     * /type.let?type=add:添加(表单)
     * /type.let?type=modifypre&id=xx 修改预备(req->转发->type_modify.jsp)
     * /type.let?type=modify 修改(表单)
     * /type.let?type=remove&id=xx删除(获取删除的类型编号)
     * /type_list.jsp 查询(所有的类型数据:当项目运行时(监听器)，数据读放到application对象)
     * servlet:
     *  request:同一个请求中传输信息
     *  session:同一个会话(用户)
     *  application:同一个运行项目
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.设置编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //2.获取各种对象
        PrintWriter out = resp.getWriter();
        ServletContext application = req.getServletContext();
        //验证用户是否登录
        HttpSession session = req.getSession();
        if(session.getAttribute("user")==null){
            out.println("<script>alert('请登录');parent.window.location.href='login.html';</script>");
            return;
        }


        //3.根据用户的需求完成业务
        String type = req.getParameter("type");
        switch (type){
            case "add":
                add(req,resp,out,application);
                break;
            case "query":
                List<Vip> vips = vipBiz.getAll();
                application.setAttribute("types",vips);
                req.getRequestDispatcher("type_list.jsp").forward(req,resp);
                break;
            case "modifypre":
                modifyPre(req,resp,out,application);
                break;
            case "modify":
                modify(req,resp,out,application);
                break;
            case "remove":
                remove(req,resp,out,application);
                break;

        }
    }

    /**
     * type_modify.jsp--> type.let?type=modify-->type_list.jsp
     * @param req
     * @param resp
     * @param out
     * @param application
     */
    private void modify(HttpServletRequest req, HttpServletResponse resp,PrintWriter out, ServletContext application) {
      //1.获取表单中的数据(id:hidden,name,parentId)
        String vipName = req.getParameter("name");
        double vipDeposit = Double.parseDouble(req.getParameter("deposit"));
        double vipRentDiscount = Double.parseDouble(req.getParameter("rentDiscount"));
        double vipSellDiscount = Double.parseDouble(req.getParameter("sellDiscount"));
        long vipBorrowNum = Long.parseLong(req.getParameter("borrowNum"));
        long vipRenew = Long.parseLong(req.getParameter("renew"));
        long vipBorrowDate = Long.parseLong(req.getParameter("borrowDate"));
        long vipTime = Long.parseLong(req.getParameter("time"));
        double vipOverdue = Double.parseDouble(req.getParameter("overdue"));
        double vipDamage = Double.parseDouble(req.getParameter("damage"));
        double vipLose = Double.parseDouble(req.getParameter("lose"));

        //2.调用biz的修改方法
        int count = vipBiz.modify(vipName,vipDeposit,vipRentDiscount,vipSellDiscount,vipBorrowNum,vipRenew,vipBorrowDate,
                vipTime,vipOverdue,vipDamage,vipLose);

        //3.更新application
        if(count>0){
            List<Vip> types = vipBiz.getAll();
            application.setAttribute("types",types);
            out.println("<script>alert('修改成功');location.href = 'type_list.jsp';</script>");
        }else{
            out.println("<script>alert('修改失败');location.href = 'type_list.jsp';</script>");
        }

        //4.提示信息

    }

    /**
     * type_list.jsp  -> type.let?type=modifypre&id=xx -转发->type_modify.jsp
     * @param req
     * @param resp
     * @param out
     * @param application
     */
    private void modifyPre(HttpServletRequest req, HttpServletResponse resp,PrintWriter out, ServletContext application) throws ServletException, IOException {
      //1.获取需要修改的type对象的id
      String id = req.getParameter("id");
      //2.根据id获取type对象
      Vip type = vipBiz.getById(id);
      //3.把type存到req中,同一个功能，req,(session,application太大了，不合适)
        req.setAttribute("type",type);
        req.getRequestDispatcher("type_modify.jsp").forward(req,resp);


    }

    /**
     * type_add.jsp --> type.let?type=add -->ok--> type_list.jsp
     *                                       no--> type_add.jsp
     * @param out
     * @param application
     */
    private void add(HttpServletRequest req, HttpServletResponse resp,PrintWriter out, ServletContext application) {
        //1.从表单中获取名字和父类型
//         String typeName = req.getParameter("typeName");
//         long parentId = Long.parseLong(req.getParameter("parentType"));
        String vipName = req.getParameter("name");
        double vipDeposit = Double.parseDouble(req.getParameter("deposit"));
        double vipRentDiscount = Double.parseDouble(req.getParameter("rentDiscount"));
        double vipSellDiscount = Double.parseDouble(req.getParameter("sellDiscount"));
        long vipBorrowNum = Long.parseLong(req.getParameter("borrowNum"));
        long vipRenew = Long.parseLong(req.getParameter("renew"));
        long vipBorrowDate = Long.parseLong(req.getParameter("borrowDate"));
        long vipTime = Long.parseLong(req.getParameter("time"));
        double vipOverdue = Double.parseDouble(req.getParameter("overdue"));
        double vipDamage = Double.parseDouble(req.getParameter("damage"));
        double vipLose = Double.parseDouble(req.getParameter("lose"));
        //2.调用biz的添加方法
        int count =  vipBiz.add(vipName,vipDeposit,vipRentDiscount,vipSellDiscount,vipBorrowNum,vipRenew,vipBorrowDate,
                vipTime,vipOverdue,vipDamage,vipLose);
        //3.更新application中types
        if(count>0){
            List<Vip> vips = vipBiz.getAll();
            application.setAttribute("types",vips);
            out.println("<script>alert('添加成功');location.href = 'type_list.jsp';</script>");
        }else{
            out.println("<script>alert('添加失败');location.href = 'type_add.jsp';</script>");
        }
        //4.提示结果

    }
    private void remove(HttpServletRequest req, HttpServletResponse resp,PrintWriter out, ServletContext application) {
      //1.获取需要删除的id
        String id = req.getParameter("id");

        //2.调用方法,biz异常
        try {
            int count = vipBiz.remove(id);
            if(count>0){
                List<Vip> types = vipBiz.getAll();
                application.setAttribute("types",types);
                out.println("<script>alert('删除成功');location.href = 'type_list.jsp';</script>");
            }else{
                out.println("<script>alert('删除失败');location.href = 'type_list.jsp';</script>");
            }

        } catch (Exception e) {
           // e.printStackTrace();
            out.println("<script>alert('"+e.getMessage()+"');location.href='type_list.jsp';</script>");
        }
        //3.更新application

        //4.提示结果
    }

}
