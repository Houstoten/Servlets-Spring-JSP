package com.servlets;

import com.entities.Pizza;
import com.model.Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().println("New pizza added SUCCESSFULLY!");
        req.getRequestDispatcher("links/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model.getInstance().add(new Pizza(req.getParameter("name"), req.getParameter("count")));
        req.setAttribute("PizzaName", Model.getInstance().getLast().getName());
        req.setAttribute("PizzaCount", Model.getInstance().listout().get(Model.getInstance().getLast().getName()));
        doGet(req,resp);
    }
}
