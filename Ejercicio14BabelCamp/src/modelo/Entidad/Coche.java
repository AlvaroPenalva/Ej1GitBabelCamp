package modelo.Entidad;

public class Coche {

	private int id;
	private String matricula;
	private String marca;
	private String modelo;
	private double kilometros;
	
	public Coche(String matricula, String marca, String modelo, double kilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
	}
	
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	
	@Override
	public String toString() {
		return "Coche:\n -ID: " + this.id + "\n -Matricula: " + this.matricula + 
				"\n -Marca: " + this.marca + "\n -Modelo: " + this.modelo +
				"\n -N� kilometros: " + this.kilometros + "\n";
		
	}
	
}
