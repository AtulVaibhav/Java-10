package com.abstraction.tightCoupling;

public class MobileSim {
  // private Airtel airtel;
	 private JIO jio;
   MobileSim(JIO jio){
	   this.jio = jio;
   }
   
   public String getSim(){
	   return this.jio.getSimName();
   }
}
