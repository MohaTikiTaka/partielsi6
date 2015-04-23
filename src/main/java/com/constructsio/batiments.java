package com.constructsio;

import com.constructsio.Option;

public class batiments{
	public int prix;{
				if (prix<0){
					throw new RuntimeException("prix non valide");
				}
				
				this.prix = prix;
			}
	public Option option = new Option();

	public batiments(final int prix){
		this.prix =prix;
	}

	public boolean batimentEtatConstruction = false;

	public void batimentEtatConstruction(){
		batimentEtatConstruction=true;


	}
	public void batimentNonConstruit(){
		batimentEtatConstruction=false;

	}

	public boolean batimentPayé = false;

	public void batimentPayé(){
		batimentPayé = true;
	}

	public void batimentNonPayé(){
		batimentPayé = false;
	}



	public int calculerPrix(){
		return prix+option.prix;

	}

}