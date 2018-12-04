package day1114;
/*
	Constant (변수를 상수처럼 사용하는 것) 의 사용
*/

class Constant{
	//Constant 선언
	public static int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;
	public static void main(String[] args) {
		System.out.println(MAX_SCORE + " / " + MIN_SCORE);
		System.out.println(Constant.MAX_SCORE + " / " + Constant.MIN_SCORE);
		int MyScore = 80;
		//MAX_SCORE = 99; // 상수에는 값할당 X
		System.out.println("점수의 최고점은 "+MAX_SCORE+"이고 최저점은 " +MIN_SCORE+ "입니다. 획득점수는 "+MyScore+"이고, 최고점과 획득점수의 차이는 "+(MAX_SCORE-MyScore)+"입니다.");
		
	}//main
}//class
