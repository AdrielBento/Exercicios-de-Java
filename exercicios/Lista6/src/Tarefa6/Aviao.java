package Tarefa6;

public class Aviao extends VeiculoAereo {

	public String modelo;
	public String linhaAerea;

	public Aviao() {
		// TODO Auto-generated constructor stub
	}

	public Aviao(int nmPoltronas) {
		super(nmPoltronas);
	}

	public Aviao(Double velocidade,Double peso) {
		super(velocidade,peso);
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		
	}

}
