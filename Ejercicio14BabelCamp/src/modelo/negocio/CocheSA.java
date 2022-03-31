package modelo.negocio;

import java.util.List;

import DAOs.DaoCocheImp;
import DAOs.interfaces.DaoCoche;
import modelo.Entidad.Coche;

public class CocheSA {

	private DaoCoche daoCoche = new DaoCocheImp();

	public String altaCoche(String matricula, String marca, String modelo, double kilometros) {

		if (matricula.length() == 7) {
			Coche coche = new Coche(matricula, marca, modelo, kilometros);

			switch (daoCoche.create(coche)) {
			case 0:
				return "Coche dado de alta con matricula: " + coche.getMatricula();
			case 1:
				return "Error en la conexion a bbdd";
			case 2:
				return "\n Error en el alta del coche \n";
			default:
				return "";
			}
		} else
			return "La matricula debe ser de 7 caracteres";

	}

	public String bajaCoche(int id) {
		switch (daoCoche.delete(id)) {
		case 0:
			return "Coche dado de baja con id: " + id;
		case 1:
			return "Error en la conexion a bbdd";
		case 2:
			return "Error en el alta del coche";
		case 3:
			return "No existe el coche con id: " + id;
		default:
			return "";
		}
	}

	public String modificarCoche(int id, String matricula, String marca, String modelo, double kilometros) {
		if (matricula.length() == 7) {
			Coche coche = new Coche(matricula, marca, modelo, kilometros);
			coche.setId(id);

			switch (daoCoche.update(coche)) {
			case 0:
				return "Coche modificado con id: " + id;
			case 1:
				return "Error en la conexion a bbdd";
			case 2:
				return "Error en el alta del coche";
			case 3:
				return "No existe el coche con id: " + id;
			default:
				return "";
			}
		} else
			return "La matricula debe ser de 7 caracteres";
	}

	public String buscarCocheID(int id) {
		Coche coche;
		coche = daoCoche.read(id);
		if (coche != null) {
			return coche.toString();
		} else
			return "No se pudo encontrar el coche con id: " + id;
	}

	public String buscarCocheMatricula(String matricula) {
		Coche coche;
		coche = daoCoche.readMat(matricula);
		if (coche != null) {
			return coche.toString();
		} else
			return "No se pudo encontrar el coche con matricula: " + matricula;
	}

	public String buscarCochesMarca(String marca) {
		List<Coche> coche;
		coche = daoCoche.readMarca(marca);
		String listado = "";
		if (coche.size() > 0) {
			for (Coche c : coche)
				listado += c.toString();
			return listado;
		} else
			return "No se encontro ningun coche de esta marca: " + marca;
	}
	
	public String buscarCochesModelo(String modelo) {
		List<Coche> coche;
		coche = daoCoche.readModelo(modelo);
		String listado = "";
		if (coche.size() > 0) {
			for (Coche c : coche)
				listado += c.toString();
			return listado;
		} else
			return "No se encontro ningun coche de esta modelo: " + modelo;
	}
	
	public String listarCoches() {
		List<Coche> coche;
		coche = daoCoche.listCoches();
		String listado = "";
		if (coche.size() > 0) {
			for (Coche c : coche)
				listado += c.toString();
			return listado;
		} else
			return "No se encontro ningun coche en la base de datos";
	}

}
