package gdpu.list.test;

import java.util.LinkedList;

public class MyStack {
	private LinkedList lili = new LinkedList();

	public void push(Object obj) {
		// TODO Auto-generated method stub
		lili.addLast(obj);
	}

	public Object pop() {
		// TODO Auto-generated method stub
		return lili.removeLast();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return lili.isEmpty();
	}
	
}
