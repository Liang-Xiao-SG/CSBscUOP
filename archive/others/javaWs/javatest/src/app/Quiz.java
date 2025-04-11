package app;

public class Quiz {
    
    public static void main(String[] args) {
        Question TFquestion1 = new TrueFalseQuestion("Programming is fun.", "TRUE");
        TFquestion1.check();
        Question TFquestion2 = new TrueFalseQuestion("Programming is tough", "TRUE");
        TFquestion2.check();
        Question TFquestion3 = new TrueFalseQuestion("Programming is doable", "TRUE");
        TFquestion3.check();
        Question TFquestion4 = new TrueFalseQuestion("Programming is impossible", "FALSE");
        TFquestion4.check();
        Question TFquestion5 = new TrueFalseQuestion("Programming is for nerds", "FALSE");
        TFquestion5.check();
        Question MCquestion1 = new MultipleChoiceQuestion("What is 5 + 3?", "6", "3", "2", "8", "53", "d");
        MCquestion1.check();
        Question MCquestion2 = new MultipleChoiceQuestion("What is 6 - 2?", "1", "4", "3", "62", "5", "b");
        MCquestion2.check();
        Question MCquestion3 = new MultipleChoiceQuestion("What is 4 + 4?", "44", "7", "0", "9", "8", "e");
        MCquestion3.check();
        Question MCquestion4 = new MultipleChoiceQuestion("What is 9 - 6?", "3", "5", "1", "8", "96", "a");
        MCquestion4.check();
        Question MCquestion5 = new MultipleChoiceQuestion("What is 2 + 8?", "4", "6", "10", "7", "1", "c"); 
        MCquestion5.check();
    
        Question.showResults();
    }    
}