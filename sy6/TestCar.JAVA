class Vehicle{
	protected int wheel,weight;//weight(ton)
	Vehicle(){     //  无参构造

    }
    public Vehicle(int wheel,int weight){ //有参构造
        SetVehicle(wheel,weight);
	}
	public void SetVehicle(int wheel,int weight){  //设置car成员变量赋值
		this.wheel =  wheel;
	    this.weight = weight;
	}	 
	public void SetWheel(int wheel){  //车轮
		this.wheel =  wheel;
	}
	public void  SetWeight(int weight){  //车重
		this.weight =  weight;
	}
	public String VehicleInfo(){     
		
	return "车轮个数: "+this.wheel+"车重:"+this.weight+" 吨";//车辆信息
		
	}
}
class Car extends Vehicle{
	  protected int loader; //限载人数
	  public  Car(){
		  
	  }
	  public void Car(int wheel,int weight,int loader){
		   SetVehicle(wheel,weight);
		   SetLoader(loader);
	  }
	  
      public void SetLoader(int loader){
           this.loader = loader ;
	  }
	  public String CarInfo(){
           return super.VehicleInfo()+"限载人数: "+loader;
	  }		  
      	  
}
class Trunk extends Car{
	  protected int payload;//有限重量
	  public  Trunk(){
		  
	  }
	  public Trunk(int wheel,int weight,int loader,int payload){
	      Car(wheel,weight,loader);
          SetPayload(payload);	   
	  }
	  public void SetPayload(int payload){
         this.payload = payload ;
	  }	
	  public String TrunkInfo(){
         return super.CarInfo()+" 有限重量: "+payload;
	  }
	  	
}
class TestCar {
	 public static void main(String[] args){
		Trunk t = new Trunk(4,10,4,5);
        System.out.print(t.TrunkInfo());		
	}
}