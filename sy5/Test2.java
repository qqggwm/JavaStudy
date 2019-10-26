class Student2{
	private String name;
	int age;
	public void setname(String name){
		this.name = name;		
	}
	public void getname(){
		System.out.println(this.name);	
	}
    public void study(){
      System.out.println("studying");
    }
    public void test(){
      System.out.println("test");
    } 	
}
class Test2{
	  public static void  main(String[] args){
		 Student2 stu = new Student2();
         stu.age =18;
         stu.setname("Tim");
		 System.out.print(" getname: ");
		 stu.getname();	  
	  }
}