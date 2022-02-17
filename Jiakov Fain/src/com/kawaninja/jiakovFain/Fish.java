package com.kawaninja.jiakovFain;

public class Fish extends Pet {

		int currentDepth = 0;
		
		public int dive (int howDeep) {
			currentDepth = currentDepth + howDeep;
			System.out.println ("Dive on Depth " + howDeep + " futs");
			
			System.out.println ("Im on Depth " + currentDepth + " futs below See Level");
			return currentDepth;
		}
		
		public String say (String something) {
			return "U didnt know, that fish dont say?";
		}
		
	
	}


