package com.example.thomaswilkinson.programtwo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.widget.Toast;

public class NoRoundDialog extends AppCompatDialogFragment {
    Integer mode;
    Double tipAmount, total, bill, tip, splits;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Double tipPercent = tip/100;
        if(bill < 0) {
            Toast.makeText(getActivity().getApplicationContext(), "Enter valid input", Toast.LENGTH_SHORT).show();
        }
        else if(tip < 0 || tip > 100) {
            Toast.makeText(getActivity().getApplicationContext(), "Enter valid input", Toast.LENGTH_SHORT).show();
        }
        else if(splits < 1) {
            Toast.makeText(getActivity().getApplicationContext(), "Enter valid input", Toast.LENGTH_SHORT).show();
        }
        else {
            if (mode == 1) {
                if (splits == 1) {
                    tipAmount = bill*tipPercent;
                    total = tipAmount + bill;
                    builder.setTitle("Total Calculated Bill Amount")
                            .setMessage("Total Bill: \n\n" +
                                    "Calculated Tip Amount: $" + String.format( "%.2f", tipAmount) + "\n\n" +
                                    "Total Bill Amount With Tip: $" + String.format( "%.2f", total) + "\n\n")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    return builder.create();
                } else {
                    tipAmount = bill*tipPercent;
                    total = tipAmount + bill;
                    Double splitTip, splitTotal;
                    splitTip = tipAmount/splits;
                    splitTotal = total/splits;
                    builder.setTitle("Total Calculated Bill Amount")
                            .setMessage("Total Bill: \n\n" +
                                    "Calculated Tip Amount: $" + String.format( "%.2f", tipAmount) + "\n\n" +
                                    "Total Bill Amount With Tip: $" + String.format( "%.2f", total) + "\n\n\n" +
                                    "Bill Per Person: \n\n"+
                                    "Tip Amount per person: $" + String.format( "%.2f", splitTip) + "\n\n" +
                                    "Total Bill Amount With Tip per person: $" + String.format( "%.2f", splitTotal) + "\n\n")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    return builder.create();
                }
            } else if (mode == 2) {
                if (splits == 1) {
                    tipAmount = bill*tipPercent;
                    total = tipAmount + bill;
                    Double roundedTotal;
                    roundedTotal = Math.ceil(total);
                    builder.setTitle("Total Calculated Bill Amount")
                            .setMessage("Total Bill: \n\n" +
                                    "Calculated Tip Amount: $" + String.format( "%.2f", tipAmount) + "\n\n" +
                                    "Total Bill Amount Rounded With Tip: $" + String.format("%.2f",roundedTotal) + "\n\n")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    return builder.create();
                } else {
                    tipAmount = bill*tipPercent;
                    total = tipAmount + bill;
                    Double splitTotal ,roundedSplitTotal, splitTip;
                    splitTip = tipAmount/splits;
                    splitTotal = total/splits;
                    roundedSplitTotal = Math.ceil(splitTotal);
                    builder.setTitle("Total Calculated Bill Amount")
                            .setMessage("Total Bill: \n\n" +
                                    "Calculated Tip Amount: $" + String.format( "%.2f", tipAmount) + "\n\n" +
                                    "Total Bill Amount With Tip: $" + String.format("%.2f",total) + "\n\n\n" +
                                    "Bill Per Person: \n\n"+
                                    "Tip Amount per person: $" + String.format( "%.2f", splitTip) + "\n\n" +
                                    "Total Bill Amount Rounded With Tip per person: $" + String.format( "%.2f", roundedSplitTotal) + "\n\n")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    return builder.create();
                }
            } else if (mode == 3) {
                if (splits == 1) {
                    tipAmount = bill*tipPercent;
                    //Double roundedTip;
                    Long roundedTip;
                    roundedTip = Math.round(tipAmount);
                    total = roundedTip + bill;
                    builder.setTitle("Total Calculated Bill Amount")
                            .setMessage("Total Bill: \n\n" +
                                    "Calculated Rounded Tip Amount: $" + String.format( "%.2f", roundedTip) + "\n\n" +
                                    "Total Bill Amount With Tip: $" + String.format("%.2f",total) + "\n\n")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    return builder.create();
                } else {

                }
            }
        }

       /* builder.setTitle("Total Calculated Bill Amount")
                .setMessage("Given Bill Amount: \n\n" +
                        "Calculated Tip Amount: \n\n" +
                        "Total Bill  Amount With Tip: ")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();*/


        return null;
    }
    public void setValue(Integer mode, Double bill, Double tip, Double splits)
    {
        this.mode = mode;
        this.bill = bill;
        this.tip = tip;
        this.splits = splits;
    }
}