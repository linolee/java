package evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import view.InputLineDialog;
import view.MainControlView;
import view.ReportDialogView;

/**
 * 18.12.25 1�� �ۼ� �Ϸ� - ������ ���� �����ؾ� �Ǵ� �κ��̶� �߰��߰� ������ �ʹ� ���� �ν��Ͻ�ȭ�� Ŭ������ ������ �̵��� ��
 * �� �Ű��� �� �� �ؿ� �ּ��� �ڵ���� �߰��� �����ϴ� �κп� ���� ������ ����Ǿ� ����
 * 
 * @author ������
 */
public class MainControlEvt implements ActionListener {
	private MainControlView mcv;
	private String filePath; // ���� �н��� VO�� ����
	private int startLine; // startLine ���� �߰��� (Ŭ���������� �߰� - 6�������� �̿��ϴ� ����
	private int endLine; // endLine ���� �߰��� (Ŭ���������� �߰� - 6�������� �̿��ϴ� ����
	private String tempResult;// tempResult ���� �߰���(Ŭ���������� �߰� - Report�� �������� ���� ���� ����� �ӽ÷� �����ϴ� ����
	private boolean flag;// flag ���� �߰���(Ŭ���������� �߰� - view�� �ּ� �ѹ� ����Ǿ����� �Ǵ�
	
	private FileRead fr;// FileRead ���� �߰��� (Ŭ���� ������ �߰� - log ��ü�� ����� data)
	private FileRead SelectedFr;// FileRead ���� �߰��� (Ŭ���� ������ �߰� - log �Ϻθ� ����� data)

//	private ReportDialogView rdv;  //���ս� �߰��� �� 

	//������ �� �� �����ֵ�
//	private MainControlVO mcvo;  //���ս� �߰��� ��   ( �̰� ���� ��� �� �Ű���
//	private InputLineDialog ild;  //���̵� ����  ( �̰� ���� ��� �� �Ű��� �ߵ��ư� , Ŭ������������ �� ��)
	// public MainControlEvt(MainControlView, MainControlVO) //�Ű������� 2���� �ʿ䰡 ��������
	// (�����ڷ� �ѱ�¹��� �ٽ� �� �� )

	public MainControlEvt(MainControlView mcv) {
		this.mcv = mcv;
		startLine = -1;
		endLine = -1;
		tempResult = "";
		flag = false;

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == mcv.getJbtnView()) {
			showReport();
		}

