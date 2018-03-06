package com.example.android.world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    boolean question1=false;  //is the answer correct or not
    boolean question2=false;
    boolean question3=false;
    boolean question4=false;
    boolean question5=false;
    boolean question6=false;
    boolean question7=false;
    boolean question8=false;
    boolean checked=false; // check of submit btn has been pressed, if so clear value first and call clearAll method
    ArrayList <TextView> arrText;
    // create object of type Quiz
    Quiz test=new Quiz();

    @Override
    @SuppressWarnings("unchecked")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //set the properties of the Object
        ArrayList <String> arr = new ArrayList();   // list of options
        ArrayList <Integer> ans=new ArrayList();     // list of answers
        //set question 1
        arr.add(getString(R.string.q11));
        arr.add(getString(R.string.q12));
        arr.add(getString(R.string.q13));
        arr.add(getString(R.string.q14));
        ans.add(2);
        test.setQuiz(getString(R.string.question1), arr, ans);
        arr.clear();
        ans.clear();
        //set question 2
        arr.add(getString(R.string.q2answer));
        ans.add(0);
        test.setQuiz(getString(R.string.question2), arr, ans);
        ans.clear();
        arr.clear();
        //set question 3
        arr.add(getString(R.string.q31));
        arr.add(getString(R.string.q32));
        arr.add(getString(R.string.q33));
        arr.add(getString(R.string.q34));
        ans.add(0);
        test.setQuiz(getString(R.string.question3), arr, ans);
        arr.clear();
        ans.clear();
        //set question 4
        arr.add(getString(R.string.q41));
        arr.add(getString(R.string.q42));
        arr.add(getString(R.string.q43));
        ans.add(2);
        test.setQuiz(getString(R.string.question4), arr, ans);
        arr.clear();
        ans.clear();
        //set question 5
        arr.add(getString(R.string.q51));
        arr.add(getString(R.string.q52));
        arr.add(getString(R.string.q53));
        arr.add(getString(R.string.q54));
        ans.add(2);
        test.setQuiz(getString(R.string.question5), arr, ans);
        arr.clear();
        ans.clear();
        //setting question 6
        arr.add(getString(R.string.q61));
        arr.add(getString(R.string.q62));
        arr.add(getString(R.string.q63));
        arr.add(getString(R.string.q64));
        ans.add(1);
        test.setQuiz(getString(R.string.question6), arr, ans);
        arr.clear();
        ans.clear();
        //setting question 7
        arr.add(getString(R.string.q71));
        arr.add(getString(R.string.q72));
        arr.add(getString(R.string.q73));
        arr.add(getString(R.string.q74));
        ans.add(1);
        test.setQuiz(getString(R.string.question7), arr, ans );
        arr.clear();
        ans.clear();
        //setting 8
        arr.add(getString(R.string.q81));
        arr.add(getString(R.string.q82));
        arr.add(getString(R.string.q83));
        ans.add(1);
        test.setQuiz(getString(R.string.question8), arr, ans);
        arr.clear();
        ans.clear();
        //setting question 9
        arr.add(getString(R.string.q91));
        arr.add(getString(R.string.q92));
        arr.add(getString(R.string.q93));
        arr.add(getString(R.string.q94));
        arr.add(getString(R.string.q95));
        arr.add(getString(R.string.q96));
        arr.add(getString(R.string.q97));
        ans.add(0);
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        ans.add(6);
        test.setQuiz(getString(R.string.question9), arr, ans);
        arr.clear();
        ans.clear();
        //assign value to TextView question1
        TextView q1 =findViewById(R.id.q1);
        q1.setText(test.getText(0));
        //set options for question1
        RadioButton q11 =findViewById(R.id.q11);
        q11.setText(test.getOptions(0, 0));
        RadioButton q12 = findViewById(R.id.q12);
        q12.setText(test.getOptions(0, 1));
        RadioButton q13 = findViewById(R.id.q13);
        q13.setText(test.getOptions(0, 2));
        RadioButton q14 = findViewById(R.id.q14);
        q14.setText(test.getOptions(0, 3));
        //assign value to TextView question2
        TextView q2 = findViewById(R.id.q2);
        q2.setText(test.getText(1));
        //assign value to TextView question 3
        TextView q3 = findViewById(R.id.q3);
        q3.setText(test.getText(2));
        //assign options to RadioGroup in question 3
        RadioButton q31 =findViewById(R.id.q31);
        q31.setText(test.getOptions(2, 0));
        RadioButton q32 =findViewById(R.id.q32);
        q32.setText(test.getOptions(2, 1));
        RadioButton q33 =findViewById(R.id.q33);
        q33.setText(test.getOptions(2, 2));
        RadioButton q34 =findViewById(R.id.q34);
        q34.setText(test.getOptions(2, 3));
        //assign value to TextView question 4
        TextView q4 = findViewById(R.id.q4);
        q4.setText(test.getText(3));
        //assign options to RadioGroup in question 4
        RadioButton q41 = findViewById(R.id.q41);
        q41.setText(test.getOptions(3, 0));
        RadioButton q42 = findViewById(R.id.q42);
        q42.setText(test.getOptions(3, 1));
        RadioButton q43 = findViewById(R.id.q43);
        q43.setText(test.getOptions(3, 2));
        //assign value to TextView question 5
        TextView q5 =findViewById(R.id.q5);
        q5.setText(test.getText(4));
        //assign options to RadioGroup in question 5
        RadioButton q51 = findViewById(R.id.q51);
        q51.setText(test.getOptions(4, 0));
        RadioButton q52 = findViewById(R.id.q52);
        q52.setText(test.getOptions(4, 1));
        RadioButton q53 = findViewById(R.id.q53);
        q53.setText(test.getOptions(4, 2));
        RadioButton q54 = findViewById(R.id.q54);
        q54.setText(test.getOptions(4, 3));
        //assign value to TextView question 6
        TextView q6 = findViewById(R.id.q6);
        q6.setText(test.getText(5));
        //assign options to RadioGroup in question 6
        RadioButton q61 =findViewById(R.id.q61);
        q61.setText(test.getOptions(5, 0));
        RadioButton q62 =findViewById(R.id.q62);
        q62.setText(test.getOptions(5, 1));
        RadioButton q63 =findViewById(R.id.q63);
        q63.setText(test.getOptions(5, 2));
        RadioButton q64 = findViewById(R.id.q64);
        q64.setText(test.getOptions(5, 3));
        //assign value to TextView question 7
        TextView q7 = findViewById(R.id.q7);
        q7.setText(test.getText(6));
        //assign options to RadioGroup in question 7
        RadioButton q71 = findViewById(R.id.q71);
        q71.setText(test.getOptions(6, 0));
        RadioButton q72 = findViewById(R.id.q72);
        q72.setText(test.getOptions(6, 1));
        RadioButton q73 = findViewById(R.id.q73);
        q73.setText(test.getOptions(6, 2));
        RadioButton q74 =findViewById(R.id.q74);
        q74.setText(test.getOptions(6, 3));
        //assign value to TextView question 8
        TextView q8 = findViewById(R.id.q8);
        q8.setText(test.getText(7));
        //assign options to RadioGroup in question 8
        RadioButton q81 = findViewById(R.id.q81);
        q81.setText(test.getOptions(7, 0));
        RadioButton q82 = findViewById(R.id.q82);
        q82.setText(test.getOptions(7, 1));
        RadioButton q83 = findViewById(R.id.q83);
        q83.setText(test.getOptions(7, 2));
        //assign value to TextView question 9
        TextView q9 = findViewById(R.id.q9);
        q9.setText(test.getText(8));
        //assign options to RadioGroup in question 9
        CheckBox q91 =findViewById(R.id.q91);
        q91.setText(test.getOptions(8, 0));
        CheckBox q92 = findViewById(R.id.q92);
        q92.setText(test.getOptions(8, 1));
        CheckBox q93 =findViewById(R.id.q93);
        q93.setText(test.getOptions(8, 2));
        CheckBox q94 = findViewById(R.id.q94);
        q94.setText(test.getOptions(8, 3));
        CheckBox q95 = findViewById(R.id.q95);
        q95.setText(test.getOptions(8, 4));
        CheckBox q96 =findViewById(R.id.q96);
        q96.setText(test.getOptions(8, 5));
        CheckBox q97 = findViewById(R.id.q97);
        q97.setText(test.getOptions(8, 6));
    }

    //show the total score on click Submit button
    public void onSubmit(View view) {
        if (checked)
            clearAll();
        if (question1)
            test.setScore();
        if (question3)
            test.setScore();
        if (question4)
            test.setScore();
        if (question5)
            test.setScore();
        if (question6)
            test.setScore();
        if (question7)
            test.setScore();
        if (question8)
            test.setScore();
        //check EditBox value
        EditText num   = findViewById(R.id.q22);
        try {
            int number = Integer.parseInt(num.getText().toString());
            if (number > 0) {
                String editTextValue = num.getText().toString();
                question2 = test.checkAns(editTextValue, 1);
                if (question2)
                      this.test.setScore();
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }

        // check Checkbox values
        CheckBox check1 = findViewById(R.id.q91);
        if (check1.isChecked()) {
            if (this.test.checkAns(check1.getText().toString(), 8))
                this.test.setScore();
        }
        CheckBox check2 = findViewById(R.id.q92);
        if (check2.isChecked()) {
            if (this.test.checkAns(check2.getText().toString(), 8))
                this.test.setScore();
        }
        CheckBox check3 =findViewById(R.id.q93);
        if (check3.isChecked()) {
            if (this.test.checkAns(check3.getText().toString(), 8))
                this.test.setScore();
        }
        CheckBox check4 = findViewById(R.id.q94);
        if(check4.isChecked()) {
            if (this.test.checkAns(check4.getText().toString(), 8))
                this.test.setScore();
        }
        CheckBox check5 = findViewById(R.id.q95);
        if(check5.isChecked()) {
            if (this.test.checkAns(check5.getText().toString(), 8))
                this.test.setScore();
        }
        CheckBox check6 = findViewById(R.id.q96);
        if(check6.isChecked()) {
            if (this.test.checkAns(check6.getText().toString(), 8))
                this.test.setScore();
        }
        CheckBox check7 = findViewById(R.id.q97);
        if(check7.isChecked()) {
            if (this.test.checkAns(check7.getText().toString(), 8))
                this.test.setScore();
        }
        Toast.makeText(getApplicationContext(),getString(R.string.yourScoreIs)+test.getScore()+" "+getString(R.string.of15teen), Toast.LENGTH_SHORT).show();
        showAnswers(test);
        checked=true;
    }

    // get correct answers and show them
    @SuppressWarnings("unchecked")
    private void showAnswers(Quiz qz){
        String text2;
        int tek;
        String p;
        //String text="";
        int sizeOfQuestions;
        int num; // number of answers for the current question
        text2 ="\n"+getString(R.string.answer)+" ";
        arrText=new ArrayList();
        ArrayList <String> arrOfTexts=new ArrayList();
        TextView a1 = findViewById(R.id.q1);
        arrText.add(a1);
        TextView a2 = findViewById(R.id.q2);
        arrText.add(a2);
        TextView a3 = findViewById(R.id.q3);
        arrText.add(a3);
        TextView a4 = findViewById(R.id.q4);
        arrText.add(a4);
        TextView a5 = findViewById(R.id.q5);
        arrText.add(a5);
        TextView a6 =  findViewById(R.id.q6);
        arrText.add(a6);
        TextView a7 = findViewById(R.id.q7);
        arrText.add(a7);
        TextView a8 = findViewById(R.id.q8);
        arrText.add(a8);
        TextView a9 = findViewById(R.id.q9);
        arrText.add(a9);
        sizeOfQuestions=arrText.size();
        for (int i=0;i<sizeOfQuestions-1;i++) {
            //get number of answers for the current question
            StringBuilder text = new StringBuilder(500);
            num = qz.getQuestion(i).getAnswer().size();
            //get array of answers for the current question
            for (int j = 0; j < num; j++) {
                //get current answer;
                tek = qz.getQuestion(i).getAnswer().get(j);
                p = qz.getOptions(i, tek);
                text.append(p);
                text.append("\n");
            }
            arrOfTexts.add(text.toString());
          //  text="";

            arrText.get(i).setText(Html.fromHtml(arrText.get(i).getText()+ "<br /><br />"+text2+arrOfTexts.get(i)));
        }
        //for last question, all are correct
        arrText.get(sizeOfQuestions-1).setText(Html.fromHtml(arrText.get(sizeOfQuestions-1).getText()+ "<br /><br />"+text2+getString(R.string.allCorrect)));
    }


    //on click question 1
    public void onClick1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton rb;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q11:
                if (checked) {
                    rb = findViewById(R.id.q11);
                    question1 = test.checkAns(rb.getText().toString(), 0);
                    break;
                }
            case R.id.q12:
                if (checked) {
                    rb =findViewById(R.id.q12);
                    question1 = test.checkAns(rb.getText().toString(), 0);

                    break;
                }
            case R.id.q13:
                if (checked) {
                    rb = findViewById(R.id.q13);
                    question1 =test.checkAns(rb.getText().toString(), 0);
                    break;
                }
            case R.id.q14:
                if (checked) {
                    rb = findViewById(R.id.q14);
                    question1 = test.checkAns(rb.getText().toString(), 0);
                    break;
                }
        }

    }

    //on click question 3
    public void onClick3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton rb;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q31:
                if (checked) {
                    rb = findViewById(R.id.q31);
                    question3 = test.checkAns(rb.getText().toString(), 2);
                    break;
                }
            case R.id.q32:
                if (checked) {
                    rb = findViewById(R.id.q32);
                    question3 = test.checkAns(rb.getText().toString(), 2);
                    break;
                }
            case R.id.q33:
                if (checked) {
                    rb =findViewById(R.id.q33);
                    question3 =test.checkAns(rb.getText().toString(), 2);
                    break;
                }
            case R.id.q34:
                if (checked) {
                    rb = findViewById(R.id.q34);
                    question3 = test.checkAns(rb.getText().toString(), 2);
                    break;
                }
        }
     }

    //on click question 4
    public void onClick4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton rb;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q41:
                if (checked) {
                    rb =findViewById(R.id.q41);
                    question4 = test.checkAns(rb.getText().toString(), 3);
                    break;
                }
            case R.id.q42:
                if (checked) {
                    rb = findViewById(R.id.q42);
                    question4 = test.checkAns(rb.getText().toString(), 3);

                    break;
                }
            case R.id.q43:
                if (checked) {
                    rb = findViewById(R.id.q43);
                    question4 =test.checkAns(rb.getText().toString(), 3);
                    break;
                }
        }

    }

    //on click question 5
    public void onClick5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton rb;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q51:
                if (checked) {
                    rb =findViewById(R.id.q51);
                    question5 = test.checkAns(rb.getText().toString(), 4);
                    break;
                }
            case R.id.q52:
                if (checked) {
                    rb =findViewById(R.id.q52);
                    question5 = test.checkAns(rb.getText().toString(), 4);
                    break;
                }
            case R.id.q53:
                if (checked) {
                    rb =findViewById(R.id.q53);
                    question5 =test.checkAns(rb.getText().toString(), 4);
                    break;
                }
            case R.id.q54:
                if (checked) {
                    rb = findViewById(R.id.q54);
                    question5 =test.checkAns(rb.getText().toString(), 4);
                    break;
                }
        }
    }

    //on click question 6
    public void onClick6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton rb;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q61:
                if (checked) {
                    rb = findViewById(R.id.q61);
                    question6 = test.checkAns(rb.getText().toString(), 5);
                    break;
                }
            case R.id.q62:
                if (checked) {
                    rb = findViewById(R.id.q62);
                    question6 = test.checkAns(rb.getText().toString(), 5);

                    break;
                }
            case R.id.q63:
                if (checked) {
                    rb = findViewById(R.id.q63);
                    question6 =test.checkAns(rb.getText().toString(), 5);
                    break;
                }
            case R.id.q64:
                if (checked) {
                    rb = findViewById(R.id.q64);
                    question6 =test.checkAns(rb.getText().toString(), 5);
                    break;
                }
        }
    }

    //on click question 6
    public void onClick7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton rb;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q71:
                if (checked) {
                    rb = findViewById(R.id.q71);
                    question7 = test.checkAns(rb.getText().toString(), 6);
                    break;
                }
            case R.id.q72:
                if (checked) {
                    rb = findViewById(R.id.q72);
                    question7 = test.checkAns(rb.getText().toString(), 6);
                    break;
                }
            case R.id.q73:
                if (checked) {
                    rb = findViewById(R.id.q73);
                    question7 =test.checkAns(rb.getText().toString(), 6);
                    break;
                }
            case R.id.q74:
                if (checked) {
                    rb =findViewById(R.id.q74);
                    question7 =test.checkAns(rb.getText().toString(), 6);
                    break;
                }
        }
    }

    //on click question 8
    public void onClick8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton rb;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q81:
                if (checked) {
                    rb = findViewById(R.id.q81);
                    question8 = test.checkAns(rb.getText().toString(), 7);
                    break;
                }
            case R.id.q82:
                if (checked) {
                    rb = findViewById(R.id.q82);
                    question8 = test.checkAns(rb.getText().toString(), 7);
                    break;
                }
            case R.id.q83:
                if (checked) {
                    rb = findViewById(R.id.q83);
                    question8 =test.checkAns(rb.getText().toString(), 7);
                    break;
                }
           }
    }

    public void onClearBtn(View view){
        clearAll();
    }

    //clear checks
    private void clearAll() {
        if (checked) {
            RadioGroup rg1 = findViewById(R.id.rg1);
            rg1.clearCheck();
            EditText ed = findViewById(R.id.q22);
            ed.setText("");
            RadioGroup rg2 =findViewById(R.id.rg2);
            rg2.clearCheck();
            RadioGroup rg3 =findViewById(R.id.rg3);
            rg3.clearCheck();
            RadioGroup rg4 = findViewById(R.id.rg4);
            rg4.clearCheck();
            RadioGroup rg5 = findViewById(R.id.rg5);
            rg5.clearCheck();
            RadioGroup rg6 =findViewById(R.id.rg6);
            rg6.clearCheck();
            RadioGroup rg7 = findViewById(R.id.rg7);
            rg7.clearCheck();
            CheckBox check1 = findViewById(R.id.q91);
            check1.setChecked(false);
            CheckBox check2 = findViewById(R.id.q92);
            check2.setChecked(false);
            CheckBox check3 = findViewById(R.id.q93);
            check3.setChecked(false);
            CheckBox check4 = findViewById(R.id.q94);
            check4.setChecked(false);
            CheckBox check5 = findViewById(R.id.q95);
            check5.setChecked(false);
            CheckBox check6 = findViewById(R.id.q96);
            check6.setChecked(false);
            CheckBox check7 = findViewById(R.id.q97);
            check7.setChecked(false);
            question1 = false;
            question2 = false;
            question3 = false;
            question4 = false;
            question5 = false;
            question6 = false;
            question7 = false;
            question8 = false;
            checked = false;
            this.test.clearScore();
            for (int i = 0; i < arrText.size(); i++)
                arrText.get(i).setText(test.getText(i));
            arrText.clear();
        }
    }
}
