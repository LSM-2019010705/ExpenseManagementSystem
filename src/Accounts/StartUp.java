package Accounts;

import java.util.Scanner;

public class StartUp extends Student {

	public StartUp(AccountType type) {
		super(type);
	}

	public void getUserInput(Scanner input) {
		setAccountID(input);
		setAccountName(input);
		setAccountEmailwithYN(input);
		setAccountPhone(input);
	}
	
	public void printInfo() {
		String stype = getKindString() ;
		System.out.println(" ���� : " + stype);
		System.out.println(" ���� : " + ID);
		System.out.println(" ���� : " + name);
		System.out.println(" �̸��� : " + email);
		System.out.println(" ��ȭ ��ȣ : " + phone);
		}

}
