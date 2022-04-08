package Estructuras;

import Entidades.Personas.Jefe;
import Entidades.Personas.Persona;

//Singleton
public class Fortaleza {

	private static Fortaleza fort;
	private Persona heroe;
	Jefe jefe;

	private Fortaleza() {
		jefe = new Jefe();
	};

	public synchronized static Fortaleza getFortaleza() {
		if (fort == null)
			fort = new Fortaleza();
		return fort;
	}

	public synchronized void entraryLuchar(Persona combatiente) {
		if (jefe.vivo)
			combatiente.presentar();

		while (combatiente.vivo && jefe.vivo) {
			jefe.encajarGolpe(combatiente.atacar());
			if (jefe.vivo)
				combatiente.encajarGolpe(jefe.atacar());
			else {
				heroe = combatiente;
				jefe.muerte();
			}
		}

		if (!combatiente.vivo)
			System.out.println(combatiente.getNombre() + " ha muerto.\n");

	}

	public Persona getHeroe() {
		return heroe;
	}

	public boolean isJefeMuerto() {
		return !jefe.vivo;
	}

}
