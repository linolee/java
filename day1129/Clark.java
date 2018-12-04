package day1129;

import day1129.Person;
/**
 * 사람의 공통특징은 Person에서 가져다가 사용하고 자신만의 특징을 정의한 클래스
 * @author owner
 */
public final class Clark extends Person{
	public int power;
	public Clark() {
		super(3,1,1);
		power = 9;
	}
	
	public String power(String stone) {
		String result = "";
		
		if(stone.equals("클립토나이트")) {
			power = 0;
			result = "힘 방전";
		}else if(stone.equals("다이아몬드")) {
			power = 10;
			result = "간사합니다!";
		}else {
			power = 12;
			result = "따꼼";
		}//end if
		return result;
	}
	
	@Override
	public String eat() {
		return getName()+"이 집에서 빵을 먹는다.";
	}
	public String eat(String menu, int price) {
		return getName()+"이 레스토랑에서 "+price+"달러 짜리 "+menu+"를 먹는다.";
	}
	
}//class
