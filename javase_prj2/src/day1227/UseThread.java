package day1227;

/**
 * Thread class를 상속받아서 Thread 사용.
 * @author owner
 */
//1. Thread 상속
public class UseThread extends Thread {
	//2.run method Override
	@Override
	public void run() {
		//3.Thread로 동작되어야 할 코드(동시에 실행되어야할 코드)
		for(int i = 0; i < 1000; i++) {
			System.out.println("run i --------->"+i);
		}
	}//run
	public void test() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("test i ========>"+i);
		}
	}
	
	
	public static void main(String[] args) {
		//4.객체 생성
		UseThread ut = new UseThread();
		//5.부모 클래스인 Thread가 가진 start메소드 호출
		ut.start();//run안의 for문과 test 안의 for문이 동시에 실행
//		ut.run();//run 안의 method가 끝난 후 test의 for문 실행
		ut.test();
	}

}
