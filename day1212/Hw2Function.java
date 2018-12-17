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
		// ����Ʈ�� Ŭ���ϸ� String ���� �ɰ��� text field�� �Է�
		if (ie.getSource() == fra.getList()) {
			fillList();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// BtnAdd�� ������ �̸�, ���� �ּҸ� List�� �߰��ϰ� text field �ʱ�ȭ
		if (ae.getSource() == fra.getBtnAdd()) {
			addList();
			resetTf();
		}
		// BtnDel�� ������ ����Ʈ�� �������� ���õǾ����� Ȯ�� �� text field�� ���� ��ġ�ϴ� �������� ����
		if (ae.getSource() == fra.getBtnDel()) {
			delList();
		}
		// BtnUpd�� ������ ����Ʈ�� �������� ���õǾ����� Ȯ�� �� text field�� ���� ��ġ�ϴ� ������ ���� ����
		if (ae.getSource() == fra.getBtnUpd()) {
			updList();
		}
		// BtnClo�� ������ ���α׷��� ����
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
