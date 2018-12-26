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
		super(":::::::::::::::::채팅서버:::::::::::::::::");

		jta = new JTextArea();
		jta.setBorder(new TitledBorder("대화내용"));
		jta.setEditable(false);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);
		JScrollPane jsp = new JScrollPane(jta);

		jtf = new JTextField();
		jtf.setBorder(new TitledBorder("대화입력"));

		add("Center", jsp);
		add("South", jtf);

		jtf.addActionListener(this);
		setBounds(100, 100, 300, 400);
		setVisible(true);
		jtf.requestFocus();// 커서를 jtf에 위치시킨다

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료");
				dispose();//화면이 종료된 후 windowClosed 호출
			}

			@Override
			public void windowClosed(WindowEvent e) {
				try {
					close();//클라이언트와 연결하고 있는 스트림, 소켓, 서버소켓 종료
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

	}

	/**
	 * 1.ServerSocket 생성하고 (PORT 열림) 2.접속자 소켓이 들어오면(accept) 3.대화를 주고 받을 수 있도록
	 * Stream을 연결(DIS,DOS)
	 * 
	 * @throws IOException
	 */
	public void openServer() throws IOException , SocketException{
		// 1.
		server = new ServerSocket(65535);
		jta.setText("서버 가동 중..... 접속자를 기다립니다.\n");
		// 3.
		client = server.accept();
		jta.append("client 접속\n");
		// 4.스트림 연결
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());

	}

	/**
	 * 접속자가 보내오는 메세지를 계속 읽어들여야한다.
	 * 
	 * @throws IOException
	 */
	public void revMsg() throws IOException {
		String msg = "";
		while (true) {
			// 메세지를 읽어들여
			msg = readStream.readUTF();
			// 대화창에 출력
			jta.append("[client Msg] : " + msg + "\n");
		}
	}

	/**
	 * 접속자에게 메세지를 보내는 일.
	 * 
	 * @throws IOException
	 */
	public void sendMsg() throws IOException {
		// T.F의 값을 가져와서
		String msg = jtf.getText().trim();
		// 스트림에 기록하고
		writeStream.writeUTF(msg);
		// 스트림의 내용을 목적지로 분출
		writeStream.flush();
		// 내가 쓴 내용을 내 화면에 출력하고
		jta.append("[server Msg] : " + msg + "\n");
		// 입력이 편하도록 jtf를 초기화
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
			if (writeStream != null) {// 접속자가 존재하여 스트림이 생성된 경우에만
				sendMsg();// 메세지를 보낸다.
			} else {
				JOptionPane.showMessageDialog(this, "대화 상대가 없습니다.");
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
			System.err.println("접속자가 들어오기 전 종료"+se.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(scs, "서버가동 실패!! 메세지를 읽어들일 수 없습니다.");
			e.printStackTrace();
		}
	}

}
