package sy15;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int data = 0;
		ArrayList arrlst = new ArrayList();
		
		while(true){
			data = sc.nextInt();
			if(data!=-1) {
				arrlst.add(data);
			}
			else {
				break;
			}
		}
		System.out.println(arrlst);
		
		Iterator it = arrlst.iterator();
		int i = 0;
		int size = arrlst.size();
		int [] arr = new int[size];
		
		while(it.hasNext()) {				//转换成数组
			Object obj = it.next();	
			arr[i] = (int) arrlst.get(i);
			i++;
		}
		System.out.println(arr[arr.length-1]);
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+"\t");
		}
	}

}
