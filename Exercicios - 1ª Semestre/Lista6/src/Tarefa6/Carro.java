package Tarefa6;

public class Carro extends VeiculoTerrestre {
	
	
	private Double nmCarro;
	private int nmPoltronas;
	private String marca;
	

	public Carro() {
		
	}
	
	public Carro(int qtdRodas) {
		super(qtdRodas);
	}
	
	public Carro(Double nmCarro,int nmPoltronas,String marca) {
		this.nmCarro = nmCarro;
		this.nmPoltronas = nmPoltronas;
		this.marca = marca;
		
	}
//	public Carro(Double velocidade,Double peso) {
//		super(velocidade,peso);
//	}

	@Override
	public void andar() {
				
	}

}
