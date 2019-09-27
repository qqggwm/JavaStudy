import java.util.Scanner;
class Score{
    public static void main(String args[ ]){
              Scanner input = new Scanner(System.in);
              System.out.println("请输入分数score: ");
              Double score = input.nextDouble(); 
              if (score >100 || score <0)
              System.out.println("输入错误 ");  
       
       else if (   score<=100 && score>=90) 
              System.out.println("优秀 ");
              
       else if( score<90 && score >=80 ) 
              System.out.println("良好");
              
       else if( score <80 && score >=70 )
              System.out.println("中等");
              
       else if( score <70 && score >=60 )
              System.out.println( "及格");
             
        else if( score >=0 && score <60) 
               System.out.println("不及格 ");
               
   } 
}