package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.text);
        TextView textView = findViewById(R.id.Text_view);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ОБРАБОТКА КЛИКА
                String text = editText.getText().toString();
                textView.setText(text);
            }
        });
    }
}