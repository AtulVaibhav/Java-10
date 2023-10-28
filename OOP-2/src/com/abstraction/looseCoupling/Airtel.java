package com.abstraction.looseCoupling;

public class Airtel implements Sim {
	private String simName; 
	
	Airtel(String simName){
		this.simName = simName;
	}

	@Override
	public String getSimName(){
		return this.simName;
	}
	
	
	

}
