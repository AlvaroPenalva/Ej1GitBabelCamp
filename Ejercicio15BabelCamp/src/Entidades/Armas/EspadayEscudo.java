package Entidades.Armas;

import Entidades.Personas.Atributos;

public class EspadayEscudo extends Arma {

	public EspadayEscudo() {
		super(2);
	}

	@Override
	public String presentar() {
		return "la espada y escudo!\n";
	}

	@Override
	public double usarArma(Atributos atributos) {
		System.out.println("Golpea con la espada\n");
		return danio + (atributos.getDestreza() / 10);
	}

}
