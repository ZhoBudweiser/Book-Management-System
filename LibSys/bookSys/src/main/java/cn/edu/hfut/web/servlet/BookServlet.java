package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Book;
import cn.edu.hfut.model.Client;
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
import java.util.List;

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

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = bookService.selectAll();
        String jsonString = JSON.toJSONString(books);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Book book = JSON.parseObject(params, Book.class);

        bookService.add(book);

        resp.getWriter().write("success");
    }

    public void selectByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Long id = JSON.parseObject(params, Long.class);
        Book book = bookService.selectByPrimaryKey(id);
        String jsonString = JSON.toJSONString(book);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void updateByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Book book = JSON.parseObject(params, Book.class);
        bookService.updateByPrimaryKeySelective(book);

        resp.getWriter().write("success");
    }
}
