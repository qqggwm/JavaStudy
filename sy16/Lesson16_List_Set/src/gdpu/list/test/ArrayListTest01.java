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
 * 去除集合中字符串的重复值(字符串的内容相同)
创建新集合实现：ArrayListTest01.java
已知：strList=[hello,world,java,hello,world]
求：newList = [hello,world,java]
分析：去除集合中字符串的重复值
    1.创建新集合
	2.遍历旧集合，获取每个元素
		判断元素是否在新集合中存在
		是：
		否：将该元素添加到新集合中
	3.打印新集合
 */
		ArrayList<String> strList = new ArrayList();
		strList.add("hello");
		strList.add("world");
		strList.add("java");
		strList.add("hello");
		strList.add("world");
		System.out.println(strList);
//		1.创建新集合
		ArrayList<String> newList = new ArrayList();
//		2.遍历旧集合，获取每个元素
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
