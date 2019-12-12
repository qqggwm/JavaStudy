class A
{
	public void show()
	{
		show2();
	}
	
	public void show2()
	{
		System.out.println("我");
	}
}
class B extends A 
{
	public void show2()
	{
		System.out.println("爱");
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
		System.out.println("你");
	}
}
 
public class Test 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.show();//System.out.println("爱"); B->SHOW() ->  B->SHOW2/先找B自己内部的
 
		B b = new C();
		b.show();//C->show()- >  A->show()->C.show2//有限找自己内部的
	}
	}

