package gdpu.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
������


 * @author 3T001
 *
 */
public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
//		A����������¼�����ݶ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������0������");
//		B���������϶���洢������������
		ArrayList<Integer> intList = new ArrayList();
//		C��ѭ���жϼ������������Ƿ�Ϊ0��
		int num = 0;
		while((num=sc.nextInt())!=0){

//		��0���ڼ�������Ӽ�������
			intList.add(num);
		}
//		��0������ѭ��
//		D������Collections�����࣬�Լ��Ͻ�������
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
//		E������Collections�����࣬��ȡ���ֵ
		System.out.println("���ֵΪ��"+Collections.max(intList));
	}

}
