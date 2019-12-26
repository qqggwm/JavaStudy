package gdpu.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> stuSet = new TreeSet();
		Student stu1 = new Student("zs",19);
		Student stu2 = new Student("ls",21);
		Student stu3 = new Student("ww",19);
		stuSet.add(stu1);
		stuSet.add(stu2);
		stuSet.add(stu3);
		System.out.println(stuSet);
	}

}
