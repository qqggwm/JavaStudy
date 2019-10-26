 import java.util.Date;
 class Time{
    public  static void main(String[] args){
		 Date date = new Date();
	                 System.out.printf("全部日期和时间信息：%tc%n",date);
		 System.out.printf("年份：%ty%n",date);
	                 System.out.printf("月份：%tB%n",date);
	                 System.out.printf("日期：%td%n",date);
		 System.out.printf("小时：%tH%n",date);
		 System.out.printf("分钟：%tm%n",date);
		 System.out.printf("秒：%tS%n",date);
		 System.out.printf("本地星期的简称：%tA%n",date);		 
	}
 }