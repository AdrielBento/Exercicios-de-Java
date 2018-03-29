import java.util.Scanner;
public class Empresa {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int funcionario = 0;
		int i = 0;
		Double total = 0.0;
		Double media= 0.0;
		int cont = 0;
		int j = 0;
		String aux = "";
		boolean test = false;
		
		do {
			System.out.println("Quantos funcionario existem na empresa ?");
			aux = read.next();	
			try {
				
				funcionario  = Integer.parseInt(aux);
				test= true;
				
			}catch (NumberFormatException e) {
				test=false;
				System.out.println("");
			}
		}while(!test);
		
		
		String StrFuncionario [] = new String[funcionario];
		Double DlbFuncionario [] = new Double[funcionario];
		
		while(i<funcionario) {
				try {					
				
					System.out.println("Nome do Funcionario");
					StrFuncionario[i] = read.next();
					System.out.println("Salário do funcionario");
					DlbFuncionario[i] = read.nextDouble();
					i++;
					read.nextLine();
				}catch ( Exception e) {
					System.out.println("Erro ao inserir");
				}
		}
		
		for(Double v : DlbFuncionario) {
			total += v;
			cont++;
			}
		
		  media = total/cont;				  
		  System.out.printf("A media salarial da empresa é :%.2f\n",media);	
		  i=0;
		  for(Double v: DlbFuncionario) {
			  
			  if(v>media) {
			  System.out.printf("Salarios acima da media\n Nome : %s  Salario : %.2f ",StrFuncionario[i],v);	
			  }
			  i++;
		  }
				  
	}

}
