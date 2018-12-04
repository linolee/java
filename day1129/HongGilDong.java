package day1129;

/**
 * 사람의 공통특징을 부모(Person)로 부터 사용하고 자신만의 특징만(싸움을 잘한다) 정의
 * @author owner
 */
public class HongGilDong extends Person{
	private int level;//싸움레벨
	
	public HongGilDong() {
		super();
		level=7;
	}//HongGilDong
	
	/**
	 * 싸움하는 일 : 입력된 레벨보다 낮다면 패배, 입력된 레벨보다 높다면 승리, 입력된 레벨과 같다면 비김.<br>
	 * 승리 -> 레벨 1 증가/ 패배 -> 레벨 1 감소 비기면 변화 없음 최대 10 최소 1
	 * @param inputLevel 싸움 상대자의 레벨
	 * @return 싸움의 결과
	 */
	public String fight(int inputLevel) {
		String result = "";
		if (level>inputLevel) {//승리
			result = "이김";
			level++;
			if (level > 10) {
				level = 10;
			}//end if
		}else if (level < inputLevel) {//패배
			result = "짐";
			level--;
			if (level < 1) {
				level = 10;
			}//end if
		}else {//비김
			result = "비김";
		}
		return result;
	}
	@Override
	public String toString() {
		return "홍길동 객체의 값 눈 : "+getEye()+", 코 : "+getNose()+", 입 : "+getMouth();
	}
	/**
	 * 부모클래스가 제공하는 method의 기능이 자식에 맞지 않아 장속인 식당이 주막으로 변경, 화폐단위인 원이 냥으로 변경 
	 */
	@Override
	public String eat(String menu, int price) {
		return getName()+"이 주막에서 "+price+"냥 짜리 "+menu+"를 먹는다.";
	}
}
