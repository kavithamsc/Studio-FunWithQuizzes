package org.launchcode.funandquizzes;

class TrueOrFalseQuestion extends Question {
    public TrueOrFalseQuestion(String prompt, String answer) {
        super(prompt, answer);
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
}