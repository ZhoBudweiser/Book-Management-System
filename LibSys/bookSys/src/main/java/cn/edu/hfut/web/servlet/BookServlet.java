package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Book;
import cn.edu.hfut.model.VBorrowBook;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.BookService;
import cn.edu.hfut.service.impl.BookServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/book/*")
public class BookServlet extends BaseServlet {

    private BookService bookService = new BookServiceImpl();

    public void selectByBookIsbn(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        String isbn = JSON.parseObject(params, String.class);
        VBorrowBook book = bookService.selectByBookIsdn(isbn);
        String jsonString = JSON.toJSONString(book);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
