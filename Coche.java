package Micodigo;

public class Coche extends Vehículo{
	private String marca;
	public Coche(String identificador, String media) {
		super(identificador, medio);
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca ) {
		this.marca = marca;
	}
}
