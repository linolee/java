package day1115;
/*
	java ���α׷� �ܺο��� java ���α׷� ���η� ���� ������ ��.
	main method�� Arguments ���
	����) java bytecode�� �� �� ��
*/

class MainArguments{
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		//Integer.parseInt(���ڿ�); ���ڿ��� �����Ͽ� int������ ��ȯ�� �� �� ���� ��ȯ�ϴ� ��
		Integer.parseInt("111");
		System.out.println(i*j);
		System.out.println(args[2]+"�� �ȳ��ϼ���");
		
	}
}
