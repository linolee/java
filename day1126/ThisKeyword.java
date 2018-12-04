package day1126;

/**
 * method�� ȣ���ϴ� ��ü�� �ּҷ� ����Ǿ� ���Ǵ� this
 * @author owner
 */
public class ThisKeyword {
	int i;
	/**
	 * parameter�� �̸��� instance������ �̸��� ���� �� this�� ������� �ʰ� parameter�� ���� �ν��Ͻ� ������ ������ ��
	 */
	public void UseInstance(int i, ThisKeyword t) {
		t.i = i;//parameter(stack) ������ ���� instance(heap) ������ �Ҵ�
		System.out.println(t);
				
	}//UseInstance
	/**
	 * parameter�� �̸��� instance �̸��� ���� ������ ��ü�� �ѱ�� �޾Ƽ� ����Ϸ��� �ڵ��� ����.<br>
	 * this�� ��� 
	 * @param i �Է� ����
	 */
	public void UseThis(int i) {
		//this�� method�� ȣ���ϴ� ��ü�� �ּҷ� �����ϴ� Ű����
		//�Ű������� ��ü�� ���� �ʿ䰡 ������
		this.i = i;
		System.out.println(this);
	}//UseThis
	
	public static void test() {
//		this.i = 10;//static method �ȿ����� this keyword�� ����� �� ����.
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		System.out.println("������ ��ü"+tk);
		tk.UseInstance(300, tk);
		System.out.println("������ ��ü�� instance������ �� "+ tk.i);
		System.out.println("===============");
		
		tk.UseThis(900);
		System.out.println("this�� ����Ͽ� ������ �ν��Ͻ� ������ �� "+tk.i);
		
		
	}//main

}//class
