package ej1Git;
public class Suma {
	private static int acumulado = 0;
	public static int sumaAyB(int a, int b) {
		return a + b;
	}
	public static int sumaAcumulada(int num) {
		acumulado += num;
		return acumulado;
	}
}
