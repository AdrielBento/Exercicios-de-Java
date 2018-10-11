public class CalcVelo {

    public static void main(String[] args) {

        float distancia = Float.parseFloat(args[0]);
        float tempo = Float.parseFloat(args[1]);
        float velocidade = distancia / tempo;

        System.out.printf("A velocidade media e de %.2f",velocidade);
    }
}