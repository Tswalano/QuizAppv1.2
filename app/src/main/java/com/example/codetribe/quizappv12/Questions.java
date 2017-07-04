package com.example.codetribe.quizappv12;

import java.util.ArrayList;
import java.util.List;

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

   public String myAnswers[][] = {
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

    public String myCorrectAnswers[] = {
            "Java Development Kit",
            "Java Virtual Machine",
            "Numbers",
            "All Of The Above",
            "There are 10 primitive types in Java",
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
        String cAnswer = myCorrectAnswers[a];
        return cAnswer;
    }

    //--------------------------------------------------------------------------------------------//
    ////////////////////////////////QUESTIONS FOR SECOND CATEGORY///////////////////////////////////
    //--------------------------------------------------------------------------------------------//

    public String cat2Questions[] = {
            "What is the name of the Android Icon?",
            "What are the basic requirements of creating Android Application?",
            "What is the latest version of Android?",
            "Who currently own Android?",
            "What API level is Marshmallow",
            "What is Android API Level 22",
            "When was the first beta version of the Android released?"
    };

    public String cat2Answers[][] = {
            {"Andy The Android","Android","Green Man","None of The Above"},
            {"Java","Android","Java & XML","XML"},
            {"KitKat","Lollipop","Marshmallow","Oreo"},
            {"Google","SunMicrosoft","Oracle","Samsung"},
            {"21","23","25","19"},
            {"Lollipop","KitKat","Nougat","Marshmallow"},
            {"1989","2007","2000","2010"},
    };

    public String cat2CorrectAnswers[] = {
            "Andy The Android",
            "Java & XML",
            "Oreo",
            "Google",
            "23",
            "Lollipop",
            "2007",
    };

    public String getC2Questions(int a){
        String question = cat2Questions[a];
        return question;
    }

    public String getC2Answer1(int a){
        String answer = cat2Answers[a][0];
        return answer;
    }

    public String getC2Answer2(int a){
        String answer = cat2Answers[a][1];
        return answer;
    }

    public String getC2Answer3(int a){
        String answer = cat2Answers[a][2];
        return answer;
    }

    public String getC2Answer4(int a){
        String answer = cat2Answers[a][3];
        return answer;
    }

    public String getC2CorrectAnswer(int a){
        String cAnswer = cat2CorrectAnswers[a];
        return cAnswer;
    }
}
