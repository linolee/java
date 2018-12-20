package day1214;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.memo.view.JavaMemo;

@SuppressWarnings("serial")
public class UseTitledBorder extends JFrame implements ActionListener {

	private JTextField jtFld;
	private JPasswordField jpfPass;
	private JLabel jlOutput;

	public UseTitledBorder() {
		jtFld = new JTextField();
		jpfPass = new JPasswordField();
		jlOutput = new JLabel("");

		jtFld.setBorder(new TitledBorder("아이디"));
		jpfPass.setBorder(new TitledBorder("비밀번호"));
		jlOutput.setBorder(new TitledBorder("출력창"));

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		panel.add(jtFld);
		panel.add(jpfPass);
		panel.add(jlOutput);

		// 이벤트 등록
		jtFld.addActionListener(this);
		jpfPass.addActionListener(this);

		add("Center", panel);

		setBounds(100, 100, 250, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		String id = jtFld.getText().trim();
		String pass = new String(jpfPass.getPassword());

		if (ae.getSource() == jtFld) {// 아이디에서 이벤트가 발생하면
			// 아이디에 값이 들어있다면 커서를 비밀번호로 이동
			if (!id.equals("")) {
				jpfPass.requestFocus();

			} else {
				jlOutput.setText("아이디를 입력해주세요");
			}

		}
		if (ae.getSource() == jpfPass) {// 비밀번호에서 이벤트가 발생하면
			if (id.equals("")) {// 아이디에 값이 없다면
				jtFld.requestFocus();
				jlOutput.setText("아이디를 입력해주세요");
				// 커서를 아이디로 이동
				return;
			}

			if (pass.trim().equals("")) {// 비밀번호에 값이 없다면
				jlOutput.setText("비밀번호를 입력해주세요");
				jpfPass.requestFocus();
				return;
				// 출력창에 "비번입력"을 보여주고 커서를 비밀번호에 이동
			} else {
				// 비밀번호에 값이 있다면
				if (id.equals("admin") && pass.trim().equals("123")) {// 아이디가 admin, 비밀번호가 123과 같은지 비교하여
					new JavaMemo(null);// 같다면 자바메모장 클래스를 실행
					dispose();
				} else {
					jlOutput.setText("아이디나 비밀번호를 확인해주세요");
					return;
				}
			}
		}
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new UseTitledBorder();
	}

}
