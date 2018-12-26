package evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import view.InputLineDialog;
import view.MainControlView;
import view.ReportDialogView;

/**
 * 18.12.25 1차 작성 완료 - 통합을 제일 많이해야 되는 부분이라 중간중간 구멍이 너무 많음 인스턴스화한 클래스간 데이터 이동을 좀
 * 더 신경써야 할 듯 밑에 주석에 코드들이 추가로 들어가야하는 부분에 대한 설명이 기술되어 있음
 * 
 * @author 이재찬
 */
public class MainControlEvt implements ActionListener {
	private MainControlView mcv;
	private String filePath; // 파일 패스를 VO에 전달
	private int startLine; // startLine 변수 추가됨 (클래스명세서에 추가 - 6번문제에 이용하는 라인
	private int endLine; // endLine 변수 추가됨 (클래스명세서에 추가 - 6번문제에 이용하는 라인
	private String tempResult;// tempResult 변수 추가됨(클래스명세서에 추가 - Report로 내보내기 위해 문제 결과를 임시로 저장하는 변수
	private boolean flag;// flag 변수 추가됨(클래스명세서에 추가 - view가 최소 한번 실행되었음을 판단
	
	private FileRead fr;// FileRead 변수 추가됨 (클래스 명세서에 추가 - log 전체를 사용한 data)
	private FileRead SelectedFr;// FileRead 변수 추가됨 (클래스 명세서에 추가 - log 일부를 사용한 data)

//	private ReportDialogView rdv;  //통합시 추가할 것 

	//지워도 될 것 같은애들
//	private MainControlVO mcvo;  //통합시 추가할 것   ( 이거 딱히 없어도 될 거같음
//	private InputLineDialog ild;  //좀이따 구현  ( 이거 딱히 없어도 될 거같음 잘돌아감 , 클래스명세서에서 뺄 것)
	// public MainControlEvt(MainControlView, MainControlVO) //매개변수가 2개일 필요가 없을수도
	// (생성자로 넘기는법을 다시 볼 것 )

	public MainControlEvt(MainControlView mcv) {
		this.mcv = mcv;
		startLine = -1;
		endLine = -1;
		tempResult = "";
		flag = false;

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == mcv.getJbtnView()) {
			showReport();
		}

