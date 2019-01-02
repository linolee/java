package day1227;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Thread�� �����Ͽ� �޼����� �д� �ڵ带 ȭ��, �޼����� ������ �ڵ�� ���ÿ� ó���Ѵ�.
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class SimpleThreadChatServer extends JFrame implements ActionListener, Runnable {

	private JTextArea jta;
	private JTextField jtf;

	private ServerSocket server;
	private Socket client;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	private JScrollPane jsp;
	
	public SimpleThreadChatServer() {
		super(":::::ä�ü���:::::");
		jta = new JTextArea();
		jta.setBorder(new TitledBorder("��ȭ����"));
		jta.setEditable(false);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);

		JScrollPane jsp = new JScrollPane(jta);

		jtf = new JTextField();
		jtf.setBorder(new TitledBorder("��ȭ�Է�"));

		add("Center", jsp);
		add("South", jtf);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);//���� �ڹٰ���ӽŰ� ���õ� �ν��Ͻ��� �� �ֱ�
				dispose();// ȭ���� ����� �� -> windowClosed ȣ��
			}

			@Override
			public void windowClosed(WindowEvent e) {
				try {
					close(); // Ŭ���̾�Ʈ�� �����ϰ��ִ� ��Ʈ��, ����, �������� ����
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		setBounds(100, 100, 300, 400);
		setVisible(true);
		jtf.requestFocus();

//		try {
//			openServer();
//			//has a : �޼����� �д� �ڵ带 Thread�� ó���ϸ� ��� �ִ� �����ϰ� �ȴ�.
//			Thread t = new Thread(this);
//			t.start();//start�� ���� run ȣ��
//		} catch (SocketException se) {
//			System.err.println("�����ڰ� ������ �� ����" + se.getMessage());
//		} catch (IOException e) {
//			JOptionPane.showMessageDialog(this, "�������� ���� !! �޼����� �о���� �� �����ϴ�.");
//		}

		jtf.addActionListener(this);
	}

	public void close() throws IOException {
		try {
			if (writeStream != null) {
				writeStream.close();
			}
			if (readStream != null) {
				readStream.close();
			}
			if (client != null) {
				client.close();
			}
		} finally {
			if (server != null) {
				server.close();
			}
		}

	}

	/**
	 * 1. ServerSocket �����ϰ�(PORT����) 2. ������ ������ ������(accept) 3. ��ȭ�� �ְ� ���� �� �ֵ���
	 * Stream�� ����(DIS, DOS)
	 */
	public void openServer() throws IOException, SocketException {
		// 1.
		server = new ServerSocket(65535);
		jta.setText("�������� ��..... �����ڸ� ��ٸ��ϴ�.\n");
		// 3.
		client = server.accept();
		jta.append("client ����\n ");
		// 4. ��Ʈ�� ����
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());

	}

	/**
	 * 
	 * @throws IOException
	 */
	public void sendMsg() throws IOException {
		// T.F�� ���� �����ͼ�
		String msg = jtf.getText().trim();
		// ��Ʈ���� ����ϰ�
		writeStream.writeUTF(msg);
		// ��Ʈ���� ������ �������� ����
		writeStream.flush();
		// ���� �� ������ �� ȭ�鿡 ����ϰ�
		jta.append("[ server �޼��� ] : " + msg + "\n");
		// �Է��� ���ϵ��� jtf�� �ʱ�ȭ
		jtf.setText("");
	}

	/**
	 * �����ڰ� �������� �޼����� ��� �о�鿩�� �Ѵ�.
	 * 
	 * @throws IOException
	 */
	@Override
	public void run() {
		String msg = "";
		try {
			while (true) {
				// �޼����� �о�鿩
				msg = readStream.readUTF();

				// ��ȭâ�� ���
				jta.append("[ client �޼��� ] : " + msg + "\n");
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			}
		} catch (IOException ie) {
			JOptionPane.showMessageDialog(this, "�����ڰ� ����Ͽ����ϴ�.");
			ie.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if (writeStream != null) { // �����ڰ� �����Ͽ� ��Ʈ���� ������ ��쿡��
				sendMsg();// �޼����� ������.
			} else {
				JOptionPane.showMessageDialog(this, "��ȭ��밡 �����ϴ�.");
				jtf.setText("");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		new SimpleThreadChatServer();
		SimpleThreadChatServer stcs = new SimpleThreadChatServer();
		try {
			stcs.openServer();
			//Thread�� stcs ��ü�� has a ����� ����
			Thread t = new Thread(stcs);
			//�޼����� �д� �ڵ带 Thread�� ó��
			t.start();
		} catch(SocketException se) {
			System.err.println("�����ڰ� ������ �� ����" + se.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(stcs, "�������� ���� !! �޼����� �о���� �� �����ϴ�.");
		}

	}

}
