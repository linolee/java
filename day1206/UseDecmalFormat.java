package day1206;

import java.text.DecimalFormat;

/**
 * DecimalFormat<br>
 * ���ڸ� ������ ���ڿ��� ����
 * 
 * @author owner
 */
public class UseDecmalFormat {

	public UseDecmalFormat() {
		int temp = 20181206;
		System.out.println(temp);

		DecimalFormat df = new DecimalFormat("0,000,000,000");
		System.out.println("0 ��� : " + df.format(temp));
		DecimalFormat df1 = new DecimalFormat("#,###,###,###");
		System.out.println("# ��� : " + df1.format(temp));
		DecimalFormat df2 = new DecimalFormat("#,###,###,###.00");
		System.out.println("�Ҽ� �ڸ��� ǥ�� : " + df2.format(201812.064));
		System.out.println("�Ҽ� �ڸ��� ǥ�� : " + df2.format(201812.065));
		//�Ǽ� �ڸ����� �̿��ϸ� ������ ���ڸ��� ���� �ݿø� ����̶�� �ݿø��� ����� �����ش�.

	}// UseDecmalFormat

	public static void main(String[] args) {
		new UseDecmalFormat();
	}// main

}// class
