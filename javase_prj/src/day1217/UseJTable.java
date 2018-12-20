package day1217;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * MVC Pattern이 적용된 class
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJTable extends JFrame implements ActionListener{

	private JButton btnAdd;
	private DefaultTableModel dtm;
	private JTable jt;
	private UseJTable ujt;
	
	public UseJTable() {
		super("JTable 연습");
		ujt = this;
		//1. 데이터를 관리하는 Model class 생성
		String[] columnNames = {"번호", "이름", "주소", "이메일"};
		String[][] rowData = {{"1","이재찬","인천시 소래동","chan@test.com"},{"2","정택성","서울시 구로동","teack@test.com"},{"3","이재현","경기도 안양시","hyun@gmail.com"}};
//		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		dtm = new DefaultTableModel(rowData, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		
		//2. 데이터를 보여주는 View class 생성
		jt = new JTable(dtm);
		btnAdd = new JButton("데이터 추가");
		//테이블 컬럼의 크기 변경 : 컬럼은 하나의 넓이를 변경하면 하위 모든 컬럼은 동일한 크기를 적용받는다.
		//컬럼크기변경 1. :컬럼의 크기를 얻는다.
//		TableColumn tc = jt.getColumnModel().getColumn(0);
		//컬럼크기변경 2. :컬럼의 크기를 변경한다.
//		tc.setPreferredWidth(80);
		//1+2
		jt.getColumnModel().getColumn(0).setPreferredWidth(30);
		jt.getColumnModel().getColumn(1).setPreferredWidth(100);
		jt.getColumnModel().getColumn(2).setPreferredWidth(200);
		jt.getColumnModel().getColumn(3).setPreferredWidth(170);
		//테이블 행의 높이 변경
		jt.setRowHeight(30);
		
		//3. ScrollBar 설정
		JScrollPane jsp = new JScrollPane(jt);
		JPanel jp = new JPanel();
		jp.add(btnAdd);
		
		//이벤트 등록
		btnAdd.addActionListener(this);
		UseJTable.TableEvt te = this.new TableEvt();
		jt.addMouseListener(te);
		
		//배치
		add("Center",jsp);
		add("South", jp);
		setBounds(100,100,500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJTable
	
	
	/////////////////////////////////////////inner class 시작 ///////////////////////////////////////////////////////
	public class TableEvt extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent me) {
//			System.out.println("행선택 : "+jt.getSelectedRow()+" 열선택 : "+jt.getSelectedColumn());
//			String selectedValue = (String)jt.getValueAt(jt.getSelectedRow(), jt.getSelectedColumn());
			
			
			StringBuilder viewData = new StringBuilder();
			int selectedRow = jt.getSelectedRow();
			int columnCount = jt.getColumnCount();
			
			int flag = JOptionPane.showConfirmDialog(ujt, "예를 누르면 조회, 아니오를 누르면 삭제를 수행합니다.");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				for (int i = 0; i < columnCount; i++) {
					viewData.append(jt.getValueAt(selectedRow, i)).append("\n");
				}
				JOptionPane.showMessageDialog(ujt, viewData);
				break;
			case JOptionPane.NO_OPTION:
				switch (JOptionPane.showConfirmDialog(ujt, "정말 삭제하시겠습니까")) {
				case JOptionPane.OK_OPTION:
					dtm.removeRow(selectedRow);
					break;
				}
				break;
			}
			
			
			
		}
		
		
	}//TableEvt
	/////////////////////////////////////////inner class 끝 ///////////////////////////////////////////////////////
	
	
	
	public static void main(String[] args) {
		new UseJTable();
	}//main

	@Override
	public void actionPerformed(ActionEvent ae) {
		String inputData = JOptionPane.showInputDialog("데이터입력\n예)번호,이름,주소,이메일");
		//유효성 검증
//		4,이봉현, 서울시 동작구, bong@test.com
		if (inputData == null) {
			return;
		}
		String[] tempData = inputData.split(",");
				
		if (tempData.length != 4) {
			JOptionPane.showMessageDialog(this, "입력 데이터의 형태는 \n번호,이름,주소,이메일 이어야합니다", "입력 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (!tempData[3].contains("@")||!tempData[3].contains(".")) {
//			System.out.println("에러체크메세지");
			JOptionPane.showMessageDialog(this, "이메일의 형태가 잘못되었습니다.", "입력 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		dtm.addRow(tempData);
		
		
		
		
		
	}

}//class
