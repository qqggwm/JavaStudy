class T_4{
   public static void main(String[] args){
     String[] name = {"�Ű���","��С��","���о�","��ΰ","�����","��СȪ"};
     int[] age = {52,11,74,15,36,60};
	 System.out.println("������50�����ϵĻ��ߣ�");
     for(int i = 0;i<age.length;i++){
		 
		if(age[i]>50)
        System.out.println("��������"+name[i]+"��������"+age[i]);			  
	 }	
  }
}