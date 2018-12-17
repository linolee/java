package day1213;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Frame Ŭ�������� ������Ʈ�� Is a�� ������ Dialog ���
 * @author owner
 */
//
@SuppressWarnings("serial")
public class UseDialogIsA extends Frame implements ActionListener {

	private Button btn1;//Frame�� ��ġ
	
	public UseDialogIsA() {
		super("���̾�α� ���");
		
		btn1 = new Button("���̾�α� ���");
		Panel panel = new Panel();
		panel.add(btn1);
		
		add("Center",panel);
		
		btn1.addActionListener(this);
		setBounds(100, 100, 300, 400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
	}//UseDialogIsA
	@Override
	public void actionPerformed(ActionEvent ae) {
			createDialog();
	}
	
	public void createDialog() {
		new DialogIsA(this);
	}
	

	public static void main(String[] args) {
		new UseDialogIsA();
	}

}
