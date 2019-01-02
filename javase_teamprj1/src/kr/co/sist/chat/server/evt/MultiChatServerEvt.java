package kr.co.sist.chat.server.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import kr.co.sist.chat.server.helper.MultiChatServerHelper;
import kr.co.sist.chat.server.view.MultiChatServerView;

public class MultiChatServerEvt extends WindowAdapter implements ActionListener {

	private MultiChatServerView mcsv;
	private Thread threadServer1, threadServer2, threadServer3, threadServer4; // �����ڿ� ���� ó���� �ϱ� ���� thread
	private ServerSocket server; // PORT ����
	private List<MultiChatServerHelper> listClient; // ��� �����ڸ� ������ List

	private Thread t1 = new Thread(new Runnable() {
		public void run() {
			// ���������� ���� ������ ������ �޴´�.
			try {
				server = new ServerSocket(35000);// 0~65535
				DefaultListModel<String> dlmTemp = mcsv.getDlmChatList1();
				mcsv.getDlmChatList1().addElement("������ 35000 PORT�� ���� ���� ��......");
				
				Socket someClient = null;// ������ ������ ������ ��ü
				InetAddress ia = null;// �������� ip address�� ��� ���� ��ü
				MultiChatServerHelper mcsh = null;// ������ ������ �޾� ��Ʈ���� �����ϰ�, ��ȭ�� �аų� ��� �����ڿ��� �����ϴ� ��.
				for (int cnt = 0;; cnt++) {
					someClient = server.accept();
					ia = someClient.getInetAddress();
					dlmTemp.addElement("[" + ia + "] �����ڰ� �����Ͽ����ϴ�.");
					
					// ����, ������ ȭ��, ���Ӽ����� �Ҵ��Ͽ� Helper class ����
					mcsh = new MultiChatServerHelper(someClient, dlmTemp, cnt, mcsv, listClient, mcsv.getJspList1());
					// ������ ���� �̸��� ���� ��ü�� ������ �����ϱ� ���� List�� �߰�
					listClient.add(mcsh);
					// �������� �޼����� �о���̱� ���� Thread ����
					mcsh.start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	});
	private Thread t2 = new Thread(new Runnable() {
		public void run() {
			// ���������� ���� ������ ������ �޴´�.
			try {
				server = new ServerSocket(35001);// 0~65535
				DefaultListModel<String> dlmTemp = mcsv.getDlmChatList2();
				mcsv.getDlmChatList2().addElement("������ 35001 PORT�� ���� ���� ��......");
				
				Socket someClient = null;// ������ ������ ������ ��ü
				InetAddress ia = null;// �������� ip address�� ��� ���� ��ü
				MultiChatServerHelper mcsh = null;// ������ ������ �޾� ��Ʈ���� �����ϰ�, ��ȭ�� �аų� ��� �����ڿ��� �����ϴ� ��.
				for (int cnt = 0;; cnt++) {
					someClient = server.accept();
					ia = someClient.getInetAddress();
					dlmTemp.addElement("[" + ia + "] �����ڰ� �����Ͽ����ϴ�.");
					
					// ����, ������ ȭ��, ���Ӽ����� �Ҵ��Ͽ� Helper class ����
					mcsh = new MultiChatServerHelper(someClient, dlmTemp, cnt, mcsv, listClient, mcsv.getJspList2());
					// ������ ���� �̸��� ���� ��ü�� ������ �����ϱ� ���� List�� �߰�
					listClient.add(mcsh);
					// �������� �޼����� �о���̱� ���� Thread ����
					mcsh.start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	});
	private Thread t3 = new Thread(new Runnable() {
		public void run() {
			// ���������� ���� ������ ������ �޴´�.
			try {
				server = new ServerSocket(35002);// 0~65535
				DefaultListModel<String> dlmTemp = mcsv.getDlmChatList3();
				mcsv.getDlmChatList3().addElement("������ 35002 PORT�� ���� ���� ��......");
				
				Socket someClient = null;// ������ ������ ������ ��ü
				InetAddress ia = null;// �������� ip address�� ��� ���� ��ü
				MultiChatServerHelper mcsh = null;// ������ ������ �޾� ��Ʈ���� �����ϰ�, ��ȭ�� �аų� ��� �����ڿ��� �����ϴ� ��.
				for (int cnt = 0;; cnt++) {
					someClient = server.accept();
					ia = someClient.getInetAddress();
					dlmTemp.addElement("[" + ia + "] �����ڰ� �����Ͽ����ϴ�.");
					
					// ����, ������ ȭ��, ���Ӽ����� �Ҵ��Ͽ� Helper class ����
					mcsh = new MultiChatServerHelper(someClient, dlmTemp, cnt, mcsv, listClient, mcsv.getJspList3());
					// ������ ���� �̸��� ���� ��ü�� ������ �����ϱ� ���� List�� �߰�
					listClient.add(mcsh);
					// �������� �޼����� �о���̱� ���� Thread ����
					mcsh.start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	});
	private Thread t4 = new Thread(new Runnable() {
		public void run() {
			// ���������� ���� ������ ������ �޴´�.
			try {
				server = new ServerSocket(35003);// 0~65535
				DefaultListModel<String> dlmTemp = mcsv.getDlmChatList1();
				mcsv.getDlmChatList4().addElement("������ 35003 PORT�� ���� ���� ��......");
				
				Socket someClient = null;// ������ ������ ������ ��ü
				InetAddress ia = null;// �������� ip address�� ��� ���� ��ü
				MultiChatServerHelper mcsh = null;// ������ ������ �޾� ��Ʈ���� �����ϰ�, ��ȭ�� �аų� ��� �����ڿ��� �����ϴ� ��.
				for (int cnt = 0;; cnt++) {
					someClient = server.accept();
					ia = someClient.getInetAddress();
					dlmTemp.addElement("[" + ia + "] �����ڰ� �����Ͽ����ϴ�.");
					
					// ����, ������ ȭ��, ���Ӽ����� �Ҵ��Ͽ� Helper class ����
					mcsh = new MultiChatServerHelper(someClient, dlmTemp, cnt, mcsv, listClient, mcsv.getJspList4());
					// ������ ���� �̸��� ���� ��ü�� ������ �����ϱ� ���� List�� �߰�
					listClient.add(mcsh);
					// �������� �޼����� �о���̱� ���� Thread ����
					mcsh.start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	});
	
	public MultiChatServerEvt(MultiChatServerView mcsv) {
		this.mcsv = mcsv;
		listClient = new ArrayList<MultiChatServerHelper>();
	}// Constructor

	@Override
	public void windowClosing(WindowEvent we) {
		switch (JOptionPane.showConfirmDialog(mcsv, "ä�ü����� �����Ͻðڽ��ϱ�?\n�����Ͻø� ��� �������� ������ �������ϴ�.")) {
		case JOptionPane.OK_OPTION:
			mcsv.dispose();
			break;
		default:
			break;
		}
	}// windowClosing

	@Override
	public void windowClosed(WindowEvent we) {
		try {
			if (server != null) {
				server.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == mcsv.getJbtOpenServer()) {
			if (threadServer1 == null) {
				threadServer1 = new Thread(t1);
				threadServer1.start();// start() -> run()
			} else {
				JOptionPane.showMessageDialog(mcsv, "1�� ä�ü����� �̹� ���� ���Դϴ�.");
			}
			if (threadServer2 == null) {
				threadServer2 = new Thread(t2);
				threadServer2.start();// start() -> run()
			} else {
				JOptionPane.showMessageDialog(mcsv, "2�� ä�ü����� �̹� ���� ���Դϴ�.");
			}
			if (threadServer3 == null) {
				threadServer3 = new Thread(t3);
				threadServer3.start();// start() -> run()
			} else {
				JOptionPane.showMessageDialog(mcsv, "3�� ä�ü����� �̹� ���� ���Դϴ�.");
			}
			if (threadServer4 == null) {
				threadServer4 = new Thread(t4);
				threadServer4.start();// start() -> run()
			} else {
				JOptionPane.showMessageDialog(mcsv, "4�� ä�ü����� �̹� ���� ���Դϴ�.");
			}
		}

		if (ae.getSource() == mcsv.getJbtCloseServer()) {

			switch (JOptionPane.showConfirmDialog(mcsv, "ä�ü����� �����Ͻðڽ��ϱ�?\n�����Ͻø� ��� �������� ������ �������ϴ�.")) {
			case JOptionPane.OK_OPTION:
				mcsv.dispose();
				break;
			default:
				break;
			}
		}

	}// actionPerformed

}// MultiChatServerEvt
