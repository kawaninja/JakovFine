package com.kawaninja.car;

public class JamesBondCar extends Car {

		public int drive (int howLong) {
			distance = distance + howLong * 180;
			System.out.println ("Я проехал " + distance + " км" + " на машине Бонда");
			return distance;
	}

}
