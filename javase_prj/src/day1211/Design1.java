package day1211;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//1.Frame 상속, 이벤트를 처리할 수 있는 ItemListener 구현 
@SuppressWarnings("serial")
public class Design1 extends Frame implements ItemListener{
	List list = new List();
	Label label = new Label();
	
	public Design1() {
		list.add("이재찬/27");
		list.add("정택성/26");
		list.add("공선의/27");
		list.add("이봉현/28");
		list.add("오진경/31");
		label.setText("이름 :         나이 : ");		
		
		
		setLayout(new BorderLayout());
		add("Center", list);
		add("South", label);
		setBounds(100,100,300,300);
		setVisible(true);
		
		list.addItemListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
	}
	
	
	public static void main(String[] args) {
		new Design1();
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		//리스트의 아이템이 선택되면 선택한 아이템을 가져와서 라벨에 변경
		String[] temparr = list.getSelectedItem().split("/");
		String name = temparr[0];
		String age = temparr[1];
		StringBuilder viewData = new StringBuilder();
//		label.setText("이름 : "+name+"  나이 : "+age);
		viewData.append("이름 : ").append(name).append("   나이 : ").append(age);
		label.setText(viewData.toString());
		
	}

}
