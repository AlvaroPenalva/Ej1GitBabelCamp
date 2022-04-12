package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import entidades.Usuario;
import integracion.DAOUSuario;
import negocio.UsuarioSA;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/JSON");
		response.setCharacterEncoding("UTF-8");
		response.addHeader("Access-Control-Allow-Origin", "*");
		String user = request.getParameter("user");
		String password = request.getParameter("password");

		Usuario usuario = new Usuario(user, password);
		UsuarioSA usa = new UsuarioSA();
		JSONObject respuesta = usa.verificarUsuario(usuario);
		
		response.getWriter().write(respuesta.toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/JSON");
		response.setCharacterEncoding("UTF-8");
		response.addHeader("Access-Control-Allow-Origin", "*");
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		Usuario usuario = new Usuario(user, password);
		UsuarioSA usa = new UsuarioSA();
		JSONObject respuesta = usa.verificarUsuario(usuario);
		response.getWriter().write(respuesta.toString());
	}

}
