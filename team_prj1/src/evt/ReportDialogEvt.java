package evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Set;

import view.ReportDialogView;;

public class ReportDialogEvt extends WindowAdapter implements ActionListener {
	private ReportDialogView rdv;

	public ReportDialogEvt(view.ReportDialogView rdv) {
		this.rdv = rdv;
		String[] result = new String[6];
		FileRead fr = rdv.getMce().getFr(); // �� ������ �޼��忡 ������ �����͸� �ް������� �ѷ���
		FileRead SelectedFr = rdv.getMce().getSelectedFr(); // 6�� ���� �޼��忡 �ʿ��� �����͸� �ް������� ���
		StringBuilder sb = new StringBuilder();// ��� ����� ���� StringBuilder

		// ���� ��� �ӽ� ����
		result[0] = setReport1(fr);
		result[1] = setReport2(fr);
		result[2] = setReport3(fr);
		result[3] = setReport4(fr);
		result[4] = setReport5(fr);
		result[5] = setReport6(SelectedFr);

		// ���â�� �� ������ ��� ���
		rdv.getReport1().setText(result[0]);
		rdv.getReport2().setText(result[1]);
		rdv.getReport3().setText(result[2]);
		rdv.getReport4().setText(result[3]);
		rdv.getReport5().setText(result[4]);
		rdv.getReport6().setText(result[5]);

		sb.append(result[0]).append("\n").append(result[1]).append("\n").append(result[2]).append("\n")
				.append(result[3]).append("\n").append(result[4]).append("\n").append(result[5]).append("\n");

		// ������� setting
		rdv.getMce().setTempResult(sb.toString());

	}// ReportDialogEvt

	public String getMaxKVP(Map<String, Integer> map) {// �Ű������� �Էµ� map����
		Set<String> keySet = map.keySet();// ��� key�� set���� �޾Ƴ���
		int maxValue = 0;
		String maxKey = "";
		for (String key : keySet) {
			if (map.get(key) > maxValue) {// ���� key���� value���� �ش� key���� value�� �� ũ�ٸ�
				maxValue = map.get(key);// �ִ밪���� ��ü
				maxKey = key;// Ű�� ����
			}
		}
		String rtnValue = maxKey + " : " + maxValue + "ȸ";
		return rtnValue;
	}// getMaxKVP

	public int getSumValue(Map<String, Integer> map) {// �Ű������� �Էµ� map����
		int sumValue = 0;
		Set<String> keySet = map.keySet();// ��� key�� set���� �޾Ƴ���
		for (String key : keySet) {
			sumValue += map.get(key);// ���� �����ش�.
		}
		return sumValue;
	}

	
	
	// ����Ǫ�� �޼ҵ�
	public String setReport1(FileRead fr) {
		Map<String, Integer> map = fr.getMcvo().getUrlMap();
		String value = getMaxKVP(map);
		System.out.println(value);
		return value;
	}

	public String setReport2(FileRead fr) {

		int valuesum = 0;
		for (String key : fr.getMcvo().getBrowserMap().keySet()) {
			valuesum += fr.getMcvo().getBrowserMap().get(key);
		}

		String value = "";
		String pValue = "";

//		String a="1";
//		Integer[] arr= {};
//		int i=0;
//		arr[i]=fr.getMcvo().getBrowserMap().get(0);
//		System.out.println(arr[0]);
//		Arrays.sort(fr.getMcvo().getBrowserMap().keySet(), Collections.reverseOrder());
		for (String key : fr.getMcvo().getBrowserMap().keySet()) {
			value = key + " " + fr.getMcvo().getBrowserMap().get(key) + "�� ����("
					+ Math.round(((double) (fr.getMcvo().getBrowserMap().get(key)) / valuesum) * 1000) / 10.0 + "%)\n";
			System.out.println(value);
			pValue += value;
		}

		return pValue;
	}

	public String setReport3(FileRead fr) {

		Map<String, Integer> map = fr.getMcvo().getCodeMap();
		int successNum = (int) map.get("200");
		int failNum = (int) map.get("404");

		System.out.println("���� Ƚ�� : " + successNum);
		System.out.println("���� Ƚ�� : " + failNum);

		String value = "����Ƚ�� : " + successNum + "\n����Ƚ�� : " + failNum;

		return value;
	}

	
	public String setReport4(FileRead fr) {
		return "";
	}

	
	public String setReport5(FileRead fr) {
		Map<String, Integer> map = fr.getMcvo().getCodeMap();

		int cnt = map.get("403");
		double percent = ((cnt / (double) getSumValue(map)) * 100);
		DecimalFormat df = new DecimalFormat("##.##");

		String report5 = "403�߻�Ƚ��: " + cnt + "ȸ, ����: " + df.format(percent) + "%";

		return report5;
	}// setReport5

	
	public String setReport6(FileRead SelectedFr) {
		return "";
	}

	
	@Override
	public void windowClosing(WindowEvent we) {
		rdv.dispose();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		rdv.dispose();
	}

}// class