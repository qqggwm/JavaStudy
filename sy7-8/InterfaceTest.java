import java.util.Scanner;
interface Soundable {    
    public void increaseVolume( );
    public void decreaseVolume( );
    public void stopSound( );
    public void playSound( );
}

class Radio implements Soundable {
  public void increaseVolume( ) {
	  System.out.println("��������������");
  }
  
  public void decreaseVolume( ) {
	  System.out.println("��С����������");
  }
  public void stopSound( ) {
	  System.out.println("�ر�������");
  }
  public void playSound( ) {
	  System.out.println("���������Ź㲥");
  }
}

class Walkman implements Soundable {
  public void increaseVolume( ) {
	  System.out.println("��������������");
  }
  
  public void decreaseVolume( ) {
	  System.out.println("��С����������"); //����1  �����С����������
  }
  public void stopSound( ) {
	  System.out.println("�ر�������");
  }
  public void playSound( ) {
	  System.out.println("��������������");
  }
}

class Mobilephone implements Soundable {
  public void increaseVolume( ) {
	  System.out.println("�����ֻ�����");
  }
  
  public void decreaseVolume( ) {
	  System.out.println("��С�ֻ�����");
  }
  public void stopSound( ) {
	  System.out.println("�ر��ֻ�");
  }
  public void playSound( ) {
	  System.out.println("�ֻ�������������");
  }
}

class Clock implements Soundable{
	public void stopSound(){
	System.out.println("�ر����� ");
}
  public void playSound(){
	System.out.println("���ӷ����δ��� ");
   }
  public void increaseVolume(){
	System.out.println("�����ֻ�����");
}
  public void decreaseVolume(){
	System.out.println("��С�ֻ�����");
}

}


class People {
   private String name;
   private int    age;    
   public void listen(Soundable s) {	  
	   s.playSound( );
   }
}
	
public class InterfaceTest {
   public static void main(String[] args) {       
	   int i;	   
	   People sportsman = new People( );
       Scanner scanner = new Scanner(System.in);
	   Soundable[] soundDevice = new Soundable[4];
       //�������豸�����з����ܷ������豸
	   soundDevice[0] = new Radio( );
	   soundDevice[1] = new Walkman( );
	   soundDevice[2] = new Mobilephone( );//�����ֻ����󲢸�ֵ��soundDevice[2]
	   soundDevice[3] = new Clock();
	   System.out.println("������ʲô? ������ѡ��0-������ 1-������ 2-�ֻ� 3-����");
     	  i = scanner.nextInt( );       
	   //��ʼ������
	   sportsman.listen(soundDevice[i]);
	   soundDevice[i].increaseVolume( );
	    soundDevice[i].stopSound( ); //����stopSound( )����
   }
}
