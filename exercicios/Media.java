import java.util.*;

import java.util.Scanner;
//import java.util.Arrays;


public class Media {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Double valores[] = new Double[50];
		int i = 0;
		String aux = " ";
		Double resposta[] = new Double[1];
		
				
		while(aux != "s") {
		try {
			
			System.out.println("Digite um valor numerico ou Digite 's' para sair:");
			aux=read.next();
			read.nextLine();

			if(aux.equals("s")) {
				aux = "s";
				if(valores!= null) {
				resposta = soma(valores);
				System.out.printf(" Numero de elementos : %.0f \n Media dos elementos: %.2f",resposta[1],resposta[0]);
				}
				
			}else if(!aux.equals("")){
				
				valores[i] = Double.parseDouble(aux);
				i++;
			}
					 
		}catch ( IllegalFormatConversionException e) {
			System.out.println("Erro de conversao dados");	
		}catch(InputMismatchException e) {			
			System.out.println("Erro ao inserir");	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Tamanho do array menor que o numero de argumentos inseridos");
		}catch(NumberFormatException  e) {
			System.out.println("Valor invalido.Por favor digite outro argumento");
		}
	
	}
		
		
		
//		NumberFormatException
//	InputMismatchException = Execeção paraao inserir um tipo de dado inesperado 
		
	}
	
	public static Double[] soma(Double[] vetor) {
		
		Double media = 0.0;
		Double total = 0.0;
		Double cont = 0.0;
		
		for(Double v:vetor) {							
			if(v!= null) {
				total+=v;
				cont++;
			}					
		}
		media =total/cont;
		return new Double[] {media,cont};
	}
	
}
