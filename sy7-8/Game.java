import java.util.Arrays;
import java.util.Scanner;
interface Skill{
	public abstract void PersonSkill();
}

abstract class People {
	private int Id;
	private int Blood;
	public People() {
		
	}
	public People(int Id,int Blood) {
		this.Id = Id;
		this.Blood = Blood;
	}
	public void move() {
		System.out.println("i can move!");
	}
	public  void SetId (int Id){
		this.Id = Id;
	}
	public  void SetBlood (int Blood){
		this.Blood = Blood;
	}
	public  int GetId (){
		return this.Id;
	}
	public  int GetBlood (){
		return this.Blood;
	}
	
}
class P1 extends People implements Skill{
	
	public P1() {
		
	}
	public P1(int id,int Blood)
	{
		super(id,Blood);		
	}
	public void PersonSkill() {
		 System.out.println("����:������");
	}	
}
class P2 extends People implements Skill{
	public P2() {
		
	}
	public P2(int id,int Blood)
	{
		super(id,Blood);		
	}
	public void PersonSkill() {
		System.out.println("����:������");
	}
	
}
class P3 extends People implements Skill{
	public P3() {
		
	}
	public P3(int id,int Blood)
	{
		super(id,Blood);		
	}
	public void PersonSkill() {
		System.out.println( "����:һ��ָ");
	}
	
}


public class Game {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ʼ����һλӢ�۵ı��");
		int id =sc.nextInt();
		System.out.println("��ʼ����һλӢ�۵�Ѫ��");
		int blood =sc.nextInt();
		P1 A = new P1(id,blood);
		System.out.println("Ѫ�� ��"+A.GetBlood()+" id��"+A.GetId());
		A.move();A.PersonSkill();
		
		
		System.out.println("��ʼ���ڶ�λӢ�۵ı��");
		 id =sc.nextInt();
		System.out.println("��ʼ���ڶ�λӢ�۵�Ѫ��");
		 blood =sc.nextInt();
	  	P2 B = new P2(id,blood);
	  	System.out.println("Ѫ�� ��"+B.GetBlood()+" id��"+B.GetId());
		B.move();B.PersonSkill();
		
		
		System.out.println("��ʼ������λӢ�۵ı��");
		 id =sc.nextInt();
		System.out.println("��ʼ������λӢ�۵�Ѫ��");
		 blood =sc.nextInt();
	  	P3 C = new P3(id,blood);
	  	System.out.println("Ѫ�� ��"+C.GetBlood()+" id��"+C.GetId());
		C.move();C.PersonSkill();
	
	}
}	