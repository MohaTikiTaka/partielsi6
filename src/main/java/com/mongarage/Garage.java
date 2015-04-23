package com.mongarage;


public class Garage {
	
	Voiture v1 = new Voiture();
	Voiture v2 = new Voiture();
	Moto m1 = new Moto();
	Moto m2 = new Moto();
	
	void initVoiture(){
		v1.marque = "audi";
		v2.marque = "mercedes";
		
	}
	void initMoto(){
		m1.marque = "derbi";
		m2.marque = "ktm";
	}
	

}
