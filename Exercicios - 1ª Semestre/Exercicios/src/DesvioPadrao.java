import java.util.*;
import java.util.Scanner;

public class DesvioPadrao {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int numAmostras =0;
		Double var = 0.0;
		Double dp = 0.0;
		Double media = 0.0;
     	int i=0;
		
     	System.out.println("Digite o numero de amostras :");
		numAmostras=read.nextInt();
		
		Double amostras[] = new Double[numAmostras];
		
		while(i<=numAmostras-1) {			
			System.out.printf("Digite o %d° valor :",i+1);
			amostras[i] = read.nextDouble();	
			i++;
		}
		
		for(Double a : amostras) {
			media+=a;
		}
		//Determina a média aritimética 
		media = media/numAmostras;
		//System.out.printf("media %f",media);
		
		for(Double a : amostras) {
			var+= Math.pow((a-media),2);
			
		}
		//Determina a variância populacional  ou variância amostral  numamostras-1
		var = var/(numAmostras-1);
		
		dp=Math.sqrt(var) ;
	
		System.out.printf("Desvio padrão : %.2f\n Variância : %.2f",dp,var);
		
		
	}

}
