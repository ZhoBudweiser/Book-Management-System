package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.Vip;
import cn.edu.hfut.service.ClientService;
import cn.edu.hfut.service.VipService;
import cn.edu.hfut.service.impl.ClientServiceImpl;
import cn.edu.hfut.service.impl.VipServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/vip/*")
public class VipServlet extends BaseServlet {

    private VipService vipService = new VipServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Vip> vips = vipService.selectAll();
        String jsonString = JSON.toJSONString(vips);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

}
