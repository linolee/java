package day1114;
class UseCasting{
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;//자동형변환
		byte result = (byte)(b1+b2);//연산의 결과가 int로 자동형변환
		System.out.println(b1+'+'+b2+'='+result);
		//연산의 결과가 int로 자동형변환 되는 것을 byte로 강제형변환
		double d = 11.14;
		float f = (float)d;
		System.out.println("double : "+d+", float : "+f);
		float f1 = (float)2018.11;
		System.out.println("float : "+f1);
		//long l = (long)2147483648;  //상수 값이 literal보다 크다면 casting을 실행하기 전에 erorr
		int i = (int)f1;//값손실 발생(실수부 값이 모두 사라져 할당)
		System.out.println("int : "+i+", float : "+f1);

		char c = 'A';
		System.out.println(c+"의 unicode(ASCII code)값 = "+(int)c);
		//기본형 <-> 참조형은 강제형변환이 되지 않는다
//		String s = "11";
//		int i = (int)s;
		//boolean형은 boolean형 끼리만 변환 가능
		boolean b = true;
//		i = (int)b; //erorr
		if (b == true) {
			System.out.println("b는 트루");
		}
	}//main
}//class
