package Accounts;

import java.util.Scanner;
import Exception.EmailFormatException;

public abstract class Student extends Account {

	public Student(AccountType type) {
		super(type);
	}
	@Override
	public abstract void getUserInput(Scanner input); 
		
	@Override
	public void printInfo() {
		String type = getKindString() ;
		System.out.println(" 종류 : " + type);
		System.out.println(" 계좌 : " + ID);
		System.out.println(" 이름 : " + name);
		System.out.println(" 이메일 : " + email);
		System.out.println(" 휴대 전화: " + phone);
	}

	public void setAccountEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
		{
			System.out.print("이메일을 가지고 있습니까? (Y/N) : ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer == 'y') {
					System.out.print("이메일 : ");
					String email = input.next();
					this.setEmail(email);
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
				setAccountEmailwithYN(input);
			}
		}
	}
}