package ej1Git;

public class Multiplicacion {
	private static int acumulado = 0;
	public static int multiplicaAyB(int a, int b) {
		return a * b;
	}
	public static int multiplicacionAcumulada(int num) {
		acumulado *= num;
		return acumulado;
	}
}
