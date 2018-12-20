package day1214;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {

	private JButton btn1, btn2, btn3;
	private JLabel jlOutput;
	public UseJOptionPane() {
		super("JOptionPane ���");
		
		btn1 = new JButton("input Dialog");
		btn2 = new JButton("Message Dialog");
		btn3 = new JButton("Confirm Dialog");
		jlOutput = new JLabel("���");
		jlOutput.setBorder(new TitledBorder("���â"));
		
		
		JPanel panel = new JPanel();
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		
		add("Center", panel);
		add("South", jlOutput);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btn1) {
			String name = JOptionPane.showInputDialog("�̸� �Է�");
			jlOutput.setText(name+"�� �ȳ��ϼ���?");
		}
		if (ae.getSource() == btn2) {
			
		}
		if (ae.getSource() == btn3) {
			
		}
	}

	public static void main(String[] args) {
		new UseJOptionPane();
	}

}
