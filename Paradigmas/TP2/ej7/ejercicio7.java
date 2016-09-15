import java.util.Scanner;

public class ejercicio7
{
   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       double a, b, c, d;
       
       System.out.println("ingrese la base para el primer rectángulo:");
       a = sc.nextDouble();
       System.out.println("ingrese la altura para el primer rectángulo:");
       b = sc.nextDouble();
       System.out.println("ingrese la base para el segundo rectángulo:");
       c = sc.nextDouble();
       System.out.println("ingrese la altura para el segundo rectángulo:");
       d = sc.nextDouble();
       
       double perimetroRectangulo1 = perimetro(a,b);
       double perimetroRectangulo2 = perimetro(c,d);
      if (a == b || c == d)
      {
          System.out.println("Error, debe ingresar las medidas de un rectangulo");
      }
      else
      {        
      if (perimetroRectangulo1 > perimetroRectangulo2){
           if( a > c && b > d)
           {
               System.out.println("Encajan sin girar");
           }
           else if ((b > c && a > d)|| (b<c && a >d))
           {
               System.out.println("Encajan girando");                
           }
      }   
      else if (perimetroRectangulo1 <= perimetroRectangulo2){
        System.out.println("No encajan");
       }
      } 
   }
   
     // Funcion para determinar el area
      public static Double perimetro(double b, double h){
          return 2*(b+h);    
        }
       
}
       
     

