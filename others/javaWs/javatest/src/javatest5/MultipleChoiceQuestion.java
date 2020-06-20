package javatest5;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
	

	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query + "\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		correctAnswer = answer;
	}

	String ask() {
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		switch (answer) {
		case "A":
		case "B":
		case "E":
		case "C":
		case "D":
			return answer;// valid answer not has to be correct
		default:
			JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
			return ask();
		}
	}


}
