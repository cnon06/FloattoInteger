package com.example.floattointeger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;

    public Integer Float_to_Integer (Float rr)
    {

        float ff = rr;
        int yy = (int) ff;
        
        return yy;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.Text1);

        display.setText(Float_to_Integer(12.56f).toString());

    }
}