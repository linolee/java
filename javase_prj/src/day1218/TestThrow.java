package day1218;

import java.util.Random;

/**
 * ���ܸ� ������ �߻�
 * @author owner
 */
public class TestThrow {

	public void teaksung() throws Exception{
		String[] grade = {"�ʵ��л�","���л�","����л�","���л�"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if (randomGd.equals("�ʵ��л�")) {
			throw new Exception(randomGd+"�� �ݿ���");
			
		}else {
			System.out.println(randomGd+"�� ��踦 �ǿ�� ��ô �������� ('' )( '')");
		}
	}
	public void teaksung2() throws TobaccoException{
		String[] grade = {"�ʵ��л�","���л�","����л�","���л�"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if (randomGd.equals("�ʵ��л�")) {
			throw new TobaccoException();
			
		}else {
			System.out.println(randomGd+"�� ��踦 �ǿ�� ��ô �������� ('' )( '')");
		}
	}
	
	public static void main(String[] args) {
		TestThrow tt = new TestThrow();
		try {
			tt.teaksung();
		}catch (Exception e) {
			e.printStackTrace();
		}
		tt.teaksung2();
		
//		try {
//		}catch (TobaccoException e) {
//			e.printStackTrace();
//		}
	}

}
