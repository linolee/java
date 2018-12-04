package day1115;
/*
2. 2147483647의 값에서 상위 2byte와 하위 2byte 값을 분리하여 출력해보세요. 
    출력 예) 상위 2byte -> 32767
                하위 2byte -> 65535

*/
class HW2{
	public static void main(String[] args) {
		int i = 2147483647 , temp1 = 0, temp2 = 0;
		temp1 = i >>> 16;
		System.out.println(i+"의 상위 2byte는 "+temp1);

		temp2 = i << 16;
		temp2 >>>= 16;

//		temp2 = i & 0x0000ffff;

		System.out.println(i+"의 하위 2byte는 "+temp2);		
		
	}
}
