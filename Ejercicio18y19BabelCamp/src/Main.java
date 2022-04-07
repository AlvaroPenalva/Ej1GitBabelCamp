import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

	@FunctionalInterface
	interface InterfazPrimo {
		public Runnable esPRimo(int num);
	}

	public static void main(String[] args) {

		//Ejercicio 18
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca tres numeros para saber si son primos");
		Runnable i1 = () -> {
			int num1 = scan.nextInt();
				boolean esPrimo = true;
				if (num1 == 0 || num1 == 1 || num1 == 4) {
					esPrimo = false;
				} else {
					for (int x = 2; x < num1; ++x) {
						if (num1 % x == 0)
							esPrimo = false;

					}
				}
				if (esPrimo)
					System.out.println("El numero " + num1 + " es primo");
				else System.out.println("El numero " + num1 + " no es primo");
			};
			
			Runnable i2 = ()-> {
				int num2 = scan.nextInt();
				boolean esPrimo = true;
				if (num2 == 0 || num2 == 1 || num2 == 4) {
					esPrimo = false;
				} else {
					for (int x = 2; x < num2; ++x) {
						if (num2 % x == 0)
							esPrimo = false;

					}
				}
				if (esPrimo)
					System.out.println("El numero " + num2 + " es primo");
				else System.out.println("El numero " + num2 + " no es primo");
			};
			Runnable i3 = ()->{
				int num3 = scan.nextInt();
				boolean esPrimo = true;
				if (num3 == 0 || num3 == 1 || num3 == 4) {
					esPrimo = false;
				} else {
					for (int x = 2; x < num3; ++x) {
						if (num3 % x == 0)
							esPrimo = false;

					}
				}
				if (esPrimo)
					System.out.println("El numero " + num3 + " es primo");
				else System.out.println("El numero " + num3 + " no es primo");
			};
		

		Thread th1 = new Thread(i1);
		Thread th2 = new Thread(i2);
		Thread th3 = new Thread(i3);
		th1.run();
		th2.run();
		th3.run();
		try {
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ejercicio 19
		Operar sumar = (num1, num2)->{return num1 + num2;};
		Operar restar = (num1, num2)->{return num1 - num2;};
		Operar multiplicar = (num1, num2)->{return num1 * num2;};
		Operar dividir = (num1, num2)->{return num1 / num2;};
		Operar potencia = (num1, num2)->{return Math.pow(num1, num2);};
		
		double a;
		int b;
		System.out.println("Introduzca dos numeros para realizar operaciones:\n");
		a = scan.nextDouble();
		b = scan.nextInt();
		System.out.println("La suma es: " + sumar.operacion(a, b));
		System.out.println("La resta es: " + restar.operacion(a, b));
		System.out.println("La multiplicacion es: " + multiplicar.operacion(a, b));
		System.out.println("La division es: " + dividir.operacion(a, b));
		System.out.println("La potencia es: " + potencia.operacion(a, b));

	}

}
