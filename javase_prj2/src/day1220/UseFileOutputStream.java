package day1220;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * JVM���� �߻��� �����Ͱ� ����, byte[]�� ��� File�� �����ϴ� FileOutputStream�� ���
 * 
 * @author owner
 */
public class UseFileOutputStream {

	public void useFileOutputStream() throws IOException {
		int i = 64;
		// 1.File class ����
		File file = new File("c:/dev/temp/java_write.txt");
		// 2.FileOutputStream ����
		FileOutputStream fos = null;
		try {
			boolean flag = true;
			if (file.exists()) {
				boolean[] temp = { true, false, false };
				int select = JOptionPane.showConfirmDialog(null, "����ðڽ��ϱ�?");
				flag = temp[select];
			}
			if (flag) {
				fos = new FileOutputStream(file);
				fos.write(i);// ���� ��Ʈ���� ���.(���� ���� ���ڰ� ���)
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
