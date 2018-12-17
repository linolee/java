package kr.co.sist.memo.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.TextArea;

import kr.co.sist.memo.evt.MemoHelpEvt;


@SuppressWarnings("serial")
public class MemoHelp extends Dialog {
	
	JavaMemo jm;
	private Button btnClo;
	
	public MemoHelp(JavaMemo jm) {
		super(jm,"����",true);
		this.jm = jm;
		
		TextArea taHelp;
		taHelp = new TextArea();
		taHelp.setText("�޸��� ���� \n �� �޸����� java�� ����������� ������ �ڵ� ���� �� ������ �� �� �ֽ��ϴ�. \n �� �� �ڵ带 ����Ͽ� �������� ������ �ҽ������� ��Ģ���� �Ѵ�. GNU \n �ۼ��� : �̺��� \n Version : 1.0");
		taHelp.setEditable(false);
		add("Center",taHelp);
		
		
		btnClo = new Button("Ȯ��");
		MemoHelpEvt mhe = new MemoHelpEvt(this);
		btnClo.addActionListener(mhe);
		add("South",btnClo);
		
		setBounds(jm.getX()+100, jm.getY()+100, 600, 300);
		addWindowListener(mhe);
		setVisible(true);
		
	}

	public JavaMemo getJm() {
		return jm;
	}


	public Button getBtnClo() {
		return btnClo;
	}
	
	
}
