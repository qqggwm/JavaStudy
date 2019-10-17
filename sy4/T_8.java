class T_8 {
      public static void main(String[] args){
          int [] arr = {1,2,3,4,5,6,7,8,9,10};
         int count=0;          
         for(int a :arr)
            System.out.print(a+"\t");
         for(int i=0;i<arr.length;i++)
           {
              if(arr[i]%2==0)
               count++;
           }
          System.out.println("偶数个数："+count+"奇数个数"+(arr.length-count));
   }
}