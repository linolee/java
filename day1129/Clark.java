package day1129;

import day1129.Person;
/**
 * ����� ����Ư¡�� Person���� �����ٰ� ����ϰ� �ڽŸ��� Ư¡�� ������ Ŭ����
 * @author owner
 */
public final class Clark extends Person{
	public int power;
	public Clark() {
		super(3,1,1);
		power = 9;
	}
	
	public String power(String stone) {
		String result = "";
		
		if(stone.equals("Ŭ���䳪��Ʈ")) {
			power = 0;
			result = "�� ����";
		}else if(stone.equals("���̾Ƹ��")) {
			power = 10;
			result = "�����մϴ�!";
		}else {
			power = 12;
			result = "����";
		}//end if
		return result;
	}
	
	@Override
	public String eat() {
		return getName()+"�� ������ ���� �Դ´�.";
	}
	public String eat(String menu, int price) {
		return getName()+"�� ����������� "+price+"�޷� ¥�� "+menu+"�� �Դ´�.";
	}
	
}//class
