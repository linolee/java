package day1130;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * import : �ٸ� ��Ű���� Ŭ������ �����Ͽ� ����� ��.
 * @author owner
 */
public class TestImport {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		Random r = new Random();
		Random r1 = new Random();
		Random r2 = new Random();
		
		Date d = new Date();
		
		//���� �̸��� Ŭ����(interface)�� �� �� ���� ���Ǵ� ���� import�� ó���ϰ� ���� ���Ǵ� ���� full path�� ó���Ѥ�
		java.awt.List list = null;
		List list1 = null;//util.list
	}//main

}//class
