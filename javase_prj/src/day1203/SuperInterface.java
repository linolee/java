package day1203;

/**
 * ����Ŭ����(�ڽ�Ŭ����)���� �ݵ�� Override �ؾ��ϴ� ���� ��ϸ� �����ϴ� 
 * @author owner
 */
public interface SuperInterface extends InterA, InterB{
//	int i; //������ ��� �Ұ�
	
	//�������̽��� ��ӿ��� �߻� method�� Override���� �ʴ´�.
//	@Override
//	public String msg();
	//constant : ������ ���ó�� ���
	public static final int FALG_VALUE = 12;
	//�߻�method ����
	//�Ϲ� method�� ���� �� ����
//	public void test() {
//		
//	}
	public void methodA();
	public abstract void method();	
}//interface
