package com.auribises.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.auribises.model.User;

public class WelcomeUserUI implements ActionListener{
	// 1. Declare the components and containers required to design UI
	
	JFrame fr;
	
	JLabel lblTitle;
	
	JButton btnCancel;
	
	JPanel pnlTitle, pnlButton, pnlAll;
	
	public WelcomeUserUI(User uRef) {
	
		fr = new JFrame("Welcome");
		//fr.setTitle("Welcome");
		
		lblTitle = new JLabel("Welcome, "+uRef.name+" Email: "+uRef.email);
		

		btnCancel = new JButton("Cancel");
		

		btnCancel.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
	}
	
	public void showUI(){
		
		pnlTitle.add(lblTitle);
		
		
		pnlButton.add(btnCancel);
		
		pnlAll.add(pnlTitle);
		
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
		System.out.println("Cancel Clicked");
		fr.dispose();
	}
}
