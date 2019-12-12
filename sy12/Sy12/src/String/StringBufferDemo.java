package String;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);
		change(s1, s2);
		System.out.println(s1 + "---" + s2);

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);

	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;//  sb1 和s2引用同一块内存空间
		sb2.append(sb1); //字符串追加,sb1=sb2=worldworld
		System.out.println("使用StringBuffer交换函数的结果："+sb1 + "---" + sb2);
	}

	public static void change(String s1, String s2) {
		s1 = s2;
		s2 = s1 + s2;
		System.out.println("使用String交换函数的结果："+s1 + "---" + s2); 
	}
}
