package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;
import kr.co.sist.memo.view.MemoHelp;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	
	private JavaMemo jm;
	
	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		jm.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
//		miNew, miOpen, miSave, miNewSave, miEnd, miFormat, miHelp;
		if (ae.getSource() == jm.getMiNew()) {
			newMemo();
		}//새글 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiOpen()) {
			openMemo();
		}//열기 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiSave()) {
			saveMemo();
		}//저장 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiNewSave()) {
			newSaveMemo();
		}//새이름으로 저장 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiEnd()) {
			jm.dispose();//수정필요
		}//종료 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiFormat()) {
			formatDialog();
		}//글꼴 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiHelp()) {
			helpDialog();
		}//도움말 아이템에서 이벤트가 발생 했을 때
		
		
		
		
	}

	/**
	 * 새글 : TextArea를 초기화
	 */
	public void newMemo() {
		jm.getTaNote().getText();//버그 때문에 한번 불러옴
		jm.getTaNote().setText("");
		jm.setTitle("메모장 - 새글");
	}
	
	/**
	 * .txt파일 열기
	 */
	public void openMemo() {
		FileDialog fdOpen = new FileDialog(jm, "문서열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		String filePath = fdOpen.getDirectory();
		String fileName = fdOpen.getFile();
		
		if(filePath != null) {//선택한 파일이 존재
			jm.setTitle("메모장 - 열기 "+filePath+fileName);//파일의 경로와 이름을 Frame의 TitleBar에 설정
		}
	}
	
	/**
	 * 작성한 메모 저장 - 기존의 파일명을 그대로 저장하는 파일명에 반영
	 */
	public void saveMemo() {
		newSaveMemo();
	}
	
	/**
	 * 파일명을 입력받아 새이름으로 저장
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm, "문서저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String filePath = fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		if(filePath != null) {//선택한 파일이 존재
			jm.setTitle("메모장 - 저장 "+filePath+fileName);//파일의 경로와 이름을 Frame의 TitleBar에 설정
		}
	}
	
	/**
	 * 글꼴 설정하는 다이얼로그 실행
	 */
	public void formatDialog() {
		new MemoFormat(jm);
		
	}
	
	/**
	 * 메모장 정보를 제공하는 다이얼로그 실행
	 */
	public void helpDialog() {
		new MemoHelp(jm);
	}
	
	
	
	
	
	
	
	
	
	
}
