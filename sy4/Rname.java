class Rname {
    public static void main(String[] args){
          int size = 6;
         
     String [] room = {"�ڿ�","���","����","����","��ǻ��","�ǿ�"};
     
   /* char [0] =�ڿƣ�
     char [1] =��ƣ�
     char [2] =���ƣ�
     char [3] =���ƣ�
     char [4] =��ǻ�ƣ�
     char [5] =�ǿƣ�*/
    //int [] count = new count[size];
    int [] count = {60,27,42,63,19,31};
    for (int i=0; i<size;i++){
          System.out.println(room[i]+":"+count[i]);
     }
    }
 }