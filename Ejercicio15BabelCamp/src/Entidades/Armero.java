package Entidades;

import Entidades.Armas.Arma;
import Entidades.Armas.Baculo;
import Entidades.Armas.BarraDePan;
import Entidades.Armas.EspadayEscudo;
import Entidades.Armas.Hacha;
import Entidades.Armas.Rosario;

public final class Armero {

	public static Arma getArma() {
		int arma = (int) Math.floor(Math.random() * 5);
		switch (arma) {
		case 0:
			return new Hacha();
		case 1:
			return new EspadayEscudo();
		case 2:
			return new Baculo();
		case 3:
			return new Rosario();
		default:
			System.out.println("\n¡Este combatiente no tenia arma asi que el panadero le dado una barra de pan dura!\n ");
			return new BarraDePan();
		}
	}
}
