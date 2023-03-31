package com.example.calcolatrice20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button somma=(Button) findViewById(R.id.buttonSomma);
        EditText v1=(EditText) findViewById(R.id.editTextn1);
        EditText v2=(EditText) findViewById(R.id.editTextn2);
        TextView tot=(TextView) findViewById(R.id.textViewRisultato);

        somma.setOnClickListener(new View.OnClickListener())
        {

        }

    }
}