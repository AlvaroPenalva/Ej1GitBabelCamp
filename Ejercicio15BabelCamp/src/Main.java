import java.util.Scanner;

import Entidades.Vestuario;
import Entidades.Personas.Persona;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String menu = "Elija una opcion:     1. Combate     2. Salir\n";
		System.out.println(menu);
		int opcion = scan.nextInt();

		Persona combatiente1;
		Persona combatiente2;
		while (opcion == 1) {
			System.out.println("¡¡¡¡Bienvenidos a la gran arena de BABElll!!!!!!\n");
			System.out.println("¡Demos comienzo a nuestro combate!\n");
			combatiente1 = Vestuario.getGuerrero("Combatiente 1");
			combatiente2 = Vestuario.getGuerrero("Combatiente 2");
			combate(combatiente1, combatiente2);
			System.out.println(menu);
			opcion = scan.nextInt();
		}
		scan.close();
	}

	public static void combate(Persona uno, Persona dos) {
		double danio = 0;
		int i = 1;
		while (uno.vivo && dos.vivo) {
			System.out.println("Turno: " + i + "\n");
			danio = uno.atacar();
			dos.encajarGolpe(danio);
			danio = dos.atacar();
			uno.encajarGolpe(danio);
			i++;
		}
		if (!uno.vivo && !dos.vivo)
			System.out.println("Tenemos un empate.\n");
		else if (!dos.vivo)
			System.out.println("Ha ganado " + uno.getNombre() + "\n");
		else
			System.out.println("Ha ganado " + dos.getNombre() + "\n");
	}

}
