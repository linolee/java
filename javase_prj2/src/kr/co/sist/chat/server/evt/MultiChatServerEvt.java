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
import javax.swing.JOptionPane;

import kr.co.sist.chat.server.helper.MultiChatServerHelper;
import kr.co.sist.chat.server.view.MultiChatServerView;

public class MultiChatServerEvt extends WindowAdapter implements ActionListener, Runnable {

	private MultiChatServerView mcsv;
	private Thread threadServer; // �����ڿ� ���� ó���� �ϱ� ���� thread
	private ServerSocket server; // PORT ����
	private List<MultiChatServerHelper> listClient; // ��� �����ڸ� ������ List

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
	public void run() {
		// ���������� ���� ������ ������ �޴´�.
		try {
			server = new ServerSocket(36000);// 0~65535
			DefaultListModel<String> dlmTemp = mcsv.getDlmChatList();
			mcsv.getDlmChatList().addElement("������ 35000 PORT�� ���� ���� ��......");

			Socket someClient = null;// ������ ������ ������ ��ü
			InetAddress ia = null;// �������� ip address�� ��� ���� ��ü
			MultiChatServerHelper mcsh = null;// ������ ������ �޾� ��Ʈ���� �����ϰ�, ��ȭ�� �аų� ��� �����ڿ��� �����ϴ� ��.
			for (int cnt = 0;; cnt++) {
				someClient = server.accept();
				ia = someClient.getInetAddress();
				dlmTemp.addElement("[" + ia + "] �����ڰ� �����Ͽ����ϴ�.");

				// ����, ������ ȭ��, ���Ӽ����� �Ҵ��Ͽ� Helper class ����
				mcsh = new MultiChatServerHelper(someClient, dlmTemp, cnt, mcsv, listClient, mcsv.getJspList());
				// ������ ���� �̸��� ���� ��ü�� ������ �����ϱ� ���� List�� �߰�
				listClient.add(mcsh);
				// �������� �޼����� �о���̱� ���� Thread ����
				mcsh.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// run

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
			if (threadServer == null) {
				threadServer = new Thread(this);
				threadServer.start();// start() -> run()
			} else {
				JOptionPane.showMessageDialog(mcsv, "ä�ü����� �̹� ���� ���Դϴ�.");
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
