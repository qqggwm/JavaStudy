import java.lang.Math;
abstract class Shapes {
	public  int x,y; //x£¬yÎªµÄ×ø±ê  
	public  int width,height;   
	public  Shapes(int x,int y,int width,int height)  {    
		this.x= x;
		this.y= y;
		this.width= width;
		this.height= height;
}   
	public abstract double getArea();  
	public abstract double getPerimeter(); 
}
class Rectangle extends Shapes{
	public Rectangle(int x,int y,int width,int height) {
		super(x,y,width, height);
	}
	
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
}
class Circle extends Shapes{
	double radius,radius2;//°ë¾¶
	public Circle(int x,int y,int radius,int radius2) {
		super(x,y,radius, radius2);
	}
	 public double getArea() {
		 return Math.PI*super.height*super.width;
	}
	public double getPerimeter() {
		return Math.PI*super.height*super.width;
	}
}
class AreaPerimeter{
	public static void main(String[] args) {
		Circle cir = new Circle(0,0,5,5);
		System.out.println(cir.getArea());
	}
}

