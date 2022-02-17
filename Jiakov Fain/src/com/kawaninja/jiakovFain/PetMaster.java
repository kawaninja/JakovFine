package com.kawaninja.jiakovFain;

public class PetMaster {
	public static void main(String[] args) {

	String petReaction;
	
	Pet myPet = new Pet();
	myPet.eat();
	petReaction = myPet.say("Tweet! Tweet!");
	System.out.println(petReaction);
	myPet.sleep();
	
//	Fish myLittleFish = new Fish ();
//	myLittleFish.sleep();
	
	Fish myFish = new Fish ();
	
	myFish.dive(2);
	myFish.dive(3);
//	myFish.sleep();
	
	petReaction = myFish.say("Hi");
	System.out.println(petReaction);
	}

}
