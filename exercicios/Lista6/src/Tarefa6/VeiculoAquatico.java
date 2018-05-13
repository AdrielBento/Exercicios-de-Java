package Tarefa6;

public abstract class VeiculoAquatico extends Veiculo {
	
	private String tipoPropulsao;

	public VeiculoAquatico() {
		// TODO Auto-generated constructor stub
	}
	
	public VeiculoAquatico(String tipoPropulsao) {
		this.tipoPropulsao = tipoPropulsao;
	}

	
	public VeiculoAquatico(Double velocidade,Double peso) {
		super(velocidade,peso);
	}
		
	
	@Override
	public  abstract void andar();
		
	
	public String getTipoPropulsao() {
		return tipoPropulsao;
	}
	
	public void setTipoPropulsao(String tipoPropulsao) {
		this.tipoPropulsao = tipoPropulsao;
	}
}
