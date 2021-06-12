package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Manager.AccountManager;
import gui.AccountAdder;
import gui.AccountViewer;
import gui.WindowFrame;

public class ButtonView implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonView(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AccountViewer accountViewer = frame.getViewer();
		AccountManager accountmanager = getObject("accountmanager.ser");
		accountViewer.setAccountmanager(accountmanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(accountViewer);
		frame.revalidate();
		frame.repaint();
//		JButton b = (JButton) e.getSource();
//		frame.getViewer();
//		AccountViewer view = frame.getViewer();
//		frame.setupPanel(view);
	}
	
	public static AccountManager getObject(String filename) {
		AccountManager accountmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			accountmanager = (AccountManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return accountmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
		return accountmanager;
	}

}
