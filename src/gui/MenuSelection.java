package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Listeners.ButtonAdd;
import Listeners.ButtonView;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("계좌 추가");
		JButton button2 = new JButton("계좌 삭제");
		JButton button3 = new JButton("계좌 편집");
		JButton button4 = new JButton("계좌 목차");
		JButton button5 = new JButton("나가기");
		
		button1.addActionListener(new ButtonAdd(frame));
		button4.addActionListener(new ButtonView(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	}
}
