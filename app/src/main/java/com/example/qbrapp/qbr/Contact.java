package com.example.qbrapp.qbr;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by monika.pejicic on 24.6.2015..
 */
public class Contact extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
