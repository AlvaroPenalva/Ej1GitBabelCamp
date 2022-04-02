package Entidades;

import Entidades.Personas.Caballero;
import Entidades.Personas.Guerrero;
import Entidades.Personas.Hechicero;
import Entidades.Personas.Monje;
import Entidades.Personas.Panadero;
import Entidades.Personas.Persona;

public class Vestuario {

	public static Persona getGuerrero(String nombre) {
		double persona = Math.random();

		if (persona < 0.24)
			return new Guerrero(nombre);
		if (persona < 0.48)
			return new Caballero(nombre);
		if (persona < 0.72)
			return new Hechicero(nombre);
		if (persona < 0.96)
			return new Monje(nombre);

		System.out.println("¡Oh no, el panadero Felix ha caido en la arena asi que tendra que combatir!");
		return new Panadero();
	}

}
