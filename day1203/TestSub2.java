package day1203;

public class TestSub2 extends TestSuper {
	int i;

	public TestSub2() {
		super();
		System.out.println("자식의 생성자222222222222222");
	}// TestSub

	public void subMethod() {
		System.out.println("자식의 subMethod2222222222222");
	}// subMethod

	@Override
	public void printI() {
		System.out.println("자식222222222222222이 Overrider 한 method/ 자식의 i = " + this.i + ", 부모의 i = " + super.i);
	}// printI

}// class
