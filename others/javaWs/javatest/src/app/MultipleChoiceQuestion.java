package app;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {

    MultipleChoiceQuestion(final String query, final String a, final String b, final String c, final String d, final String e, final String answer) {

        question = query+"\n";
        question += "A. "+a+"\n";
        question += "B. "+b+"\n";
        question += "C. "+c+"\n";
        question += "D. "+d+"\n";
        question += "E. "+e+"\n";
        
        correctAnswer = answer;
        correctAnswer = answer.toUpperCase();
    }

    String ask() {

        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
            if (valid) return answer;
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E.");
        }
    }
}