import java.util.*;
class Animals{
     public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("������ͷ����");
       int h = input.nextInt();
       System.out.println("�����������");
       int f = input.nextInt();
       if( h>0&&f>0&&f%2==0&&f>=2*h&&f<=4*h){
          
             for (int chi= 1 ; chi<h; chi++){
                    int rab = h - chi;
                    if(2*chi + 4*rab == f)
                    System.out.println("��һ��:"+chi +"ֻ,����һ��:"+rab);         
            }
         }
      else System.out.println("������Ч");
               }
}
