package day1114;

/*
2. 기본형 데이터형에 대응되는 클래스를 Wrapper Class라고 한다. 
   Java Document에서 Wrapper클래스의 상수가 존재하는지 찾아보고 
   그에 대한 최소값과 최대값을 출력 한다. 
 
   출력 :  byte의 최소값 :  -128  최대값 : 127 
*/
class HW2{
	public static void main(String[] args) {


		System.out.println("byte의 최소값 :  "+Byte.MIN_VALUE+"  최대값 : "+Byte.MAX_VALUE);
		System.out.println(Math.sin(Math.PI));
		System.out.println(Math.E);

		int deci = 15;
		int octal = 017;
		int hex = 0xf;
		long tel = 1111111;
		System.out.println(deci+octal+hex);
		System.out.println(octal);
		System.out.println(hex);
		System.out.println(tel);
	}
}
