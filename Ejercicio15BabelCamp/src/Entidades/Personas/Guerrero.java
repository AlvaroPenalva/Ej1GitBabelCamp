package Entidades.Personas;

import Entidades.Armero;
import Entidades.Armas.Arma;
import Entidades.Armas.Hacha;

public class Guerrero extends Persona {
	private Arma arma;

	public Guerrero(String nombre) {
		super(nombre, new Atributos(10, 2, 5, 0, 1));
		this.arma = Armero.getArma();
		System.out.println(this.arma.presentar());
	}

	@Override
	protected double danio() {
		double danioFinal = arma.usarArma(atributos);
		if (arma instanceof Hacha)
			danioFinal += (danioFinal / 20);
		if (Math.random() > 0.8) {
			danioFinal *= 2;
			System.out.println(" �Critico!\n");
		}
		return danioFinal;
	}

	@Override
	protected double defensa() {
		System.out.println("�El guerrero " + nombre + " se defiende!\n");
		return 0.5;
	}

	@Override
	protected void presentar() {
		System.out.println("Entra en la arena el guerrero " + nombre + " con su arma... ");
	}

}
