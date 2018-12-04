package day1130;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK 1.5에서부터 추가된 annotation의 사용<br>
 * Deprecated, Override, SuppressWarnings
 * @author owner
 */
public class UseAnnotation {

	/**
	 * 이 method는 자라서 문제를 발생시킬 수 있습니다.
	 */
	@Deprecated
	public void test() {
		System.out.println("차후에 문제가 발생될 method");
	}
	@Override
	public String toString() {
		return "옴뇸";
	}
	
	//method 위에 설정하면 method 내의 모든 경고상황을 무시
	@SuppressWarnings({"rawtypes","unused"})
	public void temp() {
		
		//unused 변수를 사용하지 않을 때 경고 무시
//		@SuppressWarnings("unused")
		int i = 0;
		
		//rawtypes : Generic을 사용하지 않을 때 경고 무시
		//변수 위에 설정하면 바로 아래 있는 변수만 경고를 무시하고
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
