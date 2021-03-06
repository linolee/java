package day1115;
/*
쉬프트 연산자
<<	(left shift)	비트를 왼쪽으로 밀고 밀어서 빈칸을 0으로 채운다
>>	(right shift)	비트를 오른쪽으로 밀고 밀어서 빈칸을 최상위비트와 같은 숫자로 채운다
>>>	(unsigned right shift)	비트를 오른쪽으로 밀고 밀어서 빈칸을 0으로 채운다
*/
//method : static method 사용
//클래스명.method명(값)

class Operator3{
	public static void main(String[] args) {
		int i = 11;
		System.out.println(Integer.toBinaryString(i));//1011
		System.out.println(Integer.toOctalString(i));//013		
		System.out.println(Integer.toHexString(i));//0xb	
		
		i = 9; // 1001   ->  1001000  -> 64+8 = 72
		System.out.println(i+"<<3 = " + (i<<3));
		i = 36;// 100100 ->  100 = 4
		System.out.println(i+">>3 = " + (i>>3));
		i= 120;// 1111000 ->   111 = 1+2+4 = 7
		System.out.println(i+">>>4 = " + (i>>>4));
		i = 1;
		System.out.println(i<<31);//최상위 부호비트 변경
		i = -1;
		System.out.println(i >>100);//최상위 부호비트 유지
		System.out.println(i >>> 1);
	}//main
}//class
