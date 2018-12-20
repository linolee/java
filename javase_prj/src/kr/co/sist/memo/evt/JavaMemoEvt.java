package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;
import kr.co.sist.memo.view.MemoHelp;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String taNoteData;// TextArea의 초기 내용을 저장할 변수
	private String openPath; // 열었던 파일명을 저장

	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;
		taNoteData = "";
		openPath = "";
	}

	public void exitMemo() {
		TextArea tempTa = jm.getTaNote();
		if (!taNoteData.equals(tempTa.getText())) {// 메모장의 내용이 처음 연 내용과 다를 때
			if (openPath.equals("")) {// 이름이 없으면 새이름으로 저장을 바로 띄우고
				newSaveMemo();
				jm.dispose();
			} else {// 이름이 있으면
				int flag = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");// 저장할지 물어보고
				switch (flag) {
				case JOptionPane.OK_OPTION:// 예 = 그 이름으로 저장하고 종료
					saveMemo();
					jm.dispose();
					break;
				case JOptionPane.NO_OPTION:// 아니오 = 바로 종료
					jm.dispose();
					break;

				default:// 취소 = 아무 동작 없음
					break;
				}
			}
		} else {// 메모장의 내용이 처음 연 내용과 같으면 바로 종료
			jm.dispose();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		exitMemo();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
//		miNew, miOpen, miSave, miNewSave, miEnd, miFormat, miHelp;
		if (ae.getSource() == jm.getMiNew()) {
			newMemo();
		} // 새글 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiOpen()) {
			try {
				openMemo();
			} catch (FileNotFoundException e) {
				JOptionPane.showInputDialog(null, "선택한 파일을 읽을 수 없습니다.", "파일 열기 에러", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showInputDialog(null, "선택한 파일을 읽어들이는 중 문제가 발생했습니다.", "파일 열기 에러", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		} // 열기 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiSave()) {
			saveMemo();
		} // 저장 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiNewSave()) {
			newSaveMemo();
		} // 새이름으로 저장 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiEnd()) {
			exitMemo();
		} // 종료 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiFormat()) {
			formatDialog();
		} // 글꼴 아이템에서 이벤트가 발생 했을 때
		if (ae.getSource() == jm.getMiHelp()) {
			helpDialog();
		} // 도움말 아이템에서 이벤트가 발생 했을 때

	}

	/**
	 * 새글 : TextArea를 초기화
	 */
	public void newMemo() {
		boolean flagNew = true;
		TextArea tempTa = jm.getTaNote();
		if (!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "다른 이름으로 저장하시겠습니까?");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				newSaveMemo();
				break;
			case JOptionPane.NO_OPTION:
				flagNew = true;
				break;

			default:
				flagNew = false;
			}

		}

		if (flagNew) {
			tempTa.getText();
			tempTa.setText("");

			// 새 글이 된 이후에는 내용을 초기화
			taNoteData = tempTa.getText();
			openPath = "";

			jm.setTitle("메모장 - 새글");
		}
	}

	/**
	 * .txt파일 열기
	 */
	public void openMemo() throws IOException, FileNotFoundException {

		// TextArea의 내용과 읽어들였던 내용이 다르다면 저장여부를 묻고 작업을 진행
		// 변수에 불러들인 내용 저장
		TextArea tempTa = jm.getTaNote();
		boolean flagOpen = true;
		// 변수에 열었던 파일명을 저장
//		openPath = jm.getTitle();
		if (!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, openPath + "\n 저장하시겠습니까?");

			switch (flag) {
			case JOptionPane.OK_OPTION:
				if (!openPath.equals("")) {
					// 기존의 이름에 저장
					if (flag == JOptionPane.OK_OPTION) {
						saveMemo();
					} else {
						newSaveMemo();
					}
					// 다른이름으로 저장
				}
				break;
			case JOptionPane.NO_OPTION:
				flagOpen = true;
				break;
			default:
				flagOpen = false;
			}

		}
		if (flagOpen) {
			FileDialog fdOpen = new FileDialog(jm, "문서열기", FileDialog.LOAD);
			fdOpen.setVisible(true);

			String filePath = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();

			if (filePath != null) {// 선택한 파일이 존재
				/////////////////////// 12-20-2018 스트림으로 파일의 내용을 읽는 코드 추가 시작///////////////////

				// 선택한 파일로 파일객체 생성
				File file = new File(filePath + fileName);
				// 16bit stream 사용
				BufferedReader br = null;
				String temp = "";

				try {
					br = new BufferedReader(new FileReader(file));
					// T.A를 초기화한 후
					tempTa.getText();
					tempTa.setText("");
					while ((temp = br.readLine()) != null) {
						tempTa.append(temp + "\r\n");
						// 파일에서 읽어들인 내용을 설정
					}

					taNoteData = tempTa.getText();//////////////////////////////////////////////////////

					openPath = file.getAbsolutePath();
				} finally {
					if (br != null) {
						br.close();
					}
				}

				/////////////////////// 12-20-2018 코드 추가
				/////////////////////// 끝//////////////////////////////////////////

				jm.setTitle("메모장 - 열기 " + filePath + fileName);// 파일의 경로와 이름을 Frame의 TitleBar에 설정
			}
		}
	}

	/**
	 * 작성한 메모 저장 - 기존의 파일명을 그대로 저장하는 파일명에 반영
	 */
	public void saveMemo() {
		// 기존의 열었던 이름의 파일에 덮어쓴다.
		try {
			if (!openPath.equals("")) {
				createFile(openPath);
			} else {
				newSaveMemo();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createFile(String pathName) throws IOException {
		BufferedWriter bw = null;

		try {
			// 사용자가 디렉토리명을 마음대로 변경할 수 없기 때문에 File 클래스를 사용할 필요가 없다.
			bw = new BufferedWriter(new FileWriter(pathName));
			bw.write(jm.getTaNote().getText());// TA의 내용을 스트림에 기록
			bw.flush();// 스트림의 내용을 목적파일로 분출

			openPath = pathName;
			taNoteData = jm.getTaNote().getText();

		} finally {
			if (bw != null) {
				bw.close();
			}
		}
	}

	/**
	 * 파일명을 입력받아 새이름으로 저장
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm, "문서저장", FileDialog.SAVE);
		fdSave.setVisible(true);

		String filePath = fdSave.getDirectory();
		String fileName = fdSave.getFile();

		if (filePath != null) {// 선택한 파일이 존재
			try {
				createFile(filePath + fileName);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "저장 중 문제 발생", "문제발생", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
			jm.setTitle("메모장 - 저장 " + filePath + fileName);// 파일의 경로와 이름을 Frame의 TitleBar에 설정
		}
	}

	/**
	 * 글꼴 설정하는 다이얼로그 실행
	 */
	public void formatDialog() {
		new MemoFormat(jm);

	}

	/**
	 * 메모장 정보를 제공하는 다이얼로그 실행
	 */
	public void helpDialog() {
		new MemoHelp(jm);
	}

}
