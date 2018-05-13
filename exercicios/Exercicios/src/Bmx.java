
public class Bmx extends Bicicleta {
	
	public double nota;
	
	public Bmx() {
		super();
	};
	
	public Bmx(int marcha) {
		super(marcha);
	}
	
	Bicicleta c  = new Bicicleta();
	
	@Override
	public void potencia() {	
		
		
		int teste = super.getMarcha();
		
		System.out.println("Potencia foda");
	}

}
