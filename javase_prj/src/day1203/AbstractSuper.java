package day1203;

/**
 * ����� �������� ����� �θ� Ŭ����<br>
 * ��üȭ�� ���� �ʴ´�<br>
 * �ڽ�Ŭ������ �ݵ�� �����ؾ��� abstract method�� ������ Ŭ����<br>
 * @author owner
 */
public abstract class AbstractSuper {
	
	int i;
	public AbstractSuper() {
		//�ڽ�Ŭ������ ������ ���� ȣ��ȴ�.
		System.out.println("AbstractSuper ������");
	}//AbstractSuper
	
	public void method() {
		System.out.println("���� �ϴ� �Ϲ� method");
	}
	
	//abstract method�� �ڽ��� �ݵ�� �����ؾ��� ���� ��� ����
	public abstract void absMethod();//�߻�method
	public abstract String absMethod1(int i);//�߻�method
	
	
	public static void main(String[] args) {
//		new AbstractSuper();//�߻�Ŭ������ ��üȭ �� �� ����.
		
	}//main

}//class
