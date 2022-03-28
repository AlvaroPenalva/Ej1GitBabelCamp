package Entidades;

public class Trabajador extends Empleado{
	
	private int valoracion;
	
	public Trabajador(String nombre, double sueldoBase, int valoracion) {
		super(nombre, sueldoBase);
		setValoracion(valoracion);
	}

	public int getValoracion() {
		return valoracion;
	}

	/**Se hace un set de la valoracion del empleado
	 * @param valoracion - la nueva valoracion del empleado
	 * En caso de que esta sea mayor que 10 se filtrara para que se mantenga en 10 como maximo.
	 * Si por el contrario esta es menor que 0 se establecera en 0 al ser este el minimo.
	 * @return void
	 */
	public void setValoracion(int valoracion) {
		if(valoracion < 0) this.valoracion = 0;
		else if(valoracion > 10) this.valoracion = 10;
		else this.valoracion = valoracion;		
	}

	/**Este metodo calcula el sueldo de un trabajador en base a su valoracion con extras para el sueldo
	 * Al estar filtrada la valoracion solo tenemos en cuenta los casos superiores a 4 para aniadir
	 * un extra, en caso contrario retornara el sueldo base.
	 * @return devuelve un double que es el sueldo final del trabajador
	 */
	@Override
	public double calcularSueldo() {
		
		if(this.valoracion == 5 || this.valoracion == 6) return this.sueldoBase + 50;
		if(this.valoracion == 7 || this.valoracion == 8) return this.sueldoBase + 100;
		if(this.valoracion >= 9) return this.sueldoBase + 200;
		return this.sueldoBase;
	}

}
