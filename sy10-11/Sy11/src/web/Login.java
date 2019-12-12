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
		
		System.out.println("请输入账号");
		String name = sc.nextLine();
		
		System.out.println("请输入密码");
		String pw = sc.nextLine();
		
		for(int i = 0; i<3 ; i++) {
			if(i==2)
			{
				System.out.println("锁定账户！请与管理员联系！");
				break;
			}
			if ( name.equals(user.name)&&pw.equals(user.password))
			{
				System.out.println("登陆成功");
				break;
			}
			else if(!name.equals(user.name)) 		
			{	
				System.out.println("还有"+(2-i)+"次机会");
				System.out.println("用户名不存在，请重试");
				System.out.println("请输入账号");
				name = sc.nextLine();
				System.out.println("请输入密码");
				pw = sc.nextLine();
				continue;
			}
			else if(!pw.equals(user.password)) {
				System.out.println("还有"+(2-i)+"次机会");
				System.out.println("密码输入错误，请重试");
				System.out.println("请输入密码");
				pw = sc.nextLine();
			}
			
		}
		
	}

}
