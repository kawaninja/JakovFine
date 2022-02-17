package com.kawaninja.jiakovFain;

public class Pet {
	int age;
	float weight;
	float height;
	String color;

	final public void sleep() {
		System.out.println("Good night! To see u");
	}

	public void eat() {
		System.out.println("Im hungry, lets go eating cheaps!");
	}

	public String say(String aWord) {
		String petResponse = "Ok! " + aWord;
		return petResponse;
	}
}
