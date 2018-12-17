package kr.co.sist.memo.evt;

import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
	}
	

	@Override
	public void windowClosing(WindowEvent e) {
		
		mf.dispose();
	}

}
