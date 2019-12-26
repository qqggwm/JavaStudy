package gdpu.list.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stuList = new ArrayList();
		Student stu1 = new Student("zs",21);
		Student stu2 = new Student("ls",19);
		Student stu3 = new Student("zs",21);
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		System.out.println(stuList);
		ArrayList<Student> newList = new ArrayList();
		ListIterator li = stuList.listIterator();
		while(li.hasNext()){
			Student stu = (Student)li.next();
			if(!newList.contains(stu)){
				newList.add(stu);
			}
		}
		System.out.println(newList);
	}

}
