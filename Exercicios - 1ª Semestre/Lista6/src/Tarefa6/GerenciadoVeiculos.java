package Tarefa6;

import java.util.Scanner;

public class GerenciadoVeiculos {

	public static void main(String[] args) {

	
		Scanner read = new Scanner(System.in);
		String aux = "";
		int qtdV = 0;
		System.out.println("Quantidade de veiculos :");
		qtdV = read.nextInt();
		Veiculo[] list = new Veiculo[qtdV];		
		
		
	for (int i = 0; i < qtdV; i++) {
		
		System.out.println("Tipo do veiculo");
		aux = read.nextLine();
		aux.toUpperCase();
		
		switch(aux) {
		
			case "CARRO" :
				System.out.println("nmCarro");
				System.out.println("nmPoltronas :");
				System.out.println("Marca do carro:");
				System.out.println("Peso");
				System.out.println("Quantidade Rodas:");
				System.out.println("Velocidade:");
				
				list[i] = 
				break;
			case "AVIAO":
				break;
			case "BARCO":
				break;
				
			
		}
	}
		
		
		
		
		
		
	}

}
