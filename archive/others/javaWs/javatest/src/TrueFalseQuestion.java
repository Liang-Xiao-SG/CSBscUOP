import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class TrueFalseQuestion extends Question {

    List<String> trueAnswers = Arrays.asList("T", "TRUE", "Y", "YES");
    List<String> falseAnswers = Arrays.asList("F", "FALSE", "N", "NO");

    public TrueFalseQuestion(String question, String correctAnswer) {
        this.question = "TRUE or FALSE: " + question;
        this.correctAnswer = getAnswer(correctAnswer);
    }

    @Override
    String ask() {

        while(true) {
            String answer = getAnswer(JOptionPane.showInputDialog(question).toUpperCase());

            if(answer.equals("INVALID"))
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
            else
                return answer;
        }
    }

    private String getAnswer(String answer) {
        if(trueAnswers.contains(answer))
            return "TRUE";
        else if(falseAnswers.contains(answer))
            return "FALSE";
        else
            return "INVALID";
    }
}
