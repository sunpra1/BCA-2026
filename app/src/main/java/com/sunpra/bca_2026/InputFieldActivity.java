package com.sunpra.bca_2026;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputFieldActivity extends AppCompatActivity {

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

        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(
                (View view) -> {
                    Log.d("BTN CLICK", "Submit Btn Clicked");
                }
        );
    }


}