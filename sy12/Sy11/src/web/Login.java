package web;
import java.util.Scanner;
public class Login {
	protected String name;
	protected String password;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login user = new Login("root","root520");		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������˺�");
		String name = sc.nextLine();
		
		System.out.println("����������");
		String pw = sc.nextLine();
		
		for(int i = 0; i<3 ; i++) {
			if(i==2)
			{
				System.out.println("�����˻����������Ա��ϵ��");
				break;
			}
			if ( name.equals(user.name)&&pw.equals(user.password))
			{
				System.out.println("��½�ɹ�");
				break;
			}
			else if(!name.equals(user.name)) 		
			{	
				System.out.println("����"+(2-i)+"�λ���");
				System.out.println("�û��������ڣ�������");
				System.out.println("�������˺�");
				name = sc.nextLine();
				System.out.println("����������");
				pw = sc.nextLine();
				continue;
			}
			else if(!pw.equals(user.password)) {
				System.out.println("����"+(2-i)+"�λ���");
				System.out.println("�����������������");
				System.out.println("����������");
				pw = sc.nextLine();
			}
			
		}
		
	}

}
