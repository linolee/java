package day1203;

/**
 * 구현클래스(자식클래스)에서 반드시 Override 해야하는 일의 목록만 정의하는 
 * @author owner
 */
public interface SuperInterface extends InterA, InterB{
//	int i; //변수는 사용 불가
	
	//인터페이스간 상속에는 추상 method를 Override하지 않는다.
//	@Override
//	public String msg();
	//constant : 변수를 상수처럼 사용
	public static final int FALG_VALUE = 12;
	//추상method 구현
	//일반 method는 가질 수 없다
//	public void test() {
//		
//	}
	public void methodA();
	public abstract void method();	
}//interface
