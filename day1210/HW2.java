package day1210;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HW2 extends Frame{
	public HW2() {
		
		super("글꼴");
		
		Label font = new Label("글꼴");
		Label fontStyle = new Label("글꼴스타일");
		Label size = new Label("크기");
		Label look = new Label("보기");
		Label look_text = new Label("AaBbYyZz");
		
		TextField font_text = new TextField();
		TextField fontStyle_text = new TextField();
		TextField size_text = new TextField();
		
		List list_font = new List();
		List list_fontStyle = new List();
		List list_size = new List();
		list_font.add("Dialog");
		list_font.add("Serif");
		list_font.add("SansSerif");
		list_font.add("Monospaced");
		list_font.add("DialogInput");
		list_fontStyle.add("일반");
		list_fontStyle.add("굵게");
		list_fontStyle.add("기울임꼴");
		list_fontStyle.add("굵게 기울임꼴");
		for (int i = 2; i < 11; i += 2) {
			list_size.add(String.valueOf(i));
		}
		for (int i = 11; i < 81; i ++) {
			list_size.add(String.valueOf(i));
		}
		
		Button confirm = new Button("확인");
		Button cancel = new Button("취소");

		setLayout(null);
		
		font.setBounds(10, 30, 30, 30);
		fontStyle.setBounds(150, 30, 80, 30);
		size.setBounds(280, 30, 30, 30);
		look.setBounds(180, 190, 30, 20);
		look_text.setBounds(140, 210, 140, 40);
		
		font_text.setBounds(10, 60, 100, 20);
		fontStyle_text.setBounds(150, 60, 100, 20);
		size_text.setBounds(280, 60, 100, 20);

		list_font.setBounds(10, 85, 100, 100);
		list_fontStyle.setBounds(150, 85, 100, 80);
		list_size.setBounds(280, 85, 100, 100);
		
		confirm.setBounds(290, 260, 30, 30);
		cancel.setBounds(330, 260, 30, 30);
		
		
		add(font);
		add(fontStyle);
		add(size);
		add(font_text);
		add(fontStyle_text);
		add(size_text);
		add(look);
		add(look_text);
		add(list_font);
		add(list_fontStyle);
		add(list_size);
		add(confirm);
		add(cancel);
		
		setBounds(200,100,400,330);
		setResizable(false);
		
		//사용자에게 보여주기
		setVisible(true);
		//종료처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		new HW2();
	}

}
