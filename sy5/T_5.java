import java.util.Scanner;
class Oblong{
	int chang,kuan;
    public int circ(int chang,int kuan){
		return chang*2+kuan*2;		
	}
	public int area(int chang,int kuan){
		return chang*kuan;		
	}
}
class T_5{
    public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
	   Oblong sq = new Oblong();
	   System.out.println("�����볤��");
	   int chang =sc.nextInt();
                   System.out.println("��������");
	   int kuan =sc.nextInt();
	   System.out.println("�ܳ���"+sq.circ(chang,kuan));
	   System.out.println("�����"+sq.area(chang,kuan));
	   
   }
}