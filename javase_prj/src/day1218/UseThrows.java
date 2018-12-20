package day1218;

import java.util.Random;

/**
 * method ������ �߻��� ���ܸ� method�� ȣ���� ������ ó���ϴ� throws�� ���
 * @author owner
 */
public class UseThrows {
	
	public void test() throws ClassNotFoundException{
		//throws�� ���ܸ� ������ method �ȿ� try~catch�� �� �ʿ䰡 ����.
//		Class.forName("day1217.UseRuntimeException");
		String className = "day1217.UseRuntimeException";
		
		if(new Random().nextBoolean()) {
			className = "java.lang.Integer";
		}
		
		Object obj = Class.forName(className);
		System.out.println("Ŭ���� �ε� : "+obj);
		
	}
	public static void main(String[] args) {
		UseThrows ut = new UseThrows();
		try {
			ut.test();
		}catch(ClassNotFoundException cnfe) {
			System.err.println("�˼��մϴ�");
			cnfe.printStackTrace();
			System.out.println("�������");
		}
		
	}

}
