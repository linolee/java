package day1206;

import java.util.Stack;

/**
 * Stack : LIFO(Last Input First Output)�� ������ Ŭ����
 * @author owner
 */
public class UseStack {
	public UseStack() {
		//����)
		Stack<String> stk = new Stack<String>();
		//���Ҵ�)
//		stk.add("�θ�");//�θ�Ŭ������ �����ϴ� ����� ������� �ʴ´�.
		stk.push("�ϼ̽��ϴ�.");
		stk.push("����");
		stk.push("���õ� ");
		
//		System.out.println(stk.get(0));
//		System.out.println(stk.get(1));
//		System.out.println(stk.get(2));
		//�θ�Ŭ������ �����ϴ� ����� ����ϸ� ������ ��������� ����� �� ���Եȴ�.
		
		System.out.println(stk);
		while(!stk.isEmpty()) {
			System.out.println(stk.pop());//���ÿ��� ������ �����ʹ� ���������� ����� �� ����. 
		}
		
	}//UseStack
	
	
	
	public static void main(String[] args) {
		new UseStack();
	}

}
