package com.abstraction.looseCoupling;

public class MobileSim {
    private Sim sim;
    MobileSim(Sim sim){
    	this.sim = sim;
    }
    
    public String getSimName(){
    	return this.sim.getSimName();
    }
}
