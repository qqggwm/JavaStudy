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
	public int GetArea()
	{
		area = bianchang*bianchang;
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
		Rectangle R = new Rectangle(10,5);
		Square S = new Square(5);
		Rectangle [] arr = new Rectangle[2];
		arr[0] = R;
		arr[1] = S;
        //System.out.println("面积和为："+S.GetArea());              
	    System.out.println("面积和为："+(arr[0].GetArea()+arr[1].GetArea()));
	}
}
