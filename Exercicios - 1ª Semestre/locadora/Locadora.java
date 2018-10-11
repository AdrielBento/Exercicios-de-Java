package exercicios.locadora;

/**Classe que calcula o faturamento anual e multas mensais de uma locadora
 * @author Adriel Bento
*/
public class Locadora {
    public static void main(String[] args) {
        double quantDvds = Double.parseDouble(args[0]);
        double valueDvds = Double.parseDouble(args[1]);

        System.out.printf("O seu faturamento e de :R$%.2f\nTotal de multas no mes :R$%.2f\n",
                faturamento(quantDvds, valueDvds), multasDoMes(quantDvds, valueDvds));
    }

    /**Método que o faturamento anual de uma locadora
    * @param quantDvds int - Quantidade de dvds da locadora
    * @param valuesDvds double - Valor do aluguel de cada Dvd
    * @return Double - valor da multa por mes
    */

    public static double faturamento(double quantDvds, double valueDvds) {
        double faturaPorMes = (quantDvds / 3.0) * valueDvds;
        double fatura = faturaPorMes * 12;
        return fatura;
    }

    /**Método que calcula as multas mensais de uma locadora
    * @param  quantDvds int - Quantidade de dvds da locadora
    * @param  valuesDvds double - Valor do aluguel de cada Dvd
    * @return Double - valor da multa por mes
    */

    public static double multasDoMes(double quantDvds, double valueDvds) {
        double dezPorcento = (valueDvds * 10.0) / 100;        
        double multaPorMes = (quantDvds/3)/10 * dezPorcento;       
        return multaPorMes;
    }

}