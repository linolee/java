package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;
import kr.co.sist.memo.view.MemoHelp;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String taNoteData;// TextArea�� �ʱ� ������ ������ ����
	private String openPath; // ������ ���ϸ��� ����

	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;
		taNoteData = "";
		openPath = "";
	}

	public void exitMemo() {
		TextArea tempTa = jm.getTaNote();
		if (!taNoteData.equals(tempTa.getText())) {// �޸����� ������ ó�� �� ����� �ٸ� ��
			if (openPath.equals("")) {// �̸��� ������ ���̸����� ������ �ٷ� ����
				newSaveMemo();
				jm.dispose();
			} else {// �̸��� ������
				int flag = JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?");// �������� �����
				switch (flag) {
				case JOptionPane.OK_OPTION:// �� = �� �̸����� �����ϰ� ����
					saveMemo();
					jm.dispose();
					break;
				case JOptionPane.NO_OPTION:// �ƴϿ� = �ٷ� ����
					jm.dispose();
					break;

				default:// ��� = �ƹ� ���� ����
					break;
				}
			}
		} else {// �޸����� ������ ó�� �� ����� ������ �ٷ� ����
			jm.dispose();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		exitMemo();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
//		miNew, miOpen, miSave, miNewSave, miEnd, miFormat, miHelp;
		if (ae.getSource() == jm.getMiNew()) {
			newMemo();
		} // ���� �����ۿ��� �̺�Ʈ�� �߻� ���� ��
		if (ae.getSource() == jm.getMiOpen()) {
			try {
				openMemo();
			} catch (FileNotFoundException e) {
				JOptionPane.showInputDialog(null, "������ ������ ���� �� �����ϴ�.", "���� ���� ����", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showInputDialog(null, "������ ������ �о���̴� �� ������ �߻��߽��ϴ�.", "���� ���� ����", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		} // ���� �����ۿ��� �̺�Ʈ�� �߻� ���� ��
		if (ae.getSource() == jm.getMiSave()) {
			saveMemo();
		} // ���� �����ۿ��� �̺�Ʈ�� �߻� ���� ��
		if (ae.getSource() == jm.getMiNewSave()) {
			newSaveMemo();
		} // ���̸����� ���� �����ۿ��� �̺�Ʈ�� �߻� ���� ��
		if (ae.getSource() == jm.getMiEnd()) {
			exitMemo();
		} // ���� �����ۿ��� �̺�Ʈ�� �߻� ���� ��
		if (ae.getSource() == jm.getMiFormat()) {
			formatDialog();
		} // �۲� �����ۿ��� �̺�Ʈ�� �߻� ���� ��
		if (ae.getSource() == jm.getMiHelp()) {
			helpDialog();
		} // ���� �����ۿ��� �̺�Ʈ�� �߻� ���� ��

	}

	/**
	 * ���� : TextArea�� �ʱ�ȭ
	 */
	public void newMemo() {
		boolean flagNew = true;
		TextArea tempTa = jm.getTaNote();
		if (!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "�ٸ� �̸����� �����Ͻðڽ��ϱ�?");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				newSaveMemo();
				break;
			case JOptionPane.NO_OPTION:
				flagNew = true;
				break;

			default:
				flagNew = false;
			}

		}

		if (flagNew) {
			tempTa.getText();
			tempTa.setText("");

			// �� ���� �� ���Ŀ��� ������ �ʱ�ȭ
			taNoteData = tempTa.getText();
			openPath = "";

			jm.setTitle("�޸��� - ����");
		}
	}

	/**
	 * .txt���� ����
	 */
	public void openMemo() throws IOException, FileNotFoundException {

		// TextArea�� ����� �о�鿴�� ������ �ٸ��ٸ� ���忩�θ� ���� �۾��� ����
		// ������ �ҷ����� ���� ����
		TextArea tempTa = jm.getTaNote();
		boolean flagOpen = true;
		// ������ ������ ���ϸ��� ����
//		openPath = jm.getTitle();
		if (!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, openPath + "\n �����Ͻðڽ��ϱ�?");

			switch (flag) {
			case JOptionPane.OK_OPTION:
				if (!openPath.equals("")) {
					// ������ �̸��� ����
					if (flag == JOptionPane.OK_OPTION) {
						saveMemo();
					} else {
						newSaveMemo();
					}
					// �ٸ��̸����� ����
				}
				break;
			case JOptionPane.NO_OPTION:
				flagOpen = true;
				break;
			default:
				flagOpen = false;
			}

		}
		if (flagOpen) {
			FileDialog fdOpen = new FileDialog(jm, "��������", FileDialog.LOAD);
			fdOpen.setVisible(true);

			String filePath = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();

			if (filePath != null) {// ������ ������ ����
				/////////////////////// 12-20-2018 ��Ʈ������ ������ ������ �д� �ڵ� �߰� ����///////////////////

				// ������ ���Ϸ� ���ϰ�ü ����
				File file = new File(filePath + fileName);
				// 16bit stream ���
				BufferedReader br = null;
				String temp = "";

				try {
					br = new BufferedReader(new FileReader(file));
					// T.A�� �ʱ�ȭ�� ��
					tempTa.getText();
					tempTa.setText("");
					while ((temp = br.readLine()) != null) {
						tempTa.append(temp + "\r\n");
						// ���Ͽ��� �о���� ������ ����
					}

					taNoteData = tempTa.getText();//////////////////////////////////////////////////////

					openPath = file.getAbsolutePath();
				} finally {
					if (br != null) {
						br.close();
					}
				}

				/////////////////////// 12-20-2018 �ڵ� �߰�
				/////////////////////// ��//////////////////////////////////////////

				jm.setTitle("�޸��� - ���� " + filePath + fileName);// ������ ��ο� �̸��� Frame�� TitleBar�� ����
			}
		}
	}

	/**
	 * �ۼ��� �޸� ���� - ������ ���ϸ��� �״�� �����ϴ� ���ϸ� �ݿ�
	 */
	public void saveMemo() {
		// ������ ������ �̸��� ���Ͽ� �����.
		try {
			if (!openPath.equals("")) {
				createFile(openPath);
			} else {
				newSaveMemo();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createFile(String pathName) throws IOException {
		BufferedWriter bw = null;

		try {
			// ����ڰ� ���丮���� ������� ������ �� ���� ������ File Ŭ������ ����� �ʿ䰡 ����.
			bw = new BufferedWriter(new FileWriter(pathName));
			bw.write(jm.getTaNote().getText());// TA�� ������ ��Ʈ���� ���
			bw.flush();// ��Ʈ���� ������ �������Ϸ� ����

			openPath = pathName;
			taNoteData = jm.getTaNote().getText();

		} finally {
			if (bw != null) {
				bw.close();
			}
		}
	}

	/**
	 * ���ϸ��� �Է¹޾� ���̸����� ����
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm, "��������", FileDialog.SAVE);
		fdSave.setVisible(true);

		String filePath = fdSave.getDirectory();
		String fileName = fdSave.getFile();

		if (filePath != null) {// ������ ������ ����
			try {
				createFile(filePath + fileName);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "���� �� ���� �߻�", "�����߻�", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
			jm.setTitle("�޸��� - ���� " + filePath + fileName);// ������ ��ο� �̸��� Frame�� TitleBar�� ����
		}
	}

	/**
	 * �۲� �����ϴ� ���̾�α� ����
	 */
	public void formatDialog() {
		new MemoFormat(jm);

	}

	/**
	 * �޸��� ������ �����ϴ� ���̾�α� ����
	 */
	public void helpDialog() {
		new MemoHelp(jm);
	}

}
