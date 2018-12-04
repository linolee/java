package day1115;
/*
 단항 연산자(unary
 	~, !, +, ++,, --
*/

class Operator1 
{
	public static void main(String[] args) {
		int i = 11;
		int j = -11;
		//~(tilde) : 1의 보수 연산
		//~양수 : 부호변경 1 증가
		System.out.println("~"+i+"="+~i); //-12
		//~음수 : 부호변경 1 감소
		System.out.println("~"+j+"="+~j); //10

		//!(NOT) : true -> false, false -> ture
		boolean t = true;
		boolean f = false;
		System.out.println("!"+t+"="+!t);
		System.out.println("!"+f+"="+!f);
		System.out.println(!(11>15));
		// + : 형식적 제공
		System.out.println("-"+i+"="+ +i);
			System.out.println("-"+i+"="+ +i);
		// - : 2의 보수 연산, 부호 바꿈 연산
		System.out.println("-"+i+"="+-i);
		System.out.println("-"+j+"="+-j);
		

		//증가 연산 (대상체의 값을 1씩 증가)
		i = 0;
		j = 10;
		//전위 연산 : 연산자 대상체;
		++i;//0->1
		--j;//10 ->9
		
		System.out.println("전위연산 후 : i="+i+", j= "+j);
		i++; // 1->2
		j--; // 9->8
		System.out.println("후위연산 후 : i="+i+", j= "+j);
		//증가 연산자와 감소 연산자는 대입연산자와 함께 사용되면 전위와 후위가 다른 값을 대입한다
		j = 0;
		//전위 : 내것 먼저
		j = ++i;
		System.out.println("전위연산 후 : i="+i+", 대입 j= "+j);

		j = 0;
		//후위 : 대입 먼저
		j = i++;
		System.out.println("후위연산 후 : i="+i+", 대입 j= "+j);




	}//main
}//class
