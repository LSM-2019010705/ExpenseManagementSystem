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
		System.out.print("계좌 :");
		String ID = input.next();
		this.setID(ID);
	}
	
	public void setAccountName(Scanner input) {
		System.out.print("성명 :");
		String name = input.next();
		this.setName(name);
	}
	
	public void setAccountPhone(Scanner input) {
		System.out.print("전화 번호:");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public void setAccountEmail(Scanner input) {
		String email = "";
		while (email.contains("@")) {
		
		System.out.print("이메일 :");
		email = input.next();
		try {
			this.setEmail(email);;
		} catch(EmailFormatException e) {
			System.out.println("이메일 형식과 맞지 않습니다. '@'을 포함하여 입력해주십시오.");
				e.printStackTrace();
			}
		}
	}
	

	public String getKindString() {
		String stype = "null";
		switch(this.type) {
		case Normal:
			stype = "일반";
			break;
		case Enterprise :
			stype = "기업";
		case Elementary:
			stype = "학생";
			break;
		case StartUp:
			stype = "스타트업";
			break;
		default :
		}
		return stype;
	}
	
}