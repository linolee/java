package day1203;

/**
 * interface를 구현하는 class(자식크래스이고 interface 내 모든 추상 method를 override 하는 클래스
 * @author owner
 */
public class Interfaceimpl implements SuperInterface{
	public String msgA() {
		return "내일은 화요일";
	}//msgA
	public String msgB() {
		return "오늘은 월요일";
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
		//자식클래스로 객체화
		//ii.msg() ii.msgB, ii.methodA(), ii.methodB(), ii.test()
		Interfaceimpl ii = new Interfaceimpl();
		ii.method();
		ii.msgA();
		
		//is a 관계의 객체화
		//1.interA, 2. interB, 3.SuperInterface
		InterA ia = new Interfaceimpl();
		ia.methodA();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

}

