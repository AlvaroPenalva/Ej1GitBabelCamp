package ej1Git;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sol, num;
		System.out.println("Escriba dos números y pulse enter: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sol = Suma.sumaAyB(a, b);
		System.out.println("Resultado: " + sol);
		System.out.println("Inserte números para acumular, el 0 detiene la suma:");
		do {
			num = sc.nextInt();
			sol = Suma.sumaAcumulada(num);
		}while(num != 0);
		System.out.println("El número acumulado es: " + sol);
	}
	
}
