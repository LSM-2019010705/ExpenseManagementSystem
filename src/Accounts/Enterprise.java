package Accounts;

import java.util.Scanner;

import Exception.EmailFormatException;

public class Enterprise extends Student {

	public Enterprise(AccountType type) {
		super(type);
	}

	public void getUserInput(Scanner input) {
		setAccountID(input);
		setAccountName(input);
		setAccountEmailwithYN(input);
		setParentEmailwithYN(input);
		setAccountPhone(input);
	}
	
	public void setParentEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
		{
			System.out.print("회사의 이메일 입니까? (Y/N)");
			answer = input.next().charAt(0);
			try {
			if(answer == 'Y' || answer == 'y') {
				setAccountEmail(input);
				break;
			}
			else if (answer == 'N' || answer =='n') {
				this.setEmail("");
				break;
			}
			else {
			}
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put your e-mail address that contains @");
			}
		}
	}
	
	public void printInfo() {
		String stype = getKindString() ;
		System.out.println(" 종류 : " + stype);
		System.out.println(" 계좌 : " + ID);
		System.out.println(" 성명 : " + name);
		System.out.println(" 이메일 : " + email);
		System.out.println(" 전화 번호 : " + phone);
		System.out.println(" 회사 이메일 : " + email);
		System.out.println(" 회사 전화 번호 : " + phone);
		}
	
}