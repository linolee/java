package day1115;
/*
논리연산자
    일반 논리 : 여러개의 관계 연산자를 붙일 때
        && (and)    전항과 후항이 모두 참일 때만 참 반환
                전항이 false이면 후항을 계산하지 않는다.
        || (or)           전항과 후항이 모두 거짓일 때만 거짓 반환
                전항이 true이면 후항을 계산하지 않는다.

    비트 논리 : 비트를 합치거나 분리할 때 사용
        & (and)        상위비트/하위비트 둘 다 1일 때만 1
        | (or)              상위비트/하위비트 둘 다 0일 때만 0
        ^ (xor)       상위비트/하위비트 둘 중 하나만 1일 때만 1

*/

class Operator5{
	public static void main(String[] args) {
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
		int i, j = 0;


		System.out.println("----------------------&&----------------------");
		
			
		
		System.out.println(flag1+"&&"+flag3+"="+(flag1 && flag3));
		System.out.println(flag1+"&&"+flag2+"="+(flag1 && flag2));
		System.out.println(flag2+"&&"+flag1+"="+(flag2 && flag1));
		System.out.println(flag2+"&&"+flag4+"="+(flag2 && flag4));


		System.out.println("----------------------||----------------------");



		System.out.println(flag1+"||"+flag3+"="+(flag1 || flag3));
		System.out.println(flag1+"||"+flag2+"="+(flag1 || flag2));
		System.out.println(flag2+"||"+flag1+"="+(flag2 || flag1));
		System.out.println(flag2+"||"+flag4+"="+(flag2 || flag4));

		flag1 = false;
		flag2 = false;
		flag3 = false;
		

		flag3 = (flag1 = 3>4) && (flag2=5<4);
		System.out.println("전항 : "+flag1+", 후항 : "+flag3+", 판정 : "+flag3);


		System.out.println("----------------------&|^----------------------");

		System.out.println(9&3);
		System.out.println(9|3);
		System.out.println(9^3);

		System.out.println("----------------------------------------------");
		i = 28;  //11100
		j = 48;	//110000
		//10000 = 16
		System.out.println(i+" & "+j+" = "+(i&j));
		i = 16; // 10000
		j = 3;	// 00011
		//10011 = 19
		System.out.println(i+" | "+j+" = "+(i|j));
		i = 10; // 1010
		j = 12; // 1100
		// 110 = 6
		System.out.println(i+" ^ "+j+" = "+(i^j));

	}//main
}//class
