package com.example.dell_pc.kikoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    private EditText Email,Password;
    private Button signup,login;
    public TextView txt;

    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RetrofitInterface retrofitInterface;

    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replacefont.replacedefault(this,"DEFAULT","fonts/Nunito-SemiBold.ttf");


        Retrofit retrofitClient = RetrofitClient.getInstance();
        retrofitInterface = retrofitClient.create(RetrofitInterface.class);

        Email = findViewById(R.id.editText);
        Password = findViewById(R.id.editText2);

        login = findViewById(R.id.button);
        signup = findViewById(R.id.button2);
        txt = findViewById(R.id.textView3);

        login.setOnClickListener(v1 -> {

            loginUser(Email.getText().toString(),Password.getText().toString());

        });

        signup.setOnClickListener(v2 -> {

            Intent signup = new Intent(MainActivity.this,sign_up.class);
            startActivity(signup);
        });

        txt.setOnClickListener(view -> {
            Intent forgot = new Intent(MainActivity.this,forgotpass.class);
            startActivity(forgot);
        });

    }
    public void loginUser(String Email, String Password){
        if(TextUtils.isEmpty(Email)){
            Toast.makeText(this, "Email cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(Password)){
            Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        compositeDisposable.add(retrofitInterface.loginUser(Email,Password)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Consumer<String>() {
            @Override
            public void accept(String response) throws Exception {
                Toast.makeText(MainActivity.this, ""+response, Toast.LENGTH_SHORT).show();
            }
        })
        );
        Intent landing = new Intent(MainActivity.this,landing.class);
        startActivity(landing);

    }
}
