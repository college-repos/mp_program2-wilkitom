package com.example.thomaswilkinson.programtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText bill, tip, splits;
    Button noRound, roundTotal, roundTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bill= findViewById(R.id.billAmount);
        tip= findViewById(R.id.billAmount2);
        splits = findViewById(R.id.billAmount3);
        noRound = findViewById(R.id.button3);
        roundTotal = findViewById(R.id.button4);
        roundTip = findViewById(R.id.button2);

        noRound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Double billAmt = Double.parseDouble(bill.getText().toString());
                Double tipAmt = Double.parseDouble(tip.getText().toString());
                Integer splitAmt = Integer.parseInt(tip.getText().toString());
            }
        });
    }
}

