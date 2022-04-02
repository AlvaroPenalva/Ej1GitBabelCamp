package Entidades.Armas;

import Entidades.Personas.Atributos;

public class Rosario extends Arma {

	public Rosario() {
		super(1);
	}

	@Override
	public String presentar() {
		return "el rosario!\n";
	}

	@Override
	public double usarArma(Atributos atributos) {
		System.out.println("Golpea con el rosario\n");
		return danio + (atributos.getFe() / 8);
	}
}
