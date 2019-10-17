import java.util.*;

class T_7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int tem[][] = new int[4][3];
		int i=0,j=0;
		for(i=0; i<4;i++)
		{
			System.out.println("请输入第"+(i+1)+"个病人的体温");
			for(j=0;j<3;j++)
			{
				System.out.print("第"+(j+1)+"次");
		        tem[i][j] = sc.nextInt();	
		    }
		}
		for(i=0;i<4;i++)
		{
	                         for(j=0;j<3;j++)
		          {
	                            System.out.print(tem[i][j]+"\t");                     			
		           }	
                                       System.out.print("\n");
		} 
	}
}