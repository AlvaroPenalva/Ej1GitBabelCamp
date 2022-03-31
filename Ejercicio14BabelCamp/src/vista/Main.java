package vista;

import java.util.Scanner;
import modelo.negocio.CocheSA;

public class Main {

	public static void main(String[] args) {

		menu();
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		CocheSA csa = new CocheSA();

		int id;
		String matricula;
		String marca;
		String modelo;
		double kilometros;

		while (option != 9) {

			switch (option) {

			case 1:
				System.out.println("Introduzca los datos del coche | matricula | marca | modelo | nº kilometros");
				matricula = scanner.next();
				marca = scanner.next();
				modelo = scanner.next();
				kilometros = scanner.nextDouble();
				System.out.println(csa.altaCoche(matricula, marca, modelo, kilometros));
				break;
			case 2:
				System.out.println("Introduzca el id del coche");
				id = scanner.nextInt();
				System.out.println(csa.bajaCoche(id));
				break;
			case 3:
				System.out.println("Introduzca los datos del coche | id | matricula | marca | modelo | nº kilometros");
				id = scanner.nextInt();
				matricula = scanner.next();
				marca = scanner.next();
				modelo = scanner.next();
				kilometros = scanner.nextDouble();
				System.out.println(csa.modificarCoche(id, matricula, marca, modelo, kilometros));
				break;
			case 4:
				System.out.println("Introduzca el id del coche");
				id = scanner.nextInt();
				System.out.println(csa.buscarCocheID(id));
				break;
			case 5:
				System.out.println("Introduzca la matricula del coche");
				matricula = scanner.next();
				System.out.println(csa.buscarCocheMatricula(matricula));
				break;
			case 6:
				System.out.println("Introduzca la marca del coche");
				marca = scanner.next();
				System.out.println(csa.buscarCochesMarca(marca));
				break;
			case 7:
				System.out.println("Introduzca el modelo del coche");
				modelo = scanner.next();
				System.out.println(csa.buscarCochesModelo(modelo));
				break;
			case 8:
				System.out.println(csa.listarCoches());
				break;
			}

			menu();
			option = scanner.nextInt();
		}
		scanner.close();

	}

	public static void menu() {
		String mensajemenu = "Elija una opción:\n" + "1. Alta de coche\r\n" + "2. Eliminar coche por id\r\n"
				+ "3. Modificar coche por id\r\n" + "4. buscar coche por id\r\n" + "5. buscar coche por matricula\r\n"
				+ "6. buscar coches por marca\r\n" + "7. buscar coches por modelo\r\n"
				+ "8. listar todos los coches\r\n" + "9. Salir de la aplicación";
		System.out.println(mensajemenu);
	}

}
