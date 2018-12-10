package day1207;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Set : �˻��� ����� ������(get x), �ߺ����� �������� �ʴ� ���
 * @author owner
 */
public class UseSet {
	public UseSet() {
		//JDK1.5���Ͽ����� Generic�� �������� �ʰ� ��ü�� ����.
		
		//1.����)
		Set<String> set = new HashSet<String>();
		//2.���Ҵ�) - ������� �Էµ��� �ʴ´�.
		set.add("���ü�");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("�̺���");
		set.add("�̺���");//�ߺ����� �������� �ʴ´�.
		System.out.println(set.size()+"/"+ set);
		set.remove("������");
		System.out.println(set.size()+"/"+ set);
		
		//�迭�κ���
		String[] names = new String[set.size()];
		set.toArray(names);
		//Iterator�� ����Ͽ� ���� ���
		Iterator<String> ita = set.iterator();
		
		String name = "";
		while (ita.hasNext()) {//Iterator�� �����ϴ� Set�� ��Ұ� �����Ѵٸ�
			name = ita.next();//�ش����� ���� ��� ���� �����ͷ� �̵�
			System.out.println(name);
		}
		
		System.out.println("-------���� for------");
		for(String temp : set) {
			System.out.println(temp);
		}
		
		
		//set�� ���� (Element)�� �� ���
		
		set.clear();
		System.out.println("clear��"+set.size()+set);
		System.out.println("-----�迭�� ������ ��-----");
		for (int i = 0; i<name.length();i++) {
			System.out.println(names[i]);
		}
	}
	public int[] lotto() {
		int[] tempLotto = new int[6];
		Random random = new Random();
		for (int i = 0 ; i < tempLotto.length ; i++) {
			tempLotto[i] = random.nextInt(45)+1;
			for (int j = 0; j<i; j++) {
				if (tempLotto[i] == tempLotto[j]) {//���� ���� ���ٸ�
					i--;//�ߺ� �߻��� ��ȣ�� i��° ��ȣ�� �ٽ� �߻���Ű�� ���� �ε��� ���� �ϳ� ���߰�
					break;//inner for���� ����������
				}//end if
			}//end inner for
		}//end outer for
		
		return tempLotto;
	}//lotto
	
	public Integer[] lotto1() {
		Integer[] tempLotto = new Integer[6];
		
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		while (set.size() != 6) {
			set.add(random.nextInt(45)+1);
			}
//		while (true) {
//			set.add(random.nextInt(45)+1);
//			if (set.size() == 6) {
//				break;
//			}
//		}//end while
		
		set.toArray(tempLotto);
		
		return tempLotto;
	}//lotto
	
	public static void main(String[] args) {
		UseSet us = new UseSet();
		int[]temp = us.lotto();
		for (int i = 0; i<temp.length; i++) {
			System.out.printf("%d\t",temp[i]);
		}
		System.out.println();
		
		Integer[]temp1 = us.lotto1();
		for (int i = 0; i<temp1.length; i++) {
			System.out.printf("%d\t",temp1[i]);
		}
	}//main

}//class
