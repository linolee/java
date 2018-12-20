package day1127;

/**
 * 행 하나에 여러열로 구성된 배열<br>
 * 배열 - 메모리에 동일 데이터형으로 나열된 데이터형.<br>
 * 참조형 데이터형, 고정길이형<br>
 * 일괄처리시 사용<br>
 * 방의 수를 얻기(배열명.length)<br>
 * 1차원 배열을 참조형 방식으로 사용
 * @author owner
 */
public class UseArray1 {
	public UseArray1() {
		//1.배열선언)데이터형[]배열명 = null;
		int[] arr=null;
		//2.배열생성)배열명 = new 데이터형[인덱스 수]
		//배열을 생성하면 모든 방의 값이 초기화된다.
		arr = new int[6];
		//1+2.선언과 생성)데이터형[] 배열명 = new 데이터형[인덱스 수]
		int[] arr1 = new int[8];
		System.out.println(arr+"/"+arr1);
		System.out.println("arr배열 방의 갯수 "+arr.length+", arr1배열 방의 갯수 "+arr1.length);
		//3.값할당)배열명[인덱스]=값;
		arr[0]=11;
		arr[1]=27;
		arr[2]=14;
		arr[3]=46;
		//4.값사용)배열명[인덱스]
		System.out.printf("arr[0] = %d, arr[1] = %d, arr[2] = %d, arr[3] = %d, arr[4] = %d, arr[5] = %d \n",
				arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
		//일괄처리
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"/");
		}
		System.out.println();
		
	}//UseArry1
	/**
	 * 1차원 배열의 기본형 형식 사용(new x)
	 */
	public void arrayPrimitive() {
		System.out.println("===============기본형 형식의 사용================");
		//1.선언 : 데이터형[]배열명={값,,,,,,,}
		int[] arr = {2018,11,27,15,20};
		System.out.println("인덱스 수 : "+arr.length);
		int[] arr1 = new int[] {1,2,3,4,5,6,7};//인덱스 수를 직접 정의하면 error
		System.out.println("arr1 인덱스 수 : "+arr1.length);
		
		arr[0] = 2019;
		System.out.println(arr[0]+"/"+arr[1]);
		
		for (int i = 0; i<arr.length;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		//향상된 for : 배열이나 Collection(List,Set)의 처음 방부터 끝방까지 모든 방의 값을 순차적으로 손쉽게 출력할 때 
		//for (배열방의 값을 저장한 변수 : 배열){
		//변수명
		//}
		for(int value : arr) {
			System.out.println(value);
		}
		System.out.println("역순");
		for(int i = arr1.length-1;i>-1;i--) {
			System.out.print(arr1[i]);
		}
		
	}//arrayPrimitive
	
	public static void main(String[] args) {
//		UseArray1 ua = new UseArray1();
		new UseArray1();
		new UseArray1().arrayPrimitive();
	}//main

}//class
