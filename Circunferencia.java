package MCodigo;

public class Circunferencia {
	//ATRIBUTOS
	int coordX;
	int coordY;
	double radio;
	//CONSTRUCTOR
	public Circunferencia(int coordX,int coordY,double radio){
		this.coordX=coordX;
		this.coordY=coordY;
		this.radio=radio;
	}
	//MÉTODOS DET GET
	void setCoordX(int coordX){
		this.coordX=coordX;
	}
	void setCoordY(int coordY){
		this.coordY=coordY;
	}
	void setRadio(float radio){
		this.radio=radio;
	}
	int getCoordX(){
		return coordX;
	}
	int getCoordY(){
		return coordY;
	}
	float getRadio() {
		return radio;
	}
}
