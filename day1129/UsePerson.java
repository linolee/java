package day1129;

import java.util.Date;

public class UsePerson {

	public static void main(String[] args) {
		HongGilDong gd = new HongGilDong();
		gd.setName("홍길동");//부모의 method 사용
		System.out.println("눈 : "+gd.getEye()+", 코 : "+gd.getNose()+", 입 : "+gd.getMouth());
		System.out.println(gd.eat());
		System.out.println(gd.eat("국밥", 1));
		//자신만의 특징
		System.out.println(gd.fight(6));//7>8
		System.out.println(gd.fight(7));//8>9
		System.out.println(gd.fight(9));//비김
		System.out.println(gd.fight(10));//9>8
		System.out.println(gd.fight(9));//8>7
		
		System.out.println("====================================================================");
		Clark superman = new Clark();//자식이 생성되면 부모클래스가 먼저 생성된 후 자식이 생성
		//자식의 객체로 부모의 클래스의 자원(변수,method)을 자식의 것처럼 사용할 수 있다.
		superman.setName("클락");
		System.out.println(superman.getEye()+"/"+superman.getNose()+"/"+superman.getMouth()+"/"+superman.getName());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크", 10));
		
		//자식의 method
		String stone = "짱돌";
		System.out.println(stone+"은(는) 맞은 결과 "+superman.power(stone)+", 힘의 변화 : "+superman.power);
		
		stone = "클립토나이트";
		System.out.println(stone+"은(는) 맞은 결과 "+superman.power(stone)+", 힘의 변화 : "+superman.power);
		
		stone = "다이아몬드";
		System.out.println(stone+"은(는) 맞은 결과 "+superman.power(stone)+", 힘의 변화 : "+superman.power);
		
		System.out.println("====================================================================");
		BongHyeon bong = new BongHyeon();
		bong.setName("봉현");
		System.out.println(bong.getName());
		bong.hide();
		bong.sleep();
		System.out.println(bong.getName());
		
		System.out.println(gd);
		
		String s = new String ("오늘은 금욜");
		System.out.println(gd.toString());
		System.out.println(s.toString());
		//같은 문법인데 출력이 다름 => overriding 
		Date d = new Date();
		System.out.println(d.getYear());
		@SuppressWarnings("unused")
		int i;
	}

}
