package day1219;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class HW1 extends JFrame{
	private String path, message;
	
	
	public HW1() {
		path = "";
		message = "";
	}
	
	
	
	public void inputPath() {
		System.out.println("디렉토리명 입력 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			path = br.readLine();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setComponent() {
		String name, type, size, date;
		Date d;
		File file;
		File[] fileArr;
		file = new File(path);
		fileArr = file.listFiles();
		for(int i = 0; i<fileArr.length; i++) {
			name = fileArr[i].getName();
			type = fileArr[i].isFile()?"파일":"폴더";
			size = fileArr[i].length()+"byte";
			d = new Date(fileArr[i].lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			date = sdf.format(d);
			if(type == "폴더") {
				size = "     ";
				date = "     ";					
			}
			message = message+name+"\t\t\t"+type+"\t\t"+size+"\t\t"+date+"\n";
		}
	}
	
	
	public static void main(String[] args) {
		
		
		HW1 hw1 = new HW1();
		hw1.inputPath();
		if (new File(hw1.path).isDirectory()) {
			hw1.setComponent();
			JTextArea jta = new JTextArea(10, 60);
//			jta.setEditable(false);
			jta.append("이름\t\t\t유형\t\t크기\t\t마지막으로 수정한 날짜\n");
			jta.append(hw1.message);
			JOptionPane.showMessageDialog(null, jta);
		}else {
			System.out.println("파일은 취급하지 않습니다.");
		}
		
	
	}
		
		

}
