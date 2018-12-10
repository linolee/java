package day1210;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 일반 컴포넌트와 LayoutManager의 사용
 * @author owner
 */
//1.Window Component상속(사용자에게 보여지는 일)
@SuppressWarnings("serial")
public class UseBorderLayout extends Frame{

	public UseBorderLayout() {
		super("BorderLayout 연습");
		
		//2.사용할 일반 컴포넌트를 생성
		TextField tfNorth = new TextField("North");
		Label lblEast = new Label("East");
		TextArea taCenter = new TextArea("Center");
		Label lblWest = new Label("West");
		Choice choSouth = new Choice();
		choSouth.add("South");
		
		//3.배치관리자 설정 : Window Component인 Frame, Dialog는 BorderLayout이 기본설정
		setLayout(new BorderLayout());
		//4.컴포넌트의 배치관리자를 사용하여 배치 : add("배치위치", 컴포넌트); add(상수, 컴포넌트);
		add("North", tfNorth);
		add("Center",taCenter);
		//Constant(Field)를 사용하여 배치
		add(BorderLayout.WEST,lblWest);
		add(BorderLayout.EAST,lblEast);
		add(BorderLayout.SOUTH,choSouth);
		
		//5.윈도우의 크기를 설정
		int width = 400;
		int height = 400;
		setSize(width, height);
		//6.사용자에게 보여주기
		setVisible(true);
		//종료(anonymous class)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
		
		
	}//UseBorderLayout
	
	public static void main(String[] args) {
		new UseBorderLayout();
	}//main
}//class
