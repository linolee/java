package day1204;

/**
 * method�ȿ� Ŭ������ �����ϴ� ���� class�� ���<br>
 * ������ ��ü�� ��������ó�� ����ϴ� Ŭ����
 * 
 * @author owner
 */
public class LocalOuter {
	int i=8;

	public LocalOuter() {
		System.out.println("�ٱ�Ŭ������ ������");
	}// LocalOuter

	public void method(int param_i, final int param_j) {
		int local_i = 3;
		final int local_j = 4;
		//////////////////////////////����Ŭ���� ����////////////////////////////////////////
		class Local{
			int loc_i;
			public Local() {
				System.out.println("����Ŭ������ ������");
			}//Local
			public void locMethod() {
				System.out.println("����Ŭ������ method");
				System.out.println("�ν��Ͻ� ���� i = "+i);
				System.out.println("����Ŭ������ �ν��Ͻ� ���� loc_i = "+loc_i);
				System.out.println("����Ŭ������ �Ű����� param_i = "+param_i);
				System.out.println("����Ŭ������ �Ű����� param_j = "+param_j);
				//final�� ���� �Ű������� ����� �� �ִ�.
				System.out.println("����Ŭ������ ���� ���� local i = "+local_i);
				System.out.println("����Ŭ������ ���� ��� local j = "+local_j);
				//final�� ���� ���������� ����� �� �ִ�.
//				local_i = 2018; JDK1.8���ʹ� final�� �پ����� ���� ���������� ����� ���������� �������� ���� �ʴ´�(final�� �پ����� �ʾƵ� final�� �ٿ��ش�)
			}//locMethod
		}//class
		
		//////////////////////////////����Ŭ���� ��////////////////////////////////////////
		//����Ŭ������ ��üȭ
		Local lo = new Local();
		//������ ��ü�� Ŭ���� ���� �ڿ��� ����� �� �ִ�.
//		loc_i=100;//������� �Ұ�
		lo.loc_i = 100;
		lo.locMethod();
		
		
		
		System.out.println("method ȣ��");
		
	}//method
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.method(12, 4);
		//method ȣ�� != ����Ŭ���� ȣ�� // �ٱ�Ŭ�������� ����Ŭ������ ��üȭ �ؾ� ��� ����
		
		
	}// main

}// class
