package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

/**
 * has a ������ �̺�Ʈ ó��<br>
 * �����ΰ� �̺�Ʈ ó�� �ڵ带 �и��Ͽ� �ڵ��� ���⵵�� ���� �� �ִ�.
 * @author owner
 */
//1.������ ������Ʈ ���
@SuppressWarnings("serial")
public class Design extends Frame{
	//2.�̺�Ʈ ó���� �����ִ� Component�� ����
	private Button btn;
	public Design() {
		super("������");
		//3.������Ʈ ����
		btn = new Button("Ŭ��");
		//4.��ġ
		Panel panel = new Panel();
		panel.add(btn);
		add("Center",panel);
		//5.�̺�Ʈ ���
		//�̺�Ʈ ó�� ��ü ����
		EventHandlingHasA ehha = new EventHandlingHasA(this);
		System.out.println("������ ������ ��ü"+this);
		//������Ʈ�� �̺�Ʈ�� ���
		btn.addActionListener(ehha);//��ư���� �̺�Ʈ�� �߻��ϸ� ehha��ü�� override�� method���� �̺�Ʈ�� ó��
		
		//6.������ ũ�� ����
		setBounds(100,100,400,300);
		//7.����ȭ
		setVisible(true);
//		//8.�����̺�Ʈ
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent we) {
//				dispose();
//			}
//		});		
		
	}//Design
	public Button getBtn() {
		return btn;
	}//getBtn
	
	public static void main(String[] args) {
		new Design();
	}//main

}//class
