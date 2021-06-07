package gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountAdder extends JPanel {

	WindowFrame frame;
	
	public AccountAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelAccount = new JLabel("����: ", JLabel.TRAILING);
		JTextField fieldAccount = new JTextField(10);
		labelAccount.setLabelFor(fieldAccount);
		panel.add(labelAccount);
		panel.add(fieldAccount);
		
		JLabel labelName = new JLabel("�̸�: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("�̸���: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JLabel labelPhone = new JLabel("�޴���ȭ: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		panel.add(new JButton("����"));
		panel.add(new JButton("���"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		this.add(panel);
		this.setVisible(true);
	}
}