package day1220;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * 8bit stream과 16bit stream을 사용하여 문자열 데이터를 File에 기록
 * 
 * @author owner
 */
public class UseFileOutputStream2 {

	public UseFileOutputStream2() throws IOException {
		String data = "오지고요 지리고요 고요고요 고요한 밤이고요";
		// 1.File객체 생성 : 파일이 존재한다면 덮어쓸 것인지 판단
		File file = new File("c:/dev/temp/java_write2.txt");

		boolean flag = false;
		if (file.exists()) {
			boolean[] temp = { false, true, true };
			flag = temp[JOptionPane.showConfirmDialog(null, "덮어쓰는 부분 린정?")];
		}

		// 2.스트림 생성
		if (!flag) {
			BufferedWriter bw = null;
			try {
				//파일을 생성하는 스트림 => 폴더가 없을 때 FileNotFoundException 발생
//				FileOutputStream fos = new FileOutputStream(file);
//				OutputStreamWriter osw = new OutputStreamWriter(fos);
//				bw = new BufferedWriter(osw);
//				
//				bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
				
				/////////16bit만 사용/////////////
				bw = new BufferedWriter(new FileWriter(file));
				
				bw.write(data);
				bw.flush();
				System.out.println("파일 기록 완료");
				
				
			} finally {
				// 스트림 객체가 생성되어 있다면 연결 끊기
				if (bw != null) {
					bw.close();
				}
			}
		}

	}

	public static void main(String[] args) {

		try {
			new UseFileOutputStream2();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// main

}// class
