package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design class�� Has a ����� ������ Event class
 * 
 * @author owner
 */
public class FriendsListEvt extends WindowAdapter implements ActionListener, ItemListener {

	private FriendsList fl;

	public FriendsListEvt(FriendsList fl) {
		this.fl = fl;
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// ģ������Ʈ���� �������� Ŭ���Ǹ� �ش� �������� ���ܵ� ģ������Ʈ�� ������.
		// ���ܵ� ģ������Ʈ���� �������� Ŭ���Ǹ� �ش� �������� ģ������Ʈ�� ������.
		if (ie.getSource() == fl.getListFriend()) {
//			System.out.println("ģ��");
			blockFriend();
		}
		if (ie.getSource() == fl.getListBlockFriend()) {
//			System.out.println("��ģ��");
			unBlockFriend();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// >>:��� ģ���� ���� ������� �̵�
		if (ae.getSource() == fl.getBtnAllBlock()) {
			allBlock();
		}
		// <<:���ܵ� ��� ģ���� ģ��������� �̵�
		if (ae.getSource() == fl.getBtnAllUnblock()) {
			allUnblock();
		}
	}

	/**
	 * ������ ģ���� ģ������Ʈ���� ������ ģ������Ʈ�� �̵�
	 */
	private void blockFriend() {
		List tempFriend = fl.getListFriend();
		// ������ ģ���� ���ͼ�
		String name = tempFriend.getSelectedItem();
		// �������� ������.
		fl.getListBlockFriend().add(name);
		tempFriend.remove(name);
	}

	/**
	 * ������ ģ���� ������ ģ������Ʈ���� ģ������Ʈ�� �̵�
	 */
	private void unBlockFriend() {
		List tempList = fl.getListBlockFriend();
		// ������ ģ���� ���ͼ�
		int selectedIndex = tempList.getSelectedIndex();
		// �������� ������.
		fl.getListFriend().add(tempList.getItem(selectedIndex));
		tempList.remove(selectedIndex);
	}

	/**
	 * ��ư�� Ŭ���ϸ� ��� ģ�� ����
	 */
	private void allBlock() {
		List tempList = fl.getListFriend();
		String[] names = tempList.getItems();
		for (int i = 0; i < names.length; i++) {
			fl.getListBlockFriend().add(names[i]);
//			tempList.remove(names[i]);
		}
		tempList.removeAll();
	}

	/**
	 * ��ư�� Ŭ���ϸ� ��� ģ���� ���� ����
	 */
	private void allUnblock() {
		String[] arrBlockList = fl.getListBlockFriend().getItems();
		for (String name : arrBlockList) {
			fl.getListFriend().add(name);
		}
		fl.getListBlockFriend().removeAll();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		fl.dispose();
	}
}
