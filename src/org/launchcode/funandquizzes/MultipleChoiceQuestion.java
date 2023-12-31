package org.launchcode.funandquizzes;

import java.util.*;


class MultipleChoice extends Question {
    private List<String> options;

    public MultipleChoice(String prompt, List<String> options, String answer) {
        super(prompt, answer);
        this.options = options;
    }
    public String getAnswer() {
        return super.answer;
    }
    public boolean isAnswerCorrect(String userAnswer) {
        return userAnswer.equalsIgnoreCase(getAnswer());
    }

    @Override
    public void displayAnswers() {

    }

    @Override
    public int getAnswers() {
        return 0;
    }

    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((char) ('A' + i) + ") " + options.get(i));
        }
    }
}