package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Usuario usuarios[] = {
    		new Usuario("alvaro", "yo"),
    		new Usuario("Felix", "jefe"),
    		new Usuario("tonto", "tonto")
    };
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entramos al servlet");
		String nombre = request.getParameter("usuario");
		String password = request.getParameter("password");
		boolean logged = false;
		for(Usuario user: usuarios) {
			if(user.getNombre().equals(nombre)) {
				if(user.getPassword().equals(password)) {
					RequestDispatcher rd = request.getRequestDispatcher("formularioLogin.jsp");
					request.setAttribute("nombre", nombre);
					rd.forward(request, response);
					logged = true;
					break;
				}
			}
		} if(!logged) {
			RequestDispatcher rd = request.getRequestDispatcher("error.html");
			rd.forward(request, response);
		}
		
	}

}
