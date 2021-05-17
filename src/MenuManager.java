import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager accountmanager = new AccountManager(input);
		
		selectMenu(input, accountmanager);
	}
	
	public static void selectMenu(Scanner input, AccountManager accountmanager) {
		int num=-1;
		while (num != 6) {
			try {
			showMenu();
			num = input.nextInt(); //�޴��� �Է¹޴´�
			switch(num) {
				case 1:
					accountmanager.addAccount();
					break;
				case 2:
					accountmanager.deleteAccount(); 
					break;
				case 3:
					accountmanager.editAccount();
					break;
				case 4:
					accountmanager.listAccount();
					break;
				case 5:
					accountmanager.viewAccounts();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put in an integer!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("----- �޴� ��ȣ�� �����Ͻʽÿ�. -----");
		System.out.println("1. ���� �߰�"); //�޴� ��ϵ��̴�.
		System.out.println("2. ���� ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ���");
		System.out.println("5. ���� ����");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1~6: ");
	}
			
}