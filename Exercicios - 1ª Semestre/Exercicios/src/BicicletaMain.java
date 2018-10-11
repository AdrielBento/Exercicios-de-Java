import java.util.Scanner;
public class BicicletaMain {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Bicicleta bmx = new Bmx();
		
		
		bmx.potencia();
		
		int opcao = 0,valor =0;
		
		
		
		
//		while(opcao !=5) {
//			System.out.println("1-Mudar Candencia\n2-Mudar marcha\n3-Aumentar Velocidade\n4-Aplicar Freios\n5-Sair ");
//			opcao= read.nextInt();	
//			
//			
//			switch(opcao) { 
//			
//			case 1:
//				System.out.println("Valor :");
//				valor= read.nextInt();
//				b.mudarCadencia(valor);
//				System.out.printf("Cadencia\n",b.getCadencia());
//				break;
//			case 2:
//				System.out.println("Valor :");
//				valor= read.nextInt();
//				b.mudarMarcha(valor);
//				System.out.printf("Marcha\n",b.getMarcha());
//				break;
//			case 3:
//				System.out.println("Valor :");
//				valor= read.nextInt();
//				System.out.printf("%d",valor);
//				b.aumentarVelocidade(valor);
//				System.out.printf("Velocidade:\n",b.getVelocidade());
//				break;
//			case 4:
//				System.out.println("Valor :");
//				valor= read.nextInt();
//				b.aplicarFreios(valor);
//				System.out.printf("Velocidade com freio:\n",b.getVelocidade());
//				break;
//			case 5:
//				System.exit(0);
//				break;
//			
//			}
//			
//		}
//		

	}

}
