package com.example.android.world;

import java.util.ArrayList;

/**
 * Created by VeLiSLava on 03.03.2018.
 * private variable @text stores the text of the question
 * private variable @answer is array of answers of type String
 * private array @options contains the options to choose for answer
 */

@SuppressWarnings("unchecked")
public class Question {
        private String text;
        private ArrayList <Integer> answer=new ArrayList();
        private ArrayList <String> options=new ArrayList();

        // constructor question() sets the variable
        Question(){
            this.text="";
            this.answer.clear();
            this.options.clear();
        }

        //sets text of the question
        void setText(String text, ArrayList opt, ArrayList ans){
             this.text=text;
             this.setOpt(opt);
             this.setAnswer(ans);
        }

        //sets the answers in the array
        private void setAnswer(ArrayList <Integer> ans){
            //get size of the array
            int size=ans.size();
            //fill in the array
            for(int i=0;i<size;i++)
                this.answer.add(ans.get(i));
        }

        //sets the options in the array
        private void setOpt(ArrayList <String> opt){
            //get size of the array
            int size=opt.size();
            //fill in the array
            for (int i=0;i<size;i++)
                this.options.add(opt.get(i));
        }

        // return the text of the question
        public String getText(){
            return this.text;
        }

        //return the options
        ArrayList getOptions2(){
           return this.options;
        }

        //return the answer of the question
        ArrayList <Integer> getAnswer(){
           return this.answer;
        }
}
