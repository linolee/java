package day1204;



/**
 * �������̽��� method�� �Ű������� �� �����ϰ� ����ϴ� ���.<br>
 * 1ȸ��. ������ ���� �ʴ´�.
 * @author owner
 */
public class TestAnony {
	public void useAnonyInter(AnonyInter ai) {
		System.out.println(ai.getMsg()+" "+ai.getName());
	}
	public static void main(String[] args) {
//		AnonyInter ai = new AnonyInter();//�������̽��� ��üȭ x
		//�������̽��� �Ű������� ��
		//1.�������̽��� ������ Ŭ������ ����
		//2.����Ŭ������ ��ü�� ����
		AnonyInter ai = new AnonyImpl();
		//3.�Ű������� ���� method�� ȣ���ϱ� ���� ��ü ����
		TestAnony ta = new TestAnony();
		//4.method ȣ��
		ta.useAnonyInter(ai);
		
		System.out.println("------------anonymous innerclass------------");
		
		ta.useAnonyInter(new AnonyInter() {
			
			
			@Override
			public String getName() {
				return "������"+Test();
			}
			
			@Override
			public String getMsg() {
				return "������";
			}
			public String Test() {
				return "�ڽ� method";
			}
		});
	
		
		
		
	}//main

}//class
