package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Accounts.AccountInput;
import Accounts.AccountType;
import Accounts.Normal;
import Exception.EmailFormatException;
import Manager.AccountManager;

public class AccountAdderListener implements ActionListener {

	JTextField fieldAccount;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;
	
	AccountManager accountmanager;

	public AccountAdderListener(JTextField fieldAccount, JTextField fieldName, JTextField fieldEmail, JTextField fieldPhone, AccountManager accountmanager) {
		this.fieldAccount = fieldAccount;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.accountmanager = accountmanager;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print(fieldAccount.getText());
		System.out.print(fieldName.getText());
		System.out.print(fieldEmail.getText());
		System.out.print(fieldPhone.getText());
		
		AccountInput account = new Normal(AccountType.Normal);
		try {
			account.setID(fieldAccount.getText());
			account.setName(fieldName.getText());
			account.setEmail(fieldEmail.getText());
			account.setPhone(fieldPhone.getText());
			accountmanager.addAccount(account);
			putObject(accountmanager, "accountmanager.ser");
			account.printInfo();
		} catch (EmailFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
	
	public static void putObject(AccountManager accountmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(accountmanager);
			
			out.close();
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		

}
