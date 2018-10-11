package Default;

public class AuxiliarDeLimpeza extends Funcionario {

	public AuxiliarDeLimpeza(Double salario,String nome) {
		super(salario,nome);
	}

	public AuxiliarDeLimpeza() {
	}

	@Override
	public void getBonus() {
		double totalBonus = super.getSalario()+(super.getSalario()*5)/100;
		super.setSalario(totalBonus);
	}

}
