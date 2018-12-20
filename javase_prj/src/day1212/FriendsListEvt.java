package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design class와 Has a 관계로 설정된 Event class
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
		// 친구리스트에서 아이템이 클릭되면 해당 아이템을 차단된 친구리스트로 보낸다.
		// 차단된 친구리스트에서 아이템이 클릭되면 해당 아이템을 친구리스트로 보낸다.
		if (ie.getSource() == fl.getListFriend()) {
//			System.out.println("친구");
			blockFriend();
		}
		if (ie.getSource() == fl.getListBlockFriend()) {
//			System.out.println("안친구");
			unBlockFriend();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// >>:모든 친구를 차단 목록으로 이동
		if (ae.getSource() == fl.getBtnAllBlock()) {
			allBlock();
		}
		// <<:차단된 모든 친구를 친구목록으로 이동
		if (ae.getSource() == fl.getBtnAllUnblock()) {
			allUnblock();
		}
	}

	/**
	 * 선택한 친구를 친구리스트에서 차단한 친구리스트로 이동
	 */
	private void blockFriend() {
		List tempFriend = fl.getListFriend();
		// 선택한 친구를 얻어와서
		String name = tempFriend.getSelectedItem();
		// 차단으로 보낸다.
		fl.getListBlockFriend().add(name);
		tempFriend.remove(name);
	}

	/**
	 * 선택한 친구를 차단한 친구리스트에서 친구리스트로 이동
	 */
	private void unBlockFriend() {
		List tempList = fl.getListBlockFriend();
		// 선택한 친구를 얻어와서
		int selectedIndex = tempList.getSelectedIndex();
		// 차단으로 보낸다.
		fl.getListFriend().add(tempList.getItem(selectedIndex));
		tempList.remove(selectedIndex);
	}

	/**
	 * 버튼을 클릭하면 모든 친구 차단
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
	 * 버튼을 클릭하면 모든 친구를 차단 해제
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
