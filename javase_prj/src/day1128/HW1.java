package day1128;

public class HW1 {

	private int total;

	public HW1() {
		total = 0;
	}// ScoreProcess2

	/**
	 * ��Ż�� ������
	 * 
	 * @param score
	 */
	public void addTotal(int score) {
		total += score;
	}// addTotal

	/**
	 * ������ ����
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}// getTotal

	/**
	 * �ʱ�ȭ
	 */
	public void resetTotal() {
		total = 0;
	}// resetTotal

	// �Է¹��� array�� ����̸�ŭ �ε����� ���� array ���� method
	public int[] studentScore(String[] name) {
		int[] stuScore = new int[name.length];
		return stuScore;
	}

	// �Է¹��� array�� �����̸�ŭ �ε����� ���� array ���� method
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
	}

	// 1. �� �л� ��� (�Ҽ� ���ڸ�����)
	// ������ �ʱ�ȭ
	public int[] AvgStu(String[] name, int[][] score) {
		resetTotal();
		int[] stuScore = studentScore(name);
		// �л�����ŭ ���̸� ���� array stuScore����

		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length(); j++) {
				addTotal(score[i][j]);
			}
			// �л��� ������ �ջ��Ͽ� ��̿� ����

			stuScore[i] = getTotal() / name[0].length();// name ������ array�� ������ �Է�
			resetTotal();

		} // stuScore�� �л��� ������ �Է�

		return stuScore;//

	}

	// 2. �� ����� ������ ������ ����
	public int[] SumSub(String[] name, int[][] score) {

		// �������ŭ ���̸� ���� array subScore ����
		int[] subScore = subScore(score);
		// �� ����� ����
		for (int i = 0; i < score[0].length; i++) {

			for (int j = 0; j < score.length; j++) {
				addTotal(score[j][i]);
			}
			subScore[i] = getTotal();
			resetTotal();
		}
		return subScore;
	}

	public int SumSumSub(String[] name, int[][] score) {
		// ������ ����
		
		for (int i = 0; i < SumSub(name, score).length; i++) {
			addTotal(SumSub(name, score)[i]);
		}
		return getTotal();
	}

	// 3. �� ����� ��հ� ��ü ��� (�Ҽ� ���ڸ�����)
	public int[] AvgSub(String[] name, int[][] score) {
		SumSub(name, score);

		for (int i = 0; i < SumSub(name, score).length; i++) {
			SumSub(name, score)[i] = SumSub(name, score)[i] / name.length;
		}
		return SumSub(name, score);
	}

	// 4. �� ����� �ְ����� ���
	public void Maxsub(String[] name, int[][] score) {
		// �� ����� ����
		int[] maxScore = subScore(score);// �� �ʿ������� �𸣰ڴ�
		// �������ŭ ���̸� ���� array maxScore ����
		int max = 0;
		for (int i = 0; i < score[0].length; i++) {

			for (int j = 0; j < score.length; j++) {
				if (max < score[j][i]) {
					max = score[j][i];
				}
			}
			maxScore[i] = max;
			max = 0;
		}
		System.out.printf("�ְ����� �ڹ�[%d] ����Ŭ[%d] JDBC[%d]\n", maxScore[0], maxScore[1], maxScore[2]);
	}

	// 5. �ϵ� �л��� �̸��� ����, ��ȣ
	public void printTop(String[] name, int[][] score) {
		String temp = "";
		int tempi = 0;

		resetTotal();
		int[] stuScore = studentScore(name);
		// �л�����ŭ ���̸� ���� array stuScore����

		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length(); j++) {
				addTotal(score[i][j]);
			}
		}
		// �л��� ������ �ջ��Ͽ� ��̿� ����
		for (int i = 0; i < stuScore.length; i++) {
			if (tempi < stuScore[i]) {
				temp = name[i];
				tempi = stuScore[i];
			}

		}
		System.out.printf("Top ��ȣ[%d] �̸�[%s] ����[%d]\n", tempi, temp, tempi);

	}

	// 6. �ڹ������� �������� �����Ͽ� ���.
	public void printAscJava(String[] name, int[][] score) {
		// �л�����ŭ ���̸� ���� array stuScore����
		int[] javaScore = studentScore(name);

		for (int i = 0; i < javaScore.length; i++) {
			javaScore[i] = score[i][2];
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
	}

	public void PrintArr() {
		int[][] hw = null;
		hw = new int[6][9];
		for (int i = 0; i < hw.length; i++) {
			for (int j = 0; j < hw[i].length; j++) {
				if (i == 0 || i == hw.length-1 || j == 0 || j == hw[i].length-1) {
					hw[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < hw.length; i++) {
			for (int j = 0; j < hw[i].length; j++) {
				System.out.printf("%d\t", hw[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		HW1 hw1 = new HW1();
		// ó���� ������ �ޱ�
		String[] name = hw1.namesData();
		int[][] score = hw1.scoreData();
		
		System.out.println("1.========================================");
		//1.
		for (int i = 0; i < hw1.AvgStu(name, score).length; i++) {
		System.out.println(hw1.AvgStu(name, score)[i]);
		}
		System.out.println("2.========================================");
		//2.
		for (int i = 0; i < hw1.SumSub(name, score).length; i++) {
		System.out.println(hw1.SumSub(name, score)[i]);
		}
		System.out.println(hw1.SumSumSub(name, score));
		System.out.println("3.========================================");
		//3.
		for (int i = 0; i < hw1.AvgSub(name, score).length; i++) {
			System.out.println(hw1.AvgSub(name, score)[i]);
		}
		System.out.println("4.========================================");
		//4.
		hw1.Maxsub(name, score);
		System.out.println("5.========================================");
		//5.
		hw1.printTop(name, score);
		
	}//main
}//class
	


