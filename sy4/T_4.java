class T_4{
   public static void main(String[] args){
     String[] name = {"张爱民","李小华","王中军","赵伟","孙大庆","何小泉"};
     int[] age = {52,11,74,15,36,60};
	 System.out.println("年龄在50岁以上的患者：");
     for(int i = 0;i<age.length;i++){
		 
		if(age[i]>50)
        System.out.println("患者姓名"+name[i]+"患者年龄"+age[i]);			  
	 }	
  }
}