package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingHasA implements ActionListener{
	//EventHandlingHasA�� Design�� ������ �ִ�.
	private Design design;
	public EventHandlingHasA(Design design) {
		this.design = design;
	}//EventHandlingHasA
	
	//3. abstract method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("���޹��� ������ ��ü"+design);
		design.dispose();
	}//actionPerformed

}
