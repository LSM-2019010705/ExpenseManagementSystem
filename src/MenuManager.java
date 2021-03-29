import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=5 ;
		
		while (num != 6) {
			System.out.println("메뉴 번호를 선택하십시오.");
			System.out.println("1. 계좌 추가"); //메뉴 목록들이다.
			System.out.println("2. 계좌 삭제");
			System.out.println("3. 계좌 보기");
			System.out.println("4. 소비 목록");
			System.out.println("5. 소비 보기");
			System.out.println("6. 메뉴로 가기");
			System.out.println("7. Exit");
			System.out.println("Select one number between 1~6");
			num = input.nextInt(); //메뉴를 입력받는다
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
		Scanner input = new Scanner(System.in); //정보 기입
		System.out.print("계좌 기입: ");		
		String CountID = input.next();
		System.out.print("계좌 주인 성명: ");
		String CountNAME = input.next();
		System.out.print("계좌주 메일: ");
		String CountEmail = input.next();
		System.out.println("계좌주 휴대전화 번호: ");
		String CountPhone = input.next();
		
	}
	public static void deleteAccount() {
		Scanner input = new Scanner(System.in);
		System.out.print("계좌 주인 성명: ");
		String CountNAME = input.next();

	}
	public static void viewAccount() {
		Scanner input = new Scanner(System.in);
		System.out.print("계좌 주인 성명: ");
		String CountNAME = input.next();
	}
	public static void listExpense() {
		Scanner input = new Scanner(System.in);
		System.out.print("계좌 주인 성명: ");
		String CountNAME = input.next();

	}
	public static void viewExpense() {
		Scanner input = new Scanner(System.in);
		System.out.print("계좌 주인 성명: ");
		String CountNAME = input.next();

	}
	public static void goTomenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("계좌 주인 성명: ");
		String CountNAME = input.next();

	}
}