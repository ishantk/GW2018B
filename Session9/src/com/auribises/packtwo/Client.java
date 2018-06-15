package com.auribises.packtwo;

import com.auribises.packone.One;
// import com.auribises.packone.Two; // error | Default classes cannot be accessed outside packages

class CB extends One{
	// protected and public will be inherited
	// protected behaves as private
	
	void show(){
		//pvtShow(); err
		//defShow(); err
		protShow();
	}
}

public class Client {

	public static void main(String[] args) {
			
		//One oRef = new One();
		// oRef.pvtShow(); // error
		// oRef.defShow();  // error
		// oRef.protShow(); // error
		//oRef.pubShow();

		CB cbRef = new CB();
		//cbRef.protShow(); // error
		//cbRef.pubShow();
		cbRef.show();
	}

}
