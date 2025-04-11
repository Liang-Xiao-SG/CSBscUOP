package javatest5;

import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;

	String question;
	String correctAnswer;
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
	abstract String ask();
}
