package com.example.dell_pc.kikoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgotpass extends AppCompatActivity {

    public Button but1;
    public void init(){
     but1 = (Button) findViewById(R.id.button5);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(forgotpass.this,MainActivity.class);
                startActivity(home);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass);
        replacefont.replacedefault(this,"DEFAULT","fonts/Nunito-SemiBold.ttf");
        init();
    }
}
