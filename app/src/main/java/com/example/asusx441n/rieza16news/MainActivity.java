package com.example.asusx441n.rieza16news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        /**called when the user taps the Send button */
        public void sendMessage2 (View view){
            //do something in response to button
            Intent intent = new Intent( this,Berita1.class);
            startActivity(intent);
        }


    public void sendMessage1 (View view){
        Intent intent = new Intent( this, berita2.class);
        startActivity(intent);
        //Do something in response to button

    }

}
