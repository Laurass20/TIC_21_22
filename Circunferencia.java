package MCodigo;

public class Circunferencia {
	//ATRIBUTOS
	private MiParejaNumeros centroCirculo;
	private double radio;
	//CONSTRUCTOR
	public Circunferencia(int coordX,int coordY,double radio){
		super();
		centroCirculo=new MiParejaNumeros(coordX,coordY);
		this.radio=radio;
	}
	//MÉTODOS DET GET
	public void setCoordX(int coordX){
		centroCirculo.setNum1(coordX)
	}
	public void setCoordY(int coordY){
		this.coordY=coordY;
	}
	public void setRadio(float radio){
		this.radio=radio;
	}
	public int getCoordX(){
		return(centroCirculo.getNum1());
	}
	public int getCoordY(){
		return coordY;
	}
	public float getRadio() {
		return radio;
	}
}
