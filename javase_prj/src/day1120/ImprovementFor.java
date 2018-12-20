package day1120;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ for�� : �迭�̳� Collection���� ��� ���� ���� ó������ ������ ���������� ����ϱ� ���� ����.<br>
 * JDK1.5���� ��� ���� <br>
 * ����) for( �������� ������ : �迭��(Collection��)){<br>
 *  * ������ ;(�迭(Collection)���� ���� ����� �� �ִ�.)<br>
 * }<br>
 * 
 * @author owner
 */
public class ImprovementFor {

	public static void main(String[] args) {
		int[] tempArr = { 2018, 11, 20, 16, 5 };
		// ������ for�� ��� ���� ���� ���
		for (int i = 0; i < tempArr.length; i++) {
			System.out.println(tempArr[i]);
		} // end for
		System.out.println("======================");
		// ���� for�� ��� ���� ���� ���
		for (int value : tempArr) {
			System.out.println(value);
		}
		System.out.println("======================");
		// Collection(List)
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(110);
		list.add(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} // end for
		System.out.println("======================");
		for (int value : list) {
			System.out.println(value);
		} // end for

	}// main
}// class
