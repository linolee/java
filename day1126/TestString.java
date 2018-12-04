package day1126;

/**
 * 문자열에 대한 비교
 * 
 * @author owner
 */
public class TestString {

	public static void main(String[] args) {

		String str = "ABC";//기본형
		String str1 = new String("ABC");//참조형

		System.out.println("기본형 ==");
		System.out.println(str == "ABC");		//기본형 형식으로 선언한 문자열은 문자열 저장소의 주소를 저장하기 때문에 == 비교로 같은지에 대한 비교 수행 할 수 있다.
		System.out.println("참조형 ==");
		System.out.println(str1 == "ABC");	//참조형 형식으로 선언한 문자열은 instance 저장소의 주소를 저장하기 때문에 ==비교로 같은지에 대한 비교 수행을 할 수 없다.
		System.out.println("참조형 equals");
		System.out.println(str1.equals("ABC"));	//참조형 형식으로 선언한 문자열을 같은지에 대해 비교수행 하기 위해서는 equals method를 사용하면 된다.
		System.out.println("기본형 equals");
		System.out.println(str.equals("ABC"));	//당연히 기본형 형식에 equals method를 수행해도 된다.
	}// main

}// class
