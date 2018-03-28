import java.util.*;
import java.util.Scanner;

public class SomaPares {

	public static void main(String[] args) {
		String aux = "";
		int i= 0;
		double total  = 0.0;
	    double vetor[] = new double[20];
		Scanner read = new Scanner(System.in);
		
		while(i<=19) {
			System.out.printf("Digite o valor °%d :",i+1);					
			aux = read.next();
			try {
			    vetor[i] = Double.parseDouble(aux);
                //read.nextLine();             
			    i++;
				}catch(Exception  e) {
				
				System.out.println("Valor invalido.Por favor digite outro argumento");			    
			}			
		   
		}
		
		for(double v : vetor) {
			if((v%2) == 0) {
				total+=v;			
			}			
		}
		
//		for (int j = 0; j < vetor.length; j++) {
//			
//			if((vetor[j]%2) == 0) {
//				total+=vetor[j];			
//			}	
//		}
		System.out.printf("Total da soma dos numeros pares :%.2f\n total de elemento : %d",total,i);
		
	}
}
