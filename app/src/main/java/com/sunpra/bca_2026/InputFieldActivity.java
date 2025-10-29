package com.sunpra.bca_2026;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputFieldActivity extends AppCompatActivity {

    EditText firstNameEt;
    EditText lastNameEt;
    EditText emailEt;
    Spinner gradeSpinner;
    RadioGroup genderGroup;
    CheckBox accountCb;
    CheckBox optMathCb;
    CheckBox economicsCb;
    CheckBox computerCb;
    SwitchCompat isDifferentlyAbledSwitch;

    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //region Not Needed in exam
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_input_field);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //endregion

        firstNameEt = findViewById(R.id.firstNameEt);
        lastNameEt = findViewById(R.id.lastNameEt);
        emailEt = findViewById(R.id.emailEt);
        gradeSpinner = findViewById(R.id.gradeSpinner);
        genderGroup = findViewById(R.id.genderGroup);
        accountCb = findViewById(R.id.accountCb);
        optMathCb = findViewById(R.id.optMathCb);
        economicsCb = findViewById(R.id.economicsCb);
        computerCb = findViewById(R.id.computerCb);
        submitBtn = findViewById(R.id.submitBtn);
        isDifferentlyAbledSwitch = findViewById(R.id.isDifferentlyAbledSwitch);

        submitBtn.setOnClickListener(
                (View view) -> {

                    Log.d("BTN CLICK", "Submit Btn Clicked");
                }
        );


    }


}