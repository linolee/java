package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HW1 extends Frame {
	public HW1() {
		super("학생관리");
		Label lbl = new Label("학생관리");
		Panel mainpnl = new Panel(new GridLayout(1,2));
		Panel pnlMap = new Panel(new GridLayout(4,2));
		Panel pnlSouth = new Panel();
		Button add = new Button("추가");
		Button update = new Button("변경");
		Button delete = new Button("삭제");
		Button exit = new Button("종료");
		Label name = new Label("이름");
		Label age = new Label("나이");
		Label tel = new Label("전화번호");
		Label gender = new Label("성별");
		TextArea ta = new TextArea();
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		Panel pnlGender = new Panel();
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox rb1 = new Checkbox("남자", true, cg);
		Checkbox rb2 = new Checkbox("여자", false, cg);
		
		//3.배치관리자 설정 : Window Component인 Frame, Dialog는 BorderLayout이 기본설정
		setLayout(new BorderLayout());
		//4.컴포넌트의 배치관리자를 사용하여 배치 : add("배치위치", 컴포넌트); add(상수, 컴포넌트);
		add("North", lbl);
		add("Center",mainpnl);
		add("South",pnlSouth);
		//Constant(Field)를 사용하여 배치
		mainpnl.add(pnlMap);
		mainpnl.add(ta);
		pnlMap.add(name);
		pnlMap.add(tf1);
		pnlMap.add(age);
		pnlMap.add(tf2);
		pnlMap.add(tel);
		pnlMap.add(tf3);
		pnlMap.add(gender);
		pnlMap.add(pnlGender);
		pnlGender.add(rb1);
		pnlGender.add(rb2);
		
		
		
		pnlSouth.add(add);
		pnlSouth.add(update);
		pnlSouth.add(delete);
		pnlSouth.add(exit);
		
		//5.윈도우의 크기를 설정
		setSize(400, 200);
		//6.사용자에게 보여주기
		setVisible(true);
		//종료(anonymous class)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
		
		
	}

	public static void main(String[] args) {
		new HW1();
	}

}
