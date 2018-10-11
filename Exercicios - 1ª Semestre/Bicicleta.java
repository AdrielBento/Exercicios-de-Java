class Bicicleta {
	
	private int cadencia = 0;
	private int velocidade = 0;
	private  int marcha = 1;
	private  int maxMarchas = 0;
	
	
	
	public Bicicleta(int maxMarchas) {
		this.maxMarchas = maxMarchas;
		this.velocidade = 0;
		
	}
	
	public Bicicleta() {
		this.maxMarchas = 18;
		this.velocidade = 0;
	}
	
	
	public int getCadencia() {
		return cadencia;
	}
	public int getMarcha() {
		return marcha;
	}
	public int getVelocidade() {
		return velocidade;
	}

	
	
	
	void mudarCadencia(int novoValor){
		cadencia = novoValor;
	}
	void mudarMarcha(int novoValor){
		if(maxMarchas<18) {
		marcha = novoValor;
		}else {
			System.out.println("Numero maximo de marchas foi excedido");
		}
	}
	void aumentarVelocidade(int incremento){
		velocidade = velocidade + incremento;
	}
	void aplicarFreios(int decremento){
		velocidade = velocidade - decremento;
	}
	void printStates(){
		System.out.println("cadencia="+cadencia+" velocidade="+velocidade+"marcha="+marcha);
	}
}