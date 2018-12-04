package day1130;

/**
 * 부모클래스
 * @author owner
 */
public class TestSuper {
	int p_i;
	int p_j;
	
	public TestSuper() {
		System.out.println("부모 기본생성자");
	}//TestSuper
	public void method() {
		System.out.println("부모 method p_i : "+p_i+", p_j : "+p_j);
	}
}
