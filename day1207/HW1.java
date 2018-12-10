package day1207;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ���� 1. main method�� arguments�� ��¥�� ������ �Է� �޾� �Է¹��� ��¥�� ������ �����ϰ� ����ϴ� method ��
 * �ۼ��ϼ���.
 * 
 * ��) java Test 4 12 30 32 35 15 4
 * 
 * ���) 4 ȭ 12 �� 15 �� 30 ��
 * 
 * @author owner
 */
public class HW1 {
	public HW1() {
	}
	Map<Integer, String> map = new Hashtable<Integer, String>();

	public void print() {
		Set<Integer> allkeys = map.keySet();
		Iterator<Integer> ita = allkeys.iterator();
		while (ita.hasNext()) {//Iterator�� �����ϴ� Set�� ��Ұ� �����Ѵٸ�
			int key = ita.next();
			System.out.printf("%d %s\t",key,map.get(key));
		}
	}// map�� ����� ��¥�� ������ ����ϴ� method

	public String dayToDOW(int day) {
		String day_of_week="";
		switch (day%7) {
		case 0:
			day_of_week = "������";
			break;
		case 1:
			day_of_week = "ȭ����";
			break;
		case 2:
			day_of_week = "������";
			break;
		case 3:
			day_of_week = "�����";
			break;
		case 4:
			day_of_week = "�ݿ���";
			break;
		case 5:
			day_of_week = "�����";
			break;
		case 6:
			day_of_week = "�Ͽ���";
			break;
		}

		return day_of_week;
	}// �Էµ� ���ڸ� 7�� ���� �������� ���� ������ ��ȯ�ϴ� method

	public void setMap(String[] args) {
		for (int i = 0; i < args.length; i++) {
			int day = Integer.parseInt(args[i]);
			map.put(day, dayToDOW(day));
		}
	}// args�� �Էµ� ��¥�� ������ �Ǻ��ϰ� {��¥,����}�� map�� �Է��ϴ� method

	public static void main(String[] args) {
		HW1 hw1 = new HW1();
		hw1.setMap(args);
		hw1.print();
	}

}
