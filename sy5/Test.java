class Student{
	String name;
	int age;
    public Student(String name,int age){
        this.name = name;
       this.age = age;
  }
    public void study(){
      System.out.println("studying");
    }
    public void test(){
      System.out.println("test");
    } 	
}
class Test{
	  public static void  main(String[] args){
		 Student stu = new Student("Tim",18);
         /*stu.name = "Tim";
         stu.age =18;*/
         System.out.println("student's name is:"+stu.name);
         System.out.print("function is: ");
         stu.study();
		 System.out.print("function is: ");
		 stu.test();	  
	  }
}