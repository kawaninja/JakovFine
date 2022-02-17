package com.kawaninja.car;

public class Car {
	
	public void start () {
		
	}

	public void stop () {
		
	}
	
	int distance =0;
	
	public int drive (int howLong) {
		distance = distance + howLong * 60;
		System.out.println ("Я проехал " + distance + " км");
		return distance;
	}
}