		if (ae.getSource() == mcv.getJbtnReport()) {
			printReport();
		}
		// �α׾ƿ���ư �߰��ؾߵǴ°��� .. ?
	}

	public void showReport() {
		// ���� ���̾�α׸� ��� ��
		FileDialog fd = new FileDialog(this.mcv, "���� ����", FileDialog.LOAD);
		fd.setVisible(true);

		String path = fd.getDirectory();
		String name = fd.getFile();

		if (path != null) {
			filePath = path + name;// ���� ������ path�� �ν��Ͻ������� ����

			// fileReadHandling���� log���� ����� ������ ����
			fileReadHandling();

			// InputLineDialog�� ����.
			InputLineDialog ild = new InputLineDialog(this);

			//�����Է��� ����� ������ ���� ������ ����
			if(startLine != -1 && endLine != -1) {
				// selectedFileReadHandling���� log�� �Ϻθ� ����� ������ ����
				selectedFileReadHandling();
				
				// ���â (�α׺м� view 6����¥�� ) �����
				System.out.println("���â�� ���Դ� ~~ ");
				ReportDialogView rdv = new ReportDialogView(this);
				
				// ���â���� ���� ������� �ν��Ͻ� ������ ������ Report ���Ϸ� ����ϵ��� �ϴ� �ڵ� �Ʒ� �߰�
				// 1. �ν��Ͻ� ���� �߰� - tempResult���� �߰��� (Ŭ������������ ���� �� ��
				// 2. �ν��Ͻ� ������ ��� ����
				tempResult = "�������� �����";
				// 3. view�� ����Ǿ����� ����
				flag = true;

			}else {
				JOptionPane.showMessageDialog(mcv, "�ùٸ� ���ΰ��� �Է����� �ʾҽ��ϴ�.", "�����Է� ����", JOptionPane.ERROR_MESSAGE); 
				
			}
		} else {// ������ ���������� ����ó��
			JOptionPane.showMessageDialog(mcv, "������ �дµ� �����߽��ϴ�.", "���� �ҷ����� ����", JOptionPane.ERROR_MESSAGE); 
		}
	}

	//���� �о���̴� �޼���
	public void fileReadHandling() {
		try {
			fr = new FileRead(filePath);
			fr.logToSet();
			fr.logToList();
			fr.setMap();
			fr.logToList();
//			System.out.println(fr.getMcvo().getBrowserMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//���� �о���̴� �޼��� (������ ����
	public void selectedFileReadHandling() {
		try {
			SelectedFr = new FileRead(filePath, startLine, endLine);
			SelectedFr.logToSet();
			SelectedFr.logToList();
			SelectedFr.setMap();
//			System.out.println(SelectedFr.getMcvo().getBrowserMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//����Ʈ ��� �޼���
	public void printReport() {
		// �ּ� view�� �ѹ� ����� ���Ŀ� �޼��尡 ����Ǿ����
		if (flag) {
			// c:/dev/report ���� ���� (������ ������ �����ϴ� �۾�) - day1219 Usefile2 ����
			createDirectory();

			// "report_������¥.dat" ������ �����Ͽ� 1~6���� �۾��� write
			try {
				useFileOutputStream();
			} catch (IOException e) {
				e.printStackTrace(); // ����ó�� ���̾�α׷� ���� ��
			}
			System.out.println("������ ��µǾ��� ~~ ");

		} else {
			System.out.println("view�� �ּ� �ѹ� ����Ǿ�� �մϴ�.");
		}
	}

	// �������� �޼��� �߰� - Ŭ���� ������ ��� - day1219 Usefile2 ����
	private void createDirectory() {
		File directory = new File("c:/dev/report");
		directory.mkdirs();
	}

	// ������� �޼��� �߰� - Ŭ���� ������ ��� - day1220 UseFileOutputStream2 ����
	private void useFileOutputStream() throws IOException {
		File fileOutput = new File(fileDateNaming());// ������¥ ����� �ڵ� �߰��ؾ���

		// ������ ���ٸ� �����ϰ�, �ִٸ� �����.
		BufferedWriter bw = null;
		boolean flagFile = true; // ������ ���� ��
		boolean[] temp = { true, false, false };// ��, �ƴϿ�, ���
		int select = -1;

		if (fileOutput.exists()) {// ������ ���� �� ��
			select = JOptionPane.showConfirmDialog(null, "���� �̸��� ������ �����մϴ�. \n����ðڽ��ϱ�?");
			flagFile = temp[select];
		}

		if (flagFile) {
			try {
				///// 16��Ʈ�� ��� ////////////
				bw = new BufferedWriter(new FileWriter(fileOutput));

				bw.write(tempResult); // ��� ��Ʈ���� �Է� ���ش�. (�ν��Ͻ�����
				bw.flush();

				System.out.println("���ϱ�� �Ϸ�!!!");
			} finally {
				if (bw != null)
					bw.close();
			}
		}
	}

	// ���� �̸��� ������¥ �߰��ϴ� �޼���- Ŭ���� ������ ���
	private String fileDateNaming() {
		String s = "c:/dev/report/report_.dat";
		StringBuilder sb = new StringBuilder(s);
		String today;
		Date d;
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");

		d = new Date();
		today = sdf.format(d);

		sb.insert(s.lastIndexOf("."), today);

		return sb.toString();

	}

	public void setStartLine(int startLine) { // setter �߰��� (Ŭ���������� �߰� .
		this.startLine = startLine;
	}

	public void setEndLine(int endLine) { // setter �߰��� (Ŭ���������� �߰� .
		this.endLine = endLine;
	}

	public MainControlView getMcv() { // getter �߰��� (Ŭ���������� �߰� .
		return mcv;
	}

	public String getFilePath() {
		return filePath;
	}
	
	public FileRead getFr() {
		return fr;
	}

	public FileRead getSelectedFr() {
		return SelectedFr;
	}

}
