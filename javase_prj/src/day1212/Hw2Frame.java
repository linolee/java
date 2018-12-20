package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

@SuppressWarnings("serial")
public class Hw2Frame extends Frame{

	private TextField tfName, tfAge, tfAdr;
	private List list;
	private Button btnAdd, btnDel, btnUpd, btnClo;
	
	
	public Hw2Frame() {
		Label lblName, lblAge, lblAdr;
		
		lblName = new Label("이름");
		lblAge = new Label("나이");
		lblAdr = new Label("주소");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAdr = new TextField();
		
		list = new List();
		
		btnAdd = new Button("추가");
		btnDel = new Button("삭제");
		btnUpd = new Button("변경");
		btnClo = new Button("닫기");
		
		setLayout(null);
		setVisible(true);
		setBounds(50, 50, 800, 800);
		setResizable(false);
		
		lblName.setBounds(100, 100, 50, 30);
		lblAge.setBounds(100, 150, 50, 30);
		lblAdr.setBounds(100, 200, 50, 30);
		add(lblName);
		add(lblAge);
		add(lblAdr);

		tfName.setBounds(200, 100, 100, 30);
		tfAge.setBounds(200, 150, 100, 30);
		tfAdr.setBounds(200, 200, 100, 30);
		add(tfName);
		add(tfAge);
		add(tfAdr);
		
		btnAdd.setBounds(150, 300, 50, 30);
		btnDel.setBounds(200, 300, 50, 30);
		btnUpd.setBounds(250, 300, 50, 30);
		btnClo.setBounds(300, 300, 50, 30);
		add(btnAdd);
		add(btnDel);
		add(btnUpd);
		add(btnClo);
		
		list.setBounds(350, 100, 150, 150);
		add(list);
		
		Hw2Function func;
		func = new Hw2Function(this);
		
		addWindowListener(func);
		list.addItemListener(func);
		tfName.addActionListener(func);
		tfAge.addActionListener(func);
		tfAdr.addActionListener(func);
		btnAdd.addActionListener(func);
		btnDel.addActionListener(func);
		btnUpd.addActionListener(func);
		btnClo.addActionListener(func);

			
		
	}
	
	
	
	public TextField getTfName() {
		return tfName;
	}



	public TextField getTfAge() {
		return tfAge;
	}



	public TextField getTfAdr() {
		return tfAdr;
	}



	public List getList() {
		return list;
	}



	public Button getBtnAdd() {
		return btnAdd;
	}



	public Button getBtnDel() {
		return btnDel;
	}



	public Button getBtnUpd() {
		return btnUpd;
	}



	public Button getBtnClo() {
		return btnClo;
	}



	public static void main(String[] args) {
		new Hw2Frame();
	}

}