		if (ae.getSource() == mcv.getJbtnReport()) {
			printReport();
		}
		// 로그아웃버튼 추가해야되는건지 .. ?
	}

	public void showReport() {
		// 파일 다이얼로그를 띄운 뒤
		FileDialog fd = new FileDialog(this.mcv, "파일 선택", FileDialog.LOAD);
		fd.setVisible(true);

		String path = fd.getDirectory();
		String name = fd.getFile();

		if (path != null) {
			filePath = path + name;// 읽은 파일의 path를 인스턴스변수에 저장

			// fileReadHandling으로 log값을 사용한 데이터 생성
			fileReadHandling();

			// InputLineDialog를 띄운다.
			InputLineDialog ild = new InputLineDialog(this);

			//라인입력이 제대로 됐을때 이후 로직을 실행
			if(startLine != -1 && endLine != -1) {
				// selectedFileReadHandling으로 log값 일부를 사용한 데이터 생성
				selectedFileReadHandling();
				
				// 결과창 (로그분석 view 6문제짜리 ) 띄워줌
				System.out.println("결과창이 나왔다 ~~ ");
				ReportDialogView rdv = new ReportDialogView(this);
				
				// 결과창에서 나온 결과물을 인스턴스 변수에 저장해 Report 파일로 출력하도록 하는 코드 아래 추가
				// 1. 인스턴스 변수 추가 - tempResult변수 추가함 (클래스명세서에도 적용 할 것
				// 2. 인스턴스 변수에 결과 저장
				tempResult = "성공적인 결과물";
				// 3. view가 실행되었음을 적용
				flag = true;

			}else {
				JOptionPane.showMessageDialog(mcv, "올바른 라인값을 입력하지 않았습니다.", "라인입력 오류", JOptionPane.ERROR_MESSAGE); 
				
			}
		} else {// 파일이 안읽혔을때 예외처리
			JOptionPane.showMessageDialog(mcv, "파일을 읽는데 실패했습니다.", "파일 불러오기 오류", JOptionPane.ERROR_MESSAGE); 
		}
	}

	//파일 읽어들이는 메서드
	public void fileReadHandling() {
		try {
			fr = new FileRead(filePath);
			fr.logToSet();
			fr.logToList();
			fr.setMap();
			fr.logToList();
//			System.out.println(fr.getMcvo().getBrowserMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//파일 읽어들이는 메서드 (범위에 따라
	public void selectedFileReadHandling() {
		try {
			SelectedFr = new FileRead(filePath, startLine, endLine);
			SelectedFr.logToSet();
			SelectedFr.logToList();
			SelectedFr.setMap();
//			System.out.println(SelectedFr.getMcvo().getBrowserMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//리포트 출력 메서드
	public void printReport() {
		// 최소 view가 한번 실행된 이후에 메서드가 실행되어야함
		if (flag) {
			// c:/dev/report 폴더 생성 (폴더가 없으면 생성하는 작업) - day1219 Usefile2 참고
			createDirectory();

			// "report_생성날짜.dat" 파일을 생성하여 1~6까지 작업을 write
			try {
				useFileOutputStream();
			} catch (IOException e) {
				e.printStackTrace(); // 예외처리 다이얼로그로 해줄 것
			}
			System.out.println("파일이 출력되었다 ~~ ");

		} else {
			System.out.println("view가 최소 한번 실행되어야 합니다.");
		}
	}

	// 폴더생성 메서드 추가 - 클래스 명세서에 기술 - day1219 Usefile2 참고
	private void createDirectory() {
		File directory = new File("c:/dev/report");
		directory.mkdirs();
	}

	// 파일출력 메서드 추가 - 클래스 명세서에 기술 - day1220 UseFileOutputStream2 참고
	private void useFileOutputStream() throws IOException {
		File fileOutput = new File(fileDateNaming());// 생성날짜 만드는 코드 추가해야함

		// 파일이 없다면 생성하고, 있다면 덮어쓴다.
		BufferedWriter bw = null;
		boolean flagFile = true; // 파일이 없을 때
		boolean[] temp = { true, false, false };// 예, 아니오, 취소
		int select = -1;

		if (fileOutput.exists()) {// 파일이 존재 할 때
			select = JOptionPane.showConfirmDialog(null, "같은 이름의 파일이 존재합니다. \n덮어쓰시겠습니까?");
			flagFile = temp[select];
		}

		if (flagFile) {
			try {
				///// 16비트만 사용 ////////////
				bw = new BufferedWriter(new FileWriter(fileOutput));

				bw.write(tempResult); // 결과 스트링을 입력 해준다. (인스턴스변수
				bw.flush();

				System.out.println("파일기록 완료!!!");
			} finally {
				if (bw != null)
					bw.close();
			}
		}
	}

	// 파일 이름에 생성날짜 추가하는 메서드- 클래스 명세서에 기술
	private String fileDateNaming() {
		String s = "c:/dev/report/report_.dat";
		StringBuilder sb = new StringBuilder(s);
		String today;
		Date d;
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");

		d = new Date();
		today = sdf.format(d);

		sb.insert(s.lastIndexOf("."), today);

		return sb.toString();

	}

	public void setStartLine(int startLine) { // setter 추가됨 (클래스명세서에 추가 .
		this.startLine = startLine;
	}

	public void setEndLine(int endLine) { // setter 추가됨 (클래스명세서에 추가 .
		this.endLine = endLine;
	}

	public MainControlView getMcv() { // getter 추가됨 (클래스명세서에 추가 .
		return mcv;
	}

	public String getFilePath() {
		return filePath;
	}
	
	public FileRead getFr() {
		return fr;
	}

	public FileRead getSelectedFr() {
		return SelectedFr;
	}

}
