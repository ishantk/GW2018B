package com.auribises.view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.auribises.model.User;

public class RegisterUserUI implements ActionListener{
	
	// 1. Declare the components and containers required to design UI
	
	Frame fr; // fr is a ref var which will point to the object of Frame
	
	Label lblTitle, lblName, lblEmail, lblPassword;
	
	TextField txtName, txtEmail, txtPassword;
	
	Button btnRegister, btnCancel;
	
	Panel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButton, pnlAll;
	
	public RegisterUserUI() {
	
		fr = new Frame("Welcome");
		//fr.setTitle("Welcome");
		
		lblTitle = new Label("Please Enter Details to Register !!");
		
		lblName = new Label();
		lblName.setText("Enter Your Name");
		
		lblEmail = new Label("Enter Your Email");
		lblPassword = new Label("Enter Your Password");
		
		txtName = new TextField(14);
		txtEmail = new TextField(14);
		txtPassword = new TextField(14);
		
		btnRegister = new Button("Register");
		btnCancel = new Button("Cancel");
		
		btnRegister.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pnlTitle = new Panel();
		pnlName = new Panel();
		pnlEmail = new Panel();
		pnlPassword = new Panel();
		pnlButton = new Panel();
		pnlAll = new Panel();
		
	}
	
	public void showUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlPassword.add(lblPassword);
		pnlPassword.add(txtPassword);
		
		pnlButton.add(btnRegister);
		pnlButton.add(btnCancel);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlPassword);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		//fr.setSize(400, 400);
		fr.pack(); // take the size whichever is required. Best Fit !!
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegister){
			System.out.println("Register Clicked");
			
			User uRef = new User();
			uRef.name = txtName.getText();
			uRef.email = txtEmail.getText();
			uRef.password = txtPassword.getText();
			
			System.out.println(uRef);
			
		}else{
			System.out.println("Cancel Clicked");
			fr.dispose();
		}
	}

}
