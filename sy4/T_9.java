class T_9{
	public static void main(String[] args){
	int []arr={1,2,3,4,5,6,7,8,9,10};
	int tmp=0;
    for(int i=0;i<arr.length-1;i++){
   	    for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]<arr[j+1])
			   {
				   tmp = arr[j];
				   arr[j] =  arr[j+1];
				   arr[j+1] = tmp;
			   }   
		}
	}
	for(int a:arr)
		System.out.print(a+"\t");
  }
}