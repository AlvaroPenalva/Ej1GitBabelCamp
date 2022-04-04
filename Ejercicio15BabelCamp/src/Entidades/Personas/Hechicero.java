package Entidades.Personas;

import Entidades.Armero;
import Entidades.Armas.Arma;
import Entidades.Armas.Baculo;

public class Hechicero extends Persona {
	private Arma arma;

	private int mana;

	public Hechicero(String nombre) {

		super(nombre, new Atributos(0, 10, 2, 5, 2));
		this.arma = Armero.getArma();
		System.out.println(this.arma.presentar());
		this.mana = 5;
	}

	@Override
	protected double danio() {
		double danioFinal = 0;
		if (arma instanceof Baculo && this.mana > 0)
			danioFinal = hechizo();
		else
			danioFinal = arma.usarArma(atributos);

		if (Math.random() > 0.8) {
			danioFinal *= 1.8;
			System.out.println(" ¡Critico!\n");
		}
		return danioFinal;
	}

	@Override
	protected double defensa() {
		System.out.println("¡El hechicero " + nombre + " se defiende!\n");
		return 0.3;
	}

	private double hechizo() {
		System.out.println("Lanza un hechizo\n");
		this.mana -= 1;
		return 5 + atributos.getInteligencia() / 10;
	}

	@Override
	protected void presentar() {
		System.out.println("Entra en la arena el hechicero " + nombre + " con su arma... ");
	}
}
