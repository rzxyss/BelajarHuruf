package com.example.belajarhuruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AngkaActivity extends AppCompatActivity {

    ImageButton satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,nol;
    Animation scaleUp,scaleDown;
    FloatingActionButton btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        satu = findViewById(R.id.btn1);
        dua = findViewById(R.id.btn2);
        tiga = findViewById(R.id.btn3);
        empat = findViewById(R.id.btn4);
        lima = findViewById(R.id.btn5);
        enam = findViewById(R.id.btn6);
        tujuh = findViewById(R.id.btn7);
        delapan = findViewById(R.id.btn8);
        sembilan = findViewById(R.id.btn9);
        nol = findViewById(R.id.btn0);

        MediaPlayer satuSound = MediaPlayer.create(this,R.raw.satu);
        MediaPlayer duaSound = MediaPlayer.create(this,R.raw.dua);
        MediaPlayer tigaSound = MediaPlayer.create(this,R.raw.tiga);
        MediaPlayer empatSound = MediaPlayer.create(this,R.raw.empat);
        MediaPlayer limaSound = MediaPlayer.create(this,R.raw.lima);
        MediaPlayer enamSound = MediaPlayer.create(this,R.raw.enam);
        MediaPlayer tujuhSound = MediaPlayer.create(this,R.raw.tujuh);
        MediaPlayer delapanSound = MediaPlayer.create(this,R.raw.delapan);
        MediaPlayer sembilanSound = MediaPlayer.create(this,R.raw.sembilan);
        MediaPlayer nolSound = MediaPlayer.create(this,R.raw.nol);

        btnKembali = findViewById(R.id.btnKembali);

//AnimationOnTouch
        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);
//EndAnimationOnTouch

//        OnTouch
        satu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    satu.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    satu.startAnimation(scaleDown);
                }

                return false;
            }
        });

        dua.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    dua.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    dua.startAnimation(scaleDown);
                }

                return false;
            }
        });

        tiga.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    tiga.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    tiga.startAnimation(scaleDown);
                }

                return false;
            }
        });

        empat.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    empat.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    empat.startAnimation(scaleDown);
                }

                return false;
            }
        });

        lima.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    lima.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    lima.startAnimation(scaleDown);
                }

                return false;
            }
        });

        enam.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    enam.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    enam.startAnimation(scaleDown);
                }

                return false;
            }
        });

        tujuh.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    tujuh.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    tujuh.startAnimation(scaleDown);
                }

                return false;
            }
        });

        delapan.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    delapan.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    delapan.startAnimation(scaleDown);
                }

                return false;
            }
        });

        sembilan.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    sembilan.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    sembilan.startAnimation(scaleDown);
                }

                return false;
            }
        });

        nol.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    nol.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    nol.startAnimation(scaleDown);
                }

                return false;
            }
        });
//        EndOnTouch

//        OnClick
        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                satuSound.start();
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                duaSound.start();
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tigaSound.start();
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empatSound.start();
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limaSound.start();
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enamSound.start();
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tujuhSound.start();
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delapanSound.start();
            }
        });

        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sembilanSound.start();
            }
        });

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nolSound.start();
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AngkaActivity.this, MainActivity.class));
                finish();
            }
        });
//        EndOnClivk
    }
}