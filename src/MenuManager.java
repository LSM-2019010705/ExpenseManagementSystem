import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. 계좌 추가");
			System.out.println("2. 계좌 삭제");
			System.out.println("3. 계좌 보기");
			System.out.println("4. 소비 목록");
			System.out.println("5. 소비 보기");
			System.out.println("6. 메뉴로 가기");
			System.out.println("7. Exit");
			System.out.println("Select one number between 1~6");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("계좌 기입");
				int CountID = input.nextInt();
				System.out.print("계좌 주인 성명");
				String CountNAME = input.next();
				System.out.print("계좌 주 메일");
				int CountEmail = input.nextInt();
				break;
			case 2:
			case 3:
				System.out.print("계좌 기입");//일단 기입함
				int CountID2 = input.nextInt();
			case 4:
			case 5:
			case 6:
			}
			
		}
	}

}