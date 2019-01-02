package day1227;

/**
 * Runnable interface�� �����Ͽ� Thread�� ���
 * 
 * @author owner
 */
//1.Runnable ����
public class UseRunnable implements Runnable {

	// 2.run()�� Override
	@Override
	public void run() {
		// 3.Thread�� �����ؾ��ϴ� �ڵ�
		for (int i = 0; i < 1000; i++) {
			System.out.println("run i --------->" + i);
		}
	}

	public void test() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("test i ========>" + i);
		}
	}

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		// 4.Runnable�� ����ȭ�� Ŭ������ ��üȭ
		UseRunnable ur = new UseRunnable();
		// 5.Thread ��ü�� Runnable�� ������ ��ü�� has a ����� ����
		Thread t = new Thread(ur);
		// 6.Thread�� �ִ� start�� ȣ��
		t.start();// has a ���谡 �������� ������ Thread�� run() ȣ��
		ur.test();
		long et = System.currentTimeMillis();
		System.out.println((et - st) + "ms");
	}

}
