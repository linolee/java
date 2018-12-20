package day1218;

import java.util.Random;

/**
 * 예외를 강제로 발생
 * @author owner
 */
public class TestThrow {

	public void teaksung() throws Exception{
		String[] grade = {"초등학생","중학생","고등학생","대학생"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if (randomGd.equals("초등학생")) {
			throw new Exception(randomGd+"님 금연좀");
			
		}else {
			System.out.println(randomGd+"이 담배를 피우면 모른척 지나간다 ('' )( '')");
		}
	}
	public void teaksung2() throws TobaccoException{
		String[] grade = {"초등학생","중학생","고등학생","대학생"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if (randomGd.equals("초등학생")) {
			throw new TobaccoException();
			
		}else {
			System.out.println(randomGd+"이 담배를 피우면 모른척 지나간다 ('' )( '')");
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
