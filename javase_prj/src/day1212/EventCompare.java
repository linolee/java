package day1212;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���� ������ �̺�Ʈ�� ������ �߻��ϸ� �� �̺�Ʈ�� ���Ͽ� ó���ϴ� ���<br>
 * �̺�Ʈ�� �߻���Ų �ּҸ� �� - ��� �̺�Ʈ���� ��밡�� : getSource()<br>
 * �̺�Ʈ�� �߻���Ų ��ü�� Label�� �� - ActionEvent������ ��밡�� : getActionCommand()<br>
 * 
 * @author owner
 */
@SuppressWarnings("serial")
//1.Window Component ���, Eventó�� Listener�� ����
public class EventCompare extends Frame implements ActionListener{
	//2.�̺�Ʈ�� �����ִ� Component�� ����
	private Button btnOpen;
	private Button btnSave;
	private Label lblOutput;
		
	
	
	
	public EventCompare() {
		super("���� ���̾�α� ���");
		//3.����
		btnOpen = new Button("������");
		btnSave = new Button("������");
		lblOutput = new Label("������");
		//4.��ġ
		Panel pnl = new Panel();//Container Component
		pnl.add(btnOpen);
		pnl.add(btnSave);
		
		add("Center",pnl);
		add("South",lblOutput);
		//5.�̺�Ʈ ���
		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);
		
		//6.������ũ�⼳��
		setBounds(100, 100, 500, 100);
		//7.����ȭ
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
	}//EventCompare

	@Override
	public void actionPerformed(ActionEvent ae) {
//		System.out.println(ae);
//		�̺�Ʈ �߻�java.awt.event.ActionEvent[ACTION_PERFORMED,cmd=������,when=1544580933977,modifiers=] on button0
//		�̺�Ʈ �߻�java.awt.event.ActionEvent[ACTION_PERFORMED,cmd=������,when=1544580936817,modifiers=] on button1
		
//		System.out.println("�̺�Ʈ �߻� ��ü�� Label : "+ae.getActionCommand());
//		�̺�Ʈ �߻� ��ü�� Label : ������
//		�̺�Ʈ �߻� ��ü�� Label : ������

		////////////////////////////////�ּҺ�/////////////////////////////////
//		if(ae.getSource() == btnOpen) {
//			System.out.println("����");
//		}
//		if(ae.getSource() == btnSave) {
//			System.out.println("����");
//		}
		
		
		////////////////////////////////�󺧺�/////////////////////////////////
		String label = ae.getActionCommand();
		if(label.equals("������")) {
			//window component
			FileDialog fdOpen = new FileDialog(this, "���� ����", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String name = fdOpen.getFile();
			if (path == null) {
				path = "���õ� ��ΰ� �����ϴ�.";}
			if (name == null) {
				name = "^��^";}
			
			lblOutput.setText("�������� : "+path+name);
			setTitle("���� ���̾�α� ��� - ���� : "+name);
			
		}
		if(label.equals("������")) {
			FileDialog fdSave = new FileDialog(this, "���� ����", FileDialog.SAVE);
			fdSave.setVisible(true);
			
			String path = fdSave.getDirectory();
			String name = fdSave.getFile();
			
			if (path == null) {
				path = "���õ� ��ΰ� �����ϴ�.";}
			if (name == null) {
				name = "^��^";}
			
			lblOutput.setText("�������� : "+path+name);
			setTitle("���� ���̾�α� ��� - ���� : "+name);
			
		}
		
		
				
		
	}

	
	public static void main(String[] args) {
		new EventCompare();
	}
}
