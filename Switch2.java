class Switch2{
     public static void main(String[] args){
     A: for(int i=1;i<=5;i++)
    	{
    	  System.out.println("�����"+i+"�����ݣ�");
                for(int j=1;j<=5;j++)
                {
        	       System.out.print(j+",");
        	       if( j==3 ) 
        	       {
                         System.out.print("\n");
                         break A;        		  
        	       }        		
             }
       }
   }
}