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
		super(jm,"도움말",true);
		this.jm = jm;
		
		TextArea taHelp;
		taHelp = new TextArea();
		taHelp.setText("메모장 정보 \n 이 메모장은 java로 만들어졌으며 누구나 코드 수정 및 배포를 할 수 있습니다. \n 단 이 코드를 사용하여 개선했을 때에는 소스공개를 원칙으로 한다. GNU \n 작성자 : 이봉현 \n Version : 1.0");
		taHelp.setEditable(false);
		add("Center",taHelp);
		
		
		btnClo = new Button("확인");
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
