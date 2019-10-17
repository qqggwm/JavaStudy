class T_5{
    public static void main(String[] args){
	    String[] section = {"内科","外科","妇科","儿科","口腔科","骨科"};  
        int[] amount = {60,27,42,63,19,31};
		int tmp = 0;
		String tmp2 = null;
		for(int i=0;i<amount.length-1;i++){
			    int min = i;
		     for(int j =i;j<amount.length;j++){
				 if(amount[j]<amount[min])
					min = j;									 	 
			 }
			 if(amount[i]!=amount[min]){
				 tmp = amount[min];
				 tmp2 = section[min];
				 amount[min] = amount[i];
				 section[min] = section[i];
                 amount [i] = tmp; 			
                 section [i] = tmp2;				 
			 }
		} 
        for(int i=0;i<amount.length;i++)
            System.out.println(section[i]+":"+amount[i]);    
       
	}	
}