
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class SistemaAcademico {

	public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = 0;

		while (opcao != 7) {
			try {
				System.out.println(
						"1-Cadastrar Aluno\n2-Excluir aluno por nome\n3-Listar Alunos\n4-Matricular Aluno em Disciplina\n5-Cancelar Matricula\n6-Imprimir lista Alunos e Disciplinas Matriculadas\n7-Sair\n");
				
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
				System.out.printf("%s", matricularAlunoEmDisciplinas(alunos.get(aux), str2));
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
				ArrayList<String> disci = new ArrayList<String>();
				disci = alunos.get(aux).getDisciplinasMatriculadas();
				for (int i = 0; i < disci.size(); i++) {

					if (disci.get(i).equals(str2)) {
						System.out.printf("%s", cancelaMatricula(alunos.get(aux), str2));
						break;
					} else if (i > disci.size()) {
						System.out.printf("O aluno %s nao foi matriculado nessa disciplina", alunos.get(aux).getNome());
					}
				}
			} else {
				System.out.println("Aluno não cadastrado.Por favor  cadastrar antes de matricular");
			}
			break;
		case 6:
			imprimirListaDeAlunoseDisciplinas();
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
		alunos.add(aluno);
		System.out.printf("Aluno cadastrado com sucesso\n\n\n\n");

	}

	public static void excluirAlunoPorNome(String nome) {
		for (int i = 0; i < alunos.size(); i++) {

			if (alunos.get(i).getNome().equals(nome)) {
				System.out.printf("Aluno %s foi removido\n", alunos.get(i).getNome());
				alunos.remove(i);
				break;
			}

		}
	}

	public static void listarAlunos() {

		for (Aluno aluno : alunos) {
			System.out.printf("Nome:%s\n", aluno.getNome());
		}
	}

	public static int buscaAluno(String nome) {
		int indice = -1;
		for (int i = 0; i < alunos.size(); i++) {

			if (alunos.get(i).getNome().equals(nome)) {
				indice = i;
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
			System.out.printf("Nome : %s   Disciplinas:%s\n", aluno.getNome(), aluno.getDisciplinasMatriculadas());
		}
	}
}
