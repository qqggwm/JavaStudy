import java.util.Arrays;
class T_3{
   public static void main(String[] args){
	  int[] amount = {60,27,42,63,19,31};
      int [] number = Arrays.copyOf(amount,6);
      
	  System.out.println("amount");	            
	  for(int a:amount)
		System.out.print(a+" ");
	  System.out.println();
      System.out.println("number");	             
	  for(int b:number)
		System.out.print(b+" ");		
     }
}