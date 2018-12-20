package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HW1 extends Frame {
	public HW1() {
		super("�л�����");
		Label lbl = new Label("�л�����");
		Panel mainpnl = new Panel(new GridLayout(1,2));
		Panel pnlMap = new Panel(new GridLayout(4,2));
		Panel pnlSouth = new Panel();
		Button add = new Button("�߰�");
		Button update = new Button("����");
		Button delete = new Button("����");
		Button exit = new Button("����");
		Label name = new Label("�̸�");
		Label age = new Label("����");
		Label tel = new Label("��ȭ��ȣ");
		Label gender = new Label("����");
		TextArea ta = new TextArea();
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		Panel pnlGender = new Panel();
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox rb1 = new Checkbox("����", true, cg);
		Checkbox rb2 = new Checkbox("����", false, cg);
		
		//3.��ġ������ ���� : Window Component�� Frame, Dialog�� BorderLayout�� �⺻����
		setLayout(new BorderLayout());
		//4.������Ʈ�� ��ġ�����ڸ� ����Ͽ� ��ġ : add("��ġ��ġ", ������Ʈ); add(���, ������Ʈ);
		add("North", lbl);
		add("Center",mainpnl);
		add("South",pnlSouth);
		//Constant(Field)�� ����Ͽ� ��ġ
		mainpnl.add(pnlMap);
		mainpnl.add(ta);
		pnlMap.add(name);
		pnlMap.add(tf1);
		pnlMap.add(age);
		pnlMap.add(tf2);
		pnlMap.add(tel);
		pnlMap.add(tf3);
		pnlMap.add(gender);
		pnlMap.add(pnlGender);
		pnlGender.add(rb1);
		pnlGender.add(rb2);
		
		
		
		pnlSouth.add(add);
		pnlSouth.add(update);
		pnlSouth.add(delete);
		pnlSouth.add(exit);
		
		//5.�������� ũ�⸦ ����
		setSize(400, 200);
		//6.����ڿ��� �����ֱ�
		setVisible(true);
		//����(anonymous class)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
		
		
	}

	public static void main(String[] args) {
		new HW1();
	}

}
