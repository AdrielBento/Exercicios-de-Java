package Tarefa6;

public abstract class VeiculoTerrestre extends Veiculo {
	
	private int qtdRodas;
	

	public VeiculoTerrestre() {
		
	}
	
	public VeiculoTerrestre(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
	public VeiculoTerrestre(Double velocidade,Double peso) {
		super(velocidade,peso);
	}
	
	@Override
	public  abstract void andar();
	
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
			
	public int getQtdRodas() {
		return qtdRodas;
	}
	
}
