package Accounts;

import java.util.Scanner;

public class Normal extends Account {
	
	public Normal(AccountType type) {
		super(type);
	}

	public void getUserInput(Scanner input) {
			setAccountID(input);
			setAccountName(input);
			setAccountEmail(input);
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