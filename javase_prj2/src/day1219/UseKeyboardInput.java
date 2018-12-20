package day1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사용자가 입력한 키보드의 값을 처리하는 System.in
 * 
 * @author owner
 */
public class UseKeyboardInput {

	public UseKeyboardInput() {

		try {
			System.out.println("아무 키나 누르고 엔터");
//			int input = System.in.read();
//				System.out.println("입력값 : " + input);
			//////////////////1글자 받아오기///////////////////
//			int input = 0;
//			while (true) {
//				input = System.in.read();
//				System.out.println(input);
//				if (input == 13) {
//					break;
//				}
//			}
			//////////////////입력한 글자 모두 받아오기(한글 입력 x)///////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println(str);
			br.close();
			//////////////////입력한 글자 줄단위로 받아오기(한글 입력 o)///////////////
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new UseKeyboardInput();

	}

}
