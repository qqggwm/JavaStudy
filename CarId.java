class CarId{
     public static void main(String[] args){

             for (int i=1;i<=9;i++){
                   for(int j=1;j<9;j++){ 
                       if(Math.sqrt(i*1000+i*100+j*10+j)%1==0)
                       {
                            System.out.println(i*1000+i*100+j*10+j);
                         
                           break;
                        }
                 }                    
         }   
   }
}