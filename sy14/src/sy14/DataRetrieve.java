package sy14;
import java.util.Scanner;;
public class DataRetrieve {
	public static void main(String[] args) {
		//定义一个查询范围
		String datas = "60-128";
		//定义规则
		String regex = "-";		
		//调用方法
		String[] strArray = datas.split(regex);
		//遍历
		for(int x=0; x<strArray.length; x++){
			System.out.println(strArray[x]);
		}
		
		//键盘录入数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入待查询的数据：");
		int data = sc.nextInt();
		
		if(data>=Integer.parseInt(strArray[0])&& data<=Integer.parseInt(strArray[1])
){ 
			System.out.println("你输入的数据符合查询要求");
		}else {
			System.out.println("你输入的数据不符合查询要求");
		}
	}
}
