package Default;

public abstract class Funcionario {

	private Double salario; 
	private String nome;
	
	public abstract void getBonus();	
	
	public Funcionario(Double salario,String nome) {
		this.salario = salario;
		this.nome = nome;
	}
	
	public Funcionario() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
