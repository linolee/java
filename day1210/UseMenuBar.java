package day1210;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Menu : MenuBar, Menu, MenuItem으로 구성
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseMenuBar extends Frame {
	public UseMenuBar() {
		super("메뉴바 사용");
		//1.MenuBar생성
		MenuBar mb = new MenuBar();
		//2.Menu생성
		Menu m1 = new Menu("1조");
		Menu m2 = new Menu("2조");
		Menu m3 = new Menu("3조");
		Menu m3_1 = new Menu("3조 group1");
		Menu m4 = new Menu("4조");
		//3.MenuItem생성
		MenuItem mi1_1 = new MenuItem("이재찬");
		MenuItem mi1_2 = new MenuItem("이봉현");
		MenuItem mi1_3 = new MenuItem("박은영");
		MenuItem mi1_4 = new MenuItem("백인재");
		MenuItem mi1_5 = new MenuItem("김민정");
		
		MenuItem mi2_1 = new MenuItem("박영민");
		MenuItem mi2_2 = new MenuItem("김정윤");
		MenuItem mi2_3 = new MenuItem("김희철");
		MenuItem mi2_4 = new MenuItem("이지수");
		MenuItem mi2_5 = new MenuItem("박소영");
		
		MenuItem mi3_1 = new MenuItem("김정운");
		MenuItem mi3_2 = new MenuItem("노진경");
		MenuItem mi3_3 = new MenuItem("이재현");
		MenuItem mi3_4 = new MenuItem("정택성");
		MenuItem mi3_5 = new MenuItem("최지우");
		
		MenuItem mi4_1 = new MenuItem("공선의");
		MenuItem mi4_2 = new MenuItem("오영근");
		MenuItem mi4_3 = new MenuItem("김건하");
		MenuItem mi4_4 = new MenuItem("박정미");
		MenuItem mi4_5 = new MenuItem("최혜원");
		
		//4.MenuItem을 Menu에 배치
		m1.add(mi1_1);
		m1.add(mi1_2);
		m1.addSeparator();//구분선
		m1.add(mi1_3);
		m1.add(mi1_4);
		m1.add(mi1_5);
		
		m2.add(mi2_1);
		m2.add(mi2_2);
		m2.add(mi2_3);
		m2.add(mi2_4);
		m2.add(mi2_5);
		
		m3.add(mi3_1);
		m3.add(mi3_2);
		m3.add(mi3_3);
		m3_1.add(mi3_4);
		m3_1.add(mi3_5);
		m3.add(m3_1);
		
		m4.add(mi4_1);
		m4.add(mi4_2);
		m4.add(mi4_3);
		m4.add("-");//메뉴를 구분할 때
		m4.add(mi4_4);
		m4.add(mi4_5);
		
		//5.Menu를 MenuBar에 배치
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		//6.MenuBar를 Frame에 배치
		
		setMenuBar(mb);
		setBounds(200,100,800,600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
	}

	public static void main(String[] args) {
		new UseMenuBar();
	}// main

}// class
