
import java.util.ArrayList;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private int periodo;
	private String disciplinas[] = new String[0];
	private String endereco;
	private int idade;
	private int quantidadeDisciplinasPermitidas;

	public Aluno(String nome, String matricula, String curso, int periodo, int idade,
			int quantidadeDisciplinasPermitidas) {

		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.periodo = periodo;
		this.idade = idade;
		this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
		this.disciplinas = new String[quantidadeDisciplinasPermitidas];
	}

	public Aluno() {
	}

	public String fazMatricula(String disciplina) {
		int tam = 0;

		for (int k = 0; k < this.disciplinas.length; k++) {
			if (this.disciplinas[k] != null) {
				System.out.printf("%s", this.disciplinas[k]);
				tam++;
			}
		}

		if (tam < this.quantidadeDisciplinasPermitidas) {

			for (int i = 0; i < this.quantidadeDisciplinasPermitidas; i++) {
				if (this.disciplinas[i] == null) {
					this.disciplinas[i] = disciplina;
					break;
				}
			}

			return "Matricula na disciplina " + disciplina.toUpperCase() + " realizada com sucesso\n";

		} else if (this.quantidadeDisciplinasPermitidas == 0) {
			return "Este aluno nao pode ser matriculado em nenhuma disciplina e,por favor,fale com a secretaria\n";
		} else {
			return tam + "Quantidade de matriculas excedida.O limite de disciplinas para este aluno e  \n"
					+ this.quantidadeDisciplinasPermitidas
					+ " disciplinas.Se desejar,cancele a matricula de uma das disciplinas e faca a nova matricula\n";

		}
	}

	public String cancelarMatricula(String disciplina) {

		for (int i = 0; i < this.disciplinas.length; i++) {
			// 1,2,3,4,5,6
			if (this.disciplinas[i] != null) {
				if (this.disciplinas[i].equals(disciplina)) {
					for (int j = i+1; j < this.disciplinas.length; j++) {
						this.disciplinas[j - 1] = this.disciplinas[j];
					}
					this.disciplinas[this.disciplinas.length - 1] = null;
					return "Cancelamento de matricula da disciplina " + disciplina + " realizado com sucesso.\n";
				}
			}
		}
		return "Aluno nao esta matriculado na disciplina,portanto nao e possivel cancelar esta matricula.\n";

	}

	public void imprime() {

		System.out.printf("Nome :%s\nMatricula :%s \nCurso :%s \nPeriodo :%d\nIdade :%d\nDisciplinas : %s\n\n\n\n",
				this.nome, this.matricula, this.curso, this.periodo, this.idade, concatenaDisciplinas());
	}

	public String concatenaDisciplinas() {
		String var = "";
		for (String d : this.disciplinas) {
			if (d != null) {
				var += " "+ d;
			}
		}
		return var;
	}

	public String getNome() {
		return this.nome;
	}

	/**
	 * @return the disciplinas
	 */
	
	public String[] getDisciplinas() {
		return disciplinas;
	}

	public int getQuantidadeDisciplinasPermitidas() {
		return this.quantidadeDisciplinasPermitidas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
