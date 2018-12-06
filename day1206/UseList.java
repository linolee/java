package day1206;

import java.util.ArrayList;
import java.util.List;

/**
 * List:<br>
 * �ߺ����� ����ϸ� �˻��� ����� �ְ�, ������� ���� �Է��ϴ� ����������
 * 
 * @author owner
 */
public class UseList {

	public UseList() {
//		List list = new ArrayList();
//		list.add(new Integer(10));
//		list.add(new Short((short)10));
//		list.add("������");
//		
//		System.out.println(list.size());
//		System.out.println(((Integer)list.get(0)).intValue()+10);
//	}
		// JDK1.5+���� ��� : Generic, auto boxing, unboxing
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(new Integer(30));
//		list.add("�����");//Generic���� ������ ���� �ƴ� ���������� �߰��� �� ����.
		System.out.println(list.size());
		System.out.println(list.get(0)+10);
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i)+1);
		}

	}

	/**
	 * ArrayList ��� : Multi Thread ȯ�濡�� ���� ���� ����.(����ȭx)
	 */
	public void useArrayList() {
		//����
		ArrayList<String> al = new ArrayList<>();
		List<String> al1 = new ArrayList<String>();
		System.out.println(al+" / "+al1);
		//���߰�
		al.add("������");
		al.add("���ü�");
		al.add("������");
		al.add("������");//�ߺ��� ���� ����
		al.add("������");//�ߺ��� ���� ����
		al.add("������");//�ߺ��� ���� ����
		al.add("������");
		
		//�迭�� ����
		String[] names = new String[al.size()];
		al.toArray(names);
		
		//���� �� ���� :
		//�ε����� ���� :
		al.remove(4);
		System.out.println(al.size()+" / "+al);
		
	
		System.out.println(al+" / "+al1);
		System.out.println("al ũ�� : "+al.size()+"/ al1 ũ�� : "+al1.size());
		//������ ����
		al.remove("������");
		System.out.println(al.size()+" / "+al);
		
		for (String name : al) {
			System.out.println(name);
		}
		//��� ���� �� ����
		al.clear();
		System.out.println("al ũ�� : "+al.size()+"/ al1 ũ�� : "+al1.size());
		
		//�迭�� ��
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s\t",names[i]);
		}
		
	}

	public void useVector() {
		//����
		ArrayList<String> vec = new ArrayList<>();
		List<String> vec1 = new ArrayList<String>();
		System.out.println(vec+" / "+vec1);
		//���߰�
		vec.add("������");
		vec.add("���ü�");
		vec.add("������");
		vec.add("������");//�ߺ��� ���� ����
		vec.add("������");//�ߺ��� ���� ����
		vec.add("������");//�ߺ��� ���� ����
		vec.add("������");
		
		//�迭�� ����
		String[] names = new String[vec.size()];
		vec.toArray(names);
		
		//���� �� ���� :
		//�ε����� ���� :
		vec.remove(4);
		System.out.println(vec.size()+" / "+vec);
		
	
		System.out.println(vec+" / "+vec1);
		System.out.println("vec ũ�� : "+vec.size()+"/ vec1 ũ�� : "+vec1.size());
		//������ ����
		vec.remove("������");
		System.out.println(vec.size()+" / "+vec);
		
		for (String name : vec) {
			System.out.println(name);
		}
		//��� ���� �� ����
		vec.clear();
		System.out.println("vec ũ�� : "+vec.size()+"/ vec1 ũ�� : "+vec1.size());
		
		//�迭�� ��
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s\t",names[i]);
		}
		
	}

	public void useLinkedList() {
		//����
		ArrayList<String> ll = new ArrayList<>();
		List<String> ll1 = new ArrayList<String>();
		System.out.println(ll+" / "+ll1);
		//���߰�
		ll.add("������");
		ll.add("���ü�");
		ll.add("������");
		ll.add("������");//�ߺ��� ���� ����
		ll.add("������");//�ߺ��� ���� ����
		ll.add("������");//�ߺ��� ���� ����
		ll.add("������");
		
		//�迭�� ����
		String[] names = new String[ll.size()];
		ll.toArray(names);
		
		//���� �� ���� :
		//�ε����� ���� :
		ll.remove(4);
		System.out.println(ll.size()+" / "+ll);
		
	
		System.out.println(ll+" / "+ll1);
		System.out.println("ll ũ�� : "+ll.size()+"/ ll1 ũ�� : "+ll1.size());
		//������ ����
		ll.remove("������");
		System.out.println(ll.size()+" / "+ll);
		
		for (String name : ll) {
			System.out.println(name);
		}
		//��� ���� �� ����
		ll.clear();
		System.out.println("ll ũ�� : "+ll.size()+"/ ll1 ũ�� : "+ll1.size());
		
		//�迭�� ��
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s\t",names[i]);
		}
		
	}

	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("----------------------------------");
		ul.useArrayList();
		System.out.println("----------------------------------");
		ul.useVector();
		System.out.println("----------------------------------");
		ul.useLinkedList();
	}// main

}// class
