package com.example.yuecheng.day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnFunction(View view){

        EditText edt1 = (EditText)findViewById(R.id.editText);
        System.out.println("Button clicked:" + edt1.getText());
        Log.i("Message", "Button clicked:" + edt1.getText());
    }

    public void tbtnFunction(View view){
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton);
        EditText edt1 = (EditText)findViewById(R.id.editText);
        if(tbt.getText().equals("Show")){
            edt1.setText("Day 3  class", EditText.BufferType.EDITABLE);
        }
        else {
            edt1.setText("N/A", EditText.BufferType.EDITABLE);
        }
    }
}
