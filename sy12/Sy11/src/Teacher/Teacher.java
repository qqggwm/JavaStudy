package Teacher;
import java.util.Scanner;
public class Teacher {
	private  String name;
	private  int  age;
	

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("��������:");
		int age = sc.nextInt();
		Teacher tea = new Teacher(name,age);
		System.out.println("��ʦ����:"+tea.name);
		System.out.println("��ʦ����:"+tea.age);
	}

}
