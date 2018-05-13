package Default;

public class SistemaRH {

	public static void main(String[] args) {

		Gerente g1 = new Gerente(4000.0, "Ronaldo");
		Diretor d1 = new Diretor(5000.0, "João");
		Analista a1 = new Analista(3000.0, "Ricardo");
		Programador p1 = new Programador(3000.0, "Adriel");
		AuxiliarDeLimpeza adl = new AuxiliarDeLimpeza(1000.0, "Roberta");

		g1.gerenciarFuncionario(a1);
		g1.gerenciarFuncionario(p1);
		g1.gerenciarFuncionario(adl);
		a1.getBonus();
		p1.getBonus();
		adl.getBonus();
		imprimeRelatorio(g1.getListaFuncionarios());
		

	}

	public static void imprimeRelatorio(Funcionario[] listaFuncionarios) {

		for (Funcionario f : listaFuncionarios) {
			
			if (f != null) {
				System.out.printf("Nome: %s  Salario: %.2f\n", f.getNome(), f.getSalario());
			}			
		}
	}

}
