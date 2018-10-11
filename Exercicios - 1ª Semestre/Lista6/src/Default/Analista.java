package Default;

public class Analista extends Funcionario {

	public Analista(Double salario,String nome) {
		super(salario,nome);
	}

	public Analista() {}

	@Override
	public void getBonus() {
		double totalBonus = super.getSalario()*2;
		super.setSalario(totalBonus);

	}

}
