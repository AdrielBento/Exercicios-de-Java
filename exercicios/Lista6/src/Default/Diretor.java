package Default;

public class Diretor extends Funcionario {

	private String[] departamentos = new String[10];

	@Override
	public void getBonus() {

		double totalbonus = (super.getSalario() * 4) + (3000.0 * departamentos.length);
	}

	public Diretor(Double salario,String nome) {
		super(salario,nome);
	}

	public void gerenciaDepartamento(String dep) {

		for (int i = 0; i < departamentos.length; i++) {

			if (departamentos[i] != null) {
				departamentos[i] = dep;
			}
		}
	}
}
