package day1123;

/**
 * ����� �߻�ȭ�Ͽ� ���� Person Ŭ������ ����ϴ� Ŭ����
 * @author owner
 */
public class UsePerson {

	public static void main(String[] args) {
		//��ü ���� : heap�� �����ǰ� instance ������ �ڵ� �ʱ�ȭ
		Person teacksung = new Person();
		System.out.format("������ ��� ��ü ���� ��[%d], ��[%d], ��[%d], �̸�[%s]\n", 
				teacksung.getEye(), teacksung.getNose(), teacksung.getMouth(), teacksung.getName());
		
		teacksung.setEye(2);
		teacksung.setNose(1);
		teacksung.setMouth(1);
		teacksung.setName("���ü�");
		
		System.out.format("������ ��� ��ü ���� ��[%d], ��[%d], ��[%d], �̸�[%s]\n", 
				teacksung.getEye(), teacksung.getNose(), teacksung.getMouth(), teacksung.getName());
		//������ ��ü���� ���ǵ� ���� ���.
		System.out.println(teacksung.eat());
		System.out.println(teacksung.eat("ġŲ", 15000));
		
		Person jinban = new Person();
		jinban.setName("õ����");
		jinban.setEye(3);
		jinban.setNose(1);
		jinban.setMouth(1);
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("����",1));
	}//main

}//class
