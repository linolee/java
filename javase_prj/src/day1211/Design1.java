package day1211;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//1.Frame ���, �̺�Ʈ�� ó���� �� �ִ� ItemListener ���� 
@SuppressWarnings("serial")
public class Design1 extends Frame implements ItemListener{
	List list = new List();
	Label label = new Label();
	
	public Design1() {
		list.add("������/27");
		list.add("���ü�/26");
		list.add("������/27");
		list.add("�̺���/28");
		list.add("������/31");
		label.setText("�̸� :         ���� : ");		
		
		
		setLayout(new BorderLayout());
		add("Center", list);
		add("South", label);
		setBounds(100,100,300,300);
		setVisible(true);
		
		list.addItemListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
	}
	
	
	public static void main(String[] args) {
		new Design1();
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		//����Ʈ�� �������� ���õǸ� ������ �������� �����ͼ� �󺧿� ����
		String[] temparr = list.getSelectedItem().split("/");
		String name = temparr[0];
		String age = temparr[1];
		StringBuilder viewData = new StringBuilder();
//		label.setText("�̸� : "+name+"  ���� : "+age);
		viewData.append("�̸� : ").append(name).append("   ���� : ").append(age);
		label.setText(viewData.toString());
		
	}

}
