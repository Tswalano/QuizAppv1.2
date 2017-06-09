package com.example.codetribe.quizappv12;
import java.util.*;

public class Questions {

   public String myQuestions[] = {
           "what is the Acronym of JDK", //Java Development Kit
           "what is the Acronym of JVM", //Java Virtual Machine
           "Which of the following is NOT functionalist's of the Math class", //Exponential – Logarithmic – Trigonometric – Random
           "Which of the following is Advantages of Using Methods", // Are reusable • Make programs shorter and more readable • Make development and maintenance quicker •
           "Which statement is false? ", //a. There are eight primitive types built in to the Java programming language. b. byte, short, char, and long are the four integral primitive data types in the Java programming language. c. A boolean type variable holds true, false, and nil. d. short Long = 10; is a valid statement that adheres to the variable declaration and initialization syntax.
           "which of the following Primitive Data Types is incorrect", //Integral types (byte, short, int, and long)
           "Which of the following is correct?", //a. javac OrderClass b. java OrderClass c. javac OrderClass.java d. java OrderClass.java
           "Which main method syntax is correct?", //a. Public static void main (String[ ] args){ } b. public Static void Main (String[ ] args){ } c. public static void main (String ( ) args)[ ] d. public static void main (String[ ] args){ }
           "Which of the following variable declarations and/or initializations are correct?" //a. int count = 5; quantity = 2; b. string name, label; c. boolean complete = "false"; d. boolean complete = true;
   };

   private String myAnswers[][] = {
           {"Java Development Kit", "Java Development Knowledge","Java Downloaded Kit","None Of The Above"},
           {"Java Video Mobility", "Java Value Money","Java Virtual Machine","None Of The Above"},
           {"Exponential", "Numbers","Logarithmic","Random"},
           {"Are reusable", "Make programs shorter and more readable","Make development and maintenance quicker","All Of The Above"},
           {"There are 10 primitive types in Java",
                   "byte, short, char, and long are the four integral primitive of Java",
                   "A boolean type variable holds true, false, and nil.",
                   "short Long = 10; is a valid syntax for variable declaration and initialization"},
           {"byte", "short","string","long"},
           {"javac OrderClass", "java OrderClass","javac OrderClass.java","java OrderClass.java"},
           {"public static void main(String[] args){ }", "public Static void Main (String[ ] args){ }",
                   "public static void main (String ( ) args)[ ]","public static void main (String[ ] args)( )"},
           {"int count = 5; quantity = 2;","boolean complete = \"false\";","boolean complete = true", "string name, label;"},
    };

    private String mCorrectAnswers[] = {
            "Java Development Kit",
            "Java Virtual Machine",
            "Numbers",
            "All Of The Above",
            "There are 10 primitive types built in to the Java programming language.",
            "string",
            "javac OrderClass.java",
            "public static void main(String[] args){ }",
            "boolean complete = true"
    };

    public String getQuestions(int a){
        String question = myQuestions[a];
        return question;
    }

    public String getAnswer1(int a){
        String answer = myAnswers[a][0];
        return answer;
    }

    public String getAnswer2(int a){
        String answer = myAnswers[a][1];
        return answer;
    }

    public String getAnswer3(int a){
        String answer = myAnswers[a][2];
        return answer;
    }

    public String getAnswer4(int a){
        String answer = myAnswers[a][3];
        return answer;
    }

    public String getCorrectAnswer(int a){
        String cAnswer = mCorrectAnswers[a];
        return cAnswer;
    }

}
