package com.abstraction.looseCoupling;

public class JIO implements Sim {
    private String simName; 
	
	JIO(String simName){
		this.simName = simName;
	}
	@Override
	public String getSimName() {
		return this.simName;
	}

}
