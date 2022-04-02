package Entidades.Armas;

import Entidades.Personas.Atributos;

public abstract class Arma {
	protected double danio;

	protected Arma(double danio) {
		this.danio = danio;
	}

	public abstract String presentar();

	public abstract double usarArma(Atributos atributos);
}