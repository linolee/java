package day1203;

public class TestSub2 extends TestSuper {
	int i;

	public TestSub2() {
		super();
		System.out.println("�ڽ��� ������222222222222222");
	}// TestSub

	public void subMethod() {
		System.out.println("�ڽ��� subMethod2222222222222");
	}// subMethod

	@Override
	public void printI() {
		System.out.println("�ڽ�222222222222222�� Overrider �� method/ �ڽ��� i = " + this.i + ", �θ��� i = " + super.i);
	}// printI

}// class
