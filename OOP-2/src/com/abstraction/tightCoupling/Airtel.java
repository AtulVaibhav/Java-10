package com.abstraction.tightCoupling;

public class Airtel {
  private String simName;
  Airtel(String simName){
	  this.simName = simName;
  }
   public String  getSimName(){
	   return this.simName;
   }
}
