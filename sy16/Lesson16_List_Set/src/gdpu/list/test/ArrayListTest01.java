package gdpu.list.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * ȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
�����¼���ʵ�֣�ArrayListTest01.java
��֪��strList=[hello,world,java,hello,world]
��newList = [hello,world,java]
������ȥ���������ַ������ظ�ֵ
    1.�����¼���
	2.�����ɼ��ϣ���ȡÿ��Ԫ��
		�ж�Ԫ���Ƿ����¼����д���
		�ǣ�
		�񣺽���Ԫ����ӵ��¼�����
	3.��ӡ�¼���
 */
		ArrayList<String> strList = new ArrayList();
		strList.add("hello");
		strList.add("world");
		strList.add("java");
		strList.add("hello");
		strList.add("world");
		System.out.println(strList);
//		1.�����¼���
		ArrayList<String> newList = new ArrayList();
//		2.�����ɼ��ϣ���ȡÿ��Ԫ��
		ListIterator li = strList.listIterator();
		while(li.hasNext()){
			String str = (String)li.next();
			if(!newList.contains(str)){
				newList.add(str);
			}
		}
		System.out.println(newList);
	}

}
