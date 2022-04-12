package negocio;

import org.json.JSONObject;

import entidades.Usuario;
import integracion.DAOUSuario;
import integracion.InterfazDAOUsuario;

public class UsuarioSA {

	public JSONObject verificarUsuario(Usuario user) {
		boolean verificado = false;
		JSONObject jobj = new JSONObject();
		InterfazDAOUsuario daoU = new DAOUSuario();

		switch (daoU.verifyUsuario(user)) {
		case 0:
			System.out.println("Usuario verfificado");
			verificado = true;
		case 1:
			System.out.println("No existe un usuario con esa contrasenia");
			break;
		case 2:
			System.out.println("No existe ese usuario");
			break;
		case 3:
			System.out.println("Error en la query");
			break;
		case 4:
			System.out.println("Error de conexion a la bbdd");
			break;
		}

		jobj.put("validado", verificado);
		return jobj;
	}

}
