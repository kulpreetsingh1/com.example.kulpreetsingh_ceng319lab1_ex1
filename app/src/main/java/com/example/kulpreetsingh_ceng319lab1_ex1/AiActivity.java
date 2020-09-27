package com.example.kulpreetsingh_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

// Used the set text to display the text view or we can also use the append the append all the class notifcations using .append

public class AiActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ai_activity);
        text= (TextView)findViewById(R.id.activity);
        //Setting text in the TextView
        text.setText(getString(R.string.ai_tag)+getString(R.string.create));
    }

    //Life Cycles for AiActvity Class
    public void onStart()
    {
        super.onStart();
        text.setText(getString(R.string.ai_tag)+getString(R.string.start));
        Log.d(getString(R.string.ai_tag), getString(R.string.start));
    }

    public void onStop()
    {
        super.onStop();
        text.setText(getString(R.string.ai_tag)+getString(R.string.stop));
        Log.d(getString(R.string.ai_tag), getString(R.string.stop));
    }

    public void onDestroy()
    {
        super.onDestroy();
        text.setText(getString(R.string.ai_tag)+getString(R.string.destroy));
        Log.d(getString(R.string.ai_tag), getString(R.string.destroy));
    }

}