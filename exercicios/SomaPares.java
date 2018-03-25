import java.util.*;
import java.util.Scanner;

public class SomaPares {

	public static void main(String[] args) {
		String aux = "";
		int i= 0;
		Double total  = 0.0;
		Double vetor[] = new Double[20];
		Scanner read = new Scanner(System.in);
		
		while(i<=19) {
			try {

				System.out.printf("Digite o valor °%d :",i+1);					
			     vetor[i] = read.nextDouble();
                // read.nextLine();
                 i++;
				                 
				}catch(NumberFormatException | InputMismatchException  e) {
				System.out.println("Valor invalido.Por favor digite outro argumento");
			}		
		}
		
		for(Double v : vetor) {
			if((v%2) == 0) {
				total+=v;			
			}			
		}
		System.out.printf("Total da soma dos numeros pares :%.2f\n total de elemento : %d",total,i);
		
	}
}
