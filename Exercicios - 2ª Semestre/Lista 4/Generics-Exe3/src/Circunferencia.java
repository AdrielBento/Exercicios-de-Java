
public class Circunferencia implements Superficie {

	private double raio;
	
	
	public Circunferencia(double raio) {
		
		this.raio = raio;
	}

	@Override
	public double area() {
		return (Math.PI*Math.pow(2,raio));
	}

}
