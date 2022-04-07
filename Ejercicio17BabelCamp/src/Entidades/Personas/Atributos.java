package Entidades.Personas;

public class Atributos {
	private int fuerza;
	private int inteligencia;
	private int destreza;
	private int fe;
	private int carinioDelPueblo;

	public Atributos(int fuerza, int inteligencia, int destreza, int fe, int carinioDelPueblo) {
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.destreza = destreza;
		this.fe = fe;
		this.carinioDelPueblo = carinioDelPueblo;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getFe() {
		return fe;
	}

	public void setFe(int fe) {
		this.fe = fe;
	}

	public int getCarinioDelPueblo() {
		return carinioDelPueblo;
	}

	public void setCarinioDelPueblo(int carinioDelPueblo) {
		this.carinioDelPueblo = carinioDelPueblo;
	}

}
