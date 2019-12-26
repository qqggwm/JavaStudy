package gdpu.list.test;

public class MyStackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		请用LinkedList模拟栈数据结构的集合
//		push()进栈，pop()出栈
		MyStack stack = new MyStack();
		stack.push("hello");
		stack.push("world");
		stack.push("java");
		while(!stack.isEmpty()){
			String str = (String)stack.pop();
			System.out.println(str);
		}
		
	}

}
