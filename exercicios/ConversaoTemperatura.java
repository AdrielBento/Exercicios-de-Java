
public class ConversaoTemperatura {

     public static void conCelParaFare(Double c) {
        System.out.printf("%f", ((9 * c) / 5) + 32);

    }

    public static void conCelParakel(Double c) {
        System.out.printf("%f\n", c + 273.15);
    }

    public static void conKelParaFare(Double k) {
        System.out.printf("%f\n", 1.8 * (k - 273) + 32);
    }

    public static void conKelParaCel(Double k) {
        System.out.printf("%f\n", k - 273);
    }

    public static void conFareParaKel(Double f) {
        System.out.printf("%f\n", (f + 459.67)*0.55);
    }

    public static void conFareParaCel(Double f) {
        System.out.printf("%f\n",(f-32)/1.8);
    }

}
