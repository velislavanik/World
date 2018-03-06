package com.example.android.world;

import java.util.ArrayList;

/**
 * Created by VeLiSLava on 06.03.2018.
 * private @score stores the total score
 * array @questions of class Question
 */

@SuppressWarnings("unchecked")
class Quiz{
    private int score;
    private ArrayList<Question> questions=new ArrayList();

    Quiz(){
        this.score=0;
        this.questions.clear();
    }

    //sets number, text and answer of the question and add question to the array of questions
    void setQuiz(String text, ArrayList arr, ArrayList ans){
        Question q=new Question();
        q.setText(text, arr, ans);
        questions.add(q);
    }

    //return object of type Question
    Question getQuestion(int i){
        return this.questions.get(i);
    }

    //return question text with package-private access
    String getText(int i){
        return this.questions.get(i).getText();
    }

    //return option j of type String from question i
    String getOptions(int i, int j) {
        ArrayList ar = this.questions.get(i).getOptions2();
        return ar.get(j).toString();
    }

    //check whether the answer is correct or not
    boolean checkAns(String s, int i){
        boolean p=false;
        int k;
        int size=this.questions.get(i).getAnswer().size();
        for(int j=0;j<size;j++){
            // get the j-th element of array of answers
            k=this.questions.get(i).getAnswer().get(j);
            //find the element with index j form the options array
            if (this.questions.get(i).getOptions2().get(k).equals(s))
                p=true;
        }
        return p;
    }

    //add score
    void setScore(){
        this.score+=1;
    }

    //return total score
    int getScore(){
        return this.score;
    }

    //clear score
    void clearScore(){
        this.score=0;
    }
}
