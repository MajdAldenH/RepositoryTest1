package com.majdalden.myapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i = 0;
        final Button but_test = findViewById(R.id.but_test);
        but_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i %2==0)
                but_test.setBackground(getDrawable(R.drawable.but_shape_test));
                else
                but_test.setBackground(getDrawable(R.drawable.but_shape));
                ++i;

            }
        });
    }
}
