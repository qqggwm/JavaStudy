class Vehicle{
	protected int wheel,weight;//weight(ton)
	Vehicle(){     //  �޲ι���

    }
    public Vehicle(int wheel,int weight){ //�вι���
        SetVehicle(wheel,weight);
	}
	public void SetVehicle(int wheel,int weight){  //����car��Ա������ֵ
		this.wheel =  wheel;
	    this.weight = weight;
	}	 
	public void SetWheel(int wheel){  //����
		this.wheel =  wheel;
	}
	public void  SetWeight(int weight){  //����
		this.weight =  weight;
	}
	public String VehicleInfo(){     
		
	return "���ָ���: "+this.wheel+"����:"+this.weight+" ��";//������Ϣ
		
	}
}
class Car extends Vehicle{
	  protected int loader; //��������
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
           return super.VehicleInfo()+"��������: "+loader;
	  }		  
      	  
}
class Trunk extends Car{
	  protected int payload;//��������
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
         return super.CarInfo()+" ��������: "+payload;
	  }
	  	
}
class TestCar {
	 public static void main(String[] args){
		Trunk t = new Trunk(4,10,4,5);
        System.out.print(t.TrunkInfo());		
	}
}