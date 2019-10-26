class Student3{
	private String name;
	int age;
                public Student3(){
	
	}
	public Student3(String name,int age){
		this.name = name;	
                                this.age = age;		
	}
	public String getname( )
              {
	   return name;	
	}
               public void study()
               {
               System.out.println("studying");
               }
               public void test()
               {
               System.out.println("test");
               } 	
}
class Test3{
	  public static void  main(String[] args){
		 Student3 stu = new Student3("weiming",18);
		 System.out.print("name: "+stu.getname()+"  aeg: "+stu.age);
		  
	  }
}
