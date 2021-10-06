package com.example.kgtopoundconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.output);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Toast.makeText(context: MainActivity.this, text: "Hi Click Listener Worked!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.204 * kg;
                textView.setText("The KG Value in Pound is " + pound);

            }
        });


    }
}