class Rectangle{
    protected int width,height,area,zhouchang;
    public Rectangle(){

	}		
	public Rectangle(int width,int height)
	{
      this.width =width;
	  this.height =height;
	}	
	public int GetArea()
	{
		area = width*height;
		return area;
	}
	public int GetPermeter()
	{
	    zhouchang = 2*width + 2*height;	
		return zhouchang;
	}	
	
}
class Square extends Rectangle {
	protected int bianchang;
	public Square(){

	}
	public Square(int bianchang)
	{
      this.bianchang = bianchang;
	}
	public int GetArea(int width,int height)
	{
		area = width*height;
		return area;
	}
	 public int GetPermeter(int bianchang)
	{
	    zhouchang = 4*bianchang;	
		return zhouchang;
	}
	
}
class Area {
	public static void main(String[] args){
		Rectangle A = new Rectangle(10,5);
		System.out.println("面积为："A.GetArea());
	}
}
