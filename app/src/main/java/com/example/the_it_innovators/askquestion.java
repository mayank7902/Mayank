package com.example.the_it_innovators;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class askquestion extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextViewAskQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_askquestion);

autoCompleteTextViewAskQuestion=findViewById(R.id.autoCompleteTextViewSubjects);
        String[] subjectsList={"Science","Maths"};
        ArrayAdapter<String> adapterMessType = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,subjectsList);

        autoCompleteTextViewAskQuestion.setAdapter(adapterMessType);
    }
}