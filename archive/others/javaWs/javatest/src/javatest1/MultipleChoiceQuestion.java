package javatest1;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	static int nQuestions = 0;
	static int nCorrect = 0;

	String question;
	String correctAnswer;

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

	/**
	 * @param question      to ask
	 * @param correctAnswer to show after wrong
	 */
	void check() {
		String answer = ask();
		nQuestions++;
		if (answer.equalsIgnoreCase(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect.The correct answer is! " + correctAnswer);
		}
	}
	static void showResults() {
		JOptionPane.showMessageDialog(null,nCorrect+" correct out of questions "+nQuestions);
	}
}
