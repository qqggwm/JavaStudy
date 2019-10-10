import java.util.Scanner;
class Function {
    public static void main(String args[]){
              Scanner input = new Scanner(System.in);
              System.out.println("«Î ‰»Î ˝æ›x:");
              Double y=0.0;
              Double x = input.nextDouble(); 
              
              if(  x < 1 )   y = x;
              
              else if (x >= 1 && x < 10)  y = 2*x-1;
              
              else if (x>=10)  y = 3*x-11;
              System.out.println(y);
     } 
}