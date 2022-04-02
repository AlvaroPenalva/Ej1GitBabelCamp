package Entidades.Armas;

import Entidades.Personas.Atributos;

public class BarraDePan extends Arma {

	public BarraDePan() {
		super(0.2);
	}

	@Override
	public String presentar() {
		return "la barra de pan dura!";
	}

	@Override
	public double usarArma(Atributos atributos) {
		System.out.println("Golpea con la barra de pan dura\n");
		return danio + (atributos.getCarinioDelPueblo());
	}

}
