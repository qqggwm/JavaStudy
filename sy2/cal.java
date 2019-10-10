public class cal{
   public static void main(String[] args) {
	   int c;
	   c =    0b10100001 & 0b10000000;
	   System.out.println(c);
	   System.out.println(Integer.toBinaryString(c));

                   c = 0b10001001 | 0b10000000;
                  System.out.println(c);
	   System.out.println(Integer.toBinaryString(c));

c = ~0b11011110;
System.out.println(c);
System.out.println(Integer.toBinaryString(c));

c = 0b10010001 ^ 0b10000000;
System.out.println(c);
System.out.println(Integer.toBinaryString(c));


c = 0b11110 << 3;
System.out.println(c);
System.out.println(Integer.toBinaryString(c));

c = 0b10000000100000001010000010000000 >> 3;
System.out.println(c);
System.out.println(Integer.toBinaryString(c));

c = 0b10000000100000101000000010000000 >>> 3;
System.out.println(c);
System.out.println(Integer.toBinaryString(c));
   }
}
