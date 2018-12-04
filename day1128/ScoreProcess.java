package day1128;

/**
 * 4������ �л����� ���� ó��
 * 
 * @author owner
 */
public class ScoreProcess {
	public ScoreProcess() {
		String[] nameArr = { "������", "���ü�", "������", "��ǿ�", "������" };
		int[] scoreArr = { 89, 76, 99, 64, 50 };

		System.out.println("��ȣ\t�̸�\t����");
		System.out.println("===========================");

		int totalScore = 0; // ������ ���� ��
		int maxScore = 0;// �ְ��� ���� ����
		int minScore = 101;
		for (int i = 0; i < nameArr.length; i++) {
			System.out.printf("%d\t%s\t%d\n", i + 1, nameArr[i], scoreArr[i]);
			totalScore = totalScore + scoreArr[i];
			if (scoreArr[i] > maxScore) {
				maxScore = scoreArr[i];
			}
			if (scoreArr[i] < minScore) {
				minScore = scoreArr[i];
			}
		} // end for
		System.out.println("===========================");
		System.out.println("�����ο� : " + nameArr.length + "��");
		System.out.printf("���� [%5d] ��� [%5.2f] \n", totalScore, (double) totalScore / nameArr.length);
		System.out.printf("�ְ��� [%3d] ������ [%3d] \n", maxScore, minScore);

		for (int i = 0; i < scoreArr.length - 1; i++) {
			for (int j = i + 1; j < scoreArr.length; j++) {
				if (scoreArr[i] < scoreArr[j]) {
					int temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				} // end if
			} // end inner for
		} // end outer for //bubble sort

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%-4d", scoreArr[i]);
		} // bubble sort ���

	}// ScoreProcess

	public static void main(String[] args) {
		new ScoreProcess();
		System.out.println("=============================");
		int birth = 1991;
		String[] zodiac = {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		System.out.println(zodiac[birth%12]);
	}// main

}// class
