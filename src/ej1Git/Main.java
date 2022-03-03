package ej1Git;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sol, num;
		
		//Codigo para probar Suma
		System.out.println("Escriba dos numeros para sumar y pulse enter: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sol = Suma.sumaAyB(a, b);
		System.out.println("Resultado: " + sol);
		System.out.println("Inserte numeros para acumular, el 0 detiene la suma:");
		do {
			num = sc.nextInt();
			sol = Suma.sumaAcumulada(num);
		}while(num != 0);
		System.out.println("El numero acumulado es: " + sol + "\n");
		
		//Codigo para probar Resta
		System.out.println("Escriba dos numeros para restar y pulse enter: ");
		a = sc.nextInt();
		b = sc.nextInt();
		sol = Resta.restaAyB(a, b);
		System.out.println("Resultado: " + sol);
		System.out.println("Inserte numeros para acumular, el 0 detiene la resta:");
		do {
			num = sc.nextInt();
			sol = Resta.restaAcumulada(num);
		}while(num != 0);
		System.out.println("El numero acumulado es: " + sol);
		
		//Codigo para probar multiplicacion
		System.out.println("Escriba dos numeros para multiplicar y pulse enter: ");
		a = sc.nextInt();
		b = sc.nextInt();
		sol = Multiplicacion.multiplicaAyB(a, b);
		System.out.println("Resultado: " + sol);
		System.out.println("Inserte numeros para acumular, el 0 detiene la multiplicacion:");
		num = sc.nextInt();
		while(num != 0){			
			sol = Multiplicacion.multiplicacionAcumulada(num);
			num = sc.nextInt();
		}
		System.out.println("El numero acumulado es: " + sol);
	}

	//esta rama incluira solo este comentario en el main y la clase multiplicacion para verificar que es la fusion de avance rapido
}
