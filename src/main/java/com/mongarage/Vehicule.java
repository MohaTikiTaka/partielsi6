package com.mongarage;

public class Vehicule {
	public int prix = 0;
	public Option option = new Option();
	public Option option2 = new Option();
	
	public Vehicule(int prix){
		this.prix =prix;
	}
	
	public int calculerPrix(){
		return prix+option1.prix+option2.prix;
	}

}
