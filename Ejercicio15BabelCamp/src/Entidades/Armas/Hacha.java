package Entidades.Armas;

import Entidades.Personas.Atributos;

public class Hacha extends Arma {

	public Hacha() {
		super(3);
	}

	@Override
	public String presentar() {
		return "el Hacha!";
	}

	@Override
	public double usarArma(Atributos atributos) {
		System.out.println("Golpea con el hacha\n");
		return danio + (atributos.getFuerza() / 10);
	}

}
