package com.example.dinga.princessquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int quizScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //calculate the final score of the quiz
    public void scoreQuiz(View view) {

        //get the checked state of the Merida and Ariel checkboxes for question one
        CheckBox q1CorrectAnswer1 = findViewById(R.id.question_1_answer_2_cb);
        boolean q1CheckBoxMerida = q1CorrectAnswer1.isChecked();

        CheckBox q1CorrectAnswer2 = findViewById(R.id.question_1_answer_3_cb);
        boolean q1CheckBoxAriel = q1CorrectAnswer2.isChecked();

        CheckBox q1WrongAnswer1 = findViewById(R.id.question_1_answer_1_cb);
        boolean q1CheckBoxPocahontas = q1WrongAnswer1.isChecked();

        CheckBox q1WrongAnswer2 = findViewById(R.id.question_1_answer_4_cb);
        boolean q1CheckBoxBelle = q1WrongAnswer2.isChecked();

        if (!q1CheckBoxPocahontas && q1CheckBoxAriel && q1CheckBoxMerida && !q1CheckBoxBelle) {
            quizScore++;
        }

        //get the checked state of the Anna radio button for question 2
        RadioButton q2CorrectAnswer = findViewById(R.id.question_2_correct_answer_rb);
        boolean q2RadioButtonAnna = q2CorrectAnswer.isChecked();
        if (q2RadioButtonAnna) {
            quizScore++;
        }

        //get the checked state of the Evil Queen radio button for question 3
        RadioButton q3CorrectAnswer = findViewById(R.id.question_3_correct_answer_rb);
        boolean q3RadioButtonEvilQueen = q3CorrectAnswer.isChecked();
        if (q3RadioButtonEvilQueen) {
            quizScore++;
        }

        //get the checked state of the Rapunzel radio button for question 4
        RadioButton q4CorrectAnswer = findViewById(R.id.question_4_correct_answer_rb);
        boolean q4RadioButtonRapunzel = q4CorrectAnswer.isChecked();
        if (q4RadioButtonRapunzel) {
            quizScore++;
        }
        //get the checked state of the Seven radio button for question 5
        RadioButton q5CorrectAnswer = findViewById(R.id.question_5_correct_answer_rb);
        boolean q5RadioButtonSeven = q5CorrectAnswer.isChecked();
        if (q5RadioButtonSeven) {
            quizScore++;
        }

        //get the checked state of the Princess and the Frog Radio Button for question 6
        RadioButton q6CorrectAnswer = findViewById(R.id.question_6_correct_answer_rb);
        boolean q6RadioButtonPrincessFrog = q6CorrectAnswer.isChecked();
        if (q6RadioButtonPrincessFrog) {
            quizScore++;
        }

        //get the checked state of the spindle radio button for question 7
        RadioButton q7CorrectAnswer = findViewById(R.id.question_7_correct_answer_rb);
        boolean q7RadioButtonSpindle = q7CorrectAnswer.isChecked();
        if (q7RadioButtonSpindle) {
            quizScore++;
        }

        //get the checked state of the Giselle radio button for question 8
        RadioButton q8CorrectAnswer = findViewById(R.id.question_8_correct_answer_rb);
        boolean q8RadioButtonGiselle = q8CorrectAnswer.isChecked();
        if (q8RadioButtonGiselle) {
            quizScore++;
        }

        //get the checked state of the Cinderella button for question 9
        RadioButton q9CorrectAnswer = findViewById(R.id.question_9_correct_answer_rb);
        boolean q9RadioButtonCinderella = q9CorrectAnswer.isChecked();
        if (q9RadioButtonCinderella) {
            quizScore++;
        }
        EditText question10ResponseFromUser = findViewById(R.id.question_10_edit_text_field);
        String question10AnswerFromUser = question10ResponseFromUser.getText().toString();
        String question10Answer = "Agrabah";

        if (question10AnswerFromUser.equalsIgnoreCase(question10Answer)) {
            quizScore++;
        }
       
        String toastMessage;
        switch (quizScore) {
            case 1:
                toastMessage = "You only got one question correct!";
                break;
            case 10:
                toastMessage = "You got all the questions correct!";
                break;
            default:
                toastMessage = String.format("You got %d questions correct!", quizScore);
        }

        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();

        //reset the quiz score
        quizScore = 0;
    }

    //method to start the quiz over
    public void startOver(View view) {

        //get the checked state of the checkboxes for question 1 and set the checked state to false if checked
        CheckBox q1WrongAnswer1 = findViewById(R.id.question_1_answer_1_cb);
        boolean q1Wrong1 = q1WrongAnswer1.isChecked();
        if (q1Wrong1) {
            q1WrongAnswer1.toggle();
        }

        CheckBox q1CorrectAnswer2 = findViewById(R.id.question_1_answer_2_cb);
        boolean q1Correct2 = q1CorrectAnswer2.isChecked();
        if (q1Correct2) {
            q1CorrectAnswer2.toggle();
        }

        CheckBox q1CorrectAnswer1 = findViewById(R.id.question_1_answer_3_cb);
        boolean q1Correct1 = q1CorrectAnswer1.isChecked();
        if (q1Correct1) {
            q1CorrectAnswer1.toggle();
        }

        CheckBox q1WrongAnswer2 = findViewById(R.id.question_1_answer_4_cb);
        boolean q1Wrong2 = q1WrongAnswer2.isChecked();
        if (q1Wrong2) {
            q1WrongAnswer2.toggle();
        }

        //clear all the radio group buttons
        RadioGroup q2RG = findViewById(R.id.question_2_radio_group);
        q2RG.clearCheck();

        RadioGroup q3RG = findViewById(R.id.question_3_radio_group);
        q3RG.clearCheck();

        RadioGroup q4RG = findViewById(R.id.question_4_radio_group);
        q4RG.clearCheck();

        RadioGroup q5RG = findViewById(R.id.question_5_radio_group);
        q5RG.clearCheck();

        RadioGroup q6RG = findViewById(R.id.question_6_radio_group);
        q6RG.clearCheck();

        RadioGroup q7RG = findViewById(R.id.question_7_radio_group);
        q7RG.clearCheck();

        RadioGroup q8RG = findViewById(R.id.question_8_radio_group);
        q8RG.clearCheck();

        RadioGroup q9RG = findViewById(R.id.question_9_radio_group);
        q9RG.clearCheck();

        //clear the text from the edit text field in question 10
        EditText question10Answer = findViewById(R.id.question_10_edit_text_field);
        question10Answer.setText("");

        ScrollView parentScrollView = findViewById(R.id.parent_scroll_view);
        parentScrollView.fullScroll(View.FOCUS_UP);

    }

}
