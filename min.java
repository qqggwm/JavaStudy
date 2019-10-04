class Minshu{
       public static void main(String[] args){
            
            int i;
           // while(i%2==1&&i%5==2&&i%11==1)  
           for( i=1; ;i++)
                  if(i%2==1&&i%5==2&&i%7==3&&i%11==1)
                   break;
           //System.out.print("满足条件的最小自然数为:");
System.out.print(i);
     }
}