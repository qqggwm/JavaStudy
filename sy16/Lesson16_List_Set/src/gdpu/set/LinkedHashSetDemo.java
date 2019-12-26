package gdpu.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> strLinkedHS = new LinkedHashSet();
		strLinkedHS.add("hello");
		strLinkedHS.add("world");
		strLinkedHS.add("java");
		strLinkedHS.add("hello");
		strLinkedHS.add("world");
		System.out.println(strLinkedHS);//
	}

}
