package day1227;

/**
 * Thread class�� ��ӹ޾Ƽ� Thread ���.
 * @author owner
 */
//1. Thread ���
public class UseThread extends Thread {
	//2.run method Override
	@Override
	public void run() {
		//3.Thread�� ���۵Ǿ�� �� �ڵ�(���ÿ� ����Ǿ���� �ڵ�)
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
		//4.��ü ����
		UseThread ut = new UseThread();
		//5.�θ� Ŭ������ Thread�� ���� start�޼ҵ� ȣ��
		ut.start();//run���� for���� test ���� for���� ���ÿ� ����
//		ut.run();//run ���� method�� ���� �� test�� for�� ����
		ut.test();
	}

}
