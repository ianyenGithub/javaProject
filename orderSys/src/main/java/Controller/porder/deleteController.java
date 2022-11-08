package Controller.porder;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porder.implPorder;

public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public deleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = null;
		try 
		{
			id = Integer.parseInt(request.getParameter("id"));
			System.out.println("The number is an integer ");
		}catch(NumberFormatException ex) {
			System.out.println("The number is not an integer ");
		}
				
		//delete id porder
		if(id != null && new implPorder().queryPorder(id) != null)
		{
			new implPorder().delete(id);
		}
		response.sendRedirect("porder/delete.jsp");
	}

}
