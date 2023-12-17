package com.cwtstudio.a19_android_components;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult,txtResult2;
    private AppCompatButton btnOK,btnOK2;
    private CheckBox cbMale, cbFemale;
    private RadioGroup radioGRP;
    private RadioButton rbMale,rbFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResult2 = findViewById(R.id.txtResult2);
        btnOK2 = findViewById(R.id.btnOK2);
        radioGRP = findViewById(R.id.radioGRP);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        btnOK2.setOnClickListener(v -> {
            if (rbMale.isChecked()){
                txtResult2.setText("You are a Male MashaAllah !");
                txtResult2.setBackgroundColor(Color.GREEN);
            }
            else if (rbFemale.isChecked()){
                txtResult2.setText("You are a Female MashaAllah !");
                txtResult2.setBackgroundColor(Color.YELLOW);
            }
            else {
                txtResult2.setText("Please choose your gender !");
                txtResult2.setBackgroundColor(Color.RED);



            }




        });







        checkBoxAppCode();









    }

    private void checkBoxAppCode(){
        txtResult = findViewById(R.id.txtResult);
        btnOK = findViewById(R.id.btnOK);
        cbMale = findViewById(R.id.cbMale);
        cbFemale = findViewById(R.id.cbFemale);


        cbMale.setOnClickListener(v -> {
            if (cbMale.isChecked()) {
                if (cbFemale.isChecked()) {
                    cbFemale.setChecked(false);
                }
            }

        });

        cbFemale.setOnClickListener(v -> {
            if (cbFemale.isChecked()) {

                if (cbMale.isChecked()) {
                    cbMale.setChecked(false);
                }

            }


        });
        btnOK.setOnClickListener(v -> {
            if (cbMale.isChecked()) {
                txtResult.setText("You are a male MashaAllah !");


            } else if (cbFemale.isChecked()) {
                txtResult.setText("You are a female MashaAllah !");


            } else {
                txtResult.setText("Please choose your gender !");
            }


        });
    }

}