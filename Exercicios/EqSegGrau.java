public class EqSegGrau{
   public static void main(String[] args) {
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = Integer.parseInt(args[2]);

        calculaEquacao(a,b,c);

   }
   public static int calculaEquacao(int a ,int b,int c){
    int ponteciaDeB  = (int) Math.pow(b,2);
    int delta = ponteciaDeB + (4*a*c);
    int raizDelta = Math.sqrt(delta);
    int b  = 0 -(ponteciaDeB)

    
    
   }
}