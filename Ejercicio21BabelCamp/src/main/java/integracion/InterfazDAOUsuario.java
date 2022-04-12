package integracion;

import entidades.Usuario;

public interface InterfazDAOUsuario {
	
	public boolean initConnection();
	public boolean cerrarConexion();
	public int verifyUsuario(Usuario user);

}
