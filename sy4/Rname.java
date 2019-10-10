class Rname {
    public static void main(String[] args){
          int size = 6;
         
     String [] room = {"内科","外科","妇科","儿科","口腔科","骨科"};
     
   /* char [0] =内科；
     char [1] =外科；
     char [2] =妇科；
     char [3] =儿科；
     char [4] =口腔科；
     char [5] =骨科；*/
    //int [] count = new count[size];
    int [] count = {60,27,42,63,19,31};
    for (int i=0; i<size;i++){
          System.out.println(room[i]+":"+count[i]);
     }
    }
 }