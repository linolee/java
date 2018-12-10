package day1207;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map : KVP로 되어있는 자료구조, 키를 사용하여 값을 얻는 일. 
 * 
 * @author owner
 */
public class UseMap {

	public UseMap() {
		//JDK1.5이하인 경우 Generic을 사용할 수 없고, 객체만 저장 가능.
		
		//1.생성
		Map<String,String> map = new HashMap<String,String>();
		//2.값할당 - 키는 유일, 값은 중복가능, 입력되는 순서대로 값이 추가되지 않는다.
		map.put("Oracle", "대용량 데이터베이스");
		map.put("Java", "프로그래밍 언어");
		map.put("Python", "프로그래밍 언어");//값은 중복 가능
		map.put("Java", "완벽한 객체지향 언어");//키가 존재한다면 해당 키에 덮어 씀.
		map.put("HTML", "Markup Language");
		
		System.out.println(map.size()+" / "+map);
		//3.값얻기 - 키를 사용하여 값을 얻는다
		String val = map.get("html");//해당하는 key가 없으면 null출력
		System.out.println(val);
		
		//4.키가 존재하는지
		String key = "Java";
		boolean flag = map.containsKey(key);
		System.out.println(key+" 키 존재 "+flag);
		
		//5.값 삭제
		map.remove("Java");
		System.out.println("삭제 후 : "+map);
		
		//6.모든 키 얻기
		Set<String> allkeys = map.keySet();
		System.out.println("맵이 가진 모든 키 : "+allkeys);
		
		//7.모든 값 얻기
		Iterator<String> ita = allkeys.iterator();
		String value = "";
		while(ita.hasNext()) {//키가 존재한다면
			value = map.get(ita.next());//얻어낸 키를 가지고 Map의 값을 얻는다.
			System.out.println(value);
		}
		
		//8.삭제
		map.clear();
		System.out.println("모두 삭제 : "+map.size()+" / "+map);
		
		
		
	}
	
	/**
	 * 기본생성자를 사용하면 11개의 행이 자동 생성
	 * MultiThread에서 동시접근 불가능
	 * 데이터가 전체 행의 갯수의 약 75%채워졌을 때 가장 빠른 검색을 한다
	 */
	public void useHashTable(String key) {
		//1.생성
		Map<String, String> bloodMap = new Hashtable<String,String>(100);
		//2.값할당
		bloodMap.put("A", "세심하다 친절하다");
		bloodMap.put("B", "성질 드럽다");
		bloodMap.put("AB", "싸이코");
		bloodMap.put("O", "우유부단");
		bloodMap.put("A", "소심하다");
		
		key = key.toUpperCase();
		String value = bloodMap.get(key);
		if(!bloodMap.containsKey(key)) {
			System.out.println(key+"혈액형은 사람의 것이 아닙니다");
		}else {
			System.out.println(key+"의 특징 : "+value);
		}
		
	
	}
	/**
	 * 기본생성자를 사용하면 16개의 행이 자동 생성
	 * MultiThread에서 동시접근 가능
	 * 데이터가 전체 행의 갯수의 약 75%채워졌을 때 가장 빠른 검색을 한다
	 */
	public void useHashMap(String key) {
		//1.생성
		Map<String, String> map = new HashMap<String, String>();
		//2.값할당
		map.put("결초보은", "자이라E");
		map.put("역지사지", "초동역학 위치전환기");
		map.put("무념무상", "티모충");
		map.put("내로남불", "내가하면 로맨스 너가하면 불륜");
		map.put("이부망천", "서울살다 이혼하면 부천가고 망하면 인천간다");
		map.put("낄끼빠빠", "낄 때 끼고 빠질 때 빠지자");
		map.put("순망치한", "입술이 없으면 징그럽다");
		map.put("정택성씨", "구로구의 자랑");
		map.put("배고프다", "지금 내 상태");
		//3.값얻기
		if(map.containsKey(key)) {
			String value = map.get(key);//값 얻기
			System.out.println(key+"의 뜻 : "+value);
		}else {
			System.out.println(key+"사자성어는 준비되지 않았습니다.");
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("---------------Hashtable 사용-----------------");
		um.useHashTable("A");
		um.useHashTable("o");
		um.useHashTable("AB");
		um.useHashTable("C");
		System.out.println("---------------HashMap 사용-----------------");
		um.useHashMap("정택성씨");
		um.useHashMap("낄끼빠빠");
		um.useHashMap("역지사지");
		um.useHashMap("오매불망");
		um.useHashMap("배고프다");
	}//main

}//class
