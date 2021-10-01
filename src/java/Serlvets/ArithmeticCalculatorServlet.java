package Serlvets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "--");
        request.setAttribute("firstInput", "");
        request.setAttribute("secondInput", "");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String button_value = request.getParameter("calculation_btn");
        String first_number = request.getParameter("first_input");
        String second_number = request.getParameter("second_input");

        int result = 0;
        request.setAttribute("firstInput", first_number);
        request.setAttribute("secondInput", second_number);

        try {
            int first_number_in_Integer = Integer.parseInt(first_number);
            int second_number_in_Integer = Integer.parseInt(second_number);
            if (button_value.equals("+")) {
                result = first_number_in_Integer + second_number_in_Integer;
            } else if (button_value.equals("-")) {
                result = first_number_in_Integer - second_number_in_Integer;

            } else if (button_value.equals("*")) {
                result = first_number_in_Integer * second_number_in_Integer;

            } else if (button_value.equals("%")) {
                result = first_number_in_Integer % second_number_in_Integer;

            }
            request.setAttribute("message", result);

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;

        } catch (Exception e) {
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

    }

}
