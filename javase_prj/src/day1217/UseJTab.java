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
		//1. ���� �߰��� �� �ִ� ��ü ����
		jtp = new JTabbedPane();
		//2. �� �ǿ� �� ������Ʈ�� ����
		ImageIcon ii = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/1.jpg");
		JLabel jl = new JLabel(ii);
		
		//�ι�° �ǿ� �� ������Ʈ
		JPanel jp =new JPanel();
		jp.add(new JLabel("�̸�"));
		jp.add(new JTextField(30));
		jp.add(new JButton("�Է�"));

		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("�Էµ�����"));
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("���â"));
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		jtp.add("ó����", jl);
		jtp.add("�ι�° ��", tab2);
		jtp.addTab("����° ��", new JButton("Ŭ��"));
		
		//
		jp2 = new JPanel();
		
		jtp.addTab("4", jp2);
		jtp.addChangeListener(this);
		
		//��ġ
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
			String input = JOptionPane.showInputDialog("��� �Է�");
			if (!input.equals("123")) {
				jtp.setSelectedIndex(0);
				return;
			}
			ImageIcon ii = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\2.jpg");
			jp2.add(new JLabel(ii));
		}
	
	}

}
