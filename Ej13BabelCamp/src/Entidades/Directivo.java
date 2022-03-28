package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado{
	private List<Empleado> listaEmpleados;
	
	public Directivo(String nombre, double sueldoBase) {
		super(nombre, sueldoBase);
	}
	
	public Directivo(String nombre, double salarioBase, List<Empleado> listaEmpleados) {
		this.nombre = nombre;
		this.sueldoBase = salarioBase;
		this.listaEmpleados = listaEmpleados;
	}
	
	public void aniadirEmpleado(Empleado emp) {
		this.listaEmpleados.add(emp);
	}
	
	/**
	 * Este metodo calcula el sueldo total de un directivo que es la suma de su sueldo base
	 * mas el numero de empleados que tiene a su cargo por 100, cada empleado.
	 * @return double - Devuelve un double que es el sueldo total del directivo.
	 */
	@Override
	public double calcularSueldo() {
		return this.sueldoBase + (listaEmpleados.size() * 100);
		}

}
