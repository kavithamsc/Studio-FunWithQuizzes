package org.launchcode.funandquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
    private ArrayList<String> possibleAnswer;
    private int correctAnswer;

    public MultipleChoiceQuestion(int pointValue, String text) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
        this.possibleAnswer = possibleAnswer;
        setPointValue(1);
    }

    public void displayAnswers() {
        for (int i = 0; i < possibleAnswer.size(); i++) {
            System.out.println(possibleAnswer.get(i));
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("what will your answer be? Enter the number of the option you believe is correct Answers. to begin answer  ");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        return 0;
    }


}
