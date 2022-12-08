package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Author;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.AuthorService;
import cn.edu.hfut.service.VipService;
import cn.edu.hfut.service.impl.AuthorServiceImpl;
import cn.edu.hfut.service.impl.VipServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/author/*")
public class AuthorServlet extends BaseServlet {

    private AuthorService authorService = new AuthorServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Author> authors = authorService.selectAll();
        String jsonString = JSON.toJSONString(authors);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

}
