import java.util.Scanner;
interface Moveable{
	  public void ahead();
	  public void back();
	  public void turnleft();
	  public void turnright();
}
	class Car implements Moveable{
		public void ahead(){
			System.out.println("汽车向前");
		}
		public void back() {
			System.out.println("汽车后退");
		}
		public void turnleft() {
			System.out.println("汽车向左");
		}
		public void turnright() {
			System.out.println("汽车向右");
		}
	}
	class Ship implements Moveable{
		public void ahead(){
			System.out.println("轮船向前");
		}
		public void back() {
			System.out.println("轮船后退");
		}
		public void turnleft() {
			System.out.println("轮船向左");
		}
		public void turnright() {
			System.out.println("轮船向右");
		}
	}
	class Aircraft implements Moveable{
		public void ahead(){
			System.out.println("飞机向前");
		}
		public void back() {
			System.out.println("飞机后退");
		}
		public void turnleft() {
			System.out.println("飞机向左");
		}
		public void turnright() {
			System.out.println("飞机向右");
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
			System.out.println("你想操纵什么? 请输入选择：0-汽车 1-轮船 2-飞机 ");
			i=scanner.nextInt();
			pilot.move(Device[i]);
			System.out.println("你想怎么操纵? 请输入选择：0-前进 1-后退 2-向左 3-向右 ");
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
