package day1130;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK 1.5�������� �߰��� annotation�� ���<br>
 * Deprecated, Override, SuppressWarnings
 * @author owner
 */
public class UseAnnotation {

	/**
	 * �� method�� �ڶ� ������ �߻���ų �� �ֽ��ϴ�.
	 */
	@Deprecated
	public void test() {
		System.out.println("���Ŀ� ������ �߻��� method");
	}
	@Override
	public String toString() {
		return "�ȇ�";
	}
	
	//method ���� �����ϸ� method ���� ��� ����Ȳ�� ����
	@SuppressWarnings({"rawtypes","unused"})
	public void temp() {
		
		//unused ������ ������� ���� �� ��� ����
//		@SuppressWarnings("unused")
		int i = 0;
		
		//rawtypes : Generic�� ������� ���� �� ��� ����
		//���� ���� �����ϸ� �ٷ� �Ʒ� �ִ� ������ ��� �����ϰ�
//		@SuppressWarnings({"rawtypes","unused"})
		List l = new ArrayList();
		
		
		int j = 0;
		System.out.println("tempj = "+j);
	}
	
	
	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();
	}//main
}//class
