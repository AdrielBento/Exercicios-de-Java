
import java.util.ArrayList;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private int periodo;
	private ArrayList<String> disciplinasMatriculadas = new ArrayList<String>();
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
	}

	public Aluno() {
	}

	public String fazMatricula(String disciplina) {

		if (this.disciplinasMatriculadas.size() != this.quantidadeDisciplinasPermitidas) {

			this.disciplinasMatriculadas.add(disciplina);
			return "Matricula na disciplina " + disciplina.toUpperCase() + " realizada com sucesso\n";

		} else if (this.quantidadeDisciplinasPermitidas == 0) {
			return "Este aluno nao pode ser matriculado em nenhuma disciplina e,por favor,fale com a secretaria\n";
		} else {
			return "Quantidade de matriculas excedida.O limite de disciplinas para este aluno e  \n" +this.quantidadeDisciplinasPermitidas
					+ " disciplinas.Se desejar,cancele a matricula de uma das disciplinas e faca a nova matricula\n";

		}
	}

	public String cancelarMatricula(String disciplina) {

		if (this.disciplinasMatriculadas.remove(disciplina)) {
			return "Cancelamento de matricula da disciplina " + disciplina + " realizado com sucesso.\n";
		} else {
			return "Aluno nao esta matriculado na disciplina,portanto nao e possivel cancelar esta matricula.\n";

		}
	}

	public void imprime() {

		System.out.printf("Nome :%s\nMatricula :%s \nCurso :%s \nPeriodo :%d\nIdade :%d\nDisciplinas : %s", this.nome,
				this.matricula, this.curso, this.periodo, this.idade, concatenaDisciplinas());
	}

	public String concatenaDisciplinas() {
		String var = "";
		for (String d : this.disciplinasMatriculadas) {
			var += d;
		}
		return var;
	}

	public String getNome() {
		return this.nome;
	}

	public ArrayList<String> getDisciplinasMatriculadas() {
		return this.disciplinasMatriculadas;
	}

	public int getQuantidadeDisciplinasPermitidas() {
		return this.quantidadeDisciplinasPermitidas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
