package com.example.iossenac.appactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        LinearLayout layout = new LinearLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello Activity 2");
        layout.addView(textView);

        setContentView(layout);

    }
}
