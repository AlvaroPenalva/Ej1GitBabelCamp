package Entidades.Personas;

public abstract class Persona {

	protected double vida;
	protected String nombre;
	public boolean vivo;
	protected Atributos atributos;

	public Persona(String nombre, Atributos atributos) {
		this.nombre = nombre;
		this.vida = 15;
		this.vivo = true;
		this.atributos = atributos;
		this.presentar();
	}

	public String getNombre() {
		return this.nombre;
	}

	public double atacar() {
		System.out.println("Soy " + this.nombre + " y voy a lanzar un ataque fuaaaaaah!\n");
		return danio();
	}

	public void encajarGolpe(double danioRecibido) {

		System.out.println("Auch!\n");

		danioRecibido = danioRecibido - defensa();
		if (danioRecibido < 0)
			danioRecibido = 0;
		vida -= danioRecibido;

		System.out.println(nombre + " ha recibido " + danioRecibido + " de danio.\n");

		if (vida <= 0)
			vivo = false;
	}

	protected abstract double danio();

	protected abstract double defensa();
	
	protected abstract void presentar();

}
