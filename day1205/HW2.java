package day1205;

import java.util.StringTokenizer;

/**
 * �Ʒ� ���õ� ���ڿ��� ���� ���ڷ� �߶󳻾� ���ڿ� �迭�� �����ϰ� ��ȯ�ϴ� ���� �ϴ� method�� �ۼ��ϼ���.<br>
 * "������",������.������,���ü�~������!������.����ö,������,������,���ü�.������"<br>
 * ��� : ������ ������ ������ ���ü� ������ ������ ����ö ������ ������ ���ü� ������<br>
 */
public class HW2 {

	public HW2() {
	}

	public String[] cutName(String name) {
		StringTokenizer stk = new StringTokenizer(name, ",\"~.!");
		String[] names = new String[stk.countTokens()];

		int i = 0;
		while (stk.hasMoreTokens()) {
			names[i]= stk.nextToken();
			i++;
		}
		return names;
	}

	public void printName(String[] names) {
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i]+ " ");
		}
	}
	public static void main(String[] args) {
		HW2 hw2 = new HW2();
		hw2.printName(hw2.cutName("\"������\",������.������,���ü�~������!������.����ö,������,������,���ü�.������"));
	}

}
