package com.example.michael.mbesplug_reflex;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by Michael on 2015-10-04.
 */


public class ReactionInstructionsDialog extends DialogFragment {

    private Boolean clicked = false;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Add the buttons
        builder.setMessage(R.string.reaction_instructions).setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
                clicked = true;
            }
        });

        // Create the AlertDialog object and return it
        return builder.create();
    }

    public Boolean isClicked() {
        return clicked;
    }
}