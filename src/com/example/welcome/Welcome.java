package com.example.welcome;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Welcome extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_welcome, menu);
        return true;
    }
}
