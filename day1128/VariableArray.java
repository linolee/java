package day1128;

/**
 * 행마다 열의 갯수가 다른 가변배열
 * 
 * @author owner
 */
public class VariableArray {
	public VariableArray() {
		// 1.선언) 데이터형[][] 배열명 = null;
		int[][] arr = null;
		// 2.생성) 행의 갯수만 설정 // 배열명 = new 데이터형[행의 수][]
		arr = new int[4][];
		// 3.행마다 열 생성) 배열명[행 번호] = new 데이터형[열의 수]
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[1];
		// 초기화를 하려면 열의 갯수는 설정 x
		arr[3] = new int[] { 1, 2, 3, 4, 5, 6 };
		// 4.값할당
		arr[0][2] = 10;
		arr[1][3] = 20;
		arr[2][0] = 30;
		// 5.값 사용
		System.out.println(arr[0][0] + "/" + arr[0][1] + "/" + arr[0][2]);
		// 모든 방의 값 출력 : 일괄처리
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%-5d", i, j, arr[i][j]);
			} // end inner for
			System.out.println();
		} // end outer for
	}// VariableArray

	/**
	 * 가변 배열의 기본형 형식 사용
	 */
	public void priType() {
		System.out.println("======================================================");
		// 문법)데이터형[][] 배열명 = {{값,값},{값,값,값,값},{값},{값,값,,,,,,,,},,,,};
		String[][] arr = { { "딸기" }, { "포도", "참외", "수박", "복숭아" }, { "사과", "배", "감" }, { "뀰" } };
		String[] title = { "봄","여름","가을","겨울"};
		for(int i = 0; i<arr.length;i++) {
			System.out.print(title[i]+" : ");
			for (int j = 0; j<arr[i].length;j++) {
				System.out.printf(arr[i][j]+"\t");
			}//end inner for
			System.out.println();
		}//end outer for
	}// priType

	public static void main(String[] args) {
		new VariableArray().priType();
	}// main

}// class
