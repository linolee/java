package day1226;

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

@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener {

	private JTextArea jta;
	private JTextField jtf;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	private ServerSocket server;
	private Socket client;

	public SimpleChatServer() {
		super(":::::::::::::::::ä�ü���:::::::::::::::::");

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

		jtf.addActionListener(this);
		setBounds(100, 100, 300, 400);
		setVisible(true);
		jtf.requestFocus();// Ŀ���� jtf�� ��ġ��Ų��

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("����");
				dispose();//ȭ���� ����� �� windowClosed ȣ��
			}

			@Override
			public void windowClosed(WindowEvent e) {
				try {
					close();//Ŭ���̾�Ʈ�� �����ϰ� �ִ� ��Ʈ��, ����, �������� ����
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

	}

	/**
	 * 1.ServerSocket �����ϰ� (PORT ����) 2.������ ������ ������(accept) 3.��ȭ�� �ְ� ���� �� �ֵ���
	 * Stream�� ����(DIS,DOS)
	 * 
	 * @throws IOException
	 */
	public void openServer() throws IOException , SocketException{
		// 1.
		server = new ServerSocket(65535);
		jta.setText("���� ���� ��..... �����ڸ� ��ٸ��ϴ�.\n");
		// 3.
		client = server.accept();
		jta.append("client ����\n");
		// 4.��Ʈ�� ����
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());

	}

	/**
	 * �����ڰ� �������� �޼����� ��� �о�鿩���Ѵ�.
	 * 
	 * @throws IOException
	 */
	public void revMsg() throws IOException {
		String msg = "";
		while (true) {
			// �޼����� �о�鿩
			msg = readStream.readUTF();
			// ��ȭâ�� ���
			jta.append("[client Msg] : " + msg + "\n");
		}
	}

	/**
	 * �����ڿ��� �޼����� ������ ��.
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
		jta.append("[server Msg] : " + msg + "\n");
		// �Է��� ���ϵ��� jtf�� �ʱ�ȭ
		jtf.setText("");
	}

	public void close() throws IOException {
		try {
			if (readStream != null) {
				readStream.close();
			}
			if (writeStream != null) {
				writeStream.close();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (writeStream != null) {// �����ڰ� �����Ͽ� ��Ʈ���� ������ ��쿡��
				sendMsg();// �޼����� ������.
			} else {
				JOptionPane.showMessageDialog(this, "��ȭ ��밡 �����ϴ�.");
				jtf.setText("");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SimpleChatServer scs = new SimpleChatServer();
		try {
			scs.openServer();
			scs.revMsg();
		}catch(SocketException se) {
			System.err.println("�����ڰ� ������ �� ����"+se.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(scs, "�������� ����!! �޼����� �о���� �� �����ϴ�.");
			e.printStackTrace();
		}
	}

}
