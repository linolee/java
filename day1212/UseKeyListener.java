package day1212;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Keyboard Event ó��
 * @author owner
 */
//1.������ ������Ʈ ���, �̺�Ʈ ó�� �����ʸ� ����
@SuppressWarnings("serial")
public class UseKeyListener extends Frame implements KeyListener{
	
	//2.�̺�Ʈ�� �����ִ� ������Ʈ ����
	private TextField tf;
	private Label lbl;
	
	
	public UseKeyListener() {
		super("Ű���� �̺�Ʈ ����");
		//3.������Ʈ ����
		tf = new TextField();
		lbl = new Label("���â",Label.CENTER);
		//4.��ġ
		add("North",tf);
		add("Center",lbl);
		
		//5.������Ʈ�� �̺�Ʈ�� ���
		tf.addKeyListener(this);
		
		//6.������ ũ�� ����
		setBounds(100, 100, 400, 150);
		//7.����ȭ
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		//2.Ű�� ���� ������ ���޵Ǵ� ����. ���� Ű�� ������ �� �� �ִ�.
//		System.out.println("keyTyped");

	}

	@Override
	public void keyPressed(KeyEvent ke) {
		//1.Ű������ Ű�� ������ �����̾ Ű�� ������ �� �� ����.
//		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		//3.���� Ű�� ������ �����ϰ� �ٽ� �ö���� ����. ���� Ű�� ������ �� �� �ִ�.
//		System.out.println("keyReleased");
		//���� Ű�� ���ڿ� �ڵ尪�� ��� ��� Label�� �Ѹ���.
		char inputKey = ke.getKeyChar();
		int inputCode = ke.getKeyCode();//keycode�� Ű���� Ű�� ������
//		System.out.println(inputKey+" "+inputCode);
		StringBuilder output = new StringBuilder();
		output.append("����Ű ���� : " ).append(inputKey).append(", ���� Ű�� Ű�ڵ� : ").append(inputCode);
		lbl.setText(output.toString());
		
		switch (inputCode) {
		case KeyEvent.VK_ENTER:
			//TextField, TextArea���� setText("")�� �ٷ� ����ϸ� �ʱ�ȭ ���� �ʴ� JDK1.7���� �߻��� ����
			tf.getText();
			tf.setText("");
			break;
		case KeyEvent.VK_ESCAPE:
			dispose();
		}
	}

	public static void main(String[] args) {
		new UseKeyListener();
	}
}
