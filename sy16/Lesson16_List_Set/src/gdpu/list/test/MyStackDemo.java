package gdpu.list.test;

public class MyStackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����LinkedListģ��ջ���ݽṹ�ļ���
//		push()��ջ��pop()��ջ
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
