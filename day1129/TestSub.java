package day1129;

/**
 * TestSuper의 자식클래스
 * @author owner
 */
public class TestSub extends TestSuper {
	int i;
	public void subMehod() {
		System.out.println("자식메소드");
	}
	public static void main(String[] args) {
		//객체화는 자식클래스를 사용한다.
		TestSub ts = new TestSub();
		//자식과 부모가 같은 패키지 존재하면 부모가 가진 변수나 method의 접근지정자가 public,protected, default인 자원만 사용할 수 있다.
		ts.pub_i = 10;//public
		ts.pro_i = 20;//protected
		ts.def_i = 5;//default
		ts.i = 100;
		
		
		
		System.out.println("부모의 자원 "+ ts.pub_i+"/"+ts.pro_i+"/"+ts.def_i);
		ts.superMethod();
		System.out.println("자식의 자원"+ ts.i);
	}//main

}//class
