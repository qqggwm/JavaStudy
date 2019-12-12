class A
{
	public void show()
	{
		show2();
	}
	
	public void show2()
	{
		System.out.println("��");
	}
}
class B extends A 
{
	public void show2()
	{
		System.out.println("��");
	}
}
class C extends B 
{
	public void show()
	{
		super.show();
	}
	
	public void show2()
	{
		System.out.println("��");
	}
}
 
public class Test 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.show();//System.out.println("��"); B->SHOW() ->  B->SHOW2/����B�Լ��ڲ���
 
		B b = new C();
		b.show();//C->show()- >  A->show()->C.show2//�������Լ��ڲ���
	}
	}

