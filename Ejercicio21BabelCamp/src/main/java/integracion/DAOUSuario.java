package integracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entidades.Usuario;
public class DAOUSuario implements InterfazDAOUsuario{

	private Connection con;

	public boolean initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/mia";
		String user = "root";
		String password = "";
		try {
			this.con = DriverManager.getConnection(url, user, password);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}

	}

	public boolean cerrarConexion() {
		try {
			con.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}

	public int verifyUsuario(Usuario user) {
		if (initConnection()) {
			String query = "select * from usuarios where name = ?";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, user.getName());
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					query = "select * from usuarios where name = ? AND password = ?";
					ps = con.prepareStatement(query);
					ps.setString(1, user.getName());
					ps.setString(2, user.getPassword());
					rs = ps.executeQuery();
					if (rs.next()) return 0;
					else return 1;
				} else return 2;

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return 3;
			}
		} else
			return 4;

	}

}
