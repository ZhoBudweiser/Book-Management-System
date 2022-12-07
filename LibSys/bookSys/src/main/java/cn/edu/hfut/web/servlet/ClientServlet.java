package cn.edu.hfut.web.servlet;

import cn.edu.hfut.model.Client;
import cn.edu.hfut.service.ClientService;
import cn.edu.hfut.service.impl.ClientServiceImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/client/*")
public class ClientServlet extends BaseServlet {

    private ClientService clientService = new ClientServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Client> clients = clientService.selectAll();
        String jsonString = JSON.toJSONString(clients, SerializerFeature.DisableCircularReferenceDetect);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Client client = JSON.parseObject(params, Client.class);

        clientService.add(client);

        resp.getWriter().write("success");
    }

    public void selectByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Long id = JSON.parseObject(params, Long.class);
        Client client = clientService.selectByPrimaryKey(id);
        String jsonString = JSON.toJSONString(client);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void updateByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Client client = JSON.parseObject(params, Client.class);
        clientService.updateByPrimaryKeySelective(client);

        resp.getWriter().write("success");
    }

    public void logoutByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Long id = JSON.parseObject(params, Long.class);
        clientService.logoutByPrimaryKey(id);

        resp.getWriter().write("success");
    }

    public void activateByPrimaryKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String params = br.readLine();

        Long id = JSON.parseObject(params, Long.class);
        clientService.activateByPrimaryKey(id);

        resp.getWriter().write("success");
    }

}
