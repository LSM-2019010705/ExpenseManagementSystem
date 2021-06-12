package Manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Accounts.Account;
import Accounts.AccountInput;
import Accounts.AccountType;
import Accounts.Normal;
import Accounts.Enterprise;
import Accounts.StartUp;
import Accounts.Elementary;

public class AccountManager implements Serializable {
	/**
	 * 
	 */
	static final long serialVersionUID = -6084457482867988057L;
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
	transient Scanner input;
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void addAccount(String ID, String name, String email, String phone) {
		AccountInput accountInput = new Normal(AccountType.Normal);
		accountInput.getUserInput(input);
		accounts.add(accountInput);
	}
	
	public void addAccount(AccountInput accountInput) {
		accounts.add(accountInput);
	}
	
	public void addAccount() {
		int type = 1;
		AccountInput accountInput;
		
		while (type == 1) {
			try {
			System.out.println("1. 일반 고객");
			System.out.println("2. 기업 고객 ");
			System.out.println("3. 청소년 ");
			System.out.println("4. 스타트업 ");
			System.out.print("1 ~ 4까지 중 번호를 선택하십시오 : ");
			type = input.nextInt();
			if (type == 1) {
				accountInput = new Normal(AccountType.Normal);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
				break;
			}
			else if (type == 2) {
				accountInput = new Enterprise(AccountType.Enterprise);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
				break;
			}
			else if (type == 3) {
				accountInput = new Elementary(AccountType.Elementary);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
				break;
			}
			else if (type == 4) {
				accountInput = new StartUp(AccountType.StartUp);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
				break;
			}
			else {
				System.out.println("Again please");	
			}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 3");
				if(input.hasNext()){
					input.next();
				}
				type = -1; 
			}
		}
	}
	
	public void deleteAccount() {
		System.out.print("전화 번호 입력: ");
		String accountPhone = input.next();
		int index = checkAccounts(accountPhone);
		 removeAccount(index, accountPhone);
	}	
	
	public int checkAccounts(String accountPhone) {
		int index = -1;
		for (int i = 0; i<accounts.size(); i++) {
			if (accounts.get(i).getPhone() == accountPhone) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeAccount(int index, String expendBirth) {
		if(index >= 0) {
			accounts.remove(index);
			System.out.println("계좌, " + expendBirth + " 가 삭제되었습니다.");
			return 1;
		}
		else {
			System.out.println("Unregisterd");
			return -1;
			}
		}
	
	
	public void editAccount() {
		System.out.print("전화 번호 입력: ");
		String accountPhone = input.next();
		for (int i = 0; i<accounts.size(); i++) {
			AccountInput account = accounts.get(i);
			if (account.getPhone() == accountPhone) {
				int num = -1;
				while (num != 5) {
					showEditMenu() ;
					num = input.nextInt();
					switch(num) {
					case 1:
						account.setAccountID(input);
						break;
					case 2:
						account.setAccountName(input);
						break;
					case 3:
						account.setAccountEmail(input);
						break;
					case 4:
						account.setAccountPhone(input);
						break;
					default:
						continue;
					}
				}//while
				break ;
			}//if
		}//for
	}
	
	public void viewAccounts() {
		System.out.println("# of registered accounts"+ accounts.size());
		for (int i = 0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		System.out.println("");
		}
	}
	
	public int size() {
		return accounts.size();
	}
	
	public AccountInput get(int index) {
		return (Account) accounts.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("---고객 정보 편집 메뉴---");
		System.out.println("1. 계좌 편집");
		System.out.println("2. 이름 편집");
		System.out.println("3. 이메일 편집");
		System.out.println("4. 전화 번호 편집");
		System.out.println("5. 나가기");
		System.out.println("1~5번 중 선택하시오.: ");
	}

}