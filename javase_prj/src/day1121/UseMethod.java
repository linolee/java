package day1121;

/**
 * method : 업무를 구분하여 정의하며, 중복코드를 최소화 할 때 사용<br>
 * @author owner
 */
public class UseMethod {

		
		
		public void instanceMethod() {
			System.out.println("객체화하여 사용하는 method");
		}//instance method
		
		
		public static void staticMethod() {
			System.out.println("객체화 없이 직접 호출하여 사용하는 method");
		}		//static method
		
		public static void main(String[] args) {
			UseMethod um = new UseMethod();
			um.instanceMethod();
//			um.staticMethod();//static method는특정 객체에 속해있는 method가 아니므로 객체명으로 호출하지 않는다
			UseMethod.staticMethod();
			
	
		
	}//main

}//class
