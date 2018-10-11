public class Exercicio4L2{
   public static void main(String[] args) {
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = Integer.parseInt(args[2]);
       int[] result = new int[2];
         
       if(a==0){
             System.out.println("Não se trata de uma equação do segundo grau");
         }else{    
             result = calculaEquacao(a,b,c);
             System.out.printf("As raizes dessa equacao sao :%d %d",result[1],result[0]);
        }

   }
   public static int[] calculaEquacao(int a ,int b,int c){
        int delta = ((b*b)-(4*a*c));
        if (delta<0){
            System.out.println("Não há soluções que possam ser expressas com o conjunto dos números reais");
        }
        int x1 = (int)(( -b + (Math.sqrt (delta)))  / ( 2*a ) );
        int x2 = (int)(( -b - (Math.sqrt (delta)))  / ( 2*a ) ); 
        int[] raizes = new int[2];
        raizes[0] =  x1;
        raizes[1] =  x2;
        return raizes;
   }
}
