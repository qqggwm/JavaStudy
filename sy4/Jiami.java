import java.util.Scanner;
class Jiami{
     public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int [] arr = new int[8];
        int i = 0;		
        while(data%10!=0)
		{
		   arr[i++] = data%10;
           data/=10;		   
		}			
	    for(int a :arr)
			 System.out.print(a);
	 
    } 
}