package Tarefa6;

public  abstract class Veiculo {
	
	private Double velocidade;
	private Double peso;

	
	public Veiculo() {
		
	};
	
	public Veiculo(Double velocidade,Double peso) {
		this.velocidade = velocidade;
		this.peso = peso;
	}
	
	public abstract void andar();

}
