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
				JOptionPane.showMessageDialog(null, "1,2,3 중 하나의 값을 입력해주세요", "경고", JOptionPane.WARNING_MESSAGE);
			}
		}
	}// HW1

	public void menuDialog() {
		inputStr = JOptionPane.showInputDialog("메뉴선택\n1.입력 2.출력 3.종료");
	}

	public void inputDialog() {
		stuScore = JOptionPane.showInputDialog("데이터입력\n예)이름,자바점수,오라클점수");
		if (stuScore == null) {
			return;
		}
		String[] tempScoreArray = stuScore.split(",");
		if (tempScoreArray.length != 3) {
//			JOptionPane.showMessageDialog(null, "정확히 입력해주세요.\n예)이름,자바점수,오라클점수");
			JOptionPane.showMessageDialog(null, "정확히 입력해주세요.\n예)이름,자바점수,오라클점수", "경고", JOptionPane.WARNING_MESSAGE);
		} else {
			try {
				@SuppressWarnings("unused")
				int checkint;
				checkint = Integer.parseInt(tempScoreArray[1]);
				checkint = Integer.parseInt(tempScoreArray[2]);
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "점수는 정수로 정확히 입력해주세요.\n예)이름,자바점수,오라클점수", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			name.add(tempScoreArray[0]);
			javaScore.add(tempScoreArray[1]);
			oracleScore.add(tempScoreArray[2]);
		}
	}

	public void printDialog() {
		if (name.getItemCount() == 0) {
			JOptionPane.showMessageDialog(null, "데이터가 없습니다.");
		} else {
			JTextArea jta = new JTextArea(10, 40);
			jta.setEditable(false);
			jta.append("번호\t이름\t자바\t오라클\t총점\t평균\n");
			int numOfStu = name.getItemCount();
			int sum = 0;
			for (int i = 0; i < numOfStu; i++) {
				int tempJava = Integer.parseInt(javaScore.getItem(i));
				int tempOracle = Integer.parseInt(oracleScore.getItem(i));
				jta.append((i + 1) + "\t" + name.getItem(i) + "\t" + tempJava + "\t" + tempOracle + "\t"
						+ (tempJava + tempOracle) + "\t" + (tempJava / 2 + tempOracle / 2) + "\n");
				sum += tempJava + tempOracle;
			}
			jta.append("\t\t\t 총점 : " + sum + ", 평균 : " + (sum / numOfStu / 2));

			JScrollPane jsp = new JScrollPane(jta);

			JOptionPane.showMessageDialog(null, jsp);

		}

	}

	public static void main(String[] args) {
		new HW1();
	}// main
}// class
