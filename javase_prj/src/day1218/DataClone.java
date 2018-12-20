package day1218;

import java.util.Stack;

public class DataClone {

	private Stack<Data> historyStack;
	
	public DataClone() {
		historyStack = new Stack<Data>();
	}//DataClone
	
	/**
	 * �б������� ���� �����͸� ����
	 * @param data
	 */
	public void cloneData(Data data) {
	}
	
	public void useData() throws CloneNotSupportedException{
		Data d = new Data("�ֿ� ��ġ��");
		
		if(d instanceof Cloneable) {
		
		d.setSchool("�ֿ��ʵ��б�");
		Data d1 = d.getData();
		historyStack.push(d1);
		
		d.setSchool("�ֿ����б�");
		Data d2 = d.getData();
		historyStack.push(d2);
		
		d.setSchool("�ֿ����б�");
		Data d3 = d.getData();
		historyStack.push(d3);

		d.setSchool("�ֿ���б�");
		historyStack.push(d.getData());
		
		getHistoryData();
		
		}else {
			System.err.println("Cloneable�� ó���մϴ�.");
		}
	}//UseData
	
	public void getHistoryData() {
		Data temp = null;
		while (!historyStack.empty()) {
			temp = historyStack.pop();
			System.out.println(temp);
			System.out.println(temp.getSchool());
		}
	}
	
	
	public static void main(String[] args) {
		try {
		new DataClone().useData();
		}catch (CloneNotSupportedException e) {
			System.err.println("�������� �ʾҽ��ϴ�.");
			e.printStackTrace();
		}
		
	}//main
}//class
