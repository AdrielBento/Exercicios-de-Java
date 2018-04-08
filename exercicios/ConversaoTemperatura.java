
public class ConversaoTemperatura {

    // private double celsius;
    // private double farenheit;
    // private double kelvin;

    // public ConversaoTemperatura(double celsius, double farenheit, double kelvin) {
    //     this.celsius = celsius;
    //     this.farenheit = farenheit;
    //     this.kelvin = kelvin;
    // }

    // public ConversaoTemperatura() {

    // }

    public static void converteFarenheit(Double c) {
        System.out.printf("%f",((9*c)/5)+32);

    }

    public static void convertekelvin(Double c){
        System.out.printf("%f",c+273.15);
    }
    

}
