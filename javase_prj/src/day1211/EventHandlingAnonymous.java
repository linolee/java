package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * anonymous inner class�� �̺�Ʈ ó��
 * @author owner
 */
@SuppressWarnings("serial")
public class EventHandlingAnonymous extends Frame{
	//2.�̺�Ʈ ó���� ����� Component����
	private Button btn;
	public Button getBtn() {
		return btn;
	}
	
	public EventHandlingAnonymous() {
		super();
		//3.������Ʈ����
		btn = new Button("Ŭ��");
		//4.��ġ
		Panel panel = new Panel();
		panel.add(btn);
		
		add("Center",panel);
		
		//5.�̺�Ʈ ��� : anonymous inner class
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư Ŭ��");
				
				dispose();
			}
		});
		
		//6.������ ũ�� ����
		setBounds(100, 100, 300, 300);
		
		//7.����ȭ
		setVisible(true);
		
		
		
		
		
	}//EventHandlingAnonymous
	
	public static void main(String[] args) {
		new EventHandlingAnonymous();
	}//main

}//class
