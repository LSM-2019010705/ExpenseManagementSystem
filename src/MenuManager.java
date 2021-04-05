import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager accountmanager = new AccountManager(input);
		
		int num=-1;
		while (num != 6) {
			System.out.println("메뉴 번호를 선택하십시오.");
			System.out.println("1. 계좌 추가"); //메뉴 목록들이다.
			System.out.println("2. 계좌 삭제");
			System.out.println("3. 계좌 편집");
			System.out.println("4. 소비 목록");
			System.out.println("5. 소비 보기");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1~6");
			num = input.nextInt(); //메뉴를 입력받는다
			
			
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