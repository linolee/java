package day1212;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hw2Function extends WindowAdapter implements ActionListener, ItemListener {

	private Hw2Frame fra;

	public Hw2Function(Hw2Frame fra) {
		this.fra = fra;
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// 리스트를 클릭하면 String 값을 쪼개서 text field에 입력
		if (ie.getSource() == fra.getList()) {
			fillList();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// BtnAdd를 누르면 이름, 나이 주소를 List에 추가하고 text field 초기화
		if (ae.getSource() == fra.getBtnAdd()) {
			addList();
			resetTf();
		}
		// BtnDel를 누르면 리스트의 아이템이 선택되었는지 확인 후 text field의 값과 일치하는 아이템을 삭제
		if (ae.getSource() == fra.getBtnDel()) {
			delList();
		}
		// BtnUpd를 누르면 리스트의 아이템이 선택되었는지 확인 후 text field의 값과 일치하는 아이템 값을 수정
		if (ae.getSource() == fra.getBtnUpd()) {
			updList();
		}
		// BtnClo를 누르면 프로그램을 종료
		if (ae.getSource() == fra.getBtnClo()) {
			close();
		}

	}

	public void addList() {
		String tempName = fra.getTfName().getText();
		String tempAge = fra.getTfAge().getText();
		String tempAdr = fra.getTfAdr().getText();
		StringBuilder templist = new StringBuilder();
		templist.append(tempName).append("/").append(tempAge).append("/").append(tempAdr);

		if (!tempName.equals("") && !tempAge.equals("") && !tempAdr.equals("")) {

			fra.getList().add(templist.toString());

		}

	}

	public void fillList() {
		String templist = fra.getList().getSelectedItem();
		System.out.println(templist);
		String[] temparr = templist.split("/");
		fra.getTfName().setText(temparr[0]);
		fra.getTfAge().setText(temparr[1]);
		fra.getTfAdr().setText(temparr[2]);
	}

	public void resetTf() {
		fra.getTfName().setText(null);
		fra.getTfAge().setText(null);
		fra.getTfAdr().setText(null);
	}

	public void delList() {
		int tempidx = fra.getList().getSelectedIndex();
		if (tempidx != -1) {
			String tempName = fra.getTfName().getText();
			String tempAge = fra.getTfAge().getText();
			String tempAdr = fra.getTfAdr().getText();
			StringBuilder templist = new StringBuilder();
			templist.append(tempName).append("/").append(tempAge).append("/").append(tempAdr);

			if(fra.getList().getSelectedItem().equals(templist.toString())) {
				fra.getList().remove(templist.toString());
			}
		}
	}

	public void updList() {
		int tempidx = fra.getList().getSelectedIndex();
		if (tempidx != -1) {
			String tempName = fra.getTfName().getText();
			String tempAge = fra.getTfAge().getText();
			String tempAdr = fra.getTfAdr().getText();
			StringBuilder templist = new StringBuilder();
			templist.append(tempName).append("/").append(tempAge).append("/").append(tempAdr);
//			fra.getList().remove(tempidx);
//			fra.getList().add(templist.toString(), tempidx);
			fra.getList().replaceItem(templist.toString(), tempidx);
			resetTf();
		}
	}

	public void close() {
		fra.dispose();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		fra.dispose();
	}

}
