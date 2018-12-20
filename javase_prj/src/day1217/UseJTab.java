package day1217;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class UseJTab extends JFrame implements ChangeListener{
	JTabbedPane jtp = new JTabbedPane();
	int tabIdx;
	JPanel jp2;
	public UseJTab() {
		super("tab");
		//1. 탭을 추가할 수 있는 객체 생성
		jtp = new JTabbedPane();
		//2. 각 탭에 들어갈 컴포넌트를 생성
		ImageIcon ii = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/1.jpg");
		JLabel jl = new JLabel(ii);
		
		//두번째 탭에 들어갈 컴포넌트
		JPanel jp =new JPanel();
		jp.add(new JLabel("이름"));
		jp.add(new JTextField(30));
		jp.add(new JButton("입력"));

		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("입력데이터"));
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("결과창"));
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		jtp.add("처음탭", jl);
		jtp.add("두번째 탭", tab2);
		jtp.addTab("세번째 탭", new JButton("클릭"));
		
		//
		jp2 = new JPanel();
		
		jtp.addTab("4", jp2);
		jtp.addChangeListener(this);
		
		//배치
		add("Center",jtp);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new UseJTab();
	}



	@Override
	public void stateChanged(ChangeEvent ce) {
		tabIdx = jtp.getSelectedIndex();
		if(tabIdx == 3) {
			String input = JOptionPane.showInputDialog("비번 입력");
			if (!input.equals("123")) {
				jtp.setSelectedIndex(0);
				return;
			}
			ImageIcon ii = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\2.jpg");
			jp2.add(new JLabel(ii));
		}
	
	}

}
