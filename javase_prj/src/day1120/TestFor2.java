package day1120;

/**
 * 다양한 for 형태
 * 
 * @author owner
 */
public class TestFor2 {

	public static void main(String[] args) {
//		// 무한 loop
//		for ( ; ; ) {
//			System.out.println("무한루프");
//		}//end for
//		System.out.println("hi");//error
		
		
		//증가하는 수를 세는 무한 loop
		for(int i = 0; ; i++) {
			System.out.println("무한 loop "+i);
			if (i == 50) {
				break;//가장 인근에 존재하는 반복문을 빠져나간다.
			}
		}
		
		//여러개의 초기값을 사용하는 for
		for(int i = 0, j = 10, k = 30; i <10; i++, j +=3, k-= 2) {
			System.out.println(i+" "+j+" "+k);
		}//end for
		
		//조건식을 잘못 설정하면 무한 loop
//		for(int i = 0; i<10; i--) {
//			System.out.println(i);
//		}
		
		int i=0;
		for(i=0; i<10; i++){
			System.out.println("반복문"+i);
		}
	
		
		
	}// main

}// class
