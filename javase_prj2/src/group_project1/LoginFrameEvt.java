package group_project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class LoginFrameEvt extends WindowAdapter implements ActionListener {

	private LoginFrame lf;

	public LoginFrameEvt(LoginFrame lf) {
		this.lf = lf;
		
	}
//
//	private void exitQues() {
//	      int selectMenu = -1;
////	      TextArea tempTa = lf.getTaNote();
//
////	      if (!taNoteData.equals(tempTa.getText())) {
//	         selectMenu = JOptionPane.showConfirmDialog(lf, "�����ҷ�?");
////	         if(selectMenu == 0)
////	            saveMemo();
////	      }
//	   }

	@Override
	public void windowClosing(WindowEvent we) {
		int exitButton;
		exitButton = JOptionPane.showConfirmDialog(lf, "���� �����Ͻðڽ��ϱ�?", "����", 2);

		if (exitButton == JOptionPane.CLOSED_OPTION) {
			lf.dispose();
		} else {
			return;
		}
	}

	
	
	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == lf.getEnterBtn()) {

			String id = lf.idTf.getText().trim();
			String pass = new String(lf.pwTf.getPassword());
			if ((id.equals("admin") && pass.equals("1234")) || id.equals("root") && pass.equals("1111")) {
//				new MainFrame();
				lf.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "���̵� Ȥ�� ��й�ȣ�� Ȯ���� �ּ���");
				
				
			}
		}

		if (ae.getSource() == lf.getInforBtn()) {
			JOptionPane.showMessageDialog(null, "�غ���");
			// ���� ���̾�α� ���
		}

		if (ae.getSource() == lf.getExitBtn()) {

			int exitButton;
			exitButton = JOptionPane.showConfirmDialog(null, "���� �����Ͻðڽ��ϱ�?", "����", 2);

			if (exitButton == 0) {
				lf.dispose();
			} else {
				return;
			}
		}

	}

} // class
