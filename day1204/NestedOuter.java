package day1204;

/**
 * ����Ŭ������ static ����ó�� ����� �� �ִ� ��øŬ����<br>
 * 
 * @author owner
 */
public class NestedOuter {
	int i;
	static int j;

	public NestedOuter() {
		System.out.println("�ٱ�Ŭ������ ������");
	}// NestedOuter

	public void outInstMethod() {
		System.out.println("�ٱ� Ŭ������ instance method");
	}// outInstMethod

	public static void outStatMethod() {
		System.out.println("�ٱ� Ŭ������ static method");
	}// outStatMethod

	///////////////////////// Nested class ����///////////////////////////////

	static class NestedInner {
//		int in_i; //instance ����//instance���� �������� �ʴ´�
		static int in_j;// static ����

		public static void inStatMethod() {
			System.out.println("����Ŭ������ static method");
			System.out.println("�ٱ�Ŭ������ �ڿ� ��� i = ���Ұ�, j = "+NestedOuter.j);
		}

		

//		public NestedInner() {
//		}//������ �������� �ʴ´�.

	}// class
		///////////////////////// Nested class ��///////////////////////////////

	public static void main(String[] args) {
		//static ������ ����� ������ ��üȭ ���� Ŭ������.������, Ŭ������.method������ ����Ѵ�
//		outInstMethod();//instance�����̹Ƿ� ��� �Ұ�
		NestedInner.inStatMethod();
	}// main

}// class
