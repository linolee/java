package day1207;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map : KVP�� �Ǿ��ִ� �ڷᱸ��, Ű�� ����Ͽ� ���� ��� ��. 
 * 
 * @author owner
 */
public class UseMap {

	public UseMap() {
		//JDK1.5������ ��� Generic�� ����� �� ����, ��ü�� ���� ����.
		
		//1.����
		Map<String,String> map = new HashMap<String,String>();
		//2.���Ҵ� - Ű�� ����, ���� �ߺ�����, �ԷµǴ� ������� ���� �߰����� �ʴ´�.
		map.put("Oracle", "��뷮 �����ͺ��̽�");
		map.put("Java", "���α׷��� ���");
		map.put("Python", "���α׷��� ���");//���� �ߺ� ����
		map.put("Java", "�Ϻ��� ��ü���� ���");//Ű�� �����Ѵٸ� �ش� Ű�� ���� ��.
		map.put("HTML", "Markup Language");
		
		System.out.println(map.size()+" / "+map);
		//3.����� - Ű�� ����Ͽ� ���� ��´�
		String val = map.get("html");//�ش��ϴ� key�� ������ null���
		System.out.println(val);
		
		//4.Ű�� �����ϴ���
		String key = "Java";
		boolean flag = map.containsKey(key);
		System.out.println(key+" Ű ���� "+flag);
		
		//5.�� ����
		map.remove("Java");
		System.out.println("���� �� : "+map);
		
		//6.��� Ű ���
		Set<String> allkeys = map.keySet();
		System.out.println("���� ���� ��� Ű : "+allkeys);
		
		//7.��� �� ���
		Iterator<String> ita = allkeys.iterator();
		String value = "";
		while(ita.hasNext()) {//Ű�� �����Ѵٸ�
			value = map.get(ita.next());//�� Ű�� ������ Map�� ���� ��´�.
			System.out.println(value);
		}
		
		//8.����
		map.clear();
		System.out.println("��� ���� : "+map.size()+" / "+map);
		
		
		
	}
	
	/**
	 * �⺻�����ڸ� ����ϸ� 11���� ���� �ڵ� ����
	 * MultiThread���� �������� �Ұ���
	 * �����Ͱ� ��ü ���� ������ �� 75%ä������ �� ���� ���� �˻��� �Ѵ�
	 */
	public void useHashTable(String key) {
		//1.����
		Map<String, String> bloodMap = new Hashtable<String,String>(100);
		//2.���Ҵ�
		bloodMap.put("A", "�����ϴ� ģ���ϴ�");
		bloodMap.put("B", "���� �巴��");
		bloodMap.put("AB", "������");
		bloodMap.put("O", "�����δ�");
		bloodMap.put("A", "�ҽ��ϴ�");
		
		key = key.toUpperCase();
		String value = bloodMap.get(key);
		if(!bloodMap.containsKey(key)) {
			System.out.println(key+"�������� ����� ���� �ƴմϴ�");
		}else {
			System.out.println(key+"�� Ư¡ : "+value);
		}
		
	
	}
	/**
	 * �⺻�����ڸ� ����ϸ� 16���� ���� �ڵ� ����
	 * MultiThread���� �������� ����
	 * �����Ͱ� ��ü ���� ������ �� 75%ä������ �� ���� ���� �˻��� �Ѵ�
	 */
	public void useHashMap(String key) {
		//1.����
		Map<String, String> map = new HashMap<String, String>();
		//2.���Ҵ�
		map.put("���ʺ���", "���̶�E");
		map.put("��������", "�ʵ����� ��ġ��ȯ��");
		map.put("���乫��", "Ƽ����");
		map.put("���γ���", "�����ϸ� �θǽ� �ʰ��ϸ� �ҷ�");
		map.put("�̺θ�õ", "������ ��ȥ�ϸ� ��õ���� ���ϸ� ��õ����");
		map.put("��������", "�� �� ���� ���� �� ������");
		map.put("����ġ��", "�Լ��� ������ ¡�׷���");
		map.put("���ü���", "���α��� �ڶ�");
		map.put("�������", "���� �� ����");
		//3.�����
		if(map.containsKey(key)) {
			String value = map.get(key);//�� ���
			System.out.println(key+"�� �� : "+value);
		}else {
			System.out.println(key+"���ڼ���� �غ���� �ʾҽ��ϴ�.");
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("---------------Hashtable ���-----------------");
		um.useHashTable("A");
		um.useHashTable("o");
		um.useHashTable("AB");
		um.useHashTable("C");
		System.out.println("---------------HashMap ���-----------------");
		um.useHashMap("���ü���");
		um.useHashMap("��������");
		um.useHashMap("��������");
		um.useHashMap("���źҸ�");
		um.useHashMap("�������");
	}//main

}//class
