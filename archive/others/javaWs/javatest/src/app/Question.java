package app;

import javax.swing.JOptionPane;

public abstract class Question {
    
    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    abstract String ask();

    void check() {

        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect = nCorrect+1;}
        else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")) {
            JOptionPane.showMessageDialog(null,"Incorrect. The answer is " + correctAnswer);}
        else if (answer.equals("TRUE") || answer.equals("FALSE")) {
            JOptionPane.showMessageDialog(null, "Incorrect. The answer is " + correctAnswer);}  

    }            
    static void showResults()
        {JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");}
}