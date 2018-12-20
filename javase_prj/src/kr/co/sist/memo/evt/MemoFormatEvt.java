package kr.co.sist.memo.evt;

import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import kr.co.sist.memo.view.MemoFormat;

public class MemoFormatEvt extends WindowAdapter implements ActionListener, ItemListener {

	private MemoFormat mf;

	public MemoFormatEvt(MemoFormat mf) {
		this.mf = mf;
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		String selectedValue = ((List) ie.getSource()).getSelectedItem();
		Font temp = mf.getLblPreview().getFont();
		String font = temp.getFamily();
		int style = temp.getStyle();
		int size = temp.getSize();

		if (ie.getSource() == mf.getListFont()) {
			mf.getTfFontText().setText(selectedValue);
			font = selectedValue;
		}
		if (ie.getSource() == mf.getListStyle()) {
			mf.getTfStyleText().setText(selectedValue);
			style = mf.getListStyle().getSelectedIndex();
		}
		if (ie.getSource() == mf.getListSize()) {
			mf.getTfSizeText().setText(selectedValue);
			size = Integer.parseInt(selectedValue);
		}
		mf.getLblPreview().setFont(new Font(font, style, size));

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == mf.getBtnYes()) {
			setTaNoteFont();
			mf.dispose();
		}
		if (ae.getSource() == mf.getBtnNo()) {
			mf.dispose();
		}

	}

	public void setTaNoteFont() {
		mf.getJm().getTaNote().setFont(mf.getLblPreview().getFont());
		
		try {
			fontStausSave();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * 설정한 폰트상태를 파일로 저장 - 다음번에 프로그램이 실행되면 현재 저장된 폰트값을 적용하여 TA를 설정.
	 */
	private void fontStausSave() throws IOException {
		BufferedWriter bw = null;
		try {
			Font fontTemp = mf.getLblPreview().getFont();
			StringBuilder fontData = new StringBuilder();
			fontData.append(fontTemp.getFamily()).append(",")
			.append(fontTemp.getStyle()).append(",").append(fontTemp.getSize());
			
			bw = new BufferedWriter(new FileWriter("c:/dev/temp/memo.dat"));
			bw.write(fontData.toString());
			bw.flush();
		} finally {
			if (bw != null) {
				bw.close();
			}
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {

		mf.dispose();
	}

}
