class Sushu{
       public static void main(String[] args){
                for (int i = 2; i<=100 ; i++){

                     for (int j=1;j<=i/2;j++){
                           if(i%j==0&&i!=j&&j!=1)
                           break;
                           if(j==i/2)
                            System.out.println(i+"ÊÇËØÊý");
                          
             }                 
        }
    }
}