package com.example.dell_pc.kikoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class sign_up extends AppCompatActivity {

    private EditText RCode;
    private EditText CName;
    private EditText PName;
    private EditText DOB;
    private EditText Pincode;
    private EditText Email;
    private EditText Mobile;
    private EditText Password;

    public Button but3;

    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RetrofitInterface retrofitInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        replacefont.replacedefault(this, "DEFAULT", "fonts/Nunito-SemiBold.ttf");
        init();
    }

    public void init() {
        but3 = (Button) findViewById(R.id.button4);
        RCode = (EditText) findViewById(R.id.editText3);
        CName = (EditText) findViewById(R.id.editText6);
        PName = (EditText) findViewById(R.id.editText7);
        DOB = (EditText) findViewById(R.id.editText8);
        Pincode = (EditText) findViewById(R.id.editText9);
        Email = (EditText) findViewById(R.id.editText13);
        Mobile = (EditText) findViewById(R.id.editText12);
        Password = (EditText) findViewById(R.id.editText11);

        but3.setOnClickListener(v3 -> {
            registerUser(RCode.getText().toString(),CName.getText().toString(),PName.getText().toString(),DOB.getText().toString(),Pincode.getText().toString(),Email.getText().toString(),Mobile.getText().toString(),Password.getText().toString());
        });
    }


    public void registerUser(String RCode, String CName, String PName, String DOB, String Pincode, String Email, String Mobile, String Password){
        if(TextUtils.isEmpty(RCode)){
            Toast.makeText(this, "Rcode cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(CName)){
            Toast.makeText(this, "CName cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(PName)){
            Toast.makeText(this, "PName cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(DOB)){
            Toast.makeText(this, "DOB cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(Pincode)){
            Toast.makeText(this, "Pincode cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(Email)){
            Toast.makeText(this, "Email cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(Mobile)){
            Toast.makeText(this, "Mobile cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(Password)){
            Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        compositeDisposable.add(retrofitInterface.registerUser(RCode,CName,PName,DOB,Pincode,Email,Mobile,Password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String response) throws Exception {
                        Toast.makeText(sign_up.this, ""+response, Toast.LENGTH_SHORT).show();
                    }
                })
        );
        Log.d("check","point");
        Intent landing = new Intent(sign_up.this, landing.class);
        startActivity(landing);

    }
}


