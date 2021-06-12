package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listeners.AccountAdderListener;
import Listeners.ButtonAddCancel;
import Manager.AccountManager;

public class AccountAdder extends JPanel {

	WindowFrame frame;
	AccountManager accountmanager;
	
	public AccountAdder(WindowFrame frame, AccountManager accountmanager) {
		this.frame = frame;
		this.accountmanager = accountmanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelAccount = new JLabel("계좌: ", JLabel.TRAILING);
		JTextField fieldAccount = new JTextField(10);
		labelAccount.setLabelFor(fieldAccount);
		panel.add(labelAccount);
		panel.add(fieldAccount);
		
		JLabel labelName = new JLabel("이름: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("이메일: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JLabel labelPhone = new JLabel("휴대전화: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		
		JButton saveButton = new JButton("저장");
		saveButton.addActionListener(new AccountAdderListener(fieldAccount, fieldName, fieldEmail, fieldPhone, accountmanager));
		JButton cancelButton = new JButton("취소");
		cancelButton.addActionListener(new ButtonAddCancel(frame));
		
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		this.add(panel);
		this.setVisible(true);
	}
}