package day1129;

/**
 * ��Ӱ����� �θ�Ŭ���� : ��� �ڽ��� �������� ���� Ư¡ ����<br>
 * �θ𿡰� ���ǵ� �ڵ�� �ڽĿ��� ����� �� �ִ�.
 * @author owner
 */
public class TestSuper {

	public int pub_i;//��� �ִ� �ڽ��̵� ��� ����
	protected int pro_i;//���� ��Ű���� �ڽ��̳� �ٸ���Ű���� �ڽĸ� ��� ����
	@SuppressWarnings("unused")
	private int pri_i;//�θ�Ŭ���� �ȿ����� ��� ����(�ڽ� ��� X)
	int def_i;//���� ��Ű���� �ڽĿ��� ��� ����
	
	public TestSuper() {
		System.out.println("�θ�Ŭ���� �⺻ ������");
	}//TestSuper
	
	public void superMethod() {
		System.out.println("�θ� Ŭ������ �޼ҵ�");
	}//superMethod
	
}//class
