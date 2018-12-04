package day1115;
/*
3. ||를 사용했을 때 전항이 true라면 후항을 연산하지 않는 것을 증명할 수 있는
     코드를 작성하세요.
*/
class HW3{
	public static void main(String[] args) {
		int a = 0, b= 0;
		boolean c;
		c = (a == 0 || ++b == 1);

		// a가 0일 때(참)는 b 값이 0으로 출력되지만
		// a가 1일 때(거짓)는 b 값이 1로 출력됨
	
		
		System.out.println(c);
		System.out.println(b);
	}
}
