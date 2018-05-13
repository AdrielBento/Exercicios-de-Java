
import java.util.Scanner;

public class PainelConversaoTemp {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double valor = 0.0;
        int opcao = 0;

        while(opcao != 7){

            System.out.println(
                    "1-Conversao de Celsius para Farenheit\n2-Conversao  de Celsius para Kelvin\n3-Kelvin para Farenheit\n4-Kelvin para Celsius\n5-Farenheit para Celsius\n6-Farenheit para Kelvin\n7-Sair");
            opcao = read.nextInt();
            switch (opcao) {
            case 1:
                System.out.println("Valor em Celsius");
                valor = read.nextDouble();
                ConversaoTemperatura.conCelParaFare(valor);
                break;
            case 2:
                System.out.println("Valor em Celsius");
                valor = read.nextDouble();
                ConversaoTemperatura.conCelParakel(valor);
                break;

            case 3:
                System.out.println("Valor em Kelvin");
                valor = read.nextDouble();
                ConversaoTemperatura.conKelParaFare(valor);
                break;

            case 4:
                System.out.println("Valor em Kelvin");
                valor = read.nextDouble();
                ConversaoTemperatura.conKelParaCel(valor);
                break;

            case 5:
                System.out.println("Valor em Farenheit");
                valor = read.nextDouble();
                ConversaoTemperatura.conFareParaCel(valor);
                break;

            case 6:
                System.out.println("Valor em farenheit");
                valor = read.nextDouble();
                ConversaoTemperatura.conFareParaKel(valor);
                break;

            }
        }
    }

}

