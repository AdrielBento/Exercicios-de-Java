package Default;

public class Programador extends Funcionario {

	public Programador(Double salario,String nome) {
		super(salario,nome);
	}

	public Programador() {}

	@Override
	public void getBonus() {
		double totalBonus = super.getSalario()+(super.getSalario()*8)/100;
		super.setSalario(totalBonus);
	}

}
