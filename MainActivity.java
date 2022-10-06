package com.example.s6q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        t1=(TextView) findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res;
                res=e1.getText().toString();
                t1.setText(res.toUpperCase(Locale.ROOT));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res;
                res=e1.getText().toString();
                t1.setText(res.toLowerCase(Locale.ROOT));
            }
        });
    }
}