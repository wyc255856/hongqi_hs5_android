package com.faw.hs5.util;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.wyc.c217_car.R;

/**
 * Created by wyc on 18/3/23.
 */

public class DownloadZipAlert {
    private FrameLayout layout;
    private Context mContext;

    public DownloadZipAlert(Context context) {
        LayoutInflater inflaterDl = LayoutInflater.from(context);
        layout = (FrameLayout) inflaterDl.inflate(R.layout.hs5_alert_progress, null);
        dialog = new AlertDialog.Builder(context).create();
    }

    Dialog dialog;

    public void showAlert() {

        dialog.show();
        dialog.getWindow().setContentView(layout);

    }


    public void dismissAlert() {
        dialog.dismiss();
    }
}
