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
			System.out.print("�θ���� �̸��� �Դϱ�? (Y/N)");
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
				System.out.println("�̸��� ���İ� ���� �ʽ��ϴ�. '@'�� �����Ͽ� �Է����ֽʽÿ�.");
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
		System.out.println(" �θ�� �̸��� : " + email);
		System.out.println(" �θ�� ��ȭ ��ȣ : " + phone);
		}
	
}

