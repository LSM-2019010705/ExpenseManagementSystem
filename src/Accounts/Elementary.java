package Accounts;

import java.util.Scanner;

import Exception.EmailFormatException;

public class Elementary extends Student{
	String parentEmail;
	String parentPhone;
	
	public Elementary (AccountType type) {
		super(type);
	}
	
	@Override
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
			System.out.print("부모님의 이메일 입니까? (Y/N)");
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
				System.out.println("이메일 형식과 맞지 않습니다. '@'을 포함하여 입력해주십시오.");
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
		System.out.println(" 부모님 이메일 : " + email);
		System.out.println(" 부모님 전화 번호 : " + phone);
		}
	
}

