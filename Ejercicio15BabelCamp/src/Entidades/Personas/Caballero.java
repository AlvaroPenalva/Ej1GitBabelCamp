package Entidades.Personas;

import Entidades.Armero;
import Entidades.Armas.Arma;
import Entidades.Armas.EspadayEscudo;

public class Caballero extends Persona {
	private Arma arma;

	public Caballero(String nombre) {
		super(nombre, new Atributos(5, 0, 10, 2, 1));
		this.arma = Armero.getArma();
		System.out.println(this.arma.presentar());
	}

	@Override
	protected double danio() {
		double danioFinal = arma.usarArma(atributos);
		if (arma instanceof EspadayEscudo)
			danioFinal += (danioFinal / 20);
		if (Math.random() > 0.7) {
			danioFinal *= 2;
			System.out.println("¡Critico!\n");
		}
		return danioFinal;
	}

	@Override
	protected double defensa() {
		double defensaTotal = 0.6;
		System.out.println("¡El caballero " + nombre + " se defiende!\n");
		if (arma instanceof EspadayEscudo) {
			if (Math.random() > 0.9) {
				defensaTotal = 100;
				System.out.println("¡Ha bloqueado el ataque con el escudo!\n");
			}

		}
		return defensaTotal;
	}

	@Override
	protected void presentar() {
		System.out.println("Entra en la arena el caballero " + nombre + " con su arma... ");
	}
}
