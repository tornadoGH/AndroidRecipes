package com.example.listing2_9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature( Window.FEATURE_LEFT_ICON );
        setContentView(R.layout.activity_main);

        setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.icon );
    }
}
