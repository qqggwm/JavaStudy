class Rname {
    public static void main(String[] args){
        int size = 6;
        String [] room = {"内科","外科","妇科","儿科","口腔科","骨科"};
        //int [] count = new count[size];
        int [] count = {60,27,42,63,19,31};
    for (int i = 0; i < size ; i++){
          System.out.println(room[i]+":"+count[i]);
     }
	int max = 0;
	for (int j = 0; j < size-1 ; j++){
		  if(count[j+1]>count[max])
			 max = j+1; 
    }
	System.out.println("患者人数最多科室名称："+room[max]+",患者人数："+count[max]);
 }
}