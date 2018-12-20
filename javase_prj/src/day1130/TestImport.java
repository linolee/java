package day1130;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * import : 다른 패키지의 클래스를 참조하여 사용할 때.
 * @author owner
 */
public class TestImport {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		Random r = new Random();
		Random r1 = new Random();
		Random r2 = new Random();
		
		Date d = new Date();
		
		//같은 이름의 클래스(interface)는 둘 중 많이 사용되는 것을 import로 처리하고 적게 사용되는 것을 full path로 처리한ㄷ
		java.awt.List list = null;
		List list1 = null;//util.list
	}//main

}//class
