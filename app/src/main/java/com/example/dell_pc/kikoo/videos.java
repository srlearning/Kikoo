package com.example.dell_pc.kikoo;

import android.annotation.SuppressLint;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.jgabrielfreitas.core.BlurImageView;

import java.util.ArrayList;

public class videos extends AppCompatActivity implements View.OnClickListener {


    int[] flag = new int[26];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        replacefont.replacedefault(this,"DEFAULT","fonts/Nunito-SemiBold.ttf");


        setContentView(R.layout.activity_videos);
        ImageButton img1 = findViewById(R.id.imgview1);
        ImageButton img2 = findViewById(R.id.imgview2);
        ImageButton img3 = findViewById(R.id.imgview3);
        ImageButton img4 = findViewById(R.id.imgview4);
        ImageButton img5 = findViewById(R.id.imgview5);
        ImageButton img6 = findViewById(R.id.imgview6);
        ImageButton img7 = findViewById(R.id.imgview7);
        ImageButton img8 = findViewById(R.id.imgview8);
        ImageButton img9 = findViewById(R.id.imgview9);
        ImageButton img10 = findViewById(R.id.imgview10);
        ImageButton img11 = findViewById(R.id.imgview11);
        ImageButton img12 = findViewById(R.id.imgview12);
        ImageButton img13 = findViewById(R.id.imgview13);
        ImageButton img14 = findViewById(R.id.imgview14);
        ImageButton img15 = findViewById(R.id.imgview15);
        ImageButton img16 = findViewById(R.id.imgview16);
        ImageButton img17 = findViewById(R.id.imgview17);
        ImageButton img18 = findViewById(R.id.imgview18);
        ImageButton img19 = findViewById(R.id.imgview19);
        ImageButton img20 = findViewById(R.id.imgview20);
        ImageButton img21 = findViewById(R.id.imgview21);
        ImageButton img22 = findViewById(R.id.imgview22);
        ImageButton img23 = findViewById(R.id.imgview23);
        ImageButton img24 = findViewById(R.id.imgview24);
        ImageButton img25 = findViewById(R.id.imgview25);
        ImageButton img26 = findViewById(R.id.imgview26);
        TextView txt1 = findViewById(R.id.textView7);
        TextView txt2 = findViewById(R.id.textView8);
        ImageView pl = findViewById(R.id.play);
        final VideoView vid1 = findViewById(R.id.videoView);
        final MediaController ctlr1 = new MediaController(this);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);
        img13.setOnClickListener(this);
        img14.setOnClickListener(this);
        img15.setOnClickListener(this);
        img16.setOnClickListener(this);
        img17.setOnClickListener(this);
        img18.setOnClickListener(this);
        img19.setOnClickListener(this);
        img20.setOnClickListener(this);
        img21.setOnClickListener(this);
        img22.setOnClickListener(this);
        img23.setOnClickListener(this);
        img24.setOnClickListener(this);
        img25.setOnClickListener(this);
        img26.setOnClickListener(this);


        for(int i = 0; i<26;i++)
        {
            flag[i] = 0;
        }

        img1.setBackgroundResource(R.drawable.imgbuttonpress);
        txt1.setText("A");
        txt2.setText("Angry Anuja");
        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vid1.setVisibility(View.VISIBLE);
                getWindow().setFormat(PixelFormat.TRANSLUCENT);

                Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/A.mp4");
                vid1.setVideoURI(uri);
                ctlr1.setMediaPlayer(vid1);
                vid1.setMediaController(ctlr1);
                vid1.requestFocus();
                vid1.start();
            }
        });

    }

    @SuppressLint("CutPasteId")
    @Override
    public void onClick(View view) {

        final ImageView[] images = new ImageView[26];
        images[0] = findViewById(R.id.imgview1);
        images[1] = findViewById(R.id.imgview2);
        images[2] = findViewById(R.id.imgview3);
        images[3] = findViewById(R.id.imgview4);
        images[4] = findViewById(R.id.imgview5);
        images[5] = findViewById(R.id.imgview6);
        images[6] = findViewById(R.id.imgview7);
        images[7] = findViewById(R.id.imgview8);
        images[8] = findViewById(R.id.imgview9);
        images[9] = findViewById(R.id.imgview10);
        images[10] = findViewById(R.id.imgview11);
        images[11] = findViewById(R.id.imgview12);
        images[12] = findViewById(R.id.imgview13);
        images[13] = findViewById(R.id.imgview14);
        images[14] = findViewById(R.id.imgview15);
        images[15] = findViewById(R.id.imgview16);
        images[16] = findViewById(R.id.imgview17);
        images[17] = findViewById(R.id.imgview18);
        images[18] = findViewById(R.id.imgview19);
        images[19] = findViewById(R.id.imgview20);
        images[20] = findViewById(R.id.imgview21);
        images[21] = findViewById(R.id.imgview22);
        images[22] = findViewById(R.id.imgview23);
        images[23] = findViewById(R.id.imgview24);
        images[24] = findViewById(R.id.imgview25);
        images[25] = findViewById(R.id.imgview26);

        final TextView txt1 = findViewById(R.id.textView7);
        final TextView txt2 = findViewById(R.id.textView8);
        final VideoView vid = findViewById(R.id.videoView);
        final MediaController ctlr = new MediaController(this);
        final ImageView im = findViewById(R.id.imageView3);
        final ImageButton play = findViewById(R.id.play);

        final ImageButton img1 = findViewById(R.id.imgview1);
        ImageButton img2 = findViewById(R.id.imgview2);
        ImageButton img3 = findViewById(R.id.imgview3);
        ImageButton img4 = findViewById(R.id.imgview4);
        ImageButton img5 = findViewById(R.id.imgview5);
        ImageButton img6 = findViewById(R.id.imgview6);
        ImageButton img7 = findViewById(R.id.imgview7);
        ImageButton img8 = findViewById(R.id.imgview8);
        ImageButton img9 = findViewById(R.id.imgview9);
        ImageButton img10 = findViewById(R.id.imgview10);
        ImageButton img11 = findViewById(R.id.imgview11);
        ImageButton img12 = findViewById(R.id.imgview12);
        ImageButton img13 = findViewById(R.id.imgview13);
        ImageButton img14 = findViewById(R.id.imgview14);
        ImageButton img15 = findViewById(R.id.imgview15);
        ImageButton img16 = findViewById(R.id.imgview16);
        ImageButton img17 = findViewById(R.id.imgview17);
        ImageButton img18 = findViewById(R.id.imgview18);
        ImageButton img19 = findViewById(R.id.imgview19);
        ImageButton img20 = findViewById(R.id.imgview20);
        ImageButton img21 = findViewById(R.id.imgview21);
        ImageButton img22 = findViewById(R.id.imgview22);
        ImageButton img23 = findViewById(R.id.imgview23);
        ImageButton img24 = findViewById(R.id.imgview24);
        ImageButton img25 = findViewById(R.id.imgview25);
        ImageButton img26 = findViewById(R.id.imgview26);

        switch (view.getId())
        {
            case R.id.imgview1:

                for(int i = 0; i<26;i++)
                {
                    if(i==0)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }
                txt1.setText("A");
                txt2.setText("Angry Anuja");
                im.setImageResource(R.drawable.a);

                img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(flag[0]==1)
                    {vid.setVisibility(View.VISIBLE);
                    getWindow().setFormat(PixelFormat.TRANSLUCENT);

                    Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/A.mp4");
                    vid.setVideoURI(uri);
                    ctlr.setMediaPlayer(vid);
                    vid.setMediaController(ctlr);
                    vid.requestFocus();
                    vid.start();}
                    else {
                        im.setImageResource(R.drawable.a);
                        flag[0] = 1;
                        for(int i = 0; i<26;i++)
                        {
                            if(i==0)
                            {
                                flag[i] = 1;
                                images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                            }
                            else
                            {
                                flag[i] = 0;
                                images[i].setBackgroundResource(R.drawable.myimagebutton);
                            }
                        }
                    }
                }
            });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/A.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview2:
                txt1.setText("B");
                txt2.setText("Beautiful Bee");
                im.setImageResource(R.drawable.b);

                for(int i = 0; i<26;i++)
                {
                    if(i==1)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (flag[1]==1) {
                            vid.setVisibility(View.VISIBLE);
                            getWindow().setFormat(PixelFormat.TRANSLUCENT);

                            Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/B.mp4");
                            vid.setVideoURI(uri);
                            ctlr.setMediaPlayer(vid);
                            vid.setMediaController(ctlr);
                            vid.requestFocus();
                            vid.start();
                        }
                        else {
                            im.setImageResource(R.drawable.b);
                            flag[1] = 1;
                            for(int i = 0; i<26;i++)
                            {
                                if(i==1)
                                {
                                    flag[i] = 1;
                                    images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                                }
                                else
                                {
                                    flag[i] = 0;
                                    images[i].setBackgroundResource(R.drawable.myimagebutton);
                                }
                            }
                        }
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/B.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview3:
                txt1.setText("C");
                txt2.setText("Cute Cup");
                im.setImageResource(R.drawable.c);
                for(int i = 0; i<26;i++)
                {
                    if(i==2)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(flag[2]==1) {
                            vid.setVisibility(View.VISIBLE);
                            getWindow().setFormat(PixelFormat.TRANSLUCENT);

                            Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/C.mp4");
                            vid.setVideoURI(uri);
                            ctlr.setMediaPlayer(vid);
                            vid.setMediaController(ctlr);
                            vid.requestFocus();
                            vid.start();
                        }
                        else {
                            im.setImageResource(R.drawable.c);
                            flag[2] = 1;
                            for(int i = 0; i<26;i++)
                            {
                                if(i==2)
                                {
                                    flag[i] = 1;
                                    images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                                }
                                else
                                {
                                    flag[i] = 0;
                                    images[i].setBackgroundResource(R.drawable.myimagebutton);
                                }
                            }
                        }
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/C.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview4:
                txt1.setText("D");
                txt2.setText("Dancing Doll");
                im.setImageResource(R.drawable.d);

                for(int i = 0; i<26;i++)
                {
                    if(i==3)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(flag[3]==1) {
                            vid.setVisibility(View.VISIBLE);
                            getWindow().setFormat(PixelFormat.TRANSLUCENT);

                            Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/D.mp4");
                            vid.setVideoURI(uri);
                            ctlr.setMediaPlayer(vid);
                            vid.setMediaController(ctlr);
                            vid.requestFocus();
                            vid.start();
                        }
                        else {
                            im.setImageResource(R.drawable.d);
                            flag[3] = 1;
                            for(int i = 0; i<26;i++)
                            {
                                if(i==3)
                                {
                                    flag[i] = 1;
                                    images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                                }
                                else
                                {
                                    flag[i] = 0;
                                    images[i].setBackgroundResource(R.drawable.myimagebutton);
                                }
                            }
                        }
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/D.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview5:
                txt1.setText("E");
                txt2.setText("Ekta Elephant");
                im.setImageResource(R.drawable.e);

                for(int i = 0; i<26;i++)
                {
                    if(i==4)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(flag[4]==1) {
                            vid.setVisibility(View.VISIBLE);
                            getWindow().setFormat(PixelFormat.TRANSLUCENT);

                            Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/E.mp4");
                            vid.setVideoURI(uri);
                            ctlr.setMediaPlayer(vid);
                            vid.setMediaController(ctlr);
                            vid.requestFocus();
                            vid.start();
                        }
                        else {
                            im.setImageResource(R.drawable.e);
                            flag[4] = 1;
                            for(int i = 0; i<26;i++)
                            {
                                if(i==0)
                                {
                                    flag[i] = 1;
                                    images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                                }
                                else
                                {
                                    flag[i] = 0;
                                    images[i].setBackgroundResource(R.drawable.myimagebutton);
                                }
                            }
                        }
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/E.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview6:
                txt1.setText("F");
                txt2.setText("Flying Fish");
                im.setImageResource(R.drawable.f);

                for(int i = 0; i<26;i++)
                {
                    if(i==5)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(flag[5]==1) {
                            vid.setVisibility(View.VISIBLE);
                            getWindow().setFormat(PixelFormat.TRANSLUCENT);

                            Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/F.mp4");
                            vid.setVideoURI(uri);
                            ctlr.setMediaPlayer(vid);
                            vid.setMediaController(ctlr);
                            vid.requestFocus();
                            vid.start();
                        }
                        else {
                            im.setImageResource(R.drawable.f);
                            flag[5] = 1;
                            for(int i = 0; i<26;i++)
                            {
                                if(i==5)
                                {
                                    flag[i] = 1;
                                    images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                                }
                                else
                                {
                                    flag[i] = 0;
                                    images[i].setBackgroundResource(R.drawable.myimagebutton);
                                }
                            }
                        }
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/F.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview7:
                txt1.setText("G");
                txt2.setText("Giving Girl");
                im.setImageResource(R.drawable.g);

                for(int i = 0; i<26;i++)
                {
                    if(i==6)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(flag[6]==1) {
                            vid.setVisibility(View.VISIBLE);
                            getWindow().setFormat(PixelFormat.TRANSLUCENT);

                            Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/G.mp4");
                            vid.setVideoURI(uri);
                            ctlr.setMediaPlayer(vid);
                            vid.setMediaController(ctlr);
                            vid.requestFocus();
                            vid.start();
                        }
                        else {
                            im.setImageResource(R.drawable.g);
                            flag[6] = 1;
                            for(int i = 0; i<26;i++)
                            {
                                if(i==6)
                                {
                                    flag[i] = 1;
                                    images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                                }
                                else
                                {
                                    flag[i] = 0;
                                    images[i].setBackgroundResource(R.drawable.myimagebutton);
                                }
                            }
                        }
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/G.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview8:
                txt1.setText("H");
                txt2.setText("Helping Horse");
                im.setImageResource(R.drawable.h);

                for(int i = 0; i<26;i++)
                {
                    if(i==7)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(flag[7]==1) {
                            vid.setVisibility(View.VISIBLE);
                            getWindow().setFormat(PixelFormat.TRANSLUCENT);
                            Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/H.mp4");
                            vid.setVideoURI(uri);
                            ctlr.setMediaPlayer(vid);
                            vid.setMediaController(ctlr);
                            vid.requestFocus();
                            vid.start();
                        }
                        else {
                            im.setImageResource(R.drawable.h);
                            flag[7] = 1;
                            for(int i = 0; i<26;i++)
                            {
                                if(i==7)
                                {
                                    flag[i] = 1;
                                    images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                                }
                                else
                                {
                                    flag[i] = 0;
                                    images[i].setBackgroundResource(R.drawable.myimagebutton);
                                }
                            }
                        }
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);
                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/H.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview9:
                txt1.setText("I");
                txt2.setText("Itchy Ishan");
                im.setImageResource(R.drawable.i);

                for(int i = 0; i<26;i++)
                {
                    if(i==8)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/I.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/I.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview10:
                txt1.setText("J");
                txt2.setText("Jumping Jackfruit");
                im.setImageResource(R.drawable.j);

                for(int i = 0; i<26;i++)
                {
                    if(i==9)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/J.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/J.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview11:
                txt1.setText("K");
                txt2.setText("Kicking Kid");
                im.setImageResource(R.drawable.k);

                for(int i = 0; i<26;i++)
                {
                    if(i==10)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/K.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/K.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview12:
                txt1.setText("L");
                txt2.setText("Lazy Lalit");
                im.setImageResource(R.drawable.l);

                for(int i = 0; i<26;i++)
                {
                    if(i==11)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/L.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/L.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview13:
                txt1.setText("M");
                txt2.setText("Meenu Mango");
                im.setImageResource(R.drawable.m);

                for(int i = 0; i<26;i++)
                {
                    if(i==12)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/M.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/M.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview14:
                txt1.setText("N");
                txt2.setText("Naughty Neha");
                im.setImageResource(R.drawable.n);

                for(int i = 0; i<26;i++)
                {
                    if(i==13)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/N.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/N.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview15:
                txt1.setText("O");
                txt2.setText("Old Owl");
                im.setImageResource(R.drawable.o);

                for(int i = 0; i<26;i++)
                {
                    if(i==14)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/O.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/O.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview16:
                txt1.setText("P");
                txt2.setText("Pappu Parrot");
                im.setImageResource(R.drawable.p);

                for(int i = 0; i<26;i++)
                {
                    if(i==15)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/P.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/P.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview17:
                txt1.setText("Q");
                txt2.setText("Quiet Queen");
                im.setImageResource(R.drawable.q);

                for(int i = 0; i<26;i++)
                {
                    if(i==16)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/Q.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/Q.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview18:
                txt1.setText("R");
                txt2.setText("Red Rose");
                im.setImageResource(R.drawable.r);

                for(int i = 0; i<26;i++)
                {
                    if(i==17)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/R.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/R.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview19:
                txt1.setText("S");
                txt2.setText("Smiling Sun");
                im.setImageResource(R.drawable.s);

                for(int i = 0; i<26;i++)
                {
                    if(i==18)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/S.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/S.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview20:
                txt1.setText("T");
                txt2.setText("Talking Tommy");
                im.setImageResource(R.drawable.t);

                for(int i = 0; i<26;i++)
                {
                    if(i==19)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/T.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/T.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview21:
                txt1.setText("U");
                txt2.setText("Usha Umbrella");
                im.setImageResource(R.drawable.u);

                for(int i = 0; i<26;i++)
                {
                    if(i==20)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/U.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/U.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview22:
                txt1.setText("V");
                txt2.setText("Vijay Vulture");
                im.setImageResource(R.drawable.v);

                for(int i = 0; i<26;i++)
                {
                    if(i==21)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/V.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/V.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview23:
                txt1.setText("W");
                txt2.setText("Whistling Watermelon");
                im.setImageResource(R.drawable.w);

                for(int i = 0; i<26;i++)
                {
                    if(i==22)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/W.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/W.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview24:
                txt1.setText("X");
                txt2.setText("Max Fox");
                im.setImageResource(R.drawable.x);

                for(int i = 0; i<26;i++)
                {
                    if(i==23)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/X.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/X.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview25:
                txt1.setText("Y");
                txt2.setText("Yawning Yaseer");
                im.setImageResource(R.drawable.y);

                for(int i = 0; i<26;i++)
                {
                    if(i==24)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/Y.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/Y.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

            case R.id.imgview26:
                txt1.setText("Z");
                txt2.setText("Zipping Zero");
                im.setImageResource(R.drawable.z);

                for(int i = 0; i<26;i++)
                {
                    if(i==25)
                    {
                        flag[i] = 1;
                        images[i].setBackgroundResource(R.drawable.imgbuttonpress);
                    }
                    else
                    {
                        flag[i] = 0;
                        images[i].setBackgroundResource(R.drawable.myimagebutton);
                    }
                }

                img26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/Z.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        vid.setVisibility(View.VISIBLE);
                        getWindow().setFormat(PixelFormat.TRANSLUCENT);

                        Uri uri = Uri.parse("https://s3.ap-south-1.amazonaws.com/kikooeb1/eb1vids/Z.mp4");
                        vid.setVideoURI(uri);
                        ctlr.setMediaPlayer(vid);
                        vid.setMediaController(ctlr);
                        vid.requestFocus();
                        vid.start();
                    }
                });

                break;

        }
    }



    /*

    private void initRecyclerView(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.rcv1);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mImages);
        recyclerView.setAdapter(adapter);
    }*/

}
