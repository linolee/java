package day1127;

/**
 * 문자열 저장소의 주소를 저장하고, 문자열을 다루는 기능을 제공하는 String class의 사용<br>
 * java에서 제공하는 클래스의 이름과 내가 만든 클래스의 이름이 같다면 내가 만든 클래스를 먼저 사용하게 된다.<br>
 * java에서 제공하는 클래스를 사용할 때 마다 "full path : 패키지명을 모두 기술하여 클래스를 사용하는것"로 사용해야
 * 한다.<br>
 * 
 * @author owner
 */
public class UseString {

	public static void main(java.lang.String[] args) {
		// 기본형 형식 사용. String s="문자열";
		String str = "AbcdEfg";
		// 참조형 형식 사용 String s = new String("문자열");
		String mail = new String("linolee@naver.com");

		System.out.println(str + "의 길이 " + str.length());
		System.out.println(mail + "의 길이 " + mail.length());

		System.out.println(str + "을 모두 대문자로 : " + str.toUpperCase());
		System.out.println(str + "을 모두 소문자로 : " + str.toLowerCase());

		System.out.println(str + "에서 'd'의 인덱스 : " + str.indexOf("d"));
		System.out.println(str + "에서 'z'의 인덱스 : " + str.indexOf("z"));
		System.out.println(mail + "에서 \"@\"의 인덱스 : " + mail.indexOf("@"));
		
		str = "AbcdEfAg";
		
		System.out.println(str+ "에서 가장 마지막 A의 인덱스 : "+str.lastIndexOf("A"));
		
		System.out.println(str+"에서 인덱스 2에 해당하는 문자 : "+str.charAt(2));
//		System.out.println(str+"에서 인덱스 2에 해당하는 문자 : "+str.charAt(200));//index의 값을 초과하므로 Error
		
		System.out.println(mail+"에서 아이디 : "+ mail.substring(0, mail.indexOf("@")));
		System.out.println(mail+"에서 도메인 : "+ mail.substring(mail.indexOf("@")+1));
		
		str = "   A BC   ";
		System.out.println(str+"에서 앞뒤 공백 제거 : ["+ str.trim()+"]");
		
		str = "Abcd";
		String str1 = str.concat("Efg");
		System.out.println(str+"+"+"Efg = "+str1);
		
		str = "이재찬";
		System.out.println(str + "은(는)" +(str.equals("이재찬")?"반장":"평민"));
		str = "정택성";
		System.out.println(str + "은(는)" +(str.equals("이재찬")?"반장":"평민"));
		
		str = "피씨방";
		if (str.startsWith("씨방")) {
			System.out.println("욕은 사용하실 수 없습니다.");
		}else {
			System.out.println(str);
		}//end if
				
		str = "서울시 강남구";
		
		if (str.startsWith("서울시")) {
			System.out.println("서울 촌놈");
		}else {
			System.out.println("촌놈");
		}//end if
		
		str = "포항시 흥해읍";
		
		if (str.startsWith("서울시")) {
			System.out.println("서울 촌놈");
		}else {
			System.out.println("촌놈");
		}//end if
		
		if (str.endsWith("읍")) {
			System.out.println("촌촌촌놈");
		}else if(str.endsWith("동")){
			System.out.println("촌놈");
		}else if(str.endsWith("구")){
			System.out.println("덜촌놈");
		}//end if
		
		str="나 지금 피씨방인데 넌 어디니 씨 방새야!";
		
//		System.out.println(str.replaceAll("씨방", "**"));
		System.out.println(str.replaceAll("씨", "*").replaceAll("방", "*"));//method chain
		
		str = "  A BC  ";
		System.out.println(str.replaceAll(" ", ""));
		
		int i = 27;
		str = String.valueOf(i);
		System.out.println(str+3);
		double d = 12.27;
		str = d+"";
		System.out.println(str+3);
		str = "";
		System.out.println(str.isEmpty());
		
		//객체 생성을 하지 않았을 때 그 클래스가 제공하는 method를 사용할 수 없다.//error
//		str=null;
//		System.out.println(str.isEmpty());
		
		////////////////////11-28-2018 split 사용코드 추가/////////////////////////
		//split은 한번에 하나의 문자로 구분하여 자른다.
		String data = "이재찬,이재현,정택성~공선의~김건하.최지우,노진경,김정운.김정윤";
		String[] arr = data.split("[.]");//.은 그냥 쓰면 구분되지 않고 []묶어서 쓴다.
		System.out.println("구분된 배열 방의 갯수 : "+ arr.length);
		for (String name : arr) {
			System.out.println(name);
		}
		

		
		
	}// main

}// class
