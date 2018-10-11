
public class Pessoa {

	
	String nome= null;
	int idade = 0;
	String endereco = null;
	
	
	public void cadastra(String nome,int idade,String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	
	public void fazAniversario() {
		this.idade+= 1;
	}
	
	public void imprime() {
		System.out.printf("Nome: %s \nIdade: %d\nEndereço: %s",this.nome,this.idade,this.endereco);
	}
}
