import org.omg.CORBA.PUBLIC_MEMBER;

public class Locadora {
    public static void main(String[] args) {
        int quantDvds = Integer.parseInt(args[0]);
        float valueDvds = Float.parseFloat(args[1]);

        System.out.printf("O seu faturamento e de :R$%.2f\nTotal de multas no mes :R$%.2f\n"
        ,faturamento(quantDvds, valueDvds),multasDoMes(quantDvds, valueDvds));
    }

    public static float faturamento(int quantDvds, float valueDvds) {
        float faturaPorMes = (quantDvds / 3) * valueDvds;
        float fatura = faturaPorMes * 12;
        return fatura;
    }

    public static float multasDoMes(int quantDvds, float valueDvds) {
        float dezPorcento = (valueDvds * 10) / 100;
        float multaPorMes = (quantDvds / 10) * dezPorcento;
        return multaPorMes;
    }

}