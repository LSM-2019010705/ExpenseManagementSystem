import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. �Һ� ���");
			System.out.println("5. �Һ� ����");
			System.out.println("6. �޴��� ����");
			System.out.println("7. Exit");
			System.out.println("Select one number between 1~6");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("���� ����");
				int CountID = input.nextInt();
				System.out.print("���� ���� ����");
				String CountNAME = input.next();
				System.out.print("���� �� ����");
				int CountEmail = input.nextInt();
				break;
			case 2:
			case 3:
				System.out.print("���� ����");//�ϴ� ������
				int CountID2 = input.nextInt();
			case 4:
			case 5:
			case 6:
			}
			
		}
	}

}