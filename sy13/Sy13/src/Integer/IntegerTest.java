package Integer;

import java.util.Scanner;
public class IntegerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String input = null;
	while(true){
	int style = -1;
	input = sc.nextLine();
	try{
		int i = Integer.valueOf(input);	//字符串-》Integer
		style = 0;
		System.out.println("您输入的是一个整数："+i);
	}
	catch(Exception e)
	{		
	}
		if(style!=0)
		{		
			try{
				float f = Float.valueOf(input);
				style = 1;
				System.out.println("您输入的是一个小数："+f);
				}
			catch(Exception e)
			{
				
			}
		if(style==-1)
		{
			System.out.println("您输入的是一个字符串："+input);
		}
		}
	}
	}
}
