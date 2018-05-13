

import Tarefa10.Superfice;

public class Circuferencia implements Superfice {

	double raio = 0;
	double area = 0;
	
	//formula A=PIr²;
	public double getArea() {
		return area;
	}
	public double getRaio() {
		return raio;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double usaCircunferencia() {
		
	this.area = 3.14 *(Math.pow(this.raio,2));
	return this.area;

	}
	@Override
	public double area() {
		return 0;
	}
	
	
	
	
	
}
