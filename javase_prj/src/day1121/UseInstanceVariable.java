package day1121;

/**
 * instance(member)변수<br>
 * 객체가 생성될 때 메모리(heap)에 할당되고 그 주소를 저장한 변수(객체. intance, object)를 사용하여 접근하는 변수.<br>
 * 자동초기화가 된다.  
 * 
 * @author owner
 */
public class UseInstanceVariable {

	int i; //정수형 초기화값 0
	int j;
	double d;//실수형 초기화값 0.0
	char c;// 문자형 초기화값 \u0000
	boolean b; //불형 초기화값 false
	String str;//참조형 초기화값 null
	UseInstanceVariable jeahyun;
	
	
	public static void main(String[] args) {
		//static 영역은 가장 먼저 메모리에 로드되므로, instance 변수를 직접 사용할 수 없다.
		 
//		i = 300;
		//객체화를 하면 객체가 메모리(heap)에 생성되고 그 주소를 메모리(stack)에 할당
		//객체화 문법 : 클래스명 객체명 = new 클래스명();
		UseInstanceVariable uiv = new UseInstanceVariable();
		UseInstanceVariable uiv1 = new UseInstanceVariable();
		System.out.println("객체 출력 (heap 주소) "+uiv);
		System.out.println("객체 출력 (heap 주소) "+uiv1);
		
		//heap에 생성된 instance variable을 사용
		uiv.i = 11;
		uiv.j = 21;
		System.out.println("uiv객체의 멤버변수 i = "+uiv.i);
		System.out.println("uiv객체의 instance 변수 j = "+uiv.j);
		
		//instance(member) 변수는 자동 초기화된다.
		System.out.println("uiv객체 i : "+uiv1.i+", uiv1 객체 j :"+ uiv1.j);
		System.out.println("===============자동초기화값================");
		System.out.println("정수형 : "+uiv1.i);
		System.out.println("실수형 : "+uiv1.d);
		System.out.println("문자형 : "+uiv1.c);
		System.out.println("불린형 : "+uiv1.b);
		System.out.println("참조형1 : "+uiv1.str);
		System.out.println("참조형2 : "+uiv1.jeahyun);
		
		
		
	}//main

}//class
