package day1212;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 같은 종류의 이벤트가 여러개 발생하면 그 이벤트를 비교하여 처리하는 방법<br>
 * 이벤트를 발생시킨 주소를 비교 - 모든 이벤트에서 사용가능 : getSource()<br>
 * 이벤트를 발생시킨 객체의 Label을 비교 - ActionEvent에서만 사용가능 : getActionCommand()<br>
 * 
 * @author owner
 */
@SuppressWarnings("serial")
//1.Window Component 상속, Event처리 Listener를 구현
public class EventCompare extends Frame implements ActionListener{
	//2.이벤트와 관련있는 Component를 선언
	private Button btnOpen;
	private Button btnSave;
	private Label lblOutput;
		
	
	
	
	public EventCompare() {
		super("파일 다이얼로그 사용");
		//3.생성
		btnOpen = new Button("열기모드");
		btnSave = new Button("저장모드");
		lblOutput = new Label("ㅇㅅㅇ");
		//4.배치
		Panel pnl = new Panel();//Container Component
		pnl.add(btnOpen);
		pnl.add(btnSave);
		
		add("Center",pnl);
		add("South",lblOutput);
		//5.이벤트 등록
		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);
		
		//6.윈도우크기설정
		setBounds(100, 100, 500, 100);
		//7.가시화
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
	}//EventCompare

	@Override
	public void actionPerformed(ActionEvent ae) {
//		System.out.println(ae);
//		이벤트 발생java.awt.event.ActionEvent[ACTION_PERFORMED,cmd=열기모드,when=1544580933977,modifiers=] on button0
//		이벤트 발생java.awt.event.ActionEvent[ACTION_PERFORMED,cmd=저장모드,when=1544580936817,modifiers=] on button1
		
//		System.out.println("이벤트 발생 객체의 Label : "+ae.getActionCommand());
//		이벤트 발생 객체의 Label : 열기모드
//		이벤트 발생 객체의 Label : 저장모드

		////////////////////////////////주소비교/////////////////////////////////
//		if(ae.getSource() == btnOpen) {
//			System.out.println("열기");
//		}
//		if(ae.getSource() == btnSave) {
//			System.out.println("저장");
//		}
		
		
		////////////////////////////////라벨비교/////////////////////////////////
		String label = ae.getActionCommand();
		if(label.equals("열기모드")) {
			//window component
			FileDialog fdOpen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String name = fdOpen.getFile();
			if (path == null) {
				path = "선택된 경로가 없습니다.";}
			if (name == null) {
				name = "^오^";}
			
			lblOutput.setText("열기파일 : "+path+name);
			setTitle("파일 다이얼로그 사용 - 열기 : "+name);
			
		}
		if(label.equals("저장모드")) {
			FileDialog fdSave = new FileDialog(this, "파일 저장", FileDialog.SAVE);
			fdSave.setVisible(true);
			
			String path = fdSave.getDirectory();
			String name = fdSave.getFile();
			
			if (path == null) {
				path = "선택된 경로가 없습니다.";}
			if (name == null) {
				name = "^오^";}
			
			lblOutput.setText("저장파일 : "+path+name);
			setTitle("파일 다이얼로그 사용 - 저장 : "+name);
			
		}
		
		
				
		
	}

	
	public static void main(String[] args) {
		new EventCompare();
	}
}
