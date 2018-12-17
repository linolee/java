package day1211;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * xxxAdapter class가 사용되어야하는 이유
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent2 extends Frame {

	public UseWindowEvent2() {
		super("윈도우 이벤트 연습");
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
		UseWindowEvent2.WindowImpl wi = this.new WindowImpl();
		addWindowListener(wi);
	}

	public static void main(String[] args) {
		new UseWindowEvent2();
	}// main

	// WindowListener interface를 구현한 class는 사용하지 않는 method일지라도 모두 Override해야한다.

	public class WindowImpl extends WindowAdapter {


		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			dispose();
		}

	}// innerclass 종료
}// class
