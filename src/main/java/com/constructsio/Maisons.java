package com.constructsio;

import com.constructsio.Option;

public class Maisons {

	public int prix = 150000;

	public Option option = new Option();

	public Maisons(int prix){

		this.prix =prix;
	}

	public int calculPrix(){

		return prix+option.prix;
	}
}

