import java.util.Scanner;
public class PainelPessoa {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String nome = null, endereco = null;
		int idade = 0;
		Pessoa p = new Pessoa();
		
		System.out.println("Nome :");
		nome=read.nextLine();
		System.out.println("Idade :");
		idade = read.nextInt();
		System.out.println("Endereco :");
		read.nextLine();
		endereco = read.nextLine();
		
		
		p.cadastra(nome, idade, endereco);
		
		p.imprime();
		p.fazAniversario();
		System.out.println("\n\n");
		p.imprime();
		
	}

}
