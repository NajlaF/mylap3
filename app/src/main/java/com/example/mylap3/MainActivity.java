package com.example.mylap3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button sendButton;
    private EditText sendText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = findViewById(R.id.send_button_id);
        sendText = findViewById(R.id.send_text_id);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = sendText.getText().toString();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
    }
}
