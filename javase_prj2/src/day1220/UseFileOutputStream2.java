package day1220;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * 8bit stream�� 16bit stream�� ����Ͽ� ���ڿ� �����͸� File�� ���
 * 
 * @author owner
 */
public class UseFileOutputStream2 {

	public UseFileOutputStream2() throws IOException {
		String data = "������� ������� ����� ����� ���̰��";
		// 1.File��ü ���� : ������ �����Ѵٸ� ��� ������ �Ǵ�
		File file = new File("c:/dev/temp/java_write2.txt");

		boolean flag = false;
		if (file.exists()) {
			boolean[] temp = { false, true, true };
			flag = temp[JOptionPane.showConfirmDialog(null, "����� �κ� ����?")];
		}

		// 2.��Ʈ�� ����
		if (!flag) {
			BufferedWriter bw = null;
			try {
				//������ �����ϴ� ��Ʈ�� => ������ ���� �� FileNotFoundException �߻�
//				FileOutputStream fos = new FileOutputStream(file);
//				OutputStreamWriter osw = new OutputStreamWriter(fos);
//				bw = new BufferedWriter(osw);
//				
//				bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
				
				/////////16bit�� ���/////////////
				bw = new BufferedWriter(new FileWriter(file));
				
				bw.write(data);
				bw.flush();
				System.out.println("���� ��� �Ϸ�");
				
				
			} finally {
				// ��Ʈ�� ��ü�� �����Ǿ� �ִٸ� ���� ����
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
