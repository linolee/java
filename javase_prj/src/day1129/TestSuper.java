package day1129;

/**
 * 상속관계의 부모클래스 : 모든 자식이 가져야할 공통 특징 정의<br>
 * 부모에게 정의된 코드는 자식에서 사용할 수 있다.
 * @author owner
 */
public class TestSuper {

	public int pub_i;//어디에 있는 자식이든 사용 가능
	protected int pro_i;//같은 패키지의 자식이나 다른패키지의 자식만 사용 가능
	@SuppressWarnings("unused")
	private int pri_i;//부모클래스 안에서만 사용 가능(자식 사용 X)
	int def_i;//같은 패키지의 자식에서 사용 가능
	
	public TestSuper() {
		System.out.println("부모클래스 기본 생성자");
	}//TestSuper
	
	public void superMethod() {
		System.out.println("부모 클래스의 메소드");
	}//superMethod
	
}//class
