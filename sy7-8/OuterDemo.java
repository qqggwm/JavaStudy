interface Inter {
   void show();
}
class Outer{
	public static Inter method(){
		
	return new Inter(){
 		public void show(){
			System.out.println("HelloWorld");
		}
    	};//子类对象
	
	}
}

class OuterDemo {
	public static void main(String[] args){
		Outer.method().show();	//只有静态方法才可以直接调用
	}
}