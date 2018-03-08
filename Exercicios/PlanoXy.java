import java.util.Scanner;

public class PlanoXy {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);//instância objeto Scanner

        System.out.print("Digite o ponto A :");
        String pontoA = ler.nextLine();
        System.out.print("Digite o ponto B :");
        String pontoB = ler.nextLine();
 
        String[] cordenadasA = pontoA.split(",");
        String[] cordenadasB = pontoB.split(",");
 
        System.out.println(Calc(cordenadasA, cordenadasB));
    }

    public static double Calc(String[] cordenadasA, String[] cordenadasB) {
        int xA = Integer.parseInt(cordenadasA[0]);
        int yA = Integer.parseInt(cordenadasA[1]);
        int xB = Integer.parseInt(cordenadasB[0]);
        int yB = Integer.parseInt(cordenadasB[1]);

        double x = Math.pow(xB - xA, 2);
        double y = Math.pow(yB - yA, 2);
        double resultXy = Math.sqrt(x + y);
        return resultXy;
    }
}