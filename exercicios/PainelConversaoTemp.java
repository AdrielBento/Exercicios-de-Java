
import java.util.Scanner;

public class PainelConversaoTemp {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double valor = 0.0;
        int opcao = 0;

        System.out.println("1-Conversao para Farenheit\n2-Conversao para Kelvin");
        opcao = read.nextInt();
        switch (opcao) {
        case 1:
            System.out.println("Valor em Celsius");
            valor = read.nextDouble();
            ConversaoTemperatura.converteFarenheit(valor);
            break;
        case 2:
            System.out.println("Valor em Celsius");
            valor = read.nextDouble();
            ConversaoTemperatura.convertekelvin(valor);
        break;
        }

    }

}