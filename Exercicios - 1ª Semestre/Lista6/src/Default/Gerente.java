package Default;

public class Gerente extends Funcionario {

	public Funcionario[] listaFuncionarios = new Funcionario[10];
	
	

	public Gerente(Double salario,String nome) {
		super(salario,nome);
	}

	public Gerente() {		
	}

	@Override
	public void getBonus() {
		double totalBonus = (super.getSalario() * 2) + (100.0 * listaFuncionarios.length);
		super.setSalario(totalBonus);
	}
	
	public void gerenciarFuncionario(Funcionario f) {
		Funcionario[] ls = listaFuncionarios;	
		
		for(int i=0;i<ls.length;i++) {
											
			if(ls[i] ==  null) {
				ls[i] = f;			
				System.out.printf("Gerente %s gerencia o funcionario %s !\n",super.getNome(),f.getNome());
				break;
			}			
		}
	}
	
	public Funcionario[] getListaFuncionarios() {
		return listaFuncionarios;
	}

}
