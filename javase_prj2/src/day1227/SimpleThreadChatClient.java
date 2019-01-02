package day1227;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Thread�� ����Ͽ� ���ѷ����� �޼����� �о���̴� �ڵ带
 * ȭ������ΰ� �޼����� ������ �ڵ�� ���ÿ� �����Ų��.
 * @author owner
 */
@SuppressWarnings("serial")
public class SimpleThreadChatClient extends JFrame implements ActionListener, Runnable {
	
	private JTextArea jta;
	private JTextField jtf;
	
	private Socket client;//������ �����ϱ� ����
	private DataInputStream readStream;//������ �����͸� �б����� ��Ʈ��
	private DataOutputStream writeStream;//������ �����͸� ������ ���� ��Ʈ��
	private JScrollPane jsp;
	
	public SimpleThreadChatClient() {
		super(":::::ä��Ŭ���̾�Ʈ:::::");
		jta = new JTextArea();
		jta.setBorder(new TitledBorder("��ȭ����"));
		jta.setEditable(false);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);
		
		jsp = new JScrollPane(jta);
		
		jtf = new JTextField();
		jtf.setBorder(new TitledBorder("��ȭ�Է�"));
		
		add("Center",jsp);
		add("South",jtf);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		jtf.requestFocus();
		
//		try {
//			connectToServer();
//			run();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		jtf.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (writeStream != null) { //�����ڰ� �����Ͽ� ��Ʈ���� ������ ��쿡��
				sendMsg();//�޼����� ������.
			}else {
				JOptionPane.showMessageDialog(this, "��ȭ��밡 �����ϴ�.");
				jtf.setText("");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
	}
	
	public void close() throws IOException{
		try {
			if (writeStream != null) {writeStream.close();}
			if (readStream != null) {readStream.close();}
		}finally {
			if (client != null) {client.close();}
		}
	}
	
	/**
	 * 2. ������ �����Ͽ� ������ �����ϰ� ��ȭ�� �аų� ������ ����
	 * 4. ��Ʈ���� ������ ��´�.
	 * @throws IOException
	 */
	public void connectToServer() throws IOException{
		//2.
		client = new Socket("211.63.89.157", 35000);
//		client = new Socket("127.0.0.1", 35000);
		// 4. ��Ʈ�� ����
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());
		
	}
	
	public void run(){
		String revMsg = "";

		while (true) {
			// �޼����� �о�鿩
			try {
				revMsg = readStream.readUTF();
				jta.append("[ server �޼��� ] : " + revMsg + "\n");
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// ��ȭâ�� ���
		}
	}
	
	/**
	 * �ۼ��� �޼����� ������ ������ ��
	 */
	public void sendMsg() throws IOException{
		// T.F�� ���� �����ͼ�
		String sendMsg = jtf.getText().trim();
		// ��Ʈ���� ����ϰ�
		writeStream.writeUTF(sendMsg);
		// ��Ʈ���� ������ �������� ����
		writeStream.flush();
		// ���� �� ������ �� ȭ�鿡 ����ϰ�
		jta.append("[ client �޼��� ] : " + sendMsg + "\n");
		// �Է��� ���ϵ��� jtf�� �ʱ�ȭ
		jtf.setText("");
	}
	

	public static void main(String[] args) {
//		new SimpleThreadChatClient();
		SimpleThreadChatClient stcc = new SimpleThreadChatClient();
		try {
			stcc.connectToServer();
			//�޼����� ���ÿ� �о��� �ϱ� ������ Thread�� ó��
			Thread t= new Thread(stcc);
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
