package ej1Git;

public class Resta {
	private static int acumulado = 0;
	public static int restaAyB(int a, int b) {
		return a - b;
	}
	public static int restaAcumulada(int num) {
		acumulado -= num;
		return acumulado;
	}
}
