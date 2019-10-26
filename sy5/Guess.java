import java.util.Scanner;

class Guess{
   public static void main(String[] args){
	    int random = (int) (Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的数据:");
		int data = sc.nextInt();
		while(data!=random)
		{  
		   if(data>random)
             System.out.println("大了");
           else if(data<random)	
             System.out.println("小了");
		     System.out.println("请输入你猜的数据:");
		     data = sc.nextInt();			   
		}		    
   } 
}