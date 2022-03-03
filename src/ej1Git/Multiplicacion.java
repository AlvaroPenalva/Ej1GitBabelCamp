package ej1Git;

public class Multiplicacion {
	//tiene que ser distinto a 0 para que no falle
	private static int acumulado = 1;
	public static int multiplicaAyB(int a, int b) {
		return a * b;
	}
	public static int multiplicacionAcumulada(int num) {
		acumulado *= num;
		return acumulado;
	}
}
