package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Publisher;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.PublisherService;
import cn.edu.hfut.service.VipService;
import cn.edu.hfut.service.impl.PublisherServiceImpl;
import cn.edu.hfut.service.impl.VipServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/publisher/*")
public class PublisherServlet extends BaseServlet {

    private PublisherService publisherService = new PublisherServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Publisher> publishers = publisherService.selectAll();
        String jsonString = JSON.toJSONString(publishers);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

}
