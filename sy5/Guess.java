import java.util.Scanner;

class Guess{
   public static void main(String[] args){
	    int random = (int) (Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		System.out.println("��������µ�����:");
		int data = sc.nextInt();
		while(data!=random)
		{  
		   if(data>random)
             System.out.println("����");
           else if(data<random)	
             System.out.println("С��");
		     System.out.println("��������µ�����:");
		     data = sc.nextInt();			   
		}		    
   } 
}