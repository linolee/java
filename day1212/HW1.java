package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HW1 extends Frame implements ActionListener{
	private Button btn1;
	private Button btn2;
	
	
	
	public HW1() {
		ActionEventA aea;
		ActionEventB aeb;
		aea = new ActionEventA();
		aeb = new ActionEventB();
		
		btn1 = new Button("A");
		btn2 = new Button("B");
		Panel pnl = new Panel();
		add("Center",pnl);
		pnl.add(btn1);
		pnl.add(btn2);
		setBounds(100, 100, 100, 100);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		btn1.addActionListener(aea);
		btn2.addActionListener(aeb);
	}
	
	public static void main(String[] args) {
		new HW1();
	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("¤»¤»¤»");
	}
}//class
