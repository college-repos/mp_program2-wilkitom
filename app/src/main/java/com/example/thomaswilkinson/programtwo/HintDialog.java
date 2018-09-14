package com.example.thomaswilkinson.programtwo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

public class HintDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //Build dialog box
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //Dialog box inputs
        builder.setTitle("Instructions")
                .setMessage("Calculating Bill Total: Enter the bill amount, desired tip percentage, number of people splitting the bill, and press the first button.\n\n" +
                        "Calculating Rounded Bill Total: Enter the bill amount, desired tip percentage, number of people splitting the bill, and press the second button.\n\n" +
                        "Calculating Bill Total With Rounded Tip: Enter the bill amount, desired tip percentage, number of people splitting the bill, and press the third button.")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
