package day1126;

/**
 * Ŭ������ ��ü�� ������ �� �⺻������ ������ �־���� �⺻���� �����ϰų� �⺻������ ����� �ڵ带 �����ϴ� method ����
 * @author owner
 */
public class TestConstructor {
	
	/**
	 * �⺻ ������
	 */
	public TestConstructor() {
//		this(26);
		System.out.println("�⺻ ������");
//		TestConstructor(300);//�����ڴ� method �θ��� �θ� �� ����.
	}//TestConstructor
	
	/**
	 * ���� �ִ� ������
	 * @param i ������ ��
	 */
	public TestConstructor(int i) {
		this();
		System.out.println("���� �ִ� ������"+i);
//		this();//�������� ù��° �ٿ����� ��� ����.
	}//TestConstructor

	public void test() {
		System.out.println("test method!!!");
		temp();//method ȣ��
	}
	public void temp() {
		System.out.println("=======temp method!!!");
	}
	public static void main(String[] args) {
		new TestConstructor();
		
		
	}//main

}//class
