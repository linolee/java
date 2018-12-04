package day1128;

/**
 * 학생의 Oracle, Java, JDBC과목 점수를 처리하는 프로그램
 * 
 * @author owner
 */

public class ScoreProcess2 {
	private int total;
	public ScoreProcess2() {
		total = 0;
	}//ScoreProcess2
	
	/**
	 * 토탈을 누적합
	 * @param score
	 */
	public void addTotal(int score) {
		total += score;
	}//addTotal
	/**
	 * 점수를 얻음
	 * @return
	 */
	public int getTotal() {
		return total;
	}//getTotal
	/**
	 *초기화 
	 */
	public void resetTotal() {
		total = 0;
	}//resetTotal
	
	//입력받은 array의  행길이만큼 인덱스를 갖는 array 생성 method
	public int[] studentScore(String[] name) {
		int[] stuScore = new int[name.length];
		return stuScore;
	}
	//입력받은 array의  열길이만큼 인덱스를 갖는 array 생성 method
	public int[] subScore(int[][] score) {
		int[] subScore = new int[score[0].length];
		return subScore;
	}
	

	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String[] namesData() {
		String[] name = { "김정운", "이재현", "정택성", "노진경", "최지우", "김건하" };
		return name;
	}// nameData

	public int[][] scoreData() {
		int[][] score = { { 85, 86, 81 }, { 95, 91, 100 }, { 89, 71, 59 }, { 97, 96, 91 }, { 78, 74, 77 },
				{ 100, 95, 68 } };
		return score;
	}// scoreData
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	public void PrintScore(String[] name, int[][] score) {
		System.out.println("번호\t이름\tOracle\tJava\tJDBC\t총점");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < name.length; i++) {// 행
			System.out.printf("%d\t%s\t", i + 1, name[i]);
			for (int j = 0; j < score[i].length; j++) {// 열
				System.out.printf("%d\t", score[i][j]);
				addTotal(score[i][j]);
			} // end inner for
			System.out.println(getTotal());
			resetTotal();
		} // end outer for
		
		System.out.println("--------------------------------------------");
		//1. 각 학생 평균 (소수 두자리까지)
		//총점을 초기화
		resetTotal();
		//학생수만큼 길이를 갖는 array stuScore생성
		int[] stuScore=studentScore(name);
		
		//학생별 점수를 합산하여 어레이에 저장
		for (int i = 0; i<name.length; i++) {
			for (int j = 0; j<name[i].length(); j++) {
				addTotal(score[i][j]);
			}
			stuScore[i]=getTotal();//name 길이의 array에 점수를 입력
			resetTotal();
		}//stuScore에 학생별 총점을 입력
		for (int i = 0; i<stuScore.length; i++) {
			System.out.printf("%.2f\t",(double)stuScore[i]/
					score[i].length);
		}//총점에 과목수를 나누어 출력
		System.out.println();
		
		
		
		
		System.out.printf("--------------------------------------------\n");
		//2. 각 과목당 총점과 총점의 총점
		
		//과목수만큼 길이를 갖는 array subScore 생성
		int[] subScore=subScore(score);
		//각 과목당 총점
		for (int i = 0; i<score[0].length;i++) {
			
			for (int j = 0; j<score.length;j++) {
				addTotal(score[j][i]);
			}
			subScore[i] = getTotal();
			resetTotal();
		}
		for (int i = 0; i<subScore.length; i++) {
			System.out.println(subScore[i]);
		}
		//총점의 총점
		for (int i = 0; i<subScore.length; i++) {
			addTotal(subScore[i]);
		}
		System.out.println(getTotal());
		resetTotal();
		
		
		System.out.printf("--------------------------------------------\n");
		//3. 각 과목당 평균과 전체 평균 (소수 두자리까지)
		for (int i = 0; i<subScore.length; i++) {
			System.out.printf("%.2f\t",subScore[i]/(double)name.length);
		}
		System.out.println();
		
		for (int i = 0; i<subScore.length; i++) {
			addTotal(subScore[i]);
		}
		System.out.printf("%.2f\t",getTotal()/(double)(score.length*score[0].length));
		resetTotal();
		System.out.println();
		
		System.out.printf("--------------------------------------------\n");
		//4. 각 과목당 최고점수 출력
		//각 과목당 총점
		int[] maxScore=subScore(score);//꼭 필요한지는 모르겠다
		//과목수만큼 길이를 갖는 array maxScore 생성
		int max = 0;
		for (int i = 0; i<score[0].length;i++) {
			
			for (int j = 0; j<score.length;j++) {
				if(max<score[j][i]) {
					max = score[j][i];
				}
			}
			maxScore[i] = max;
			max = 0;
		}
		for (int i = 0; i<maxScore.length; i++) {
			System.out.println(maxScore[i]);
		}
		
		
		System.out.printf("최고점수 자바[] 오라클[] JDBC[]\n");
		//5. 일등 학생의 이름과 총점, 번호
		String temp = "";
		int tempi = 0;
		for (int i = 0; i<stuScore.length; i++) {
			if (tempi < stuScore[i]) {
				temp = name[i];
				tempi = stuScore[i];
			}
			
		}
		System.out.println(temp);
		System.out.println(tempi);
		
		
		
		
		System.out.printf("Top 번호[] 이름[] 총점[]\n");
		//6. 자바점수만 오름차준 정렬하여 출력.
		System.out.printf("--------------------------------------------\n");

		//학생수만큼 길이를 갖는 array stuScore생성
		int[] javaScore=studentScore(name);
		
		for (int i = 0; i < javaScore.length; i++) {
			javaScore[i]=score[i][2];
		}
		
		for (int i = 0; i < javaScore.length - 1; i++) {
			for (int j = i + 1; j < javaScore.length; j++) {
				if (javaScore[i] > javaScore[j]) {
					int temp11 = javaScore[i];
					javaScore[i] = javaScore[j];
					javaScore[j] = temp11;
				} // end if
			} // end inner for
		} // end outer for //bubble sort
	
		
		for (int i = 0; i < javaScore.length; i++) {
			System.out.println(javaScore[i]);
		}
		 
		
	}// PrintScore
	//숙제 2.
/*	2차원 배열을 참조형 형식으로 만들고 아래와 같이 값을 넣어 출력하는 method 작성
		1  1  1  1  1  1  1  1  1
		1  0  0  0  0  0  0  0  1
		1  0  0  0  0  0  0  0  1
		1  0  0  0  0  0  0  0  1
		1  0  0  0  0  0  0  0  1
		1  1  1  1  1  1  1  1  1*/
	
	
	
	
	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		// 처리할 데이터 받기
		String[] name = sp2.namesData();
		int[][] score = sp2.scoreData();
		// 처리
		sp2.PrintScore(name, score);
		
		
		int[][] hw = null; 
		hw = new int[6][9];
		for(int i = 0; i < hw.length; i++) {
			for (int j = 0; j<hw[i].length; j++) {
				if (i == 0 || i == 5 || j == 0 || j == 8) {
					hw[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < hw.length; i++) {
			for (int j = 0; j<hw[i].length; j++) {
				System.out.printf("%d\t",hw[i][j]); 
			}
			System.out.println();
		}
		
	}// main

}// class
