package com.auribises;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class GUI implements MouseListener, MouseMotionListener, WindowListener{

	JFrame fr;
	
	GUI(){
		fr = new JFrame("Welcome");
	}
	
	void showUI(){
		
		fr.addMouseListener(this);
		fr.addMouseMotionListener(this);
		
		fr.setSize(400, 400);
		fr.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("==mouseClicked=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("==mousePressed=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("==mouseReleased=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("==mouseEntered=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("==mouseExited=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("==mouseDragged=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("==mouseMoved=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
