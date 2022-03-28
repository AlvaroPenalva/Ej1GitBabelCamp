package Entidades;

import java.util.List;

public class Jefe extends Empleado{

	private List<Double> incentivos;
	
	public Jefe(String nombre, double sueldoBase){
		super(nombre, sueldoBase);
	}
	
	public Jefe(String nombre, double sueldoBase, List<Double> incentivos){
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.incentivos = incentivos;
	}
	
	/**Este metodo recibe un nuevo incentivo y lo aniade a la lista actual
	 * para controlar los datos que recibe, solo se aniadira un incentivo si su valor
	 * es mayor que 0.
	 * @param incentivo - un double que se aniadira a la lista de incentivos
	 */
	public void aniadirIncentivo(double incentivo) {
		if(incentivo > 0) this.incentivos.add(incentivo);
	}
	
	/**Este metodo calcula el sueldo final de un jefe en base a su sueldo base mas incentivos.
	 * Sobrecarga el metodo de la clase empleado. 
	 * @return double - El sueldo final del jefe.
	 */
	@Override
	public double calcularSueldo() {
		double sueldoFinal = this.sueldoBase;
		for(double i: this.incentivos) {
			sueldoFinal += i;
		}
		return sueldoFinal;
	}
	
	
	

}
