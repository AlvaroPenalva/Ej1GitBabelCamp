package Entidades.Personas;

import Entidades.Armas.Arma;
import Entidades.Armas.BarraDePan;

public class Panadero extends Persona {
	Arma arma;

	public Panadero() {
		super("Felix", new Atributos(0, 0, 0, 0, 999));
		arma = new BarraDePan();
		System.out.println(this.arma.presentar());
	}

	@Override
	protected double danio() {
		System.out.println("El panadero usa su habilidad\n");
		return arma.usarArma(atributos);
	}

	@Override
	protected double defensa() {
		System.out.println("¡Un espectador salta a defender al panadero!\n");
		return 999;
	}

	@Override
	protected void presentar() {
		System.out.println("Estoy muy mayor para estas cosas pero si hace falta combatire con... ");
	}

}
