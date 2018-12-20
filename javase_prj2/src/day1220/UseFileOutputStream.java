package day1220;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * JVM에서 발생한 데이터가 정수, byte[]인 경우 File로 저장하는 FileOutputStream의 사용
 * 
 * @author owner
 */
public class UseFileOutputStream {

	public void useFileOutputStream() throws IOException {
		int i = 64;
		// 1.File class 생성
		File file = new File("c:/dev/temp/java_write.txt");
		// 2.FileOutputStream 생성
		FileOutputStream fos = null;
		try {
			boolean flag = true;
			if (file.exists()) {
				boolean[] temp = { true, false, false };
				int select = JOptionPane.showConfirmDialog(null, "덮어쓰시겠습니까?");
				flag = temp[select];
			}
			if (flag) {
				fos = new FileOutputStream(file);
				fos.write(i);// 값을 스트림에 기록.(수에 대한 문자가 출력)
				fos.flush();
			}
		} finally {
			if (fos != null) {
				fos.close();
			}
		}

	}

	public static void main(String[] args) {
		UseFileOutputStream ufos = new UseFileOutputStream();
		try {
			ufos.useFileOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
