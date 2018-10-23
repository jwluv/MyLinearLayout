package com.lyna.www.mylinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v){
        Toast.makeText(this, "Button 1 is clicked", Toast.LENGTH_LONG).show();
    }
    public void onClick2(View v){
        Toast.makeText(this, "Button 2 is clicked", Toast.LENGTH_LONG).show();
    }
    public void onClick3(View v){
        Toast.makeText(this, "Button 3 is clicked", Toast.LENGTH_LONG).show();
    }

/*
    public void onClick(View v) {
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(this, "Button 1 is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "Button 2 is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "Button 3 is clicked", Toast.LENGTH_LONG).show();
                break;

        }

    }

 */

}
