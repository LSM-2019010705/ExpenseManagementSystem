package gui;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Accounts.AccountInput;
import Manager.AccountManager;

public class AccountViewer extends JPanel {
	
	WindowFrame frame;
	AccountManager accountmanager;
	
	public AccountManager getAccountmanager() {
		return accountmanager;
	}

	public void setAccountmanager(AccountManager accountmanager) {
		this.accountmanager = accountmanager;
		this.removeAll();
	
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("계좌");
		model.addColumn("성함");
		model.addColumn("이메일");
		model.addColumn("전화 번호");
		
		for (int i=0; i<accountmanager.size(); i++) {
			Vector row = new Vector();
			AccountInput ai = accountmanager.get(i);
			row.add(ai.getID());
			row.add(ai.getName());
			row.add(ai.getEmail());
			row.add(ai.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		
	}

	public AccountViewer(WindowFrame frame, AccountManager accountmanager) {
		this.frame = frame;
		this.accountmanager = accountmanager;
		
		System.out.println("*** "+ accountmanager.size() + " ***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("계좌");
		model.addColumn("성함");
		model.addColumn("이메일");
		model.addColumn("전화 번호");
		
		for (int i=0; i<accountmanager.size(); i++) {
			Vector row = new Vector();
			AccountInput ai = accountmanager.get(i);
			row.add(ai.getID());
			row.add(ai.getName());
			row.add(ai.getEmail());
			row.add(ai.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}