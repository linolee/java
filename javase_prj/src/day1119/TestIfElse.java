package day1119;

/**
 * if~else : 둘 중 하나의 코드를 실행해야할 때 사용<br>
 * 문법) if(조건식){<br>
 * 조건에 맞을 때 수행할 문장들;<br>
 * }else{<br>
 * 조건에 맞지 않을 때 수행할 문장들<br>
 * }<br>
 * 
 * @author owner
 */
public class TestIfElse {

	public static void main(String[] args) {
		// 변수가 음수, 양수인지 판단
		// 변수가 홀수, 짝수인지 판단

		int i = -18;
		System.out.print(i + "는 ");
		if (i < 0) {
			System.out.print("음수");
		} else {
			System.out.print("양수");
		} // end if
			// 수행하는 행이 한행이라면 {} 생략 가능
		System.out.print("인 ");
		if (i % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		
		//입력하는 수가 3의 배수라면 "짝"을 출력하고 그렇지 않다면 입력한 수를 출력
		int sam = 27;//3의 배수인지 확인할 수를 변수로 지정
		if(sam%3 == 0) {//3의 배수인가
			System.out.println("짝");//배수라면 "짝" 출력
		}else {
			System.out.println(sam);//아니라면 변수를 그대로 출력
		}//end if
		

	}// main

}// class
