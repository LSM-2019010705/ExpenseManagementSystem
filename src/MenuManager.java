import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=5 ;
		
		while (num != 6) {
			System.out.println("�޴� ��ȣ�� �����Ͻʽÿ�.");
			System.out.println("1. ���� �߰�"); //�޴� ��ϵ��̴�.
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. �Һ� ���");
			System.out.println("5. �Һ� ����");
			System.out.println("6. �޴��� ����");
			System.out.println("7. Exit");
			System.out.println("Select one number between 1~6");
			num = input.nextInt(); //�޴��� �Է¹޴´�
			if (num == 1) {
				addAccount();
			}
			else if (num == 2) {
				deleteAccount(); 
			}
			else if (num == 3) {
				viewAccount();
			}
			else if (num == 4) {
				listExpense();
			}
			else if (num == 5) {
				viewExpense();
			}
			else if (num == 6) {
				goTomenu();
			}
		}
	}
			
	public static void addAccount() {
		Scanner input = new Scanner(System.in); //���� ����
		System.out.print("���� ����: ");		
		String CountID = input.next();
		System.out.print("���� ���� ����: ");
		String CountNAME = input.next();
		System.out.print("������ ����: ");
		String CountEmail = input.next();
		System.out.println("������ �޴���ȭ ��ȣ: ");
		String CountPhone = input.next();
		
	}
	public static void deleteAccount() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� ����: ");
		String CountNAME = input.next();

	}
	public static void viewAccount() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� ����: ");
		String CountNAME = input.next();
	}
	public static void listExpense() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� ����: ");
		String CountNAME = input.next();

	}
	public static void viewExpense() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� ����: ");
		String CountNAME = input.next();

	}
	public static void goTomenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� ����: ");
		String CountNAME = input.next();

	}
}