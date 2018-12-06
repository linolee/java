package day1206;

import java.util.Stack;

/**
 * Stack : LIFO(Last Input First Output)을 구현한 클래스
 * @author owner
 */
public class UseStack {
	public UseStack() {
		//생성)
		Stack<String> stk = new Stack<String>();
		//값할당)
//		stk.add("부모");//부모클래스가 제공하는 기능은 사용하지 않는다.
		stk.push("하셨습니다.");
		stk.push("수고");
		stk.push("오늘도 ");
		
//		System.out.println(stk.get(0));
//		System.out.println(stk.get(1));
//		System.out.println(stk.get(2));
		//부모클래스가 제공하는 기능을 사용하면 스택의 고유기능을 사용할 수 없게된다.
		
		System.out.println(stk);
		while(!stk.isEmpty()) {
			System.out.println(stk.pop());//스택에서 꺼내진 데이터는 다음번에는 사용할 수 없다. 
		}
		
	}//UseStack
	
	
	
	public static void main(String[] args) {
		new UseStack();
	}

}
