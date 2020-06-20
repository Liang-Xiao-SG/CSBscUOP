package javatest;
import javax.swing.JOptionPane;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String question = "What is a PI?\n";
		question += "A. a test of knowledge, especially a brief, informal test given to students\n";
		question += "B. 3.14\n";
		question += "C. one movie character  \n";
		question += "D. an infinate number to describe the relationship between circumstance and radius\n";
		question += "E. sign just for fun\n";
		
		flag:while(true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			switch (answer) {
			case "A":
			case "B"://flow down to incorrect answer
			case "E"://flow down to incorrect answer
			case "C":JOptionPane.showMessageDialog(null,"\"Incorrect. Please try again!");
			continue;
			case "D":JOptionPane.showMessageDialog(null,"Correct!");
			break flag;
			//condition meet end program
			default:JOptionPane.showMessageDialog(null,"\"invalid input. Please try again!");
			}
				
		}

	}

}
