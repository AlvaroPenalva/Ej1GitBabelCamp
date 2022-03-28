package Inicio;

import java.util.ArrayList;
import java.util.List;

import Entidades.Directivo;
import Entidades.Empleado;
import Entidades.Jefe;
import Entidades.Trabajador;

public class Main {
	
	public static void main(String[] args) {
		List<Double> incentivos = new ArrayList<Double>();
		incentivos.add(300.0);
		incentivos.add(60.0);
		incentivos.add(120.0);
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		Empleado emp1 = new Trabajador("Juan", 500.5, -1);
		listaEmpleados.add(emp1);
		empleados.add(emp1);
		
		Empleado emp2 = new Trabajador("Julio", 567.5, 6);
		listaEmpleados.add(emp2);
		empleados.add(emp2);
		
		Empleado emp3 = new Trabajador("Jose", 600.1, 9);
		listaEmpleados.add(emp3);
		
		Empleado emp4 = new Jefe("Alvaro", 1200.8, incentivos);
		listaEmpleados.add(emp4);
		empleados.add(emp4);
		
		Empleado emp5 = new Jefe("Alberto",  1100.6, incentivos);
		listaEmpleados.add(emp5);
		
		Empleado emp6 = new Directivo("Felix", 2000, empleados);
		listaEmpleados.add(emp6);
		
		for(Empleado e: listaEmpleados) {
			System.out.println(e.calcularSueldo() + "\n");
		}
		
	}

}
