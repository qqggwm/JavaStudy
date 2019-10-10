import java.util.Arrays;
import java.util.*;

public class Biggest{
    public static void main(String[] agrs){
		
		Biggest number = new Biggest();
		Scanner Biggest = new Scanner(System.in);
		int [] a = new int[5];
		for (int i = 0; i < 3 ; i++  ){
			System.out.println(" 请输入第"+(i+1)+"个数字");
		 	 a[i] = Biggest.nextInt();
		}
		Arrays.sort(a,0,3);
		System.out.println((a[2]));
	}
}