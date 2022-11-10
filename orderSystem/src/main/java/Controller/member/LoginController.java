package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.member.implMember;
import Model.member;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get username password
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//check
		if(new implMember().queryMember(username, password) != null)
		{
			//pass value
			member m = new implMember().queryMember(username, password);
			HttpSession session = request.getSession();
			session.setAttribute("M", m);
			response.sendRedirect("member/loginSuccess.jsp");
		}
		else
		{
			response.sendRedirect("member/loginError.jsp");
		}
	}

}
