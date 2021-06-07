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
		System.out.println(" ���� : " + type);
		System.out.println(" ���� : " + ID);
		System.out.println(" �̸� : " + name);
		System.out.println(" �̸��� : " + email);
		System.out.println(" �޴� ��ȭ: " + phone);
	}

	public void setAccountEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
		{
			System.out.print("�̸����� ������ �ֽ��ϱ�? (Y/N) : ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer == 'y') {
					System.out.print("�̸��� : ");
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
				System.out.println("�̸��� ���İ� ���� �ʽ��ϴ�. '@'�� �����Ͽ� �Է����ֽʽÿ�.");
				setAccountEmailwithYN(input);
			}
		}
	}
}