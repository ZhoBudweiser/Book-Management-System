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

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Vip vip = JSON.parseObject(params, Vip.class);

        vipService.add(vip);

        resp.getWriter().write("success");
    }

    public void selectByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Long id = JSON.parseObject(params, Long.class);
        Vip vip = vipService.selectByPrimaryKey(id);
        String jsonString = JSON.toJSONString(vip);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void updateByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Vip vip = JSON.parseObject(params, Vip.class);
        vipService.updateByPrimaryKeySelective(vip);

        resp.getWriter().write("success");
    }

    public void deleteByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Long id = JSON.parseObject(params, Long.class);
        vipService.deleteByPrimaryKey(id);

        resp.getWriter().write("success");
    }
}
