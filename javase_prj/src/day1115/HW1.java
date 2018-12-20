package day1115;
/*
숙제
1. 변수에 할당된 값이 양수일때만 2진수로 출력하고 음수라면 ~를 사용하여
    양수로 변경하고 입력된 그대로의 10진수로 출력.
    출력 예)  "양수 인경우"  10 은(는)  1010
                 "음수 인경우"  -10 은(는) 10


*/
   
class  HW1{
	public static void main(String[] args) {
		int i = 111;
		System.out.println(i+"은(는) "+(i > 0  ? Integer.toBinaryString(i) : ~i+1));
	}
}
