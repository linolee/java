package day1115;
/*

*/

class Operator7 {
	public static void main(String[] args) {
		int i = 3;// 대입
		// 산술대입
		i += 2; // i = i+2 //5
		i -= 1; // i = i-1 //4
		i *= 2; // i = i*2 //8
		i /= 3; // i = i/3 //2; 정수/정수=정수
		i %= 3; // i = i%3 //2;

		// 쉬프트대입
		i <<= 4; // i= i << 4; //0000 0010 << 4 = 0010 0000 = 32;
		i >>= 1; // i= i >> 1; //0010 0000 >> 1 = 0001 0000 = 16
//		System.out.println(i);//bug목적 method 개발시 확인하고 출시할 때는 지워야한다
		// 실행 중인 코드에 출력코드가 존재하면 속도가 느려진다.
		i >>>= 2; // i= i >>>2; //0001 0000 >>>4 = 0000 0100 = 4

		// 비트 논리 대입
		i &= 12; // i = i & 12 // 0000 0100 & 0000 1100 = 0000 0100 = 4;
		i |= 11; // i = i | 11 // 0000 0100 | 0000 1011 = 0000 1111 = 15;
		i ^= 5; // i = i ^5; // 1111^0101 = 1010 = 10;
		System.out.println(i);
		System.out.println("김말이" == (String) "떡볶이");
	}
}
