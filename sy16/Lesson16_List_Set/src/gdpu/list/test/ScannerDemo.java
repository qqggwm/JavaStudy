package gdpu.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
分析：


 * @author 3T001
 *
 */
public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
//		A：创建键盘录入数据对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数，以0结束：");
//		B：创建集合对象存储键盘输入数据
		ArrayList<Integer> intList = new ArrayList();
//		C：循环判断键盘输入数据是否为0，
		int num = 0;
		while((num=sc.nextInt())!=0){

//		非0：在集合中添加键盘数据
			intList.add(num);
		}
//		是0：结束循环
//		D：调用Collections工具类，对集合进行排序
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
//		E：调用Collections工具类，获取最大值
		System.out.println("最大值为："+Collections.max(intList));
	}

}
