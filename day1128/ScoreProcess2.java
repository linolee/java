package day1128;

/**
 * �л��� Oracle, Java, JDBC���� ������ ó���ϴ� ���α׷�
 * 
 * @author owner
 */

public class ScoreProcess2 {
	private int total;
	public ScoreProcess2() {
		total = 0;
	}//ScoreProcess2
	
	/**
	 * ��Ż�� ������
	 * @param score
	 */
	public void addTotal(int score) {
		total += score;
	}//addTotal
	/**
	 * ������ ����
	 * @return
	 */
	public int getTotal() {
		return total;
	}//getTotal
	/**
	 *�ʱ�ȭ 
	 */
	public void resetTotal() {
		total = 0;
	}//resetTotal
	
	//�Է¹��� array��  ����̸�ŭ �ε����� ���� array ���� method
	public int[] studentScore(String[] name) {
		int[] stuScore = new int[name.length];
		return stuScore;
	}
	//�Է¹��� array��  �����̸�ŭ �ε����� ���� array ���� method
	public int[] subScore(int[][] score) {
		int[] subScore = new int[score[0].length];
		return subScore;
	}
	

	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String[] namesData() {
		String[] name = { "������", "������", "���ü�", "������", "������", "�����" };
		return name;
	}// nameData

	public int[][] scoreData() {
		int[][] score = { { 85, 86, 81 }, { 95, 91, 100 }, { 89, 71, 59 }, { 97, 96, 91 }, { 78, 74, 77 },
				{ 100, 95, 68 } };
		return score;
	}// scoreData
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	public void PrintScore(String[] name, int[][] score) {
		System.out.println("��ȣ\t�̸�\tOracle\tJava\tJDBC\t����");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < name.length; i++) {// ��
			System.out.printf("%d\t%s\t", i + 1, name[i]);
			for (int j = 0; j < score[i].length; j++) {// ��
				System.out.printf("%d\t", score[i][j]);
				addTotal(score[i][j]);
			} // end inner for
			System.out.println(getTotal());
			resetTotal();
		} // end outer for
		
		System.out.println("--------------------------------------------");
		//1. �� �л� ��� (�Ҽ� ���ڸ�����)
		//������ �ʱ�ȭ
		resetTotal();
		//�л�����ŭ ���̸� ���� array stuScore����
		int[] stuScore=studentScore(name);
		
		//�л��� ������ �ջ��Ͽ� ��̿� ����
		for (int i = 0; i<name.length; i++) {
			for (int j = 0; j<name[i].length(); j++) {
				addTotal(score[i][j]);
			}
			stuScore[i]=getTotal();//name ������ array�� ������ �Է�
			resetTotal();
		}//stuScore�� �л��� ������ �Է�
		for (int i = 0; i<stuScore.length; i++) {
			System.out.printf("%.2f\t",(double)stuScore[i]/
					score[i].length);
		}//������ ������� ������ ���
		System.out.println();
		
		
		
		
		System.out.printf("--------------------------------------------\n");
		//2. �� ����� ������ ������ ����
		
		//�������ŭ ���̸� ���� array subScore ����
		int[] subScore=subScore(score);
		//�� ����� ����
		for (int i = 0; i<score[0].length;i++) {
			
			for (int j = 0; j<score.length;j++) {
				addTotal(score[j][i]);
			}
			subScore[i] = getTotal();
			resetTotal();
		}
		for (int i = 0; i<subScore.length; i++) {
			System.out.println(subScore[i]);
		}
		//������ ����
		for (int i = 0; i<subScore.length; i++) {
			addTotal(subScore[i]);
		}
		System.out.println(getTotal());
		resetTotal();
		
		
		System.out.printf("--------------------------------------------\n");
		//3. �� ����� ��հ� ��ü ��� (�Ҽ� ���ڸ�����)
		for (int i = 0; i<subScore.length; i++) {
			System.out.printf("%.2f\t",subScore[i]/(double)name.length);
		}
		System.out.println();
		
		for (int i = 0; i<subScore.length; i++) {
			addTotal(subScore[i]);
		}
		System.out.printf("%.2f\t",getTotal()/(double)(score.length*score[0].length));
		resetTotal();
		System.out.println();
		
		System.out.printf("--------------------------------------------\n");
		//4. �� ����� �ְ����� ���
		//�� ����� ����
		int[] maxScore=subScore(score);//�� �ʿ������� �𸣰ڴ�
		//�������ŭ ���̸� ���� array maxScore ����
		int max = 0;
		for (int i = 0; i<score[0].length;i++) {
			
			for (int j = 0; j<score.length;j++) {
				if(max<score[j][i]) {
					max = score[j][i];
				}
			}
			maxScore[i] = max;
			max = 0;
		}
		for (int i = 0; i<maxScore.length; i++) {
			System.out.println(maxScore[i]);
		}
		
		
		System.out.printf("�ְ����� �ڹ�[] ����Ŭ[] JDBC[]\n");
		//5. �ϵ� �л��� �̸��� ����, ��ȣ
		String temp = "";
		int tempi = 0;
		for (int i = 0; i<stuScore.length; i++) {
			if (tempi < stuScore[i]) {
				temp = name[i];
				tempi = stuScore[i];
			}
			
		}
		System.out.println(temp);
		System.out.println(tempi);
		
		
		
		
		System.out.printf("Top ��ȣ[] �̸�[] ����[]\n");
		//6. �ڹ������� �������� �����Ͽ� ���.
		System.out.printf("--------------------------------------------\n");

		//�л�����ŭ ���̸� ���� array stuScore����
		int[] javaScore=studentScore(name);
		
		for (int i = 0; i < javaScore.length; i++) {
			javaScore[i]=score[i][2];
		}
		
		for (int i = 0; i < javaScore.length - 1; i++) {
			for (int j = i + 1; j < javaScore.length; j++) {
				if (javaScore[i] > javaScore[j]) {
					int temp11 = javaScore[i];
					javaScore[i] = javaScore[j];
					javaScore[j] = temp11;
				} // end if
			} // end inner for
		} // end outer for //bubble sort
	
		
		for (int i = 0; i < javaScore.length; i++) {
			System.out.println(javaScore[i]);
		}
		 
		
	}// PrintScore
	//���� 2.
/*	2���� �迭�� ������ �������� ����� �Ʒ��� ���� ���� �־� ����ϴ� method �ۼ�
		1  1  1  1  1  1  1  1  1
		1  0  0  0  0  0  0  0  1
		1  0  0  0  0  0  0  0  1
		1  0  0  0  0  0  0  0  1
		1  0  0  0  0  0  0  0  1
		1  1  1  1  1  1  1  1  1*/
	
	
	
	
	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		// ó���� ������ �ޱ�
		String[] name = sp2.namesData();
		int[][] score = sp2.scoreData();
		// ó��
		sp2.PrintScore(name, score);
		
		
		int[][] hw = null; 
		hw = new int[6][9];
		for(int i = 0; i < hw.length; i++) {
			for (int j = 0; j<hw[i].length; j++) {
				if (i == 0 || i == 5 || j == 0 || j == 8) {
					hw[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < hw.length; i++) {
			for (int j = 0; j<hw[i].length; j++) {
				System.out.printf("%d\t",hw[i][j]); 
			}
			System.out.println();
		}
		
	}// main

}// class
