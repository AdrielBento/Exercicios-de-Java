package Tarefa6;

public class Barco extends VeiculoAquatico {

	private String materialVela;
	private int qtdColeteSalvaVidas;
	
	public Barco() {
		// TODO Auto-generated constructor stub
	}
	
	public Barco(String tipoPropulsao) {
		super(tipoPropulsao);
	}
	
	public Barco(String materialVela,int qtdColeteSalvaVidas) {
		this.materialVela = materialVela;
		this.qtdColeteSalvaVidas = qtdColeteSalvaVidas;
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub		
	}
	
	public String getMaterialVela() {
		return materialVela;
	}
	
	public int getQtdColeteSalvaVidas() {
		return qtdColeteSalvaVidas;
	}
	
	public void setMaterialVela(String materialVela) {
		this.materialVela = materialVela;
	}
	
	public void setQtdColeteSalvaVidas(int qtdColeteSalvaVidas) {
		this.qtdColeteSalvaVidas = qtdColeteSalvaVidas;
	}
}
