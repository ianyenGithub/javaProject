package Controller.porder;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porder.implPorder;
import Model.porder;

public class updateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public updateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set Char
		request.setCharacterEncoding("BIG5");
		//get data
		String desk = request.getParameter("desk");
		Integer A = Integer.parseInt(request.getParameter("A"));
		Integer B = Integer.parseInt(request.getParameter("B"));
		Integer C = Integer.parseInt(request.getParameter("C"));
		Integer id = Integer.parseInt(request.getParameter("id"));
		//get id porder
		porder p = new implPorder().queryPorder(id);
		p.setDesk(desk);
		p.setA(A);
		p.setB(B);
		p.setC(C);
		p.getSum();//recalculate sum
		
		new implPorder().update(p);
		
		response.sendRedirect("porder/update.jsp");
		
	}

}
