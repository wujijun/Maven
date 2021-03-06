package controller;


import pojo.Product;
import service.IProductService;
import service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int id =Integer.parseInt(req.getParameter("id"));
            Product p = service.getone(id);
            req.setAttribute("p",p);
            req.getRequestDispatcher("update.jsp").forward(req,resp);
    }
}
