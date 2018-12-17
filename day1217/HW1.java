package day1217;

import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class HW1 extends JFrame {

	private String inputStr;
	private String stuScore;

	private List name;
	private List javaScore;
	private List oracleScore;

//	private String[] scoreArray;

//	private JButton input;

	public HW1() {
		name = new List();
		javaScore = new List();
		oracleScore = new List();

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		boolean flag = true;
		while (flag) {
			menuDialog();
			if (inputStr == null) {
				flag = false;
				dispose();
			} else if (inputStr.equals("1")) {
				inputDialog();
			} else if (inputStr.equals("2")) {
				printDialog();
			} else if (inputStr.equals("3")) {
				flag = false;
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "1,2,3 �� �ϳ��� ���� �Է����ּ���", "���", JOptionPane.WARNING_MESSAGE);
			}
		}
	}// HW1

	public void menuDialog() {
		inputStr = JOptionPane.showInputDialog("�޴�����\n1.�Է� 2.��� 3.����");
	}

	public void inputDialog() {
		stuScore = JOptionPane.showInputDialog("�������Է�\n��)�̸�,�ڹ�����,����Ŭ����");
		if (stuScore == null) {
			return;
		}
		String[] tempScoreArray = stuScore.split(",");
		if (tempScoreArray.length != 3) {
//			JOptionPane.showMessageDialog(null, "��Ȯ�� �Է����ּ���.\n��)�̸�,�ڹ�����,����Ŭ����");
			JOptionPane.showMessageDialog(null, "��Ȯ�� �Է����ּ���.\n��)�̸�,�ڹ�����,����Ŭ����", "���", JOptionPane.WARNING_MESSAGE);
		} else {
			try {
				@SuppressWarnings("unused")
				int checkint;
				checkint = Integer.parseInt(tempScoreArray[1]);
				checkint = Integer.parseInt(tempScoreArray[2]);
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "������ ������ ��Ȯ�� �Է����ּ���.\n��)�̸�,�ڹ�����,����Ŭ����", "���", JOptionPane.WARNING_MESSAGE);
				return;
			}
			name.add(tempScoreArray[0]);
			javaScore.add(tempScoreArray[1]);
			oracleScore.add(tempScoreArray[2]);
		}
	}

	public void printDialog() {
		if (name.getItemCount() == 0) {
			JOptionPane.showMessageDialog(null, "�����Ͱ� �����ϴ�.");
		} else {
			JTextArea jta = new JTextArea(10, 40);
			jta.setEditable(false);
			jta.append("��ȣ\t�̸�\t�ڹ�\t����Ŭ\t����\t���\n");
			int numOfStu = name.getItemCount();
			int sum = 0;
			for (int i = 0; i < numOfStu; i++) {
				int tempJava = Integer.parseInt(javaScore.getItem(i));
				int tempOracle = Integer.parseInt(oracleScore.getItem(i));
				jta.append((i + 1) + "\t" + name.getItem(i) + "\t" + tempJava + "\t" + tempOracle + "\t"
						+ (tempJava + tempOracle) + "\t" + (tempJava / 2 + tempOracle / 2) + "\n");
				sum += tempJava + tempOracle;
			}
			jta.append("\t\t\t ���� : " + sum + ", ��� : " + (sum / numOfStu / 2));

			JScrollPane jsp = new JScrollPane(jta);

			JOptionPane.showMessageDialog(null, jsp);

		}

	}

	public static void main(String[] args) {
		new HW1();
	}// main
}// class
