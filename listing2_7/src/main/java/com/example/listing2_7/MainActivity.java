package com.example.listing2_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_PROGRESS );
        setContentView(R.layout.activity_main);

        setProgressBarVisibility( true );
        setProgress( 6000 );
    }
}
