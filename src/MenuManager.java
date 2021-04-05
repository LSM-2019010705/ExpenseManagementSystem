import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager accountmanager = new AccountManager(input);
		
		int num=-1;
		while (num != 6) {
			System.out.println("�޴� ��ȣ�� �����Ͻʽÿ�.");
			System.out.println("1. ���� �߰�"); //�޴� ��ϵ��̴�.
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. �Һ� ���");
			System.out.println("5. �Һ� ����");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1~6");
			num = input.nextInt(); //�޴��� �Է¹޴´�
			
			
			if (num == 1) {
				accountmanager.addAccount();
			}
			else if (num == 2) {
				accountmanager.deleteAccount(); 
			}
			else if (num == 3) {
				accountmanager.editAccount();
			}
			else if (num == 4) {
				accountmanager.listExpense();
			}
			else if (num == 5) {
				accountmanager.viewExpense();
			}
		}
	}
			
}