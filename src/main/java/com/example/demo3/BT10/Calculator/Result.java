package com.example.demo3.BT10.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="BT10-Result",value = "/BT10-Result")
public class Result extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(request.getParameter("num1"));
        double secondOperand = Double.parseDouble(request.getParameter("num2"));
        String operator = request.getParameter("op");

        double result = 0;
        String symbol = "";

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                symbol = "+";
                break;
            case "-":
                result = firstOperand - secondOperand;
                symbol = "-";
                break;
            case "*":
                result = firstOperand * secondOperand;
                symbol = "*";
                break;
            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    request.setAttribute("error", "Cannot divide by zero");
                    request.getRequestDispatcher("BT10/Calculator/result.jsp").forward(request, response);
                    return;
                }
                symbol = "/";
                break;
        }

        request.setAttribute("num1", firstOperand);
        request.setAttribute("num2", secondOperand);
        request.setAttribute("symbol", symbol);
        request.setAttribute("result", result);

        request.getRequestDispatcher("BT10/Calculator/result.jsp").forward(request, response);
    }
}
