package com.example.dell_pc.kikoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class landing extends AppCompatActivity {

    public Button but4;
    public void init(){
        but4 = (Button)findViewById(R.id.button3);

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {

                Intent landing = new Intent(landing.this, videos.class);
                startActivity(landing);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing);
        replacefont.replacedefault(this,"DEFAULT","fonts/Nunito-SemiBold.ttf");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }
}
