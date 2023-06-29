package org.launchcode.funandquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckboxQuestion extends Question {
    private ArrayList<String> possibleAnswer;
    private ArrayList<Integer> correctAnswer;



    public CheckboxQuestion(int pointValue, String text, ArrayList<String> possibleAnswer, ArrayList<Integer> correctAnswer) {
        super(pointValue, text);
        this.possibleAnswer = possibleAnswer;
        this.correctAnswer = correctAnswer;
    }
    public void displayAnswers(){
        for (int i = 0; i < possibleAnswer.size(); i++) {
            System.out.println(possibleAnswer.get(i));
        }
    }
 public int checkAnswers(ArrayList<Integer> check){
        int answerCorrect = 0;
        for(int i = 0; i < possibleAnswer.size(); i++){
            if(correctAnswer.contains())
        }
    }
    @Override
    public int getAnswers() {
        ArrayList<String> userAnswer = new ArrayList<>();
        System.out.println("Multiple Questions?");
        Scanner userContinue = new Scanner(System.in);
        String goingContinue = userContinue.nextLine();
       while (goingContinue.indexOf('y') >= 0 && userAnswer.size()<= possibleAnswer.size());
       System.out.println("what will your Question?");
       Scanner userAnswers = new Scanner(System.in);
       String answer = userAnswers.nextLine();
       int option = Integer.parseInt(answer);
       System.out.println("For this Question");;
       goingContinue = userContinue.nextLine();
    }


}
