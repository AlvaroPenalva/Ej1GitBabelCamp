package Estructuras;

import Entidades.Personas.Caballero;
import Entidades.Personas.Guerrero;
import Entidades.Personas.Hechicero;
import Entidades.Personas.Monje;
import Entidades.Personas.Persona;

public class Vestuario {

	public static Persona getGuerrero(String nombre) {
		double persona = Math.random();

		if (persona < 0.25)
			return new Guerrero(nombre);
		if (persona < 0.5)
			return new Caballero(nombre);
		if (persona < 0.75)
			return new Hechicero(nombre);
		else
			return new Monje(nombre);
	}

}
