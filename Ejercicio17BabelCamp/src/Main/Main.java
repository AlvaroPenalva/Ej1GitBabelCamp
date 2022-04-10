package Main;

import Estructuras.Fortaleza;
import Estructuras.Vestuario;

public class Main {

	public static void main(String[] args) {

		System.out.println("¡Los combatientes estan asaltando la fortaleza!\n");

		Thread com1 = Vestuario.getGuerrero("Combatiente1");
		Thread com2 = Vestuario.getGuerrero("Combatiente2");
		Thread com3 = Vestuario.getGuerrero("Combatiente3");
		Thread com4 = Vestuario.getGuerrero("Combatiente4");
		Thread com5 = Vestuario.getGuerrero("Combatiente5");
		com1.run();
		com2.run();
		com3.run();
		com4.run();
		com5.run();
		try {
			com1.join();
			com2.join();
			com3.join();
			com4.join();
			com5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Fortaleza fortaleza = Fortaleza.getFortaleza();

		if (fortaleza.isJefeMuerto()) {
			System.out.println("El heroe " + fortaleza.getHeroe().getNombre() + " ha matado al jefe!!!!\n");
			System.out.println("La gente aplaude y vitorea al heroe");
		}
	}

}
