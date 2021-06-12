package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccountAdder;
import gui.AccountViewer;
import gui.WindowFrame;

public class ButtonAddCancel implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAddCancel(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenu());
		frame.revalidate();
		frame.repaint();

	}

}
