package com.example.thomaswilkinson.programtwo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        openDialog();
        noRound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(bill.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(tip.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(splits.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double billAmt = Double.parseDouble(bill.getText().toString());
                    Double tipAmt = Double.parseDouble(tip.getText().toString());
                    Double splitAmt = Double.parseDouble(splits.getText().toString());
                    noRoundDialog(1, billAmt, tipAmt, splitAmt);
                }
            }
        });


        roundTotal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(bill.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(tip.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(splits.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double billAmt = Double.parseDouble(bill.getText().toString());
                    Double tipAmt = Double.parseDouble(tip.getText().toString());
                    Double splitAmt = Double.parseDouble(splits.getText().toString());
                        noRoundDialog(2, billAmt, tipAmt, splitAmt);
                }
            }
        });


        roundTip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(bill.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(tip.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(splits.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double billAmt = Double.parseDouble(bill.getText().toString());
                    Double tipAmt = Double.parseDouble(tip.getText().toString());
                    Double splitAmt = Double.parseDouble(splits.getText().toString());
                        noRoundDialog(3 ,billAmt, tipAmt, splitAmt);
                }
            }
        });

    }
    public void openDialog() {
        HintDialog hintDialog = new HintDialog();
        hintDialog.show(getSupportFragmentManager(), "hintDialog");
    }
    public void noRoundDialog(Integer mode, Double bill, Double tip, Double splits){
        NoRoundDialog noRoundDialog = new NoRoundDialog();
        noRoundDialog.setValue(mode, bill, tip, splits);
        noRoundDialog.show(getSupportFragmentManager(), "billDialog");
    }
}

