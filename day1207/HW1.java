package day1207;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 숙제 1. main method의 arguments로 날짜를 여러개 입력 받아 입력받은 날짜의 요일을 저장하고 출력하는 method 를
 * 작성하세요.
 * 
 * 예) java Test 4 12 30 32 35 15 4
 * 
 * 출력) 4 화 12 수 15 토 30 일
 * 
 * @author owner
 */
public class HW1 {
	public HW1() {
	}
	Map<Integer, String> map = new Hashtable<Integer, String>();

	public void print() {
		Set<Integer> allkeys = map.keySet();
		Iterator<Integer> ita = allkeys.iterator();
		while (ita.hasNext()) {//Iterator가 참조하는 Set의 요소가 존재한다면
			int key = ita.next();
			System.out.printf("%d %s\t",key,map.get(key));
		}
	}// map에 저장된 날짜와 요일을 출력하는 method

	public String dayToDOW(int day) {
		String day_of_week="";
		switch (day%7) {
		case 0:
			day_of_week = "월요일";
			break;
		case 1:
			day_of_week = "화요일";
			break;
		case 2:
			day_of_week = "수요일";
			break;
		case 3:
			day_of_week = "목요일";
			break;
		case 4:
			day_of_week = "금요일";
			break;
		case 5:
			day_of_week = "토요일";
			break;
		case 6:
			day_of_week = "일요일";
			break;
		}

		return day_of_week;
	}// 입력된 숫자를 7로 나눈 나머지에 따라 요일을 반환하는 method

	public void setMap(String[] args) {
		for (int i = 0; i < args.length; i++) {
			int day = Integer.parseInt(args[i]);
			map.put(day, dayToDOW(day));
		}
	}// args에 입력된 날짜의 요일을 판별하고 {날짜,요일}을 map에 입력하는 method

	public static void main(String[] args) {
		HW1 hw1 = new HW1();
		hw1.setMap(args);
		hw1.print();
	}

}
