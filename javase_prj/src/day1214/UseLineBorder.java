package day1214;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class UseLineBorder extends JFrame implements ActionListener {

	private JButton btn1, btn2;
	
	public UseLineBorder() {
		super("LineBorder");
		
		btn1 = new JButton("확인");
		btn2 = new JButton("취소");
		
		
		JPanel panel = new JPanel();
		panel.add(btn1);
		panel.add(btn2);
		panel.setBorder(new LineBorder(Color.RED));
		
		setLayout(null);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		panel.setBounds(100, 350, 150, 40);
		add(panel);
		
		setBounds(100, 100, 350, 450);
		setVisible(true);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btn1) {
			new UseTitledBorder();
			dispose();
		}
		if(e.getSource()==btn1) {
			dispose();
		}
	}

	public static void main(String[] args) {
		new UseLineBorder();
	}

}
