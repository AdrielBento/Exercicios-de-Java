
public class Quadrado implements Superficie {
	
	private Double lado;	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
	
		return lado*lado ;
	}

}
