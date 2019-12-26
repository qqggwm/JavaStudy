package gdpu.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> stuSet = new HashSet();
		Student stu1 = new Student("zs",19);
		Student stu2 = new Student("ls",21);
		Student stu3 = new Student("zs",19);
		stuSet.add(stu1);
		stuSet.add(stu2);
		stuSet.add(stu3);
		System.out.println(stuSet);
		for(Student stu:stuSet){
			System.out.println(stu);
		}
	}

}
