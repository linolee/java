package day1121.sub;

import day1121.InstAccModifi;

/**
 * 다른 패키지에 존재하는 클래스의 인스턴스 변수 사용.<br>
 * 상송관계에 있다면 자식클래스로 생성하여 부모 클래스가 가진 인스턴스 변수의<br>
 * 접근 지정자가 public, protected인 것 사용 가능.<br>
 * @author owner
 */
public class UseInstAccModifi2 extends InstAccModifi{
	
	public static void main(String[] args) {
		UseInstAccModifi2 ivam = new UseInstAccModifi2();
		System.out.println("public : "+ivam.pub_i);
		System.out.println("protected : "+ivam.pro_i);
//		System.out.println("default : "+ivam.def_i);//사용불가
//		System.out.println("private : "+ivam.pri_i);//사용불가
				
	}//main
}//class
