package day1204;

/**
 * 내부클래스를 static 변수처럼 사용할 수 있는 중첩클래스<br>
 * 
 * @author owner
 */
public class NestedOuter {
	int i;
	static int j;

	public NestedOuter() {
		System.out.println("바깥클래스의 생성자");
	}// NestedOuter

	public void outInstMethod() {
		System.out.println("바깥 클래스의 instance method");
	}// outInstMethod

	public static void outStatMethod() {
		System.out.println("바깥 클래스의 static method");
	}// outStatMethod

	///////////////////////// Nested class 시작///////////////////////////////

	static class NestedInner {
//		int in_i; //instance 변수//instance변수 권장하지 않는다
		static int in_j;// static 변수

		public static void inStatMethod() {
			System.out.println("안쪽클래스의 static method");
			System.out.println("바깥클래스의 자원 사용 i = 사용불가, j = "+NestedOuter.j);
		}

		

//		public NestedInner() {
//		}//생성자 권장하지 않는다.

	}// class
		///////////////////////// Nested class 끝///////////////////////////////

	public static void main(String[] args) {
		//static 영역을 사용할 때에는 객체화 없이 클래스명.변수명, 클래스명.method명으로 사용한다
//		outInstMethod();//instance영역이므로 사용 불가
		NestedInner.inStatMethod();
	}// main

}// class
