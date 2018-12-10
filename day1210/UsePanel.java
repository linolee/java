package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Container Component : �Ϲ� Component�� Container Component�� ������ �� �ִ� Component ��� 
 * @author owner
 */
//1.window component ���
@SuppressWarnings("serial")
public class UsePanel extends Frame{
	public UsePanel() {
		super("Container Component ���");
		//2.component ����
		Color back = new Color(0x91645E);
		Color fore = new Color(0x373E5A);
		Label lblName = new Label("�̸�");
		lblName.setBackground(Color.DARK_GRAY);
		lblName.setForeground(Color.ORANGE);
		TextField tfName = new TextField(20);
		tfName.setBackground(new Color(0x02778B));
		tfName.setForeground(new Color(0xB6FFFF));
		Button btnAdd = new Button("�߰�");
		btnAdd.setBackground(back);
		btnAdd.setForeground(fore);
		
		Button btnClose = new Button("����");
		TextArea taDisplay = new TextArea();
		taDisplay.setBackground(new Color(0xD3D3FF));
		taDisplay.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 20));
		
		//�Ϲ� ������Ʈ�� ��ġ�� �� �ִ� �����̳� ������Ʈ�� ����
		Panel panelNorth = new Panel();//FlowLayout
		//������ �����̳� ������Ʈ�� �Ϲ� ������Ʈ�� ��ġ
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.add(btnClose);
		
		//3.��ġ������ ����
		setLayout(new BorderLayout());
		//4.��ġ BorderLayout Ư¡ : �ϳ��� �������� �ϳ��� ������Ʈ�� ���尡��
		add("North",panelNorth);
//		add("North",lblName);
//		add("North",tfName);
//		add("North",btnAdd);
//		add("North",btnClose);
		add("Center",taDisplay);

		
		//5.�������� ũ�⸦ ����
		setBounds(200, 150, 400, 250);
		//6.����ڿ��� �����ֱ�
		setVisible(true);
		//����(anonymous class)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
	}//UsePanel

	public static void main(String[] args) {
		new UsePanel();
	}// main

}// class
