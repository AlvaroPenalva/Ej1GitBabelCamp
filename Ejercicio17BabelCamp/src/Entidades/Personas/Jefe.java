package Entidades.Personas;

public class Jefe {

	private double vida;
	// Los atributos no se usan estan aniadidos por si queremos desarrollar los
	// bosses posteriormente
	private Atributos atr;
	private String nombre;
	public boolean vivo;

	public Jefe() {
		nombre = "Malenia";
		atr = new Atributos(10, 5, 30, 2, 0);
		vida = 30;
		vivo = true;
	}

	public double atacar() {
		System.out.println("Malenia ataca con un megacombo increible\n");

		return 10;
	}

	public void encajarGolpe(double danio) {
		double daniofinal = danio;
		if (daniofinal < 0)
			daniofinal = 0;
		vida -= daniofinal;
		System.out.println(nombre + ": ¡Eso no es nada!\n");
		System.out.println(nombre + " recibe: " + daniofinal + " de danio.\n");
		if (this.vida <= 0)
			vivo = false;
	}

	public double getVida() {
		return this.vida;
	}

	public void muerte() {
		this.vivo = false;
		System.out.println(nombre + ": No es posible, nunca fui derrotada.\n");
	}
}
