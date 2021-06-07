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
			System.out.print("ȸ���� �̸��� �Դϱ�? (Y/N)");
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
		System.out.println(" ���� : " + stype);
		System.out.println(" ���� : " + ID);
		System.out.println(" ���� : " + name);
		System.out.println(" �̸��� : " + email);
		System.out.println(" ��ȭ ��ȣ : " + phone);
		System.out.println(" ȸ�� �̸��� : " + email);
		System.out.println(" ȸ�� ��ȭ ��ȣ : " + phone);
		}
	
}