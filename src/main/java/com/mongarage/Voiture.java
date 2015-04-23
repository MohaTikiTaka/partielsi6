package com.mongarage;

public class Voiture extends Vehicule {
	public Voiture(int prix) {
		super(prix);
	}

	public boolean tatouageVitre = false;

	public void tatouerVitre(){
		tatouageVitre=true;
		
	
	}
	public void detatouerVitre(){
		tatouageVitre=false;
		
	}
	

}
