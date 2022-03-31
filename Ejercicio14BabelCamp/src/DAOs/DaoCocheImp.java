package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAOs.interfaces.DaoCoche;
import modelo.Entidad.Coche;

public class DaoCocheImp implements DaoCoche {
	private Connection con;

	public boolean initConnection() {
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

	public int create(Coche coche) {

		if (initConnection()) {

			String query = "insert into coches (matricula, marca, modelo, kilometros) values (?, ?, ?, ?)";

			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, coche.getMatricula());
				ps.setString(2, coche.getMarca());
				ps.setString(3, coche.getModelo());
				ps.setDouble(4, coche.getKilometros());
				int row = ps.executeUpdate();
				if (row != 1) {
					return 2;
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return 2;
			}
			if (!cerrarConexion())
				return 1;

			return 0;

		} else
			return 1;

	}

	public int delete(int id) {

		if (initConnection()) {

			String query = "delete from coches where id = ?";

			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, id);
				int row = ps.executeUpdate();
				if (row != 1) {
					return 3;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return 2;
			}
			if (!cerrarConexion())
				return 1;

			return 0;
		} else
			return 1;

	}

	public int update(Coche coche) {
		String query = "update coches set matricula = ?, marca = ?, modelo = ?, kilometros = ? where id = ?";

		if (initConnection()) {
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, coche.getMatricula());
				ps.setString(2, coche.getMarca());
				ps.setString(3, coche.getModelo());
				ps.setDouble(4, coche.getKilometros());
				ps.setInt(5, coche.getId());
				int row = ps.executeUpdate();
				if (row != 1) {
					return 3;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			if (!cerrarConexion())
				return 1;
			return 0;
		} else
			return 1;

	}

	public Coche read(int id) {

		if (initConnection()) {
			String query = "select * from coches where id = ?";
			Coche coche = null;
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					coche = new Coche(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
					coche.setId(rs.getInt(1));
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return null;
			}

			return coche;
		} else
			return null;
	}

	public Coche readMat(String matricula) {
		if (initConnection()) {
			String query = "select * from coches where matricula LIKE ?";
			Coche coche = null;
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, matricula);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					coche = new Coche(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
					coche.setId(rs.getInt(1));
				}

			} catch (Exception  e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return null;
			}

			return coche;
		} else
			return null;
	}

	public List<Coche> readMarca(String marca) {
		if (initConnection()) {
			String query = "Select * from coches where marca LIKE ?";
			Coche coche = null;
			List<Coche> lista = new ArrayList<Coche>();
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, marca);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					coche = new Coche(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
					coche.setId(rs.getInt(1));
					lista.add(coche);
				}

			} catch (Exception  e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return null;
			}

			return lista;
		} else
			return null;
	}

	public List<Coche> readModelo(String modelo) {
		if (initConnection()) {
			String query = "select * from coches where modelo LIKE ?";
			Coche coche = null;
			List<Coche> lista = new ArrayList<Coche>();
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, modelo);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					coche = new Coche(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
					coche.setId(rs.getInt(1));
					lista.add(coche);
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return null;
			}

			return lista;
		} else
			return null;
	}

	public List<Coche> listCoches() {
		if (initConnection()) {
			String query = "select * from coches";
			Coche coche = null;
			List<Coche> lista = new ArrayList<Coche>();
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					coche = new Coche(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
					coche.setId(rs.getInt(1));
					lista.add(coche);
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return null;
			}

			return lista;
		} else
			return null;
	}

}
