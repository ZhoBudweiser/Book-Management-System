package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Book;
import cn.edu.hfut.service.BookService;
import cn.edu.hfut.service.BorrowService;
import cn.edu.hfut.service.impl.BookServiceImpl;
import cn.edu.hfut.service.impl.BorrowServiceImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/borrow/*")
public class BorrowServlet extends BaseServlet {

    private BorrowService borrowService = new BorrowServiceImpl();

    public void insertByBookIds(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        JSONObject object = JSONObject.parseObject(params);

        borrowService.insertByBookIdsAndDate(
                object.getLong("clientId"),
                JSONObject.parseArray(object.getJSONArray("bookIds").toJSONString(), Long.class),
                object.getDate("dueDate")
        );

        resp.getWriter().write("success");
    }
}
