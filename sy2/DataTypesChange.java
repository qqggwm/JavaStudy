public class DataTypesChange
{
   public static void main(String args[])
   {
     byte a=8;
     char b='a';     //'a'��Unicode���Ӧ��ʮ��������97
     int c=12;
     long d=145L;
     float e=8.29F;
     double f=365.725;
     int g=b+c;      //char�͵ı���bת��Ϊint��
     long h=d-c;     //int�͵ı���cת��Ϊlong��
     float i=a*e;    //byte�͵ı���aת��Ϊfloat��
     double j=i/g-f; //int�͵ı���gת��Ϊfloat�ͣ�i/g�Ľ����ת��Ϊdouble��
     System.out.println("g="+g);
     System.out.println("h="+h);
     System.out.println("i="+i);
     System.out.println("j="+j);
   }
}
