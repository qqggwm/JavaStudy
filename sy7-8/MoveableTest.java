import java.util.Scanner;
interface Moveable{
	  public void ahead();
	  public void back();
	  public void turnleft();
	  public void turnright();
}
	class Car implements Moveable{
		public void ahead(){
			System.out.println("������ǰ");
		}
		public void back() {
			System.out.println("��������");
		}
		public void turnleft() {
			System.out.println("��������");
		}
		public void turnright() {
			System.out.println("��������");
		}
	}
	class Ship implements Moveable{
		public void ahead(){
			System.out.println("�ִ���ǰ");
		}
		public void back() {
			System.out.println("�ִ�����");
		}
		public void turnleft() {
			System.out.println("�ִ�����");
		}
		public void turnright() {
			System.out.println("�ִ�����");
		}
	}
	class Aircraft implements Moveable{
		public void ahead(){
			System.out.println("�ɻ���ǰ");
		}
		public void back() {
			System.out.println("�ɻ�����");
		}
		public void turnleft() {
			System.out.println("�ɻ�����");
		}
		public void turnright() {
			System.out.println("�ɻ�����");
		}
	}
	class Control {
		public void move(Moveable m) {
			m.ahead();
		}
	}
public class MoveableTest {
		public static void main(String[] args) {
			int i,j;
			Control pilot = new Control();
			Scanner scanner = new Scanner(System.in);
			Moveable[] Device = new Moveable[3];
			Device [0] = new Car();
			Device [1] = new Ship();
			Device [2] = new Aircraft();
			System.out.println("�������ʲô? ������ѡ��0-���� 1-�ִ� 2-�ɻ� ");
			i=scanner.nextInt();
			pilot.move(Device[i]);
			System.out.println("������ô����? ������ѡ��0-ǰ�� 1-���� 2-���� 3-���� ");
			j=scanner.nextInt();
			switch(j) {
			case 0:Device[i].ahead();break;
			case 1:Device[i].back();break;
			case 2:Device[i].turnleft();break;
			case 3:Device[i].turnright();break;
			default:break;
			}
		}
}
