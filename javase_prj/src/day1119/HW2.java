package day1119;

/*
 2. �̸�, ������ܰ� ����� �Ÿ��� �Է¹޾� �Ʒ��� ���� ����ϼ���.
   ��������� "����,����ö,�ý�,����"�� �����Ѵ�.
   ������� 1200��, ����ö ��� 1250��, �ýÿ�� 3800�� �Դϴ�.
   ����� 10Ű�� ������ �⺻���, �� 5Ű�� �ʰ��� ���� 100���� ���� �մϴ�.

 ���   :  xxx�� ����� ��������� xx�̸� �Ÿ��� xx Ű�� �Դϴ�.
            �� �̿� ��� xx���̰�, �պ��̿� ��� xx���̸�, �Ѵ� 20�ϱ���
            ������ ��: xxxx�� �Դϴ�.  
 */
public class HW2 {

	public static void main(String[] args) {
		int distance = Integer.parseInt(args[2]);
		int zero_charge = 0; //������ܺ� �⺻���
		double dis_charge = 0; //�Ÿ��� �߰� ���
		
		if (distance > 10) {
			dis_charge = 100*Math.ceil((double)(distance - 10) / (double)5);
		}//�Ÿ��� �߰����
		
		int how;// ������ܺ� �ڵ� ����1/����ö2/�ý�3/����0
		if (args[1].equals("����")) {
			how = 1;
		}else if(args[1].equals("����ö")){
			how = 2;
		}else if(args[1].equals("�ý�")){
			how = 3;
		}else if(args[1].equals("����ö")){
			how = 0;
		}else{
			how = 999;
		}//end if
		switch(how) {
		case 1 : 
			zero_charge = 1200;  
			break;
		case 2 : 
			zero_charge = 1250;  
			break;
		case 3 : 
			zero_charge = 3800;  
			break;
		case 0 : 
			zero_charge = 0;
			dis_charge = 0;
			break;
		default : 
			zero_charge = 9999;
			break;
		}//case
		
		if (zero_charge == 9999){
			System.out.println("��������� �߸��Ǿ����ϴ�.");
		}else {
			System.out.println(args[0]+"�� ����� ��������� "+args[1]+"�̸� �Ÿ��� "+distance+" Ű�� �Դϴ�. �� �̿� ��� "
					+(int)(zero_charge+dis_charge)+"���̰�, �պ��̿� ��� "+(int)(zero_charge+dis_charge)*2+"���̸�, �Ѵ� 20�ϱ��� ������ �� "+(int)(zero_charge+dis_charge)*2*20+"�� �Դϴ�.  ");
		}
		
		
			
	
		
		
		
		
		
	}//main

}//class
