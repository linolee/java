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
 * Thread를 사용하여 무한루프로 메세지를 읽어들이는 코드를
 * 화면디자인과 메세지를 보내는 코드와 동시에 실행시킨다.
 * @author owner
 */
@SuppressWarnings("serial")
public class SimpleThreadChatClient extends JFrame implements ActionListener, Runnable {
	
	private JTextArea jta;
	private JTextField jtf;
	
	private Socket client;//서버와 연결하기 위해
	private DataInputStream readStream;//서버의 데이터를 읽기위한 스트림
	private DataOutputStream writeStream;//서버로 데이터를 보내기 위한 스트림
	private JScrollPane jsp;
	
	public SimpleThreadChatClient() {
		super(":::::채팅클라이언트:::::");
		jta = new JTextArea();
		jta.setBorder(new TitledBorder("대화내용"));
		jta.setEditable(false);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);
		
		jsp = new JScrollPane(jta);
		
		jtf = new JTextField();
		jtf.setBorder(new TitledBorder("대화입력"));
		
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
			if (writeStream != null) { //접속자가 존재하여 스트림이 생성된 경우에만
				sendMsg();//메세지를 보낸다.
			}else {
				JOptionPane.showMessageDialog(this, "대화상대가 없습니다.");
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
	 * 2. 소켓을 생성하여 서버에 연결하고 대화를 읽거나 보내기 위해
	 * 4. 스트림의 연결을 얻는다.
	 * @throws IOException
	 */
	public void connectToServer() throws IOException{
		//2.
		client = new Socket("211.63.89.157", 35000);
//		client = new Socket("127.0.0.1", 35000);
		// 4. 스트림 연결
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());
		
	}
	
	public void run(){
		String revMsg = "";

		while (true) {
			// 메세지를 읽어들여
			try {
				revMsg = readStream.readUTF();
				jta.append("[ server 메세지 ] : " + revMsg + "\n");
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 대화창에 출력
		}
	}
	
	/**
	 * 작성된 메세지를 서버로 보내는 일
	 */
	public void sendMsg() throws IOException{
		// T.F의 값을 가져와서
		String sendMsg = jtf.getText().trim();
		// 스트림에 기록하고
		writeStream.writeUTF(sendMsg);
		// 스트림의 내용을 목적지로 분출
		writeStream.flush();
		// 내가 쓴 내용을 내 화면에 출력하고
		jta.append("[ client 메세지 ] : " + sendMsg + "\n");
		// 입력이 편하도록 jtf를 초기화
		jtf.setText("");
	}
	

	public static void main(String[] args) {
//		new SimpleThreadChatClient();
		SimpleThreadChatClient stcc = new SimpleThreadChatClient();
		try {
			stcc.connectToServer();
			//메세지를 동시에 읽어햐 하기 때문에 Thread로 처리
			Thread t= new Thread(stcc);
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
