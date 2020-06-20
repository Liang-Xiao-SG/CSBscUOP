public class Quiz {

    public static void main(String[] args) {
        Question question =
                new MultipleChoiceQuestion("Which of the following video games is written in Java?",
                        "Call of Duty",
                        "Minecraft",
                        "The Witcher",
                        "Rainbow Six",
                        "Fortnite",
                        "B");
        question.check();

        question =
                new MultipleChoiceQuestion("How many devices run Java?",
                        "3 000 000 000",
                        "100",
                        "1",
                        "156 000",
                        "10 000 000",
                        "A");
        question.check();

        question =
                new MultipleChoiceQuestion("What was the name of Java at the beginning?",
                        "Oak",
                        "Pine",
                        "Willow",
                        "Maple",
                        "Elm",
                        "A");
        question.check();

        question =
                new MultipleChoiceQuestion("Who is a creator of the Java language?",
                        "Ryan Gosling",
                        "Jim Carrey",
                        "Elon Musk",
                        "Satoshi Nakamoto",
                        "James Gosling",
                        "E");
        question.check();

        question =
                new MultipleChoiceQuestion("What will be the output of this statement 'System.out.println(1 + 2 + \" = \" + 1 + 2);'\n",
                        "3 = 3",
                        "12 = 12",
                        "3 = 12",
                        "12 = 3",
                        "It doesn't compile",
                        "C");
        question.check();

        question =
                new TrueFalseQuestion("The modulus operator (%) in Java can be used only with variables of integer type",
                        "FALSE");
        question.check();

        question =
                new TrueFalseQuestion("The operations y >> 3 and y >>> 3 produce the same result when y > 0",
                        "TRUE");
        question.check();

        question =
                new TrueFalseQuestion("Consider the statement \"x = (a > b) ? a : b\"; then the value of x is 1, if a = 1 and b = 0",
                        "TRUE");
        question.check();

        question =
                new TrueFalseQuestion("The \"switch\" selection structure must end with the \"default\" case",
                        "FALSE");
        question.check();

        question =
                new TrueFalseQuestion("An array in the Java programming language has the ability to store many different types of values",
                        "FALSE");
        question.check();

        Question.showResults();
    }
}
