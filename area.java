import java.util.Scanner;

class Area {
   
    public static void main(String args[]){

       Scanner input = new Scanner(System.in);
        
       int a = input.nextDouble();
       int b = input.nextInt();
       int c = input.nextInt();
       double s=(a+b+c)/2;
       double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println(area);
   }
}