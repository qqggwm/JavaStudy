package sy14;
import java.util.Scanner;;
public class DataRetrieve {
	public static void main(String[] args) {
		//����һ����ѯ��Χ
		String datas = "60-128";
		//�������
		String regex = "-";		
		//���÷���
		String[] strArray = datas.split(regex);
		//����
		for(int x=0; x<strArray.length; x++){
			System.out.println(strArray[x]);
		}
		
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ѯ�����ݣ�");
		int data = sc.nextInt();
		
		if(data>=Integer.parseInt(strArray[0])&& data<=Integer.parseInt(strArray[1])
){ 
			System.out.println("����������ݷ��ϲ�ѯҪ��");
		}else {
			System.out.println("����������ݲ����ϲ�ѯҪ��");
		}
	}
}
