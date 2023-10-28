package com.abstraction.looseCoupling;

public class LooseCoupling {

	public static void main(String[] args) {
		Airtel airtel = new Airtel("Airtel.com");
		JIO jio = new JIO("JIO.in");
		MobileSim mobileSim = new MobileSim(airtel);
		System.out.println(mobileSim.getSimName());
	}

}
