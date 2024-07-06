package com.example.exp3calculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculatorActivity extends AppCompatActivity {
    private AppCompatEditText etNum1, etNum2;
    private AppCompatTextView txtResult;
    private AppCompatButton btnAdd, btnSub, btnMulti, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        initViews();

        btnAdd.setOnClickListener(v -> {
            performCalculations(0);
        });

        btnSub.setOnClickListener(v -> {
            performCalculations(1);
        });

        btnMulti.setOnClickListener(v -> {
            performCalculations(2);
        });

        btnDiv.setOnClickListener(v -> {
            performCalculations(3);
        });
    }

    private void initViews() {
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        txtResult = findViewById(R.id.txtResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
    }

    private void performCalculations(int i) {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int ans = 0;
        if (i == 0) {
            ans = num1 + num2;
        } else if (i == 1) {
            ans = num1 - num2;
        } else if (i == 2) {
            ans = num1 * num2;
        } else if (i == 3) {
            ans = num1 / num2;
        }
        txtResult.setText(String.valueOf(ans));
    }
}