package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingHasA implements ActionListener{
	//EventHandlingHasA는 Design을 가지고 있다.
	private Design design;
	public EventHandlingHasA(Design design) {
		this.design = design;
	}//EventHandlingHasA
	
	//3. abstract method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("전달받은 디자인 객체"+design);
		design.dispose();
	}//actionPerformed

}
