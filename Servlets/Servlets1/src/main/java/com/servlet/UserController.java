package com.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.user.User;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Simple CRUD service for User class returns JSON objects
@WebServlet(name = "UserServlet", value = "/user/*")
public class UserController extends HttpServlet {

    private static final List<User> users = new ArrayList<>();

    //    user/ {POST METHOD}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String input = IOUtils.toString(req.getInputStream(), "UTF-8");
        User temp = mapper.readValue(input, User.class);
        users.add(temp);
        resp.getWriter().print("{ \"id\" : \"" + users.indexOf(temp) + "\" }");
    }

    //    user?id={index}   {GET METHOD}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        int index = Integer.parseInt(req.getParameter("id"));
        User temp = users.get(index);
        resp.getWriter().println(mapper.writeValueAsString(temp));
    }

    //    user?id={index}   {DELETE METHOD}
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int index = Integer.parseInt(req.getParameter("id"));
        users.remove(index);
    }

    //    user?id={index}
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String input = IOUtils.toString(req.getInputStream(), "UTF-8");
        ObjectNode node = mapper.readValue(input, ObjectNode.class);
        User temp = users.get(Integer.parseInt(req.getParameter("id")));
        temp.setName(node.get("name").asText());
        temp.setSurname(node.get("surname").asText());
        temp.setProfession(node.get("profession").asText());
        resp.getWriter().print("{ \"id\" : \"" + users.indexOf(temp) + "\" }");
    }
}
