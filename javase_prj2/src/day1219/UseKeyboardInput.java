package day1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����ڰ� �Է��� Ű������ ���� ó���ϴ� System.in
 * 
 * @author owner
 */
public class UseKeyboardInput {

	public UseKeyboardInput() {

		try {
			System.out.println("�ƹ� Ű�� ������ ����");
//			int input = System.in.read();
//				System.out.println("�Է°� : " + input);
			//////////////////1���� �޾ƿ���///////////////////
//			int input = 0;
//			while (true) {
//				input = System.in.read();
//				System.out.println(input);
//				if (input == 13) {
//					break;
//				}
//			}
			//////////////////�Է��� ���� ��� �޾ƿ���(�ѱ� �Է� x)///////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println(str);
			br.close();
			//////////////////�Է��� ���� �ٴ����� �޾ƿ���(�ѱ� �Է� o)///////////////
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new UseKeyboardInput();

	}

}
