public class EqSegGrau{

public static void main(String[] args) {
    
double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]); 
double c = Double.parseDouble(args[2]);
double x  = 0.0;
double div = 0.0;
double x1 = 0.0;
double x2 = 0.0;
double delta = Math.pow(b,2) - (4 * a * c);
 
div = 2*a;
b = -(b);
 delta = Math.sqrt(delta);


 x1 = (b - delta )/div;
 x2 = (b + delta )/div;
 System.out.println("X':"+x1);
 System.out.println("X'':"+x2);
}

}