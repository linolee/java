package day1120;

/**
 * for : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 * ���� : for ( ���۰�; ����; ����|���ҽ�){<br>
 * �ݺ����๮��<br>
 * }
 * 
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
		// 0�������� 10���� ���� ���� ����ϴ� for
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "�� �ȳ�");
		}

		// 1�������� 100���� �ݺ������ϴ� for
		for (int i = 1; i < 101; i++) {// <=�� < = ���� �����ϹǷ� for������ �� �� ������ < > �� ����.
			System.out.println("�ȳ�*" + i);
		}

		// 1�������� 100���� ¦���� ����ϴ� for
		for (int i = 1; i < 101; i += 2) {// <=�� < = ���� �����ϹǷ� for������ �� �� ������ < > �� ����.
			System.out.print((i + 1) + ", ");
		}
		System.out.println("");
		for (int i = 1; i < 101; i++) {// <=�� < = ���� �����ϹǷ� for������ �� �� ������ < > �� ����.
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("");

		// 1�������� 100���� Ȧ���� ����ϴ� for
		for (int i = 1; i < 101; i += 2) {// <=�� < = ���� �����ϹǷ� for������ �� �� ������ < > �� ����.
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i = 1; i < 101; i++) {// <=�� < = ���� �����ϹǷ� for������ �� �� ������ < > �� ����.
			if (i % 2 == 1) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("");
		// 1~100���� ����ϱ� 3�� ������� ���� ��� "¦"�� ���
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.print("¦, ");
			} else {
				System.out.print(i + ", ");
			} // end if
		} // end for
		System.out.println("");
		// 1~100������ �� ���
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		} // end for
		System.out.println(sum);
		// A~Z���� ���
		for (char i = 65; i < 91; i++) {
			System.out.println(i);
		} // end for



	}// main
}// class
