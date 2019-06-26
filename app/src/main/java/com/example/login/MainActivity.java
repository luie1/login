package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(token.token.equals("")){
            Intent in=new Intent(this,logInActivity.class);
            startActivity(in);
        }
        Toast.makeText(this, ""+token.token, Toast.LENGTH_SHORT).show();

    }
}
