package gdpu.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("hello");
		System.out.println(set);
	}

}
