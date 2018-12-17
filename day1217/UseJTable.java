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
 * MVC Pattern�� ����� class
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJTable extends JFrame implements ActionListener{

	private JButton btnAdd;
	private DefaultTableModel dtm;
	private JTable jt;
	private UseJTable ujt;
	
	public UseJTable() {
		super("JTable ����");
		ujt = this;
		//1. �����͸� �����ϴ� Model class ����
		String[] columnNames = {"��ȣ", "�̸�", "�ּ�", "�̸���"};
		String[][] rowData = {{"1","������","��õ�� �ҷ���","chan@test.com"},{"2","���ü�","����� ���ε�","teack@test.com"},{"3","������","��⵵ �Ⱦ��","hyun@gmail.com"}};
//		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		dtm = new DefaultTableModel(rowData, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		
		//2. �����͸� �����ִ� View class ����
		jt = new JTable(dtm);
		btnAdd = new JButton("������ �߰�");
		//���̺� �÷��� ũ�� ���� : �÷��� �ϳ��� ���̸� �����ϸ� ���� ��� �÷��� ������ ũ�⸦ ����޴´�.
		//�÷�ũ�⺯�� 1. :�÷��� ũ�⸦ ��´�.
//		TableColumn tc = jt.getColumnModel().getColumn(0);
		//�÷�ũ�⺯�� 2. :�÷��� ũ�⸦ �����Ѵ�.
//		tc.setPreferredWidth(80);
		//1+2
		jt.getColumnModel().getColumn(0).setPreferredWidth(30);
		jt.getColumnModel().getColumn(1).setPreferredWidth(100);
		jt.getColumnModel().getColumn(2).setPreferredWidth(200);
		jt.getColumnModel().getColumn(3).setPreferredWidth(170);
		//���̺� ���� ���� ����
		jt.setRowHeight(30);
		
		//3. ScrollBar ����
		JScrollPane jsp = new JScrollPane(jt);
		JPanel jp = new JPanel();
		jp.add(btnAdd);
		
		//�̺�Ʈ ���
		btnAdd.addActionListener(this);
		UseJTable.TableEvt te = this.new TableEvt();
		jt.addMouseListener(te);
		
		//��ġ
		add("Center",jsp);
		add("South", jp);
		setBounds(100,100,500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJTable
	
	
	/////////////////////////////////////////inner class ���� ///////////////////////////////////////////////////////
	public class TableEvt extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent me) {
//			System.out.println("�༱�� : "+jt.getSelectedRow()+" ������ : "+jt.getSelectedColumn());
//			String selectedValue = (String)jt.getValueAt(jt.getSelectedRow(), jt.getSelectedColumn());
			
			
			StringBuilder viewData = new StringBuilder();
			int selectedRow = jt.getSelectedRow();
			int columnCount = jt.getColumnCount();
			
			int flag = JOptionPane.showConfirmDialog(ujt, "���� ������ ��ȸ, �ƴϿ��� ������ ������ �����մϴ�.");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				for (int i = 0; i < columnCount; i++) {
					viewData.append(jt.getValueAt(selectedRow, i)).append("\n");
				}
				JOptionPane.showMessageDialog(ujt, viewData);
				break;
			case JOptionPane.NO_OPTION:
				switch (JOptionPane.showConfirmDialog(ujt, "���� �����Ͻðڽ��ϱ�")) {
				case JOptionPane.OK_OPTION:
					dtm.removeRow(selectedRow);
					break;
				}
				break;
			}
			
			
			
		}
		
		
	}//TableEvt
	/////////////////////////////////////////inner class �� ///////////////////////////////////////////////////////
	
	
	
	public static void main(String[] args) {
		new UseJTable();
	}//main

	@Override
	public void actionPerformed(ActionEvent ae) {
		String inputData = JOptionPane.showInputDialog("�������Է�\n��)��ȣ,�̸�,�ּ�,�̸���");
		//��ȿ�� ����
//		4,�̺���, ����� ���۱�, bong@test.com
		if (inputData == null) {
			return;
		}
		String[] tempData = inputData.split(",");
				
		if (tempData.length != 4) {
			JOptionPane.showMessageDialog(this, "�Է� �������� ���´� \n��ȣ,�̸�,�ּ�,�̸��� �̾���մϴ�", "�Է� ����", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (!tempData[3].contains("@")||!tempData[3].contains(".")) {
//			System.out.println("����üũ�޼���");
			JOptionPane.showMessageDialog(this, "�̸����� ���°� �߸��Ǿ����ϴ�.", "�Է� ����", JOptionPane.ERROR_MESSAGE);
			return;
		}
		dtm.addRow(tempData);
		
		
		
		
		
	}

}//class
