package javatest7Assignment;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MultipleChoiceQuestion extends Question {
	

	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		super(query);
		
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		correctAnswer = answer;
		initQuestionDialog();
	}

	void addChoice(String name, String label) {
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button,BorderLayout.WEST);
		choice.add(new JLabel(label+" ",JLabel.LEFT),BorderLayout.CENTER);
		question.add(choice);
	}

}
