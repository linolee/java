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

	public String getMaxKVP(Map<String, Integer> map) {// 매개변수로 입력된 map에서
		Set<String> keySet = map.keySet();// 모든 key를 set으로 받아내서
		int maxValue = 0;
		String maxKey = "";
		for (String key : keySet) {
			if (map.get(key) > maxValue) {// 이전 key값의 value보다 해당 key값의 value가 더 크다면
				maxValue = map.get(key);// 최대값으로 교체
				maxKey = key;// 키도 저장
			}
		}
		String rtnValue = maxKey + " : " + maxValue + "회";
		return rtnValue;
	}// getMaxKVP

	public int getSumValue(Map<String, Integer> map) {// 매개변수로 입력된 map에서
		int sumValue = 0;
		Set<String> keySet = map.keySet();// 모든 key를 set으로 받아내서
		for (String key : keySet) {
			sumValue += map.get(key);// 값을 더해준다.
		}
		return sumValue;
	}

	// 문제푸는 메소드
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
			value = key + " " + fr.getMcvo().getBrowserMap().get(key) + "번 실행("
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

		System.out.println("성공 횟수 : " + successNum);
		System.out.println("실패 횟수 : " + failNum);

		String value = "성공횟수 : " + successNum + "\n실패횟수 : " + failNum;

		return value;
	}

	public String setReport4(FileRead fr) {
		return "";
	}

	public String setReport5(FileRead fr) {
		Map<String, Integer> map = fr.getMcvo().getCodeMap();
		int sumValue = getSumValue(map);
		int errorValue = map.get("403");
		String value = "403 횟수 : " + errorValue + "회 / 비율 : " + ((double) errorValue / sumValue * 100) + "%";
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
