class Fu {
		static {
			System.out.println("��̬�����Fu");
		}

		{
			System.out.println("��������Fu");
		}

		public Fu() {
			System.out.println("���췽��Fu");
		}
	}

	class Zi extends Fu {
		static {
			System.out.println("��̬�����Zi");
		}

		{
			System.out.println("��������Zi");
		}

		public Zi() {
			System.out.println("���췽��Zi");
		}
	}

class FuZiTest {
		public static void main(String[] args) {
		Zi z = new Zi();//���췽��Zi
		}
}