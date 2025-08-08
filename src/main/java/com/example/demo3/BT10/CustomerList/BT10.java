package com.example.demo3.BT10.CustomerList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="BT10",value = "/BT10-Customer")
public class BT10 extends HttpServlet {
    private ListCustomer customers = new ListCustomer();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customers.getCustomers();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("BT10/BT10.jsp").forward(request, response);
    }
}
