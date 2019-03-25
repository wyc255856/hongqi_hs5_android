package com.faw.hs5demo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.faw.hs5.HS5ManuaApi;
import com.faw.hs5demo.R;

/**
 * Created by wyc on 2018/6/29.
 */

public class DemoActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }

    public void onClick(View view) {
        HS5ManuaApi.getInstance().openManua(this,"");
    }

}
