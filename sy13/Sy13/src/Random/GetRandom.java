package Random;
import java.util.Scanner;
public class GetRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		int start = sc.nextInt(),end=sc.nextInt();
		int ramdon = (int) (Math.random()*100+1);
		for(int i = 0; i <100  ; i++) {
			System.out.println((int) (Math.random()*(end-start+1)+start));
		}
	}

}
