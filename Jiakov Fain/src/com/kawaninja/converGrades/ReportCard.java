package com.kawaninja.converGrades;

public class ReportCard {

	public static void main(String[] args) {

		ReportCard rc = new ReportCard();
		char yourGrade = rc.convertGrades(88);
		
		System.out.println ("Ваша первая оценка " + yourGrade);
		
		switch (yourGrade) {
		case 'A':
		System.out.println ("Excellent Work!");
		break;
		}
		
		switch (yourGrade) {
		case 'B':
		System.out.println ("Good Job!");
		break;
		}
		
		switch (yourGrade) {
		case 'C':
		System.out.println ("You need learning more(");
		break;
		}
		
		switch (yourGrade) {
		case 'D':
		System.out.println ("Be seriosly!");
		break;
		}
		
		
		
		yourGrade = rc.convertGrades(79);
		
		
		
		System.out.println ("Ваша вторая оценка " + yourGrade);
		
		
	
		switch (yourGrade) {
		case 'A':
		System.out.println ("Excellent Work!");
		break;
		}
		
		switch (yourGrade) {
		case 'B':
		System.out.println ("Good Job!");
		break;
		}
		
		switch (yourGrade) {
		case 'C':
		System.out.println ("You need learning more(");
		break;
		}
		
		switch (yourGrade) {
		case 'D':
		System.out.println ("Be seriosly!");
		break;
		}
		}
	
	
	
	
	public char convertGrades (int testResult) {
		
		char grade;
		
		if (testResult >= 90) {
			grade = 'A';
		}
		
		else if (testResult >= 80 && testResult < 90) {
			grade = 'B';
		}
		
		else if (testResult >= 70 && testResult < 80) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		return grade;
	}
	
		
	}


