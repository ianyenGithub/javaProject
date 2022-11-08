package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.member.implMember;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get username password
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//check
		if(new implMember().queryMamber(username, password) != null)
		{
			response.sendRedirect("member/loginSuccess.jsp");
		}
		else
		{
			response.sendRedirect("member/loginError.jsp");
		}
	}

}
