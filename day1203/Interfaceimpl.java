package day1203;

/**
 * interface�� �����ϴ� class(�ڽ�ũ�����̰� interface �� ��� �߻� method�� override �ϴ� Ŭ����
 * @author owner
 */
public class Interfaceimpl implements SuperInterface{
	public String msgA() {
		return "������ ȭ����";
	}//msgA
	public String msgB() {
		return "������ ������";
	}//msgB
	
	@Override
	public void methodA() {
		System.out.println("methodA");
	}
	@Override
	public void methodB(int i) {
		System.out.println("method");
	}
	public static void main(String[] args) {
		//�ڽ�Ŭ������ ��üȭ
		//ii.msg() ii.msgB, ii.methodA(), ii.methodB(), ii.test()
		Interfaceimpl ii = new Interfaceimpl();
		ii.method();
		ii.msgA();
		
		//is a ������ ��üȭ
		//1.interA, 2. interB, 3.SuperInterface
		InterA ia = new Interfaceimpl();
		ia.methodA();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

}

