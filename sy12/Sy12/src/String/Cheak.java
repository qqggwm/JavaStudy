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
			System.out.println("�����û���:");
			String getname = sc.nextLine();
			System.out.println("��������:");
			String getpwd = sc.nextLine();
			System.out.println("������֤��:");
			String getcheckCode = sc.nextLine();
			
			
			if(getname.equals(name)) {
				
				if(getpwd.equals(psw)) 
				{
					if (getcheckCode.equals(checkCode)) 
					{
						System.out.println("��½�ɹ���");
						break;
					}
					 					
				}
				else if(!isNumber(getpwd)) 
				{
					System.out.println("�������Ϊ����");
				}
				else if(!getpwd.equals(psw))
				{
						System.out.println("�������");
				}
				
				if(!ischeckCode(getcheckCode)) 
				{
					System.out.println("��֤�������ĸ��ͷ");
				}
				else  if(!getcheckCode.equals(checkCode))
				{
					System.out.println("��֤�����");
				}
				
			}
			else if(!isChar(getname)) 
				{
					System.out.println("�û�������Ϊ��ĸ");
				}
				else if(!getname.equals(name))
				{
					System.out.println("�û�������");
				}
			if(i==0){
				System.out.println("��½ʧ�ܣ������˻�����ʾ�û������Ա��ϵ");
				break;
			}
			System.out.println("������"+i+"�λ��ᣡ");
										
		}				
	}
}
