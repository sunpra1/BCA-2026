package com.sunpra.bca_2026;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputActivity extends AppCompatActivity {

    private EditText inputFieldET;

    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); //
        setContentView(R.layout.activity_input);
        //
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //

        inputFieldET = findViewById(R.id.inputFieldET);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(
                v -> {
                    // Handle click here

                    String inputFieldValue = inputFieldET.getText().toString();

                    Toast.makeText(
                            InputActivity.this,
                            inputFieldValue,
                            Toast.LENGTH_LONG
                    ).show();

                }
        );

    }
}