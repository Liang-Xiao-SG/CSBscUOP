package javatest5;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

	public static void main(String[] args) {
		List <Question>questionArry = prepareQuestion();
		for(Question q:questionArry) {
			q.check();
		}

		Question.showResults();
	}

	/**
	 * @return a set of questions as Array
	 */
	private static List  <Question>prepareQuestion() {
		List <Question>list=new ArrayList<>();
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
		Question q1 = new MultipleChoiceQuestion(string, string2, string3, string4, string5, string6,
				"D");
		Question q2 = new MultipleChoiceQuestion(string7, string8, string9, string10, string11, string12,
				"A");
		Question q3 = new MultipleChoiceQuestion(string13, string14, string15, string16, string17,
				string18, "C");
		Question q4 = new MultipleChoiceQuestion("very very new question lol", string, string2, string3,
				string4, string18, "C");
		Question q5 = new MultipleChoiceQuestion("super super new question", string5, string6, string8,
				string16, string18, "C");
		
		Question q6 = new TrueFalseQuestion("to be or not to be ", "TRUE");
		Question q7 = new TrueFalseQuestion("to be or not to be / i dont want to be", "FALSE");
		Question q8 = new TrueFalseQuestion("hot is cold  ", "FALSE");
		Question q9 = new TrueFalseQuestion("Summer is hot ", "TRUE");
		
		
		list.add(q6);
		list.add(q7);
		list.add(q8);
		list.add(q9);
		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
		list.add(q5);

		return list;
	}
}

