package Serlvets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = (String) request.getParameter("age_input");

        if (age.trim().isEmpty()) {

            request.setAttribute("message", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        } else {
            try {
                int age_check = Integer.parseInt(age);
                request.setAttribute("message", ("Your age next birthday will be " + (age_check + 1)));
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;

            } catch (NumberFormatException e) {
                request.setAttribute("message", "You must enter a number");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }

        }

    }

}
