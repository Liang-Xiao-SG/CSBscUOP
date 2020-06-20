package javatest3;

import javax.swing.JOptionPane;

public class Quiz {
	
	static String answer;
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	static String ask(String question) {
		
		answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		while(!(answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")||answer.equals("E"))) {
		JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
		answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		}
		return answer;
	}
	
	static void check(String question, String correctAnswer) {
		String answer = ask(question);
		nQuestions++;
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect answer! the correct answer is: " + correctAnswer);
		}
	}
	public static void main(String[] args) {
	
		String question1 = "Which of the following car brands is German made:\n\n";
		question1 += "A. Fiat\n";
		question1 += "B. Volvo\n";
		question1 += "C. Kia\n";
		question1 += "D. Volkswagen\n";
		question1 += "E. Honda\n\n";
		
		String question2 = "Which country of the following located in north america:\n\n";
		question2 += "A. France\n";
		question2 += "B. Canada\n";
		question2 += "C. Brazil\n";
		question2 += "D. Germany\n";
		question2 += "E. Japan\n\n";
		
		String question3 = "What is the currency of the united states:\n\n";
		question3 += "A. EUR\n";
		question3 += "B. INR\n";
		question3 += "C. CAD\n";
		question3 += "D. SYP\n";
		question3 += "E. USD\n\n";
		
		String question4 = "Which country is the largest by area:\n\n";
		question4 += "A. Russia\n";
		question4 += "B. China\n";
		question4 += "C. India\n";
		question4 += "D. Canada\n";
		question4 += "E. Ice Land\n\n";
		
		check(question1,"D");
		check(question2,"B");
		check(question3,"E");
		check(question4,"A");
		
		JOptionPane.showMessageDialog(null, nCorrect + " correct answer out of " + nQuestions + " questions");
		
		
	
	}
}