package day1121;

/**
 * method : ������ �����Ͽ� �����ϸ�, �ߺ��ڵ带 �ּ�ȭ �� �� ���<br>
 * @author owner
 */
public class UseMethod {

		
		
		public void instanceMethod() {
			System.out.println("��üȭ�Ͽ� ����ϴ� method");
		}//instance method
		
		
		public static void staticMethod() {
			System.out.println("��üȭ ���� ���� ȣ���Ͽ� ����ϴ� method");
		}		//static method
		
		public static void main(String[] args) {
			UseMethod um = new UseMethod();
			um.instanceMethod();
//			um.staticMethod();//static method��Ư�� ��ü�� �����ִ� method�� �ƴϹǷ� ��ü������ ȣ������ �ʴ´�
			UseMethod.staticMethod();
			
	
		
	}//main

}//class
