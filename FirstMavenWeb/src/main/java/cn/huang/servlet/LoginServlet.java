package cn.huang.servlet;

import cn.huang.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Huangshen
 * @Date: 2020-01-03
 * @Description: ${PACKAGE_NAME}
 * @Version: 1.0
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    private User user;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user = new User();
        user.setUsername(username);
        user.setPassword(password);
        request.setAttribute("user", user);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
