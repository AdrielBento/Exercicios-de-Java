import java.util.Scanner;

public class BonusAnual {
    public static void main(String[] args) {

        float bonus = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("1-Diretor 2-Gerente 3-Analista 4-Programador 5-Auxiliar de Limpeza");
        int cargo = read.nextInt();
        System.out.print("Salario:");
        float salario = read.nextFloat();

        if (cargo == 1) {
            System.out.print("Digite a quantidade de Departamento gerenciados :");
            int numDep = read.nextInt();
        } else if (cargo == 2) {
            System.out.print("Digite a quantidade de Pessoas gerenciadas :");
            int numPe = read.nextInt();
        }

        switch (cargo) {
        case 1:
            bonus = (4 * salario) + 3000;
            break;

        case 2:
            bonus = (2 * salario) + 100;
            break;
        case 3:
            bonus = salario;
            break;
        case 4:
            bonus = (salario * 0.8f);
            break;

        case 5:
            bonus = (salario * 0.5f) / 100;
            break;
        }
        System.out.printf("Seu bonus Anual  e de %f", bonus);
    }
}