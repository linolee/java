package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Container Component : 일반 Component와 Container Component를 저장할 수 있는 Component 사용 
 * @author owner
 */
//1.window component 상속
@SuppressWarnings("serial")
public class UsePanel extends Frame{
	public UsePanel() {
		super("Container Component 사용");
		//2.component 생성
		Color back = new Color(0x91645E);
		Color fore = new Color(0x373E5A);
		Label lblName = new Label("이름");
		lblName.setBackground(Color.DARK_GRAY);
		lblName.setForeground(Color.ORANGE);
		TextField tfName = new TextField(20);
		tfName.setBackground(new Color(0x02778B));
		tfName.setForeground(new Color(0xB6FFFF));
		Button btnAdd = new Button("추가");
		btnAdd.setBackground(back);
		btnAdd.setForeground(fore);
		
		Button btnClose = new Button("종료");
		TextArea taDisplay = new TextArea();
		taDisplay.setBackground(new Color(0xD3D3FF));
		taDisplay.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 20));
		
		//일반 컴포넌트를 배치할 수 있는 컨테이너 컴포넌트를 생성
		Panel panelNorth = new Panel();//FlowLayout
		//생성된 컨테이너 컴포넌트에 일반 컴포넌트를 배치
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.add(btnClose);
		
		//3.배치관리자 설정
		setLayout(new BorderLayout());
		//4.배치 BorderLayout 특징 : 하나의 지역에는 하나의 컴포넌트만 저장가능
		add("North",panelNorth);
//		add("North",lblName);
//		add("North",tfName);
//		add("North",btnAdd);
//		add("North",btnClose);
		add("Center",taDisplay);

		
		//5.윈도우의 크기를 설정
		setBounds(200, 150, 400, 250);
		//6.사용자에게 보여주기
		setVisible(true);
		//종료(anonymous class)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
	}//UsePanel

	public static void main(String[] args) {
		new UsePanel();
	}// main

}// class
