package day1130;

/**
 * TestSuper의 자식클래스
 * 
 * @author owner
 */
public class TestSub extends TestSuper {

	@Override
	public void method() {
		System.out.println("자식의 method");
		p_i = 400;// 코드의 재사용성 //부모의 변수
		super.p_j = 500;
		System.out.println("자식의 Method : "+this.p_i+"/"+this.p_j);
		super.method();
		
		System.out.println(this);
//		System.out.println(super);
	}

	public static void main(String[] args) {
		TestSub ts = new TestSub();
		ts.method();

	}// main

}// class
