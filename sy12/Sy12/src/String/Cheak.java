package String;
import java.util.Scanner;

public class Cheak {
	
	public static boolean isChar(String str) {
		String regex ="^[a-zA-Z]+$";
		return str.matches(regex);
	}
	public static boolean isNumber(String psw) {
		String regex ="^[0-9]+$";
		return psw.matches(regex);
		
	}
	public static boolean ischeckCode(String checkCode) {
		String regex ="^[a-zA-Z].*$";
		return checkCode.matches(regex);
		
	}
	public static void main(String[] agrs) {
		String name = "root";
		String psw =  "123456";
		String checkCode = "A123";

		Scanner sc = new Scanner(System.in);
		
				
		
		for(int i=2;i>=0;i--)
		{
			System.out.println("输入用户名:");
			String getname = sc.nextLine();
			System.out.println("输入密码:");
			String getpwd = sc.nextLine();
			System.out.println("输入验证码:");
			String getcheckCode = sc.nextLine();
			
			
			if(getname.equals(name)) {
				
				if(getpwd.equals(psw)) 
				{
					if (getcheckCode.equals(checkCode)) 
					{
						System.out.println("登陆成功！");
						break;
					}
					 					
				}
				else if(!isNumber(getpwd)) 
				{
					System.out.println("密码必须为数字");
				}
				else if(!getpwd.equals(psw))
				{
						System.out.println("密码错误");
				}
				
				if(!ischeckCode(getcheckCode)) 
				{
					System.out.println("验证码必须字母开头");
				}
				else  if(!getcheckCode.equals(checkCode))
				{
					System.out.println("验证码错误");
				}
				
			}
			else if(!isChar(getname)) 
				{
					System.out.println("用户名必须为字母");
				}
				else if(!getname.equals(name))
				{
					System.out.println("用户名错误");
				}
			if(i==0){
				System.out.println("登陆失败！锁定账户并提示用户与管理员联系");
				break;
			}
			System.out.println("您还有"+i+"次机会！");
										
		}				
	}
}
