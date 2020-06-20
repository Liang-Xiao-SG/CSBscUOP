package javatest7Assignment;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TrueFalseQuestion extends Question {
	

	
	public TrueFalseQuestion(String question,String correctAnswer) {
		super(question);
		JPanel buttons=new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		//add true false buttons to JPanel
		this.question.add(buttons); 
		//keep box until control return by dispose
		initQuestionDialog();
		this.correctAnswer=correctAnswer;

	}

	
	void addButton(JPanel buttons,String label) {
		JButton button =new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}
	

//	public static void main(String[] args) {
//		TrueFalseQuestion s=new TrueFalseQuestion();
//		s.ask();
//	}

}
