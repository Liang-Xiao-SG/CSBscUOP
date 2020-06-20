package javatest7Assignment;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;

	QuestionDialog question;
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
	 String ask() {
		question.setVisible(true);
		return question.answer;
	}
	public Question(String question) {
		this.question =new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" "+question+" ", JLabel.CENTER));
	};
	void initQuestionDialog() {
		this.question.setModal(true);
		//resize the dialog box based on its contents
		this.question.pack();
		this.question.setLocationRelativeTo(null);

	}
	
}
