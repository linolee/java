package day1204;

/**
 * 
 * @author owner
 */
public class Outer {
	int i;
	public Outer() {
		System.out.println("바깥클래스 생성자");
	}//Outer
	public void outMethod() {
		System.out.println("바깥클래스 method");
//		System.out.println("안쪽클래스의 j = "+j);
	}//outMethod
	//안쪽클래스를 객체화
	Outer.Inner in = this.new Inner();
	
	
	//////////////////////안쪽 클래스 시작///////////////////////////
	public class Inner{
		int j;
		public Inner() {
			System.out.println("안쪽클래스 생성자");
		}//Inner
		public void inMethod() {
			System.out.println("안쪽클래스 method j = " + j + ", 바깥쪽 클래스의 변수 i = "+i);
//			outMethod();//바깥클래스의 method
			
		}//inMethod
		
		
		
	}//class
	//////////////////////안쪽 클래스 끝///////////////////////////
	
	public static void main(String[] args) {
		//1. 바깥클래스의 객체화
		Outer out = new Outer();
		out.i = 10;
		out.outMethod();
//		out.j = 100;//안쪽 클래스의 자원을 직접 접근하여 사용할 수 없다.
//		out.inMethod;//안쪽 클래스의 자원을 직접 접근하여 사용할 수 없다.
		
		//2. 안쪽클래스의 객체화 : 바깥클래스명.안쪽클래스명 객체명 = 바깥클래스객체명.new 안쪽생성자();
		//바깥 클래스에서 안쪽 클래스의 자원을 사용할 수 있다.
//		Outer.Inner in = out.new Inner();
		//바깥클래스는 생략 가능
		Inner in = out.new Inner();
		in.j = 12;
		in.inMethod();
	}//main

}//class
