import java.util.Scanner;
class Score{
    public static void main(String args[ ]){
              Scanner input = new Scanner(System.in);
              System.out.println("���������score: ");
              Double score = input.nextDouble(); 
              if (score >100 || score <0)
              System.out.println("������� ");  
       
       else if (   score<=100 && score>=90) 
              System.out.println("���� ");
              
       else if( score<90 && score >=80 ) 
              System.out.println("����");
              
       else if( score <80 && score >=70 )
              System.out.println("�е�");
              
       else if( score <70 && score >=60 )
              System.out.println( "����");
             
        else if( score >=0 && score <60) 
               System.out.println("������ ");
               
   } 
}