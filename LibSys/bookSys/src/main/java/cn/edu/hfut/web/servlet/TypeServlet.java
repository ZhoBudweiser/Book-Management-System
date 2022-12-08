package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Author;
import cn.edu.hfut.model.Type;
import cn.edu.hfut.service.AuthorService;
import cn.edu.hfut.service.TypeService;
import cn.edu.hfut.service.impl.AuthorServiceImpl;
import cn.edu.hfut.service.impl.TypeServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/type/*")
public class TypeServlet extends BaseServlet {

    private TypeService typeService = new TypeServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Type> types = typeService.selectAll();
        String jsonString = JSON.toJSONString(types);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

}
