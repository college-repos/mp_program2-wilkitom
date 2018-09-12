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
    String TAG = "WTF";
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
                    if(splitAmt == 1)
                    {
                        Double tipDollarAmt, totalAmt;
                        Log.v(TAG, billAmt.toString());
                        tipAmt = tipAmt/100;
                        tipDollarAmt = billAmt * tipAmt;
                        totalAmt = billAmt + tipDollarAmt;
                        Log.v("bill", billAmt.toString());
                        Log.v("total", totalAmt.toString());
                        Log.v("tip", tipDollarAmt.toString());
                    }
                    else
                    {
                        Double tipDollarAmt, totalAmt, splitTotalAmt, splitTipAmt, splitBillAmt;
                        tipAmt = tipAmt/100;
                        tipDollarAmt = billAmt * tipAmt;
                        totalAmt = billAmt + tipDollarAmt;
                        Log.v("bill", billAmt.toString());
                        Log.v("total", totalAmt.toString());
                        Log.v("tip", tipDollarAmt.toString());
                        splitTotalAmt = totalAmt/splitAmt;
                        splitTipAmt = tipDollarAmt/splitAmt;
                        splitBillAmt = billAmt/splitAmt;
                        Log.v("SplitBill",splitBillAmt.toString());
                        Log.v("SplitTotal", splitTotalAmt.toString());
                        Log.v("SplitTip", splitTipAmt.toString());
                    }
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
                    if(splitAmt == 1)
                    {
                        Double tipDollarAmt, totalAmt;
                        Log.v(TAG, billAmt.toString());
                        tipAmt = tipAmt/100;
                        tipDollarAmt = billAmt * tipAmt;
                        totalAmt = billAmt + tipDollarAmt;
                        long roundedTotalAmt;
                        roundedTotalAmt = Math.round(totalAmt);
                        Log.v("bill", billAmt.toString());
                        Log.v("roundedTotal", String.valueOf(roundedTotalAmt));
                        Log.v("tip", tipDollarAmt.toString());
                    }
                    else
                    {
                        Double tipDollarAmt, totalAmt, splitTotalAmt, splitTipAmt, splitBillAmt;
                        tipAmt = tipAmt/100;
                        tipDollarAmt = billAmt * tipAmt;
                        totalAmt = billAmt + tipDollarAmt;
                        Log.v("bill", billAmt.toString());
                        Log.v("total", totalAmt.toString());
                        Log.v("tip", tipDollarAmt.toString());
                        splitTotalAmt = totalAmt/splitAmt;
                        splitTipAmt = tipDollarAmt/splitAmt;
                        splitBillAmt = billAmt/splitAmt;
                        long roundedSplitTotal;
                        roundedSplitTotal = Math.round(splitTotalAmt);
                        Log.v("SplitBill",splitBillAmt.toString());
                        Log.v("RoundedSplitTotal", String.valueOf(roundedSplitTotal));
                        Log.v("SplitTip", splitTipAmt.toString());
                    }
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
                    if(splitAmt == 1)
                    {
                        Double tipDollarAmt, totalAmt;
                        Log.v(TAG, billAmt.toString());
                        tipAmt = tipAmt/100;
                        tipDollarAmt = billAmt * tipAmt;
                        totalAmt = billAmt + tipDollarAmt;
                        long roundedTipAmt;
                        roundedTipAmt = Math.round(tipDollarAmt);
                        Log.v("bill", billAmt.toString());
                        Log.v("Total", totalAmt.toString());
                        Log.v("RoundedTip", String.valueOf(roundedTipAmt));
                    }
                    else {
                        Double tipDollarAmt, totalAmt, splitTotalAmt, splitTipAmt, splitBillAmt;
                        tipAmt = tipAmt / 100;
                        tipDollarAmt = billAmt * tipAmt;
                        totalAmt = billAmt + tipDollarAmt;
                        Log.v("bill", billAmt.toString());
                        Log.v("total", totalAmt.toString());
                        Log.v("tip", tipDollarAmt.toString());
                        splitTotalAmt = totalAmt / splitAmt;
                        splitTipAmt = tipDollarAmt / splitAmt;
                        splitBillAmt = billAmt / splitAmt;
                        long roundedSplitTip;
                        roundedSplitTip = Math.round(splitTipAmt);
                        Log.v("SplitBill", splitBillAmt.toString());
                        Log.v("SplitTotal", splitTotalAmt.toString());
                        Log.v("RoundedSplitTip", String.valueOf(roundedSplitTip));
                    }
                }
            }
        });

    }
    public void openDialog() {
        HintDialog hintDialog = new HintDialog();
        hintDialog.show(getSupportFragmentManager(), "hintDialog");
    }
    /*public void noRoundDialog(){
        NoRoundDialog noRoundDialog = new NoRoundDialog();
        noRoundDialog.show(getSupportFragmentManager(), "billDialog");
    }*/
}

