package Manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Log.EventLogger;
import gui.WindowFrame;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		AccountManager accountmanager = getObject("accountmanager.ser");
		if(accountmanager == null) {
			accountmanager = new AccountManager(input);
		}
		
		WindowFrame frame = new WindowFrame(accountmanager);			
		selectMenu(input, accountmanager);
		putObject(accountmanager, "accountmanager.ser");
	}
	
	public static void selectMenu(Scanner input, AccountManager accountmanager) {
		int num=-1;
		while (num != 5) {
			try {
			showMenu();
			num = input.nextInt(); //메뉴를 입력받는다
			switch(num) {
				case 1:
					accountmanager.addAccount();
					logger.log("계좌 추가 됨");
					break;
				case 2:
					accountmanager.deleteAccount(); 
					logger.log("계좌 삭제 됨");
					break;
				case 3:
					accountmanager.editAccount();
					logger.log("계좌 편집 됨");
					break;
				case 4:
					accountmanager.viewAccounts();
					logger.log("계좌 보기 됨");
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
		System.out.println("----- 메뉴 번호를 선택하십시오. -----");
		System.out.println("1. 계좌 추가"); //메뉴 목록들이다.
		System.out.println("2. 계좌 삭제");
		System.out.println("3. 계좌 편집");
		System.out.println("4. 계좌 목록");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1~5: ");
	}
	
	public static AccountManager getObject(String filename) {
		AccountManager accountmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			accountmanager = (AccountManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return accountmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
		return accountmanager;
	}
	
	public static void putObject(AccountManager accountmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(accountmanager);
			
			out.close();
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
}