package Entidades.Personas;

import Entidades.Armero;
import Entidades.Armas.Arma;
import Entidades.Armas.Rosario;

//EL monje es en si el curandero
public class Monje extends Persona {
	private Arma arma;

	public Monje(String nombre) {
		super(nombre, new Atributos(5, 2, 0, 10, 3));
		this.arma = Armero.getArma();
		System.out.println(this.arma.presentar());
	}

	@Override
	protected double danio() {

		double danioFinal = arma.usarArma(atributos);

		if (arma instanceof Rosario)
			curarse();
		if (Math.random() > 0.8) {
			danioFinal *= 1.5;
			System.out.println(" ¡Critico!\n");
		}
		return danioFinal;
	}

	@Override
	protected double defensa() {
		System.out.println("¡El monje " + nombre + " se defiende!\n");
		return 0.2;
	}

	private void curarse() {
		double vidaCurada = (atributos.getFe() / 3);
		System.out.println("¡El monje se cura " + vidaCurada + " de vida!\n");
		vida += vidaCurada;
	}

	@Override
	protected void presentar() {
		System.out.println("Entra en la arena el monje " + nombre + " con su arma... ");

	}
}
