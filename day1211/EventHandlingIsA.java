package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ActionEvent를 사용한 이벤트 처리방법<br>
 * 디자인과 이벤트 처리를 하나의 클래스 안에서 처리한다.(값에 대한 사용이 편하다)
 * @author owner
 */
//1. 상속으로 Frame을 처리하고 이벤트 처리 객체를 구현
@SuppressWarnings("serial")
public class EventHandlingIsA extends Frame implements ActionListener {
	
	//2.이벤트 처리에 관련있는 컴포넌트를 선언
	private Button btn;
	
	public EventHandlingIsA() {
		super("Is a 관계로 이벤트 처리하는 방법");
		//3.컴포넌트 생성
		btn = new Button("클릭");
		//4.생성된 컴포넌트가 이벤트를 발생시킬 수 있도록 이벤트에 등
		btn.addActionListener(this);//Argument로 입력된 객체의 Override된 method가 호출된다.
		Panel panel = new Panel();
		panel.add(btn);
		//5.생성된 컴포넌트를 배치
		add("Center",panel);
		//6.윈도우컴포넌트에 크기설정
		setBounds(100, 100, 300, 300);
		//7.사용자에게 보여주기
		setVisible(true);
		
		
	}//EventHandlingIsA

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("버튼이 클릭되었습니다.");
		dispose();
	}
	
	public static void main(String[] args) {
		new EventHandlingIsA();
	}// main


}// class
