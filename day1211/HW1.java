package day1211;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HW1 extends Frame implements ItemListener{
	TextField view = new TextField("¿À´ÃÀº È­¿äÀÏ");
	Choice color = new Choice();
	int color_num;
	Color color_code;
	
	public HW1() {
		
		Panel panel = new Panel(new GridLayout(1,2));
		setLayout(new BorderLayout());
		add("Center",panel);
		panel.add(view);
		panel.add(color);
		
		color.add("°ËÀº»ö");
		color.add("ÆÄ¶õ»ö");
		color.add("»¡°£»ö");
		color.add("³ì»ö");
		color.add("½ÉÈ«»ö");
		
		setBounds(100, 100, 300, 100);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
		color.addItemListener(this);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new HW1();
	}//main

	public Color getColorCode(int color_num) {
		switch (color_num) {
//		color.add("°ËÀº»ö");
//		color.add("ÆÄ¶õ»ö");
//		color.add("»¡°£»ö");
//		color.add("³ì»ö");
//		color.add("½ÉÈ«»ö");
		case 0:
			color_code = Color.BLACK;
			break;
		case 1:
			color_code = Color.BLUE;
			break;
		case 2:
			color_code = Color.RED;
			break;
		case 3:
			color_code = Color.GREEN;
			break;
		case 4:
			color_code = Color.MAGENTA;
			break;
		}
		return color_code;
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		color_num = color.getSelectedIndex();
		color_code = getColorCode(color_num);
		view.setForeground(color_code);
	}

}//class
