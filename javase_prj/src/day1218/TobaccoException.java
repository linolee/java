package day1218;


//1.Exception�̳� RuntimeException�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class TobaccoException extends RuntimeException{
	public TobaccoException() {
		this("��迹�� - ����� ���� ��! �׷��� �ǿ�ðڽ��ϱ�?");
	}
	public TobaccoException(String msg) {
		super(msg);
	}
	
}
