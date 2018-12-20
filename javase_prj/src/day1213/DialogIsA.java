package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Dialog ���
@SuppressWarnings("serial")
public class DialogIsA extends Dialog implements ActionListener {
//2.�̺�Ʈ�� �����ִ� ������Ʈ�� ����
	private Button btn;

	public DialogIsA(UseDialogIsA uda) {
		super(uda, "���̾�α�", true);

		// ������Ʈ ����
		Label lbl = new Label("������ ������Դϴ�.");
		btn = new Button("����");

		add("Center", lbl);
		add("South", btn);

		btn.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}// windowClosing
		});
		//���̾�α��� ��ġ�� �θ������� ���ʿ��� ����
		setBounds(uda.getX()+50, uda.getY()+100, 200, 200);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}

}
