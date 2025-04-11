package javatest5;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	
	@Override
	String ask() {
	
			String answer = JOptionPane.showInputDialog(question);
			List<String> validAnswer = Arrays.asList( "f", "false", "False", "FALSE", "n", "no", "No", "NO", "t", "true",
					"T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES");
			while(true) {
				if(validAnswer.contains(answer)) {
					String upperCase = answer.toUpperCase();
					boolean result=upperCase.startsWith("Y")||upperCase.startsWith("T");
					return Boolean.toString(result);
				}else {
					JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
					return ask();
				}
			}	

		}
	
	
	public TrueFalseQuestion(String question,String correctAnswer) {
		super();
		this.question = "TRUE or FALSE: "+question;
		this.correctAnswer=correctAnswer;
	}


//	public static void main(String[] args) {
//		TrueFalseQuestion s=new TrueFalseQuestion();
//		s.ask();
//	}

}
