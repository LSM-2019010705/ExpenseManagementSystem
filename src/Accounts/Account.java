package Accounts;

import java.io.Serializable;
import java.util.Scanner;
import Exception.EmailFormatException;

public abstract class Account implements AccountInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5124264967743426116L;
	AccountType type = AccountType.Normal;
	String ID;
	String name;
	String email;
	String phone;
	
	public Account() {
	}
	
	public Account(AccountType type) {
		this.type = type;
	}
	
	public Account(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public Account(AccountType type, String ID, String name, String email, String phone) {
		this.type = type;
		this.ID = ID;
		this.name = name;
		this.email = email;
		this.phone = phone;			
	}
	
	public Account(String ID, String name, String email, String phone) {
		this.ID = ID;
		this.name = name;
		this.email = email;
		this.phone = phone;			
	}
	
	public AccountType getKind() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public abstract void printInfo();
	
	public void setAccountID(Scanner input) {
		System.out.print("���� :");
		String ID = input.next();
		this.setID(ID);
	}
	
	public void setAccountName(Scanner input) {
		System.out.print("���� :");
		String name = input.next();
		this.setName(name);
	}
	
	public void setAccountPhone(Scanner input) {
		System.out.print("��ȭ ��ȣ:");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public void setAccountEmail(Scanner input) {
		String email = "";
		while (email.contains("@")) {
		
		System.out.print("�̸��� :");
		email = input.next();
		try {
			this.setEmail(email);;
		} catch(EmailFormatException e) {
			System.out.println("�̸��� ���İ� ���� �ʽ��ϴ�. '@'�� �����Ͽ� �Է����ֽʽÿ�.");
				e.printStackTrace();
			}
		}
	}
	

	public String getKindString() {
		String stype = "null";
		switch(this.type) {
		case Normal:
			stype = "�Ϲ�";
			break;
		case Enterprise :
			stype = "���";
		case Elementary:
			stype = "�л�";
			break;
		case StartUp:
			stype = "��ŸƮ��";
			break;
		default :
		}
		return stype;
	}
	
}