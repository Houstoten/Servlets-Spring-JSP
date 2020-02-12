package com.servlets;

import com.model.Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EatOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().println("Already eaten out. THANKS!");
        req.setAttribute("PizzaNames", Model.getInstance().listout());
        req.getRequestDispatcher("links/eatout.jsp").forward(req, resp);
    }

}
