package day1206;

import java.util.ArrayList;
import java.util.List;

/**
 * List:<br>
 * 중복값을 허용하며 검색의 기능이 있고, 순서대로 값을 입력하는 가변길이형
 * 
 * @author owner
 */
public class UseList {

	public UseList() {
//		List list = new ArrayList();
//		list.add(new Integer(10));
//		list.add(new Short((short)10));
//		list.add("공선의");
//		
//		System.out.println(list.size());
//		System.out.println(((Integer)list.get(0)).intValue()+10);
//	}
		// JDK1.5+에서 사용 : Generic, auto boxing, unboxing
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(new Integer(30));
//		list.add("김건하");//Generic으로 설정된 형이 아닌 데이터형을 추가할 수 없다.
		System.out.println(list.size());
		System.out.println(list.get(0)+10);
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i)+1);
		}

	}

	/**
	 * ArrayList 사용 : Multi Thread 환경에서 동시 접근 가능.(동기화x)
	 */
	public void useArrayList() {
		//생성
		ArrayList<String> al = new ArrayList<>();
		List<String> al1 = new ArrayList<String>();
		System.out.println(al+" / "+al1);
		//값추가
		al.add("이재현");
		al.add("정택성");
		al.add("김정윤");
		al.add("김정윤");//중복값 저장 가능
		al.add("김정윤");//중복값 저장 가능
		al.add("김정윤");//중복값 저장 가능
		al.add("공선의");
		
		//배열에 복사
		String[] names = new String[al.size()];
		al.toArray(names);
		
		//방의 값 삭제 :
		//인덱스로 삭제 :
		al.remove(4);
		System.out.println(al.size()+" / "+al);
		
	
		System.out.println(al+" / "+al1);
		System.out.println("al 크기 : "+al.size()+"/ al1 크기 : "+al1.size());
		//값으로 삭제
		al.remove("김정윤");
		System.out.println(al.size()+" / "+al);
		
		for (String name : al) {
			System.out.println(name);
		}
		//모든 방의 값 삭제
		al.clear();
		System.out.println("al 크기 : "+al.size()+"/ al1 크기 : "+al1.size());
		
		//배열의 값
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s\t",names[i]);
		}
		
	}

	public void useVector() {
		//생성
		ArrayList<String> vec = new ArrayList<>();
		List<String> vec1 = new ArrayList<String>();
		System.out.println(vec+" / "+vec1);
		//값추가
		vec.add("이재현");
		vec.add("정택성");
		vec.add("김정윤");
		vec.add("김정윤");//중복값 저장 가능
		vec.add("김정윤");//중복값 저장 가능
		vec.add("김정윤");//중복값 저장 가능
		vec.add("공선의");
		
		//배열에 복사
		String[] names = new String[vec.size()];
		vec.toArray(names);
		
		//방의 값 삭제 :
		//인덱스로 삭제 :
		vec.remove(4);
		System.out.println(vec.size()+" / "+vec);
		
	
		System.out.println(vec+" / "+vec1);
		System.out.println("vec 크기 : "+vec.size()+"/ vec1 크기 : "+vec1.size());
		//값으로 삭제
		vec.remove("김정윤");
		System.out.println(vec.size()+" / "+vec);
		
		for (String name : vec) {
			System.out.println(name);
		}
		//모든 방의 값 삭제
		vec.clear();
		System.out.println("vec 크기 : "+vec.size()+"/ vec1 크기 : "+vec1.size());
		
		//배열의 값
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s\t",names[i]);
		}
		
	}

	public void useLinkedList() {
		//생성
		ArrayList<String> ll = new ArrayList<>();
		List<String> ll1 = new ArrayList<String>();
		System.out.println(ll+" / "+ll1);
		//값추가
		ll.add("이재현");
		ll.add("정택성");
		ll.add("김정윤");
		ll.add("김정윤");//중복값 저장 가능
		ll.add("김정윤");//중복값 저장 가능
		ll.add("김정윤");//중복값 저장 가능
		ll.add("공선의");
		
		//배열에 복사
		String[] names = new String[ll.size()];
		ll.toArray(names);
		
		//방의 값 삭제 :
		//인덱스로 삭제 :
		ll.remove(4);
		System.out.println(ll.size()+" / "+ll);
		
	
		System.out.println(ll+" / "+ll1);
		System.out.println("ll 크기 : "+ll.size()+"/ ll1 크기 : "+ll1.size());
		//값으로 삭제
		ll.remove("김정윤");
		System.out.println(ll.size()+" / "+ll);
		
		for (String name : ll) {
			System.out.println(name);
		}
		//모든 방의 값 삭제
		ll.clear();
		System.out.println("ll 크기 : "+ll.size()+"/ ll1 크기 : "+ll1.size());
		
		//배열의 값
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
