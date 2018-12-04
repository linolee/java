package day1129;

/**
 * 3차원 행렬 (면, 행, 열)
 * 
 * @author owner
 */
public class UseArray3 {
	public UseArray3() {
		// 3차원 배열 참조형 방식 사용
		// 1.선언 : 데이터형[][][] 배열명 = null; 데이터형 배열명[][][] = null;
		int[][][] arr = null;
		// 2.생성 : 배열명 = new 데이터형[면의 수][행의 수][열의 수]
		arr = new int[2][3][4];
		// 1+2. 데이터형[][][]배열명 = new 데이터형[면][행][열];
		int[][][] arr1 = new int[3][4][5];
		// 3.값할당 : 배열명[면][행][열] = 값;
		arr[0][0][0] = 10;
		arr[1][2][3] = 1000;
		// 4.값사용 : 배열명[면][행][열];
		System.out.println(arr[0][0][0] + "/" + arr[0][0][1] + "/" + arr[0][0][2]);
		System.out.println("면의 수 : " + arr.length + ", 행의 수 : " + arr[0].length + ", 열의 수 : " + arr[0][0].length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("==========================");
			System.out.printf("%d면\n", i);

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d행\n", j);
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("%d\t", arr[i][j][k]);
				}
				System.out.println("\n-------------------------");
			}
			System.out.println("==========================");
		}
		System.out.println("구우우우우우우부우웅우우우우우운서어어어엉어어어어어어언");
		for (int[][] temparr0 : arr1) {
			for (int[] temparr1 : temparr0) {
				for (int temparr2 : temparr1) {
					System.out.printf("%d\t", temparr2);
				}
				System.out.println();
			}
			System.out.println();
		}
	}// UseArray3

	public void priType() {
		// 기본형 형식으로 3차원 배열선언
		// 데이터형[][][]배열명 =
		// {{{값,,}{,,,},,,,,,,,}{값,,}{,,,},,,,,,,,}{값,,}{,,,},,,,,,,,},,,,,,,,}
		int[][][] arr = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 7, 8 }, { 9, 10 }, { 11, 12 } } };
		System.out.println(arr.length + "/" + arr[0].length + "/" + arr[0][0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("%d\t",arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}// priType
	
	
	public static void main(String[] args) {
		new UseArray3().priType();
		
	}// main

}// class
