package com.auribises.packone;

public class Client {

	public static void main(String[] args) {
		
		// Create Object of One
		One oRef = new One();

		// Create Object of Two
		Two tRef = new Two();
		
		//oRef.pvtShow(); error
		//tRef.pvtShow(); error
		
		oRef.defShow();
		tRef.defShow();
		System.out.println("----------------");
		oRef.protShow();
		tRef.protShow();
		System.out.println("----------------");
		oRef.pubShow();
		tRef.pubShow();
		
		CA caRef = new CA();
		//caRef.pvtShow(); Not Inherited
		caRef.defShow();
		caRef.protShow();
		caRef.pubShow();
	}

}
