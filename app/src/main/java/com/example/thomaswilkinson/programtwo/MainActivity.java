package com.example.thomaswilkinson.programtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Initialize Objects
    EditText bill, tip, splits;
    Button noRound, roundTotal, roundTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Grab GUI objects from XML file
        bill= findViewById(R.id.billAmount);
        tip= findViewById(R.id.billAmount2);
        splits = findViewById(R.id.billAmount3);
        noRound = findViewById(R.id.button3);
        roundTotal = findViewById(R.id.button4);
        roundTip = findViewById(R.id.button2);
        //Launch instruction dialog box
        openDialog();

        //No rounding button listener
        noRound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //When button is clicked, check that each of the value fields has input from user. Otherwise, toast and reset.
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
                    //If all value locations valid, pull values from value fields. Send to dialog function.

                    Double billAmt = Double.parseDouble(bill.getText().toString());
                    Double tipAmt = Double.parseDouble(tip.getText().toString());
                    Double splitAmt = Double.parseDouble(splits.getText().toString());
                    noRoundDialog(1, billAmt, tipAmt, splitAmt);
                }
            }
        });

        //Total rounding button listener
        roundTotal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //When button is clicked, check that each of the value fields has input from user. Otherwise, toast and reset.
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
                    //If all value locations valid, pull values from value fields. Send to dialog function.

                    Double billAmt = Double.parseDouble(bill.getText().toString());
                    Double tipAmt = Double.parseDouble(tip.getText().toString());
                    Double splitAmt = Double.parseDouble(splits.getText().toString());
                        noRoundDialog(2, billAmt, tipAmt, splitAmt);
                }
            }
        });

        //Tip rounding button listener
        roundTip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //When button is clicked, check that each of the value fields has input from user. Otherwise, toast and reset.
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
                    //If all value locations valid, pull values from value fields. Send to dialog function.

                    Double billAmt = Double.parseDouble(bill.getText().toString());
                    Double tipAmt = Double.parseDouble(tip.getText().toString());
                    Double splitAmt = Double.parseDouble(splits.getText().toString());
                    noRoundDialog(3 ,billAmt, tipAmt, splitAmt);
                }
            }
        });

    }

    //Function calling dialog box for instructions
    public void openDialog() {
        HintDialog hintDialog = new HintDialog();
        hintDialog.show(getSupportFragmentManager(), "hintDialog");
    }

    //Function calling dialog box for calculations. Sends values over FragmentManager.
    public void noRoundDialog(Integer mode, Double bill, Double tip, Double splits){
        NoRoundDialog noRoundDialog = new NoRoundDialog();
        noRoundDialog.setValue(mode, bill, tip, splits);
        noRoundDialog.show(getSupportFragmentManager(), "billDialog");
    }
}

