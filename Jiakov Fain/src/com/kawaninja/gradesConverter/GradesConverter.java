package com.kawaninja.gradesConverter;

public class GradesConverter {

	public static void converter(double temperature, char convertTo) {
		if (convertTo == 'F') {
			temperature = (temperature * 9 / 5) + 32;
			System.out.println("Температура равна " + temperature + " F");
		}

		else
			System.out.println("Температура равна " + temperature + " C");

	}

	public static void main(String[] args) {

		GradesConverter.converter(40, 'F');
		GradesConverter.converter(5, 'C');
	}

}
