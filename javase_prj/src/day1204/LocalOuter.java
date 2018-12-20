package day1204;

/**
 * method안에 클래스를 정의하는 지역 class의 사용<br>
 * 생성된 객체를 지역변수처럼 사용하는 클래스
 * 
 * @author owner
 */
public class LocalOuter {
	int i=8;

	public LocalOuter() {
		System.out.println("바깥클래스의 생성자");
	}// LocalOuter

	public void method(int param_i, final int param_j) {
		int local_i = 3;
		final int local_j = 4;
		//////////////////////////////지역클래스 시작////////////////////////////////////////
		class Local{
			int loc_i;
			public Local() {
				System.out.println("지역클래스의 생성자");
			}//Local
			public void locMethod() {
				System.out.println("지역클래스의 method");
				System.out.println("인스턴스 변수 i = "+i);
				System.out.println("지역클래스의 인스턴스 변수 loc_i = "+loc_i);
				System.out.println("지역클래스의 매개변수 param_i = "+param_i);
				System.out.println("지역클래스의 매개변수 param_j = "+param_j);
				//final이 붙은 매개변수만 사용할 수 있다.
				System.out.println("지역클래스의 로컬 변수 local i = "+local_i);
				System.out.println("지역클래스의 로컬 상수 local j = "+local_j);
				//final이 붙은 지역변수만 사용할 수 있다.
//				local_i = 2018; JDK1.8부터는 final이 붙어있지 않은 지역변수의 출력은 가능하지만 값변경은 되지 않는다(final이 붙어있지 않아도 final을 붙여준다)
			}//locMethod
		}//class
		
		//////////////////////////////지역클래스 끝////////////////////////////////////////
		//지역클래스의 객체화
		Local lo = new Local();
		//생성된 객체로 클래스 내의 자원을 사용할 수 있다.
//		loc_i=100;//직접사용 불가
		lo.loc_i = 100;
		lo.locMethod();
		
		
		
		System.out.println("method 호출");
		
	}//method
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.method(12, 4);
		//method 호출 != 지역클래스 호출 // 바깥클래스에서 지역클래스를 객체화 해야 사용 가능
		
		
	}// main

}// class
