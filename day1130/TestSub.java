package day1130;

/**
 * TestSuper�� �ڽ�Ŭ����
 * 
 * @author owner
 */
public class TestSub extends TestSuper {

	@Override
	public void method() {
		System.out.println("�ڽ��� method");
		p_i = 400;// �ڵ��� ���뼺 //�θ��� ����
		super.p_j = 500;
		System.out.println("�ڽ��� Method : "+this.p_i+"/"+this.p_j);
		super.method();
		
		System.out.println(this);
//		System.out.println(super);
	}

	public static void main(String[] args) {
		TestSub ts = new TestSub();
		ts.method();

	}// main

}// class
