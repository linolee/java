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
 * Thread를 도입하여 메세지를 읽는 코드를 화면, 메세지를 보내는 코드와 동시에 처리한다.
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
		super(":::::채팅서버:::::");
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

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);//현재 자바가상머신과 관련된 인스턴스가 다 주금
				dispose();// 화면이 종료된 후 -> windowClosed 호출
			}

			@Override
			public void windowClosed(WindowEvent e) {
				try {
					close(); // 클라이언트와 연결하고있는 스트림, 소켓, 서버소켓 종료
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
//			//has a : 메세지를 읽는 코드를 Thread로 처리하면 어디에 있던 동작하게 된다.
//			Thread t = new Thread(this);
//			t.start();//start에 의해 run 호출
//		} catch (SocketException se) {
//			System.err.println("접속자가 들어오기 전 종료" + se.getMessage());
//		} catch (IOException e) {
//			JOptionPane.showMessageDialog(this, "서버가동 실패 !! 메세지를 읽어들일 수 없습니다.");
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
	 * 1. ServerSocket 생성하고(PORT열림) 2. 접속자 소켓이 들어오면(accept) 3. 대화를 주고 받을 수 있도록
	 * Stream을 연결(DIS, DOS)
	 */
	public void openServer() throws IOException, SocketException {
		// 1.
		server = new ServerSocket(65535);
		jta.setText("서버가동 중..... 접속자를 기다립니다.\n");
		// 3.
		client = server.accept();
		jta.append("client 접속\n ");
		// 4. 스트림 연결
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());

	}

	/**
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
		jta.append("[ server 메세지 ] : " + msg + "\n");
		// 입력이 편하도록 jtf를 초기화
		jtf.setText("");
	}

	/**
	 * 접속자가 보내오는 메세지를 계속 읽어들여야 한다.
	 * 
	 * @throws IOException
	 */
	@Override
	public void run() {
		String msg = "";
		try {
			while (true) {
				// 메세지를 읽어들여
				msg = readStream.readUTF();

				// 대화창에 출력
				jta.append("[ client 메세지 ] : " + msg + "\n");
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			}
		} catch (IOException ie) {
			JOptionPane.showMessageDialog(this, "접속자가 퇴실하였습니다.");
			ie.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if (writeStream != null) { // 접속자가 존재하여 스트림이 생성된 경우에만
				sendMsg();// 메세지를 보낸다.
			} else {
				JOptionPane.showMessageDialog(this, "대화상대가 없습니다.");
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
			//Thread와 stcs 객체를 has a 관계로 설정
			Thread t = new Thread(stcs);
			//메세지를 읽는 코드를 Thread로 처리
			t.start();
		} catch(SocketException se) {
			System.err.println("접속자가 들어오기 전 종료" + se.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(stcs, "서버가동 실패 !! 메세지를 읽어들일 수 없습니다.");
		}

	}

}
