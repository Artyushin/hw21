package com.artyushin.hw21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textInfo = (TextView) findViewById(R.id.textViewInfo);
        final EditText name = (EditText)  findViewById(R.id.editTextName);
        final EditText email = (EditText)  findViewById(R.id.editTextEmail);

        Button buttonOK = (Button) findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textInfo.setText("Подписка на рассылку успешно оформлена для пользователя "
                        + name.getText() + " на электронный адрес " + email.getText());
            }
        });

        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textInfo.setText("");
                name.setText("");
                email.setText("");
            }
        });
    }



}