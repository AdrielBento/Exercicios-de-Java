package Tarefa6;

public abstract class VeiculoAereo extends Veiculo {
	
	
	private int nmPoltronas;
	

	public VeiculoAereo() {
	
	}
	
	public VeiculoAereo(int nmPoltronas) {
		this.nmPoltronas = nmPoltronas;
	}
	
	
	public VeiculoAereo(Double velocidade,Double peso) {
		super(velocidade,peso);
	}
	
	@Override
	public  abstract void andar();
	
	public int getNmPoltronas() {
		return nmPoltronas;
	}
	
	public void setNmPoltronas(int nmPoltronas) {
		this.nmPoltronas = nmPoltronas;
	}

}
