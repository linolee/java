package day1122;

/**
 * ������ : method Overload<br>
 * �ϳ��� Ŭ�������� ���� �̸��� method�� ������ �ۼ��ϴ� ��.<br>
 * ��Ģ) ���������� ��ȯ�� method�� ������ �����ϰ� ����� �Ű������� �ٸ��� �ۼ�<br>
 * 
 * @author owner
 */
public class TestOverload {
	/**
	 * ���� �ϳ� ����ϴ� ��
	 */
	public void printStar() {
		System.out.println("��");
	}// printStar

	
	/**
	 * ���� ������ ����ϴ� ��
	 * @param count �� ����
	 */
	public void printStar(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("��");
		} // end for
		System.out.println();
	}// printStar

	/**
	 * ������ 3���� ���
	 */
	public void Gugu() {
		for (int i = 1; i < 10; i++) {
			System.out.print(3 + "x" + i + "=" + 3 * i + "   ");
		} // end for
		System.out.println();
	}// Gugu

	/**
	 * �Էµ� �ܼ��� �ش� �ܺ��� 9�ܱ��� ���
	 * 
	 * @param j �������� �ܼ�
	 */
	public void Gugu(int j) {
		if (j < 2 || j > 9) {
			System.out.println("2���� 9 ������ ������ �Է��ϼ���.");
		} else {
			for (; j < 10; j++) {
				for (int i = 1; i < 10; i++) {
					System.out.print(j + "x" + i + "=" + j * i + "   ");
				} // end inner for
				System.out.println();
			} // end outer for

		} // end if

	}// Gugu

	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.printStar();
		to.printStar(5);

		to.Gugu();
		// ������ 3���� ����ϴ� method
		to.Gugu(6);
		// �Է��ϴ� ���� 2~9�� ������ �� �ش� �ܺ��� 9�ܱ��� ����ϴ� method
	}// main
}// class
