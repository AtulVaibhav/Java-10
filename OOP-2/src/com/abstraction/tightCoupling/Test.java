package com.abstraction.tightCoupling;

public class Test {

	public static void main(String[] args) {
		Airtel airtel = new Airtel("Airtel.co");
		JIO obj = new JIO("JIO.in");
		String name = null;
		
		MobileSim mobileSim = new MobileSim(obj);
	    name = mobileSim.getSim();
		System.out.println(name);

	}

}
