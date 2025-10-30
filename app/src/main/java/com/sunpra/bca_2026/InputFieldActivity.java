package com.sunpra.bca_2026;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
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
    TextView messageTv;

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
        messageTv = findViewById(R.id.messageTv);

        submitBtn.setOnClickListener(
                (View view) -> {

                    Log.d("BTN CLICK", "Submit Btn Clicked");
                }
        );


        gradeSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(
                            AdapterView<?> adapterView,
                            View view,
                            int selectedPosition,
                            long id
                    ) {
                        String[] grades = getResources().getStringArray(R.array.grade_items);
                        String selectedGrade = grades[selectedPosition];
                        messageTv.setText("You have selected grade: " + selectedGrade);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        messageTv.setText("Grade not selected.");
                    }
                }
        );

        genderGroup.setOnCheckedChangeListener(
                (@NonNull RadioGroup radioGroup, int id) -> {
                    if (id == R.id.maleRb) {
                        messageTv.setText("You have selected male gender.");
                    } else if (id == R.id.femaleRb) {
                        messageTv.setText("You have selected female gender.");
                    } else if (id == R.id.othersRb) {
                        messageTv.setText("You have selected other gender.");
                    }
                }
        );

        accountCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean isChecked) {
                messageTv.setText("You have selected subject, accounts.");
            }
        });

        isDifferentlyAbledSwitch.setOnCheckedChangeListener(
                (@NonNull CompoundButton compoundButton, boolean isChecked) -> {
                    messageTv.setText("You have " + (isChecked ? "Checked" : "Unchecked") + "is differently able.");
                }
        );

//        firstNameEt.addTextChangedListener();

    }
}