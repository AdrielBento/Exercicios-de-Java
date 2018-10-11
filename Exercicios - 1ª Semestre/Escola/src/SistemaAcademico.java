
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class SistemaAcademico {

	// public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static Scanner read = new Scanner(System.in);
	public static Aluno[] alunos = new Aluno[1];
	public static int qt = 0;
	
	public static void main(String[] args) {
		int opcao=0,tam = 0;
	
		System.out.println("Quantidade de alunos ques serão cadastrado?");
		tam = read.nextInt();
		qt = tam;
		alunos = new Aluno[tam];
		String disciplina[] = new String [4];


		while (opcao != 8) {
			try {
			
				System.out.println(
						"1-Cadastrar Aluno\n2-Excluir aluno por nome\n3-Listar Alunos\n4-Matricular Aluno em Disciplina\n5-Cancelar Matricula\n6-Imprimir lista Alunos e Disciplinas Matriculadas\n7-Buscar dados do aluno\n8-Sair\n");
				
				opcao = read.nextInt();
				
				gerenciaOpcao(opcao);

			} catch (Exception e) {
				System.out.printf("Erro ao ler um input,por favor tente novamente : %s\n", e);
				read.nextLine();

			}
		}
	}

	public static void gerenciaOpcao(int opcao) {
		String str = "", str2 = "";
		int aux = 0;
		switch (opcao) {
		case 1:
			leDadosCadastro();
			break;
		case 2:
			System.out.printf("Nome do aluno:");
			str = read.next();
			excluirAlunoPorNome(str);
			break;
		case 3:
			listarAlunos();
			break;
		case 4:
			System.out.printf("Nome do aluno :");
			str = read.next();
			System.out.printf("Disciplina: ");
			str2 = read.next();
			aux = buscaAluno(str);
			if (aux >= 0) {
				System.out.printf("%s", matricularAlunoEmDisciplinas(alunos[aux], str2));
			} else {
				System.out.println("Aluno não cadastrado.Por favor  cadastrar antes de matricular");
			}
			break;
		case 5:

			System.out.printf("Nome do aluno :");
			str = read.next();
			System.out.printf("Disciplina: ");
			str2 = read.next();
			aux = buscaAluno(str);

			if (aux >= 0) {
				String disci[] = new String[qt];
				disci = alunos[aux].getDisciplinas();
				for (int i = 0; i < disci.length; i++) {

					if (disci[i].equals(str2)) {
						System.out.printf("%s", cancelaMatricula(alunos[i], str2));
						break;
					} else if (i >  disci.length) {
						System.out.printf("O aluno %s nao foi matriculado nessa disciplina", alunos[aux].getNome());
					}
				}
			} else {
				System.out.println("Aluno não cadastrado.Por favor  cadastrar antes de matricular");
			}
			break;
		case 6:
			imprimirListaDeAlunoseDisciplinas();
			break;
			
		case 7:
		
			System.out.printf("Aluno: ");
			str = read.next();
			//aux = buscaAluno(str);
			imprimeAluno(str);
			
		break;
		
		case 8:
			System.out.println("Volte sempre !!!!!");
			break;

		 }

	}

	public static void leDadosCadastro() {
		String nome = "", matricula = "", curso = "";
		int periodo = 0, idade = 0, qtdMatriculas = 0;
		boolean cond = true;

		while (cond) {
			try {
				System.out.println("Nome:");
				read.nextLine();
				nome = read.nextLine();
				System.out.println("Matricula:");
				matricula = read.nextLine();
				System.out.println("Curso:");
				curso = read.nextLine();
				System.out.println("Periodo:");
				periodo = read.nextInt();
				System.out.println("Idade:");
				idade = read.nextInt();
				System.out.println("quantidade:");
				qtdMatriculas = read.nextInt();
				cadastrarAluno(new Aluno(nome, matricula, curso, periodo, idade, qtdMatriculas));
				cond = false;

			} catch (Exception e) {
				System.out.println("Falha ao realizar o cadastro.Tente novamente\n");
			}

		}

	}

	public static void cadastrarAluno(Aluno aluno) {
		
		int aux = 0;
		for(int i=0;i<alunos.length;i++){

			if(alunos[i]== null){
				alunos[i]= aluno;
				System.out.printf("Aluno cadastrado com sucesso\n\n\n\n");
				aux = 1;
				break;
			}
		}
		
		if(aux == 0) {
			System.out.println("O numero maximo de alunos já foi cadastrado");
		}
	}

	public static void excluirAlunoPorNome(String nome) {
	
		Aluno aux;
		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i].getNome().equals(nome)) {
				System.out.printf("Aluno %s foi removido\n", nome);
				
				for(int j = i+1;j<alunos.length;j++){
					alunos[j-1] = alunos[j];
				}
				alunos[alunos.length-1] = null;
				break;
			}

		}
	}

	public static void listarAlunos() {

		for (Aluno aluno : alunos) {
			if(aluno!=null)
			System.out.printf("Nome:%s\n", aluno.getNome());
		}	
	}

	public static int buscaAluno(String nome) {
		int indice = -1;

		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i].getNome().equals(nome)) {
				indice = i;
				break;
			}
		}
		return (indice >= 0) ? indice : 0;
	}

	public static String matricularAlunoEmDisciplinas(Aluno aluno, String disciplina) {
		return aluno.fazMatricula(disciplina);
	}

	public static String cancelaMatricula(Aluno aluno, String disciplina) {
		return aluno.cancelarMatricula(disciplina);
	}

	public static void imprimirListaDeAlunoseDisciplinas() {
		
				
		for (Aluno aluno : alunos) {  
			aluno.imprime();
		}
		
	}
	
	public static void imprimeAluno(String nome) {
		
		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i].getNome().equals(nome)) {
				//System.out.printf("Aluno %s foi removido\n", alunos.get(i).getNome());
				alunos[i].imprime();
				break;
			}

		}
	}
	
}
