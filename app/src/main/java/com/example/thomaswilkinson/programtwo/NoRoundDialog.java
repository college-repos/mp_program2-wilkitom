package com.example.thomaswilkinson.programtwo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;


public class NoRoundDialog extends AppCompatDialogFragment {
    Integer mode;
    Double tipAmount, total, bill, tip, splits;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Double tipPercent = tip/100;

        //Check values of each input, check for invalid inputs.
        if(bill < 0) {
            builder.setTitle("Error")
                    .setMessage("Please enter a valid value in field: Bill Amount.")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            return builder.create();

        }
        else if(tip < 0 || tip > 100) {
            builder.setTitle("Error")
                    .setMessage("Please enter a valid value in field: Tip Percent.")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            return builder.create();
        }
        else if(splits < 1) {
            builder.setTitle("Error")
                    .setMessage("Please enter a valid value in field: Splits.")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            return builder.create();
        }
        //All inputs valid
        else {
            //if button # 1 (i.e. mode 1) pressed
            if (mode == 1) {
                //bill is not being split
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
                    //bill is being split
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
            //if button # 2 (i.e. mode 2) pressed
            } else if (mode == 2) {
                //bill is not being split
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
                    //bill is being split
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
            //if button # 3 (i.e. mode 3) pressed
            } else if (mode == 3) {
                //bill is not being split
                if (splits == 1) {
                    tipAmount = bill*tipPercent;
                    Double roundedTipDbl;
                    Long roundedTip;
                    roundedTip = Math.round(tipAmount);
                    roundedTipDbl = Double.parseDouble(roundedTip.toString());
                    total = roundedTip + bill;
                    builder.setTitle("Total Calculated Bill Amount")
                            .setMessage("Total Bill: \n\n" +
                                    "Calculated Rounded Tip Amount: $" + String.format( "%.2f", roundedTipDbl) + "\n\n" +
                                    "Total Bill Amount With Tip: $" + String.format("%.2f",total) + "\n\n")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    return builder.create();
                } else {
                    //bill is being split
                    tipAmount = bill*tipPercent;
                    total = tipAmount + bill;
                    Double roundedTipDbl, totalSplits;
                    roundedTipDbl = tipAmount / splits;
                    Long roundedTip;
                    roundedTip = Math.round(roundedTipDbl);
                    roundedTipDbl = Double.parseDouble(roundedTip.toString());
                    totalSplits = roundedTipDbl + (bill/splits);
                    builder.setTitle("Total Calculated Bill Amount")
                            .setMessage("Total Bill: \n\n" +
                                    "Calculated Tip Amount: $" + String.format( "%.2f", tipAmount) + "\n\n" +
                                    "Total Bill Amount With Tip: $" + String.format("%.2f",total) + "\n\n" +
                                    "Bill Per Person: \n\n"+
                                    "Rounded Tip Amount per person: $" + String.format( "%.2f", roundedTipDbl) + "\n\n" +
                                    "Total Bill Amount With Rounded Tip per person: $" + String.format( "%.2f", totalSplits) + "\n\n")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    return builder.create();
                }
            }
        }
        return null;
    }
    public void setValue(Integer mode, Double bill, Double tip, Double splits)
    {
        //Takes values sent over from main activity, sets them inside fragment.
        this.mode = mode;
        this.bill = bill;
        this.tip = tip;
        this.splits = splits;
    }
}