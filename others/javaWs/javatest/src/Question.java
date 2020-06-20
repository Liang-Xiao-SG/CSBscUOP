import javax.swing.*;

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
            JOptionPane.showMessageDialog(null, "The answer is correct!");
            nCorrect++;
        }
        else
            JOptionPane.showMessageDialog(null, "The answer is wrong! The correct answer is '" + correctAnswer + "'");
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, "The number of questions is " + nQuestions +
                ".\nThe number of correct answers is " + nCorrect + ".");
    }
}
