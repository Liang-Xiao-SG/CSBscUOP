package javatest1;
import javax.swing.JOptionPane;
public class Quiz {

	/**
	 * to record number of Questions
	 */
	static int nQuestions = 0;
	/**
	 * to record number of Correct Answers
	 */
	static int nCorrect = 0;
	public static void main(String[] args) {
		String []questionArry = prepareQuestion();
		check(questionArry[0], "D");
		check(questionArry[1], "A");
		check(questionArry[2], "C");
		JOptionPane.showMessageDialog(null,nCorrect+" correct out of questions "+nQuestions);
		
		check(1, 2);
		}

	/**
	 * @param question
	 * @return valid answer
	 */
	static String ask(String question) {
		String answer = JOptionPane.showInputDialog(question);
		answer= answer.toUpperCase();
		switch (answer) {
		case "A":
		case "B":
		case "E":
		case "C":
		case "D":return answer;//valid answer not has to be correct
		default:JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
		return ask(question);
		}
	}
	static void check(int a,int b) {
		
	}
	/**
	 * @param question to ask
	 * @param correctAnswer to show after wrong
	 */
	static void check(String question, String correctAnswer) {
		String answer = ask(question);
		nQuestions++;
		if(answer.equalsIgnoreCase(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
		}else {
			JOptionPane.showMessageDialog(null,"Incorrect.The correct answer is! "+correctAnswer);
		}
	}
	/**
	 * @return a set of questions as Array
	 */
	private static String[] prepareQuestion() {
		String[]questArr= new String[3];
		String question = "What is a PI?\n";
		question += "A. a test of knowledge, especially a brief, informal test given to students\n";
		question += "B. 3.14\n";
		question += "C. one movie character  \n";
		question += "D. an infinate number to describe the relationship between circumstance and radius\n";
		question += "E. sign just for fun\n";
		
		String question1 = "What is a Animal?\n";
		question1 += "A. like dog or cats\n";
		question1 += "B. 3.14\n";
		question1 += "C. no answer  \n";
		question1 += "D. an infinate number to describe the relationship between circumstance and radius\n";
		question1 += "E. hello world\n";
		
		String question2 = "nice to meet you ?\n";
		question2 += "A. a test of knowledge, especially a brief, informal test given to students\n";
		question2 += "B. 3.14\n";
		question2 += "C. nice to meet you ,too \n";
		question2 += "D. an infinate number to describe the relationship between circumstance and radius\n";
		question2 += "E. sign just for fun\n";
		questArr[0]=question;
		questArr[1]=question1;
		questArr[2]=question2;
		return questArr;
	}
}
