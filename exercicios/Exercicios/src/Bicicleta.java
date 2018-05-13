public  abstract class Bicicleta {
	
	private int cadencia = 0;
	private int velocidade = 0;
	private  int marcha = 1;
	private  int maxMarchas = 0;
	private static  int qtdRodas = 0;

	
	public Bicicleta(int maxMarchas) {
		this.maxMarchas = maxMarchas;
		this.velocidade = 0;		
	}
	
	public Bicicleta() {
		this.maxMarchas = 18;
		this.velocidade = 0;
	}
	
	public abstract void potencia();	
	
	public static void marca() {
		System.out.println("marca");
	}
	
	public int getCadencia() {
		return this.cadencia;
	}
	public int getMarcha() {
		return this.marcha;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void mudarCadencia(int novoValor){
		cadencia = novoValor;
	}
	
	public void mudarMarcha(int novoValor){
		if(this.maxMarchas<18) {
			this.marcha = novoValor;
		}else {
			System.out.println("Numero maximo de marchas foi excedido");
		}
	}	
	
	public void aumentarVelocidade(int incremento){
		this.velocidade = this.velocidade + incremento;
	}
	public void aplicarFreios(int decremento){
		this.velocidade = this.velocidade - decremento;
	}
	public void printStates(){
		System.out.println("cadencia="+this.cadencia+" velocidade="+this.velocidade+"marcha="+this.marcha);
	}
}