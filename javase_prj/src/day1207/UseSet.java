package day1207;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Set : 검색의 기능이 없으며(get x), 중복값을 저장하지 않는 기능
 * @author owner
 */
public class UseSet {
	public UseSet() {
		//JDK1.5이하에서는 Generic이 지원되지 않고 객체만 저장.
		
		//1.생성)
		Set<String> set = new HashSet<String>();
		//2.값할당) - 순서대로 입력되지 않는다.
		set.add("정택성");
		set.add("이재현");
		set.add("공선의");
		set.add("김정운");
		set.add("노진경");
		set.add("최지우");
		set.add("이봉현");
		set.add("이봉현");//중복값을 저장하지 않는다.
		System.out.println(set.size()+"/"+ set);
		set.remove("김정운");
		System.out.println(set.size()+"/"+ set);
		
		//배열로복사
		String[] names = new String[set.size()];
		set.toArray(names);
		//Iterator를 사용하여 값을 얻기
		Iterator<String> ita = set.iterator();
		
		String name = "";
		while (ita.hasNext()) {//Iterator가 참조하는 Set의 요소가 존재한다면
			name = ita.next();//해당요소의 값을 얻고 다음 포인터로 이동
			System.out.println(name);
		}
		
		System.out.println("-------향상된 for------");
		for(String temp : set) {
			System.out.println(temp);
		}
		
		
		//set의 모든방 (Element)의 값 출력
		
		set.clear();
		System.out.println("clear후"+set.size()+set);
		System.out.println("-----배열에 복사한 값-----");
		for (int i = 0; i<name.length();i++) {
			System.out.println(names[i]);
		}
	}
	public int[] lotto() {
		int[] tempLotto = new int[6];
		Random random = new Random();
		for (int i = 0 ; i < tempLotto.length ; i++) {
			tempLotto[i] = random.nextInt(45)+1;
			for (int j = 0; j<i; j++) {
				if (tempLotto[i] == tempLotto[j]) {//방의 값이 같다면
					i--;//중복 발생된 번호의 i번째 번호를 다시 발생시키기 위해 인덱스 수를 하나 낮추고
					break;//inner for문을 빠져나간다
				}//end if
			}//end inner for
		}//end outer for
		
		return tempLotto;
	}//lotto
	
	public Integer[] lotto1() {
		Integer[] tempLotto = new Integer[6];
		
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		while (set.size() != 6) {
			set.add(random.nextInt(45)+1);
			}
//		while (true) {
//			set.add(random.nextInt(45)+1);
//			if (set.size() == 6) {
//				break;
//			}
//		}//end while
		
		set.toArray(tempLotto);
		
		return tempLotto;
	}//lotto
	
	public static void main(String[] args) {
		UseSet us = new UseSet();
		int[]temp = us.lotto();
		for (int i = 0; i<temp.length; i++) {
			System.out.printf("%d\t",temp[i]);
		}
		System.out.println();
		
		Integer[]temp1 = us.lotto1();
		for (int i = 0; i<temp1.length; i++) {
			System.out.printf("%d\t",temp1[i]);
		}
	}//main

}//class
