class A{
 	int sum,num1,num2;
    public A(){
    	num1=10;
        num2=20;
        sum=0;
    }
    void sum1(){
    	sum=num1+num2;//30
    	System.out.println("sum="+num1+"+"+num2+"="+sum);   	
    }
    void sum2(int n){
    	num1=n;    
    	sum=num1+num2;
    	System.out.println("sum="+num1+"+"+num2+"="+sum);   	
    }
 }
 
 class B extends A{
 	int num2;
    public B(){
    	num2=200;
    }
    void sum2(){
    	sum=num1+num2;
    	System.out.println("sum="+num1+"+"+num2+"="+sum);
    }
    void sum2(int n){
    	num1=n;
    	sum=num1+num2;
    	System.out.println("sum="+num1+"+"+num2+"="+sum);
    }
    void sum3(int n){
    	super.sum2(n);
    	System.out.println("sum="+num1+"+"+num2+"="+sum);
    }
 }
 public class test{
 	public static void main (String arg[]){
 		B m=new B();
        m.sum1();//30
        m.sum2();//210
        m.sum2(50);//250
        m.sum3(50);//70   210
    }
 }
