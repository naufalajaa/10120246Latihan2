package com.example.a10120246latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// 25-04-2023, NIM:10120246, Muhammad Naufal Malikulmulki, IF-6

public class VerifyAccountActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        Button veryacc = (Button) findViewById(R.id.veryacc);
        veryacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerifyAccountActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}

