package kr.co.sist.chat.server.helper;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 * �������� �����ϸ� ������ ���Ͽ� ��Ʈ���� ���ͼ� �����ϴ� Ŭ����.<br>
 * �����ڰ� �����ϸ� ������ ���Ͽ� �� ��Ʈ������ �޼����� ���ѷ����� �о���̰� ��� �����ڿ��� �޼����� ���
 * 
 * @author owner
 */
public class MultiChatServerHelper extends Thread {

	private Socket someClient;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	private DefaultListModel<String> dlm;
	private int cnt;
	private List<MultiChatServerHelper> connectList;
	private JFrame jf;
	private JScrollPane jsp;
	private String nick;

	/**
	 * ������ ������ �޾Ƽ� ��Ʈ���� ��� �޼����� �аų� ���� �� �ִ� ���·� �����.
	 * 
	 * @param socket ������ ����
	 * @param dlm    ������ ����â�� ����ϱ� ���� Model ��ü
	 * @param cnt    ���� ����
	 */
	public MultiChatServerHelper(Socket socket, DefaultListModel<String> dlm, int cnt, JFrame jf,
			List<MultiChatServerHelper> list, JScrollPane jsp) {
		someClient = socket;
		this.dlm = dlm;
		this.cnt = cnt;
		this.jf = jf;
		connectList = list;
		this.jsp = jsp;

		// ��Ʈ�� ���
		try {
			readStream = new DataInputStream(someClient.getInputStream());
			writeStream = new DataOutputStream(someClient.getOutputStream());
			
			//�����ڰ� �������� nick�� �޴´�.
			nick = readStream.readUTF();

			//����â�� ���Ӹ޼��� ���
			dlm.addElement("["+someClient.getInetAddress()+"/"+nick+"���� �����ϼ̽��ϴ�.");
			
			// ������ ������ �����ڿ��� �޼����� ���
			broadcast("[" + cnt + "] ��° �����ڰ� ["+nick+"]���� ä�ù濡 �����Ͽ����ϴ�.");
			jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			
		} catch (IOException ie) {
			JOptionPane.showMessageDialog(jf, "������ ���� �� ���� �߻�....");
			ie.printStackTrace();
		}

	}// Constructor

//	public void setConnectList(List<MultiChatServerHelper> list) {
//		connectList = list;
//	}// setConnectList

	@Override
	public void run() {
		if (readStream != null) {
			try {
				String revMsg = "";
				while (true) {// �������� �������� ��� �޼����� �о ��� �����ڿ��� �Ѹ���.
					revMsg = readStream.readUTF();
					broadcast(revMsg);
				}
			} catch (IOException ie) {
				// �����ڰ� ����ϸ� �ش� �����ڸ� ����Ʈ���� ����
				connectList.remove(this);
				// �޼����� �о������ ���ϴ� ���¶�� �����ڰ� ������ ������ ����.

				dlm.addElement(cnt+"��°/"+nick+ "������ ���.");
				broadcast("[" + nick + "]���� ����Ͽ����ϴ�.");
				
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
				
				ie.printStackTrace();
			}
		}
	}

	/**
	 * ��� �����ڿ��� �޼����� �ѷ��ִ� ��. synchronized : MultiThread���� ����ȣ�� ����(����ȭ ó��)
	 * 
	 * @param msg
	 */
	public synchronized void broadcast(String msg) {
		MultiChatServerHelper mcsh = null;
		try {
			for (int i = 0; i < connectList.size(); i++) {
				mcsh = connectList.get(i);// list���� Helper ��ü�� ���
				mcsh.writeStream.writeUTF(msg);
				mcsh.writeStream.flush();// �������� ����
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(jf, "[" + cnt + "]��° �����ڿ��� �޼����� ���� �� �����ϴ�.");
			e.printStackTrace();
		} // ��� ��Ʈ���� ���

	}// broadcast

}
