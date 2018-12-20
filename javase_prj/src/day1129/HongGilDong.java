package day1129;

/**
 * ����� ����Ư¡�� �θ�(Person)�� ���� ����ϰ� �ڽŸ��� Ư¡��(�ο��� ���Ѵ�) ����
 * @author owner
 */
public class HongGilDong extends Person{
	private int level;//�ο򷹺�
	
	public HongGilDong() {
		super();
		level=7;
	}//HongGilDong
	
	/**
	 * �ο��ϴ� �� : �Էµ� �������� ���ٸ� �й�, �Էµ� �������� ���ٸ� �¸�, �Էµ� ������ ���ٸ� ���.<br>
	 * �¸� -> ���� 1 ����/ �й� -> ���� 1 ���� ���� ��ȭ ���� �ִ� 10 �ּ� 1
	 * @param inputLevel �ο� ������� ����
	 * @return �ο��� ���
	 */
	public String fight(int inputLevel) {
		String result = "";
		if (level>inputLevel) {//�¸�
			result = "�̱�";
			level++;
			if (level > 10) {
				level = 10;
			}//end if
		}else if (level < inputLevel) {//�й�
			result = "��";
			level--;
			if (level < 1) {
				level = 10;
			}//end if
		}else {//���
			result = "���";
		}
		return result;
	}
	@Override
	public String toString() {
		return "ȫ�浿 ��ü�� �� �� : "+getEye()+", �� : "+getNose()+", �� : "+getMouth();
	}
	/**
	 * �θ�Ŭ������ �����ϴ� method�� ����� �ڽĿ� ���� �ʾ� ����� �Ĵ��� �ָ����� ����, ȭ������� ���� ������ ���� 
	 */
	@Override
	public String eat(String menu, int price) {
		return getName()+"�� �ָ����� "+price+"�� ¥�� "+menu+"�� �Դ´�.";
	}
}
