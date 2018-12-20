package day1114;
/*
기본형 데이터형
	정수 : byte, short, int, long
	문자 : char
	실수 float, double
	불린	boolean
*/

class PrimitiveDataType{
	public static void main(String[] args) {
		//정수형
		byte a = -10;
		short b = 20;
		int c = 30; //값이 4byte 이내이므로 literal 변환 필요 x
		long d = 2147483648L; // literal에 저장이 안되므로 literal의 크기를 변경 형명시
		
		System.out.println("byte : "+a+", short : "+b+", int : "+c+", long : "+d);

		//문자형 : unicode 값 : \u0000
		//char f = 'A'; //할당 unicode
		char f = 66; //unicode를 직접 입력도 가능
		char g = '0';
		char h = '가';
		//출력 : unicode에 대한 문자열 출력
		System.out.println("char : "+f+","+g+","+h);
		//실수
		float i = 6.14f;//형명시 - 실수 literal은 8byte고 float 데이터형은 4byte이므로 값할딩이 되지 않는다.
		double j = 3.14;//literal과 데이터형이 같으므로 형명시 생략 가능
		double k = 3.14d;
		System.out.println("float : "+i+" double : "+j+", "+k);
		//boolean
		boolean l = true;
		boolean m = false;
		System.out.println("boolean : "+l+", "+m);

		byte b1 = 10, b2 = 20;
		int result =0 ;
		result = b1*b2;
		System.out.println(result);




	}//main
}//class
