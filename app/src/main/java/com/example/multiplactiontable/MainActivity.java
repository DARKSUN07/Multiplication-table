package com.example.multiplactiontable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textview_1, textview_2;
    Button button;
    EditText n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview_1 = findViewById(R.id.textview_1);
        textview_2 = findViewById(R.id.textview_2);
        button = findViewById(R.id.button);
        n = findViewById(R.id.n);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_2.setText("");
//                Toast.makeText(MainActivity.this, "Tables Yaad Kar Le ( ˘︹˘ )", Toast.LENGTH_SHORT).show();
                int num = Integer.parseInt(n.getText().toString());
                textview_1.setText("Multiplication Table");
                for (int i = 1 ; i <= 100 ; i++ ){
                    textview_2.append(num+" X "+i+" = "+num*i+"\n");
                }
            }
        });
    }
}