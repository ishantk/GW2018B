package com.auribises.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddCustomerGUI implements ActionListener{
	
	JFrame fr; 
	
	JLabel lblTitle, lblName, lblPhone, lblEmail, lblAge;
	
	JTextField txtName, txtPhone, txtEmail, txtAge;
	
	JButton btnAddCustomer, btnCancel;
	
	JPanel pnlTitle, pnlName, pnlPhone, pnlEmail, pnlAge, pnlButton, pnlAll;
	
	public AddCustomerGUI() {
	
		fr = new JFrame("Add Customer");
		//fr.setTitle("Welcome");
		
		lblTitle = new JLabel("Please Enter Details to Add Customer !!");
		
		lblName = new JLabel();
		lblName.setText("Enter Customer Name");
		
		lblPhone = new JLabel("Enter Customer Phone");
		
		lblEmail = new JLabel("Enter Customer Email");
		lblAge = new JLabel("Enter Customer Age");
		
		txtName = new JTextField(14);
		txtPhone = new JTextField(14);
		txtEmail = new JTextField(14);
		txtAge = new JTextField(14);
		
		btnAddCustomer = new JButton("Add Customer");
		btnCancel = new JButton("Cancel");
		
		btnAddCustomer.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlPhone = new JPanel();
		pnlEmail = new JPanel();
		pnlAge = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
	}
	
	public void showUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlPhone.add(lblPhone);
		pnlPhone.add(txtPhone);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlAge.add(lblAge);
		pnlAge.add(txtAge);
		
		pnlButton.add(btnAddCustomer);
		pnlButton.add(btnCancel);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlPhone);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlAge);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(6, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		//fr.setSize(400, 400);
		fr.pack(); // take the size whichever is required. Best Fit !!
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAddCustomer){
			
		}else{
			fr.dispose();
		}
	}


}
