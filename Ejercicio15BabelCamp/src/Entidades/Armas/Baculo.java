package Entidades.Armas;

import Entidades.Personas.Atributos;

public class Baculo extends Arma {

	public Baculo() {
		super(0.7);
	}

	@Override
	public String presentar() {
		return "el Baculo\n";
	}

	@Override
	public double usarArma(Atributos atributos) {
		System.out.println("Golpea con el baculo\n");
		return danio + (atributos.getInteligencia() / 10);
	}

}
