package day1128;

/**
 * 행과 열로 구성된 이차원 배열
 * 
 * @author owner
 */
public class UseArray2 {
	/**
	 * 참조형 형식으로 2차원 배열 사용
	 */
	public void refType() {
		// 1. 선언) 데이터형[][] 배열명 = null;
		int[][] arr = null;
		// 2. 생성) 배열명 = new 데이터형[행의 수][열의 수]
		arr = new int[3][4];
		System.out.println("행의 수 : " + arr.length + ", 열의 수 : " + arr[1].length);
		// 1+2) 데이터형[][]배열명 = new 데이터형[행의 수][열의 수]
		int[][] arr1 = new int[4][5];
		System.out.println("행의 수 : " + arr1.length + ", 열의 수 : " + arr1[1].length);
		// 3. 값할당)
		arr[0][0] = 10;
		arr[1][1] = 20;
		arr[2][2] = 30;

		// 4. 값사용)
		System.out.println(arr[0][0] + "/" + arr[0][1] + "/" + arr[0][2]);
		// 모든 방의 값 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%-4d", i, j, arr[i][j]);
			} // inner for
			System.out.println();
		} // outer for
		
		for(int[] temp:arr1) {
			for(int val : temp) {
				System.out.print(val+"\t");
			}//inner for
			System.out.println();
		}//outer for
		
	}// refType

	/**
	 * 기본형 형식으로 2차원 배열 사용
	 */
	public void priType() {
		//행구분 괄호에 따라 행이 생성.
		//데이터형[][] 배열명= {{값,,,},{값,,,},{값,,,}};
		//1. 선언
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println("행 : "+arr.length+", 열 : "+arr[0].length);
		//2. 값할당
		arr[0][0]=100;
		//3. 값사용
		System.out.println(arr[0][0]+"/"+arr[0][1]);
		for (int i = 0; i<arr.length;i++) {
			for (int j = 0; j<arr[i].length;j++) {
				System.out.printf("arr[%d][%d]=%-4d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
	}// priType

	public static void main(String[] args) {
		UseArray2 ua2 = new UseArray2();
		ua2.refType();
		System.out.println("=================");
		ua2.priType();
	}// main

}// class
