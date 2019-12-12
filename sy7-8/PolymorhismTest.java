
import java.util.Arrays;
 abstract class Student{
    final static int CourseNo = 3;
    private String name;
	private String type;
    private int[]  courses;    
private String  courseGrade;  

public Student(){ }

    public Student(String name,String type)
    {
        this.name = name;
        this.type = type;
        courses = new int[CourseNo];//��ѧ�γ�����
        courseGrade="";
    }    
 abstract void calculateGrade(); 
    
	public String getName( )
{  	
		return name;   
 }
	public String getType( )
    {
         return type; //����ѧ������
    }
	public String getCourseGrade( )
    {
      return courseGrade;
    }
   
    public int getCourseScore(int courseNumber)
    {
      return courses[courseNumber];
    }    
    
    public void setName(String name)
    {
      this.name = name;
    }

	public void setType(String type)
    {
      this.type = type;
    }
  
    public void setCourseScore(int courseNumber, int courseScore)
    {
    	courses[courseNumber]=courseScore  ;//�γ����������ÿγ̳ɼ�
    }
	public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
	}
}


class Postgraduate extends  Student {  
   public Postgraduate(String name)
   {
      super(name,"�о���");	 
   }   
   public void calculateGrade()
   {
	   int total = 0;
	   double average = 0;
	   for (int i = 0; i < CourseNo; i++) {
	       total =total + getCourseScore(i);
	   };
	   average = total / CourseNo;
	   String currentGrade="";
	   if (average>=90&&average<=100){ 
		   currentGrade = "����";
	   }
	   else if (average>=80&&average<90) {
		   currentGrade = "����";
	   }
	   else if (average>=70&&average<80) {
		   currentGrade = "һ��";
	   }
	   else if (average>=60&&average<70) {
		   currentGrade = "����";
	   }
	   else{
		   currentGrade = "������";
	   }	
	   setCourseGrade(currentGrade);
	}
}


class Undergraduate extends Student {   
    public Undergraduate(String name) 
    {
        super(name,"������");	
    }
    public void calculateGrade() {
      int total = 0;
	  double average = 0;
      for (int i = 0; i < CourseNo; i++) {
         total=total+getCourseScore(i); // �ۼӸ��ſγ̳ɼ�
      };
      average = total / CourseNo;
      String currentGrade="";
      if (average>=80&&average<100){ 
    	  currentGrade = "����";
      }
	  else if (average>=70&&average<80){ 
		  currentGrade = "����";
	  }
	   else if (average>=60&&average<70){ 
		   currentGrade = "һ��";
	   }
	   else if (average>=50&&average<60){
		   currentGrade = "����";
	   }	   
	   else{
		   currentGrade = "������";
	   }	  
      setCourseGrade(currentGrade);
    }
}


public class PolymorhismTest {	
	public static void main(String[] args) {
		Student []studentArray  = new Student [5];
		studentArray [0] = new Undergraduate("����");//����������
		studentArray [1] = new Undergraduate("����");	//����������
		studentArray [2] = new Postgraduate("����");	//�о�������
		studentArray [3] = new Undergraduate("����");	//����������
		studentArray [4] = new Postgraduate("Ǯ��");	//�о���Ǯ��
		 
		 for (int i=0; i<studentArray.length;i++) {
			 studentArray[i].setCourseScore(0,87);
			 studentArray[i].setCourseScore(1,90);
			 studentArray[i].setCourseScore(2,78);
		 }
	     for (int i=0; i<5 ;i++) {
	    	 studentArray[i].calculateGrade();
		 }
	     System.out.println("����" + "     ����" +"    �ɼ�");
		 System.out.println("-----------------------");

		 for (int i=0; i<5 ;i++) {		   
	       System.out.println(studentArray[i].getName( )+"   "+
	    		   studentArray[i].getType( )+"  "+
	    		   studentArray[i].getCourseGrade( ));
		 }
	  }

}
