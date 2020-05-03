package javatest1;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		MultipleChoiceQuestion[] questionArry = prepareQuestion();
		questionArry[0].check();
		questionArry[1].check();
		questionArry[2].check();
		JOptionPane.showMessageDialog(null, MultipleChoiceQuestion.nCorrect + " correct out of questions " + MultipleChoiceQuestion.nQuestions);

	}

	/**
	 * @return a set of questions as Array
	 */
	private static MultipleChoiceQuestion[] prepareQuestion() {
		MultipleChoiceQuestion[] questArr = new MultipleChoiceQuestion[3];
		String string = "What is a PI?\n";
		String string2 = "a test of knowledge, especially a brief, informal test given to students";
		String string3 = "3.14";
		String string4 = "one movie character";
		String string5 = "an infinate number to describe the relationship between circumstance and radius";
		String string6 = "sign just for fun";

		String string7 = "What is a Animal?";
		String string8 = "like dog or cats";
		String string9 = "3.14";
		String string10 = "no answer";
		String string11 = "an infinate number to describe the relationship between circumstance and radius";
		String string12 = "hello world";

		String string13 = "nice to meet you ?";
		String string14 = "a test of knowledge, especially a brief, informal test given to students";
		String string15 = "3.14";
		String string16 = "nice to meet you ,too";
		String string17 = "an infinate number to describe the relationship between circumstance and radius";
		String string18 = "sign just for fun";
		MultipleChoiceQuestion q1 = new MultipleChoiceQuestion(string, string2, string3, string4, string5, string6,
				"D");
		MultipleChoiceQuestion q2 = new MultipleChoiceQuestion(string7, string8, string9, string10, string11, string12,
				"A");
		MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(string13, string14, string15, string16, string17,
				string18, "C");

		questArr[0] = q1;
		questArr[1] = q2;
		questArr[2] = q3;
		return questArr;
	}
}
