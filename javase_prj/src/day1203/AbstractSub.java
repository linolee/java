package day1203;

/**
 * �߻�Ŭ������ �θ�� �ϴ� �ڽ� Ŭ����<br>
 * �ڽ� Ŭ������ �ݵ�� �θ��� �߻� method�� Override �ؾ��Ѵ�.
 * @author owner
 */
public class AbstractSub extends AbstractSuper{

	public void subMethod() {
		System.out.println("�ڽ� method!");
	}
	
	@Override
	//override ��Ģ : ���������ڴ� �޶� �ǰ� (����) ��ȯ��, method��, �Ű������� ���ƾ��Ѵ�.
	public void absMethod() {
		//�߻� method�� super�� ȣ���� �� ����.
//		super.absMethod();
		System.out.println("Override�� absMethod");
	};//absmethod
	
	@Override
	public String absMethod1(int param_i) {
		return String.valueOf(param_i).concat("- �ڽ�");
	};//absmethod1
	
	
	public static void main(String[] args) {
		//�ڽ�Ŭ������ ��üȭ �Ǹ� �߻�Ŭ������ ��üȭ�� �ȴ�.
		AbstractSub as = new AbstractSub();
		//�ڽ�Ŭ���� ��üȭ : �θ��� ����, method, �ڽ��� ����, method
		as.i = 12;//�θ� ����
		as.method();//�θ� method
		as.subMethod();//�ڽ� method
		//Override �� method �ڽĿ��� ������ ���̹Ƿ� �ڽ��� methodȣ��
		as.absMethod();//���� �̸����� �����Ѵٸ� �ڽ��� method ȣ��
		System.out.println(as.absMethod1(3));
		
		//is a ������ ��üȭ
		//�θ�Ŭ������ ��ü�� = new �ڽĻ�����();
		AbstractSuper as1 = new AbstractSub();
		//�θ��� �ڿ� ȣ�� ����
		//Override�� method�� �����Ѵٸ� �ڽ��� method�� ȣ���
		as1.i = 100;
		as1.method();
		//�߻�method�� body�� ������ ȣ���ϰ� �Ǹ� �ڽ��� method�� ȣ��Ǿ� ��� ����
		as1.absMethod();
		System.out.println(as1.absMethod1(2018));
		//is a ����� ��üȭ�ϸ� �ڽ��� ���� method�� ȣ�� �Ұ�
//		as1.subMethod;
		
		
		
	}//main

}//class
