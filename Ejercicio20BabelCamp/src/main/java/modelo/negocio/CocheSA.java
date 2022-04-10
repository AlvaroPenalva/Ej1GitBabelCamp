package modelo.negocio;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import DAOs.DaoCocheImp;
import DAOs.interfaces.DaoCoche;
import modelo.Entidad.Coche;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
	
	/***
	 * HE generado este metodo para probarlo en el test Junit puesto que el de arriba
	 * retorna un string para imprimir por pantalla y este retornara l coche en si.
	 * @param id
	 * @return class coche
	 */
	
	public Coche getCocheID(int id) {
		Coche coche;
		coche = daoCoche.read(id);
		return coche;
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

	public void cochesToJSON() {
		List<Coche> coche;
		coche = daoCoche.listCoches();
		Gson gson = new Gson();
		String path = "src/main/resources/coches.json";
		String json = "";
		for (Coche car : coche) {
			json += gson.toJson(car) + ",\n";
		}
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
			out.write(json);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//
	public void cochesToExcel() {
		
		List<Coche> coches;
		coches = daoCoche.listCoches();
		Coche coche = null;
		XSSFWorkbook cuaderno = null;
		try {
			//Creamos el cuaderno y la hoja
			cuaderno = new XSSFWorkbook();
			cuaderno.createSheet("Cochecillos");
			XSSFSheet hoja = cuaderno.getSheetAt(0);
			XSSFCell celda = null;
			
			//En este bucle creamos filas en la hoja y las rellenamos con los datos del coche
			for(int i = 1; i <= coches.size(); ++i) {
				coche = coches.get(i - 1);
				hoja.createRow(i);
				celda = hoja.getRow(i).createCell(0);
				celda.setCellValue(coche.getId());
				celda = hoja.getRow(i).createCell(1);
				celda.setCellValue(coche.getMatricula());
				celda = hoja.getRow(i).createCell(2);
				celda.setCellValue(coche.getMarca());
				celda = hoja.getRow(i).createCell(3);
				celda.setCellValue(coche.getModelo());
				celda = hoja.getRow(i).createCell(4);
				celda.setCellValue(coche.getKilometros());
			}
			
			FileOutputStream fos = new FileOutputStream("src/main/resources/Coches.xlsx");
			cuaderno.write(fos);
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
