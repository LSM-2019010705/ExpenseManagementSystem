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
		System.out.println(" 종류 : " + stype);
		System.out.println(" 계좌 : " + ID);
		System.out.println(" 성명 : " + name);
		System.out.println(" 이메일 : " + email);
		System.out.println(" 전화 번호 : " + phone);
		}
	
}