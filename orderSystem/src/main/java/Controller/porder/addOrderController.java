package Controller.porder;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.porder.implPorder;
import Model.porder;

public class addOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set Char
		request.setCharacterEncoding("BIG5");
		//get session
		HttpSession session = request.getSession();
		//add order
		porder p = (porder)session.getAttribute("P");
		new implPorder().add(p);
		
		response.sendRedirect("porder/finish.jsp");
	}

}
