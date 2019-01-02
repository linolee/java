package kr.co.sist.chat.server.view;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import kr.co.sist.chat.server.evt.MultiChatServerEvt;

@SuppressWarnings("serial")
public class MultiChatServerView extends JFrame {
	private JList<String> jlChatList;
	private JScrollPane jspList;
	private JButton jbtOpenServer, jbtCloseServer;
	private DefaultListModel<String> dlmChatList;

	public MultiChatServerView() {
		super(":::::::::ä�ù� ������:::::::::");
		dlmChatList = new DefaultListModel<String>();
		jlChatList = new JList<String>(dlmChatList);
		jspList = new JScrollPane(jlChatList);

		jbtOpenServer = new JButton("��������");
		jbtCloseServer = new JButton("��������");

		JPanel btnPanel = new JPanel();
		btnPanel.add(jbtOpenServer);
		btnPanel.add(jbtCloseServer);

		jspList.setBorder(new TitledBorder("������ ����"));

		add("Center", jspList);
		add("South", btnPanel);

		setBounds(100, 100, 400, 650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// �̺�Ʈ ���

		MultiChatServerEvt mcse = new MultiChatServerEvt(this);
		jbtOpenServer.addActionListener(mcse);
		jbtCloseServer.addActionListener(mcse);
		addWindowListener(mcse);

	}// MultiChatServerView

////////////////////getter////////////////////////////
	public JList<String> getJlChatList() {
		return jlChatList;
	}

	public JScrollPane getJspList() {
		return jspList;
	}

	public JButton getJbtOpenServer() {
		return jbtOpenServer;
	}

	public JButton getJbtCloseServer() {
		return jbtCloseServer;
	}

	public DefaultListModel<String> getDlmChatList() {
		return dlmChatList;
	}
////////////////////getter////////////////////////////	

}// class
