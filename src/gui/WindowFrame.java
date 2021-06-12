package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.AccountManager;

public class WindowFrame extends JFrame{
	AccountManager accountmanager;
	
	MenuSelection menu;
	AccountAdder adder;
	AccountViewer viewer;
	
	
	public WindowFrame(AccountManager accountmanager) {
		this.accountmanager = accountmanager;
		
		this.menu = new MenuSelection(this);
		this.adder = new AccountAdder(this, this.accountmanager);
		this.viewer = new AccountViewer(this, this.accountmanager);
		
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setupPanel(menu);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenu() {
		return menu;
	}

	public void setMenu(MenuSelection menu) {
		this.menu = menu;
	}

	public AccountAdder getAdder() {
		return adder;
	}

	public void setAdder(AccountAdder adder) {
		this.adder = adder;
	}

	public AccountViewer getViewer() {
		return viewer;
	}

	public void setViewer(AccountViewer viewer) {
		this.viewer = viewer;
	}
}
