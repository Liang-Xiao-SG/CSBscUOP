package javatest2;

import javax.swing.JOptionPane;
public class Quiz {

	static int nQuestions = 0;
	static int nCorrect = 0;
	static void check(String question, String correctAnswer) {
		String answer = ask(question);
		if (answer.equals("E")) {
			JOptionPane.showMessageDialog(null,"Correct");
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is E. All of the above");
		}
	}
	static String ask(String question) {
		String kaye = "What is Quantum Entanglement?\n";
		kaye += "A. Its a science concept\n";
		kaye += "B. Physical phenomena that occurs between particles\n";
		kaye += "C. Multiple particles are linked together\n";
		kaye += "D. Schrödinger came up with the term\n";
		kaye += "E. All of the above\n";
		while (true) {
			String answer = JOptionPane.showInputDialog(kaye);
			answer = answer.toUpperCase();
			if (answer.equals("E") || answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")) {
				kaye = kaye.toUpperCase();
				JOptionPane.showMessageDialog(null,kaye);
			}else{
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E");
			}
		}
	}
	public static void main(String[] args) {
		String question = "What is the most famous building of all time?\n";
		question += "A. Eiffel Tower\n";
		question += "B. Taj Mahal\n";
		question += "C. Tower Of Pisa\n";
		question += "D. Stature of Liberty\n";
		question += "E. Question if too vague\n";
		check(question, "D");
	}
}
