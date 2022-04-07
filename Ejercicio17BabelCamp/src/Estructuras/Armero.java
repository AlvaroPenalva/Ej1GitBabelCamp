package Estructuras;

import Entidades.Armas.Arma;
import Entidades.Armas.Baculo;
import Entidades.Armas.EspadayEscudo;
import Entidades.Armas.Hacha;
import Entidades.Armas.Rosario;

public final class Armero {

	public static Arma getArma() {
		double arma = Math.random();

		if (arma < 0.25)
			return new Hacha();
		if (arma < 0.5)
			return new EspadayEscudo();
		if (arma < 0.75)
			return new Baculo();
		else
			return new Rosario();
	}

}
