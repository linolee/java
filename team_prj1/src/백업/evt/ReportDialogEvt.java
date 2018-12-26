package evt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import java.util.Set;

import view.ReportDialogView;;

public class ReportDialogEvt extends WindowAdapter {
	private ReportDialogView rdv;
	private String[] result;

	public ReportDialogEvt(view.ReportDialogView rdv) {
		FileRead fr, selectedFr;
		this.rdv = rdv;
		result = null;
		fr = rdv.getMce().getFr();
		selectedFr = rdv.getMce().getSelectedFr();

		rdv.getReport1().setText(setReport1(fr));
		rdv.getReport2().setText(setReport2(fr));
		rdv.getReport3().setText(setReport3(fr));
		rdv.getReport4().setText(setReport4(fr));
		rdv.getReport5().setText(setReport5(fr));
		rdv.getReport6().setText(setReport6(selectedFr));
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
		return value;
	}

	public String setReport2(FileRead fr) {

		int valuesum = 0;
		for (String key : fr.getMcvo().getBrowserMap().keySet()) {
			valuesum += fr.getMcvo().getBrowserMap().get(key);
		}

		String value = "";
		String pValue = "";

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
		int sumValue = getSumValue(map);
		int errorValue = map.get("403");
		String value = "403 Ƚ�� : " + errorValue + "ȸ / ���� : " + ((double) errorValue / sumValue * 100) + "%";
		return value;
	}

	public String setReport6(FileRead SelectedFr) {
		Map<String, Integer> map = SelectedFr.getMcvo().getCodeMap();
		return "";
	}

	public String[] getResult() {
		return result;
	}

	public void setResult(String[] result) {
		this.result = result;
	}

	public ReportDialogView getRdv() {
		return rdv;
	}

	@Override
	public void windowClosing(WindowEvent we) {
		rdv.dispose();
	}// windowClosing

}// class
