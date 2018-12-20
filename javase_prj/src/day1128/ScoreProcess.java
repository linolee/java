package day1128;

/**
 * 4강의장 학생들의 성적 처리
 * 
 * @author owner
 */
public class ScoreProcess {
	public ScoreProcess() {
		String[] nameArr = { "이재찬", "정택성", "이재현", "김건우", "공선의" };
		int[] scoreArr = { 89, 76, 99, 64, 50 };

		System.out.println("번호\t이름\t점수");
		System.out.println("===========================");

		int totalScore = 0; // 총점을 누적 합
		int maxScore = 0;// 최고점 저장 변수
		int minScore = 101;
		for (int i = 0; i < nameArr.length; i++) {
			System.out.printf("%d\t%s\t%d\n", i + 1, nameArr[i], scoreArr[i]);
			totalScore = totalScore + scoreArr[i];
			if (scoreArr[i] > maxScore) {
				maxScore = scoreArr[i];
			}
			if (scoreArr[i] < minScore) {
				minScore = scoreArr[i];
			}
		} // end for
		System.out.println("===========================");
		System.out.println("응시인원 : " + nameArr.length + "명");
		System.out.printf("총점 [%5d] 평균 [%5.2f] \n", totalScore, (double) totalScore / nameArr.length);
		System.out.printf("최고점 [%3d] 최저점 [%3d] \n", maxScore, minScore);

		for (int i = 0; i < scoreArr.length - 1; i++) {
			for (int j = i + 1; j < scoreArr.length; j++) {
				if (scoreArr[i] < scoreArr[j]) {
					int temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				} // end if
			} // end inner for
		} // end outer for //bubble sort

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%-4d", scoreArr[i]);
		} // bubble sort 출력

	}// ScoreProcess

	public static void main(String[] args) {
		new ScoreProcess();
		System.out.println("=============================");
		int birth = 1991;
		String[] zodiac = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		System.out.println(zodiac[birth%12]);
	}// main

}// class
