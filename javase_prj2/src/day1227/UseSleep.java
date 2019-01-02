package day1227;

import java.util.Random;

/**
 * running 상태에서 block 상태로 상태이전(생명주기)
 * @author owner
 */
public class UseSleep implements Runnable{

	@Override
	public void run() {
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		for (int i = 1; i < 10; i++) {
//			System.out.println("2 * " + i+" = "+ i*2);
//		}
		System.out.println("loading");
		Random r = new Random();
		for(int i = 0; i< 15 ; i++) {
			try {
				Thread.sleep(100*r.nextInt(10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println();
		System.out.println("finish");
	}
	
	public static void main(String[] args) {
		//클래스 객체화
		UseSleep us = new UseSleep();
		//Thread와 has a
		Thread t = new Thread(us);
		//start()
		t.start();
		
		
	}

}
