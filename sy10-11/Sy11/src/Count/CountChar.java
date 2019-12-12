package Count;
import java.util.Scanner;
public class CountChar {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int numberCount=0,smallCount=0,bigCount=0;
		for(int i = 0;i<s.length();i++) {
			
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')	numberCount++;
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') 	smallCount++;
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')	bigCount++;
		}
		System.out.println("´óÐ´"+bigCount+"Ð¡Ð´"+smallCount+"Êý×Ö"+numberCount);
	}
}
