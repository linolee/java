package day1214;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Icon class�� Ȱ���� �̹��� ���
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseImageIcon extends JFrame implements ActionListener {

	public UseImageIcon() {
		super("ImageIcon ���");
		ImageIcon ii1 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\1.jpg");
		ImageIcon ii2 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\2.jpg");
		ImageIcon ii3 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\3.PNG");
//		ImageIcon ii4 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\4.gif");

		JButton btn1 = new JButton("��ư1", ii1);
		JButton btn2 = new JButton("��ư2", ii2);
		JButton btn3 = new JButton("��ư3", ii3);
//		JButton btn4 = new JButton("��ư3", ii4);

		// TooltipText ����
		btn1.setToolTipText("��ư1");
		btn2.setToolTipText("��ư2");
		btn3.setToolTipText("��ư3");
//		btn4.setToolTipText("��ư4");

		//RollOverIcon
		btn3.setRolloverIcon(ii2);
		//��ư �� ��ġ ����
		//������ġ ���� : LEFT, CENTER, RIGHT
		btn1.setHorizontalTextPosition(JButton.LEFT);
		//������ġ ���� : TOP, CENTER, BOTTOM
		btn3.setHorizontalTextPosition(JButton.CENTER);
		btn3.setVerticalTextPosition(JButton.BOTTOM);
		setLayout(new GridLayout(1, 4));
		add(btn1);
		add(btn2);
		add(btn3);
//		add(btn4);

		setBounds(100, 100, 1500, 1300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new UseImageIcon();
	}// main

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}// class
