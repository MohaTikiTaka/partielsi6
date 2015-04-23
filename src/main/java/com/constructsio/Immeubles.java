package com.constructsio;

import com.constructsio.Option;

public class Immeubles {

	public int prix = 1000000;

	public Option option = new Option();


	public Immeubles(int prix){

		this.prix =prix;
	}

	public int calculPrix(){

		return prix+option.prix;
	}
}
