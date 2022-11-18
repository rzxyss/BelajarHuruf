package com.example.belajarhuruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HijaiyahActivity extends AppCompatActivity {

    ImageButton alif,ba,ta,tsa,jim,ha,kha,dal,dzal,ro,za,sin,syin,shad,dhad,tha,zha,ain,ghain,fa,qaf,kaf,lam,mim,nun,wau,haa,lamalif,hamzah,ya;
    FloatingActionButton btnKembali;
    Animation scaleUp,scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);

        alif = findViewById(R.id.btnAlif);
        ba = findViewById(R.id.btnBa);
        ta = findViewById(R.id.btnTa);
        tsa = findViewById(R.id.btnTsa);
        jim = findViewById(R.id.btnJim);
        ha = findViewById(R.id.btnHa);
        kha = findViewById(R.id.btnKha);
        dal = findViewById(R.id.btnDal);
        dzal = findViewById(R.id.btnDzal);
        ro = findViewById(R.id.btnRa);
        za = findViewById(R.id.btnZa);
        sin = findViewById(R.id.btnSin);
        syin = findViewById(R.id.btnSyin);
        shad = findViewById(R.id.btnShad);
        dhad = findViewById(R.id.btnDhad);
        tha = findViewById(R.id.btnTha);
        zha = findViewById(R.id.btnZha);
        ain = findViewById(R.id.btnAin);
        ghain = findViewById(R.id.btnGhain);
        fa = findViewById(R.id.btnFa);
        qaf = findViewById(R.id.btnQaf);
        kaf = findViewById(R.id.btnKaf);
        lam = findViewById(R.id.btnLam);
        mim = findViewById(R.id.btnMim);
        nun = findViewById(R.id.btnNun);
        wau = findViewById(R.id.btnWau);
        haa = findViewById(R.id.btnHaa);
        lamalif = findViewById(R.id.btnLamalif);
        hamzah = findViewById(R.id.btnHamzah);
        ya = findViewById(R.id.btnYaa);

        btnKembali = findViewById(R.id.btnKembali);

//        Sound
        MediaPlayer alifSound = MediaPlayer.create(this, R.raw.alif);
        MediaPlayer baSound = MediaPlayer.create(this, R.raw.ba);
        MediaPlayer taSound = MediaPlayer.create(this, R.raw.ta);
        MediaPlayer tsaSound = MediaPlayer.create(this, R.raw.tsa);
        MediaPlayer jimSound = MediaPlayer.create(this, R.raw.jim);
        MediaPlayer haSound = MediaPlayer.create(this, R.raw.ha);
        MediaPlayer khaSound = MediaPlayer.create(this, R.raw.kha);
        MediaPlayer dalSound = MediaPlayer.create(this, R.raw.dal);
        MediaPlayer dzalSound = MediaPlayer.create(this, R.raw.dzal);
        MediaPlayer raSound = MediaPlayer.create(this, R.raw.ra);
        MediaPlayer zaSound = MediaPlayer.create(this, R.raw.za);
        MediaPlayer sinSound = MediaPlayer.create(this, R.raw.sin);
        MediaPlayer syinSound = MediaPlayer.create(this, R.raw.syin);
        MediaPlayer shadSound = MediaPlayer.create(this, R.raw.shad);
        MediaPlayer dhadSound = MediaPlayer.create(this, R.raw.dhad);
        MediaPlayer thaSound = MediaPlayer.create(this, R.raw.tha);
        MediaPlayer zhaSound = MediaPlayer.create(this, R.raw.zha);
        MediaPlayer ainSound = MediaPlayer.create(this, R.raw.ain);
        MediaPlayer ghainSound = MediaPlayer.create(this, R.raw.ghain);
        MediaPlayer faSound = MediaPlayer.create(this, R.raw.fa);
        MediaPlayer qafSound = MediaPlayer.create(this, R.raw.qaf);
        MediaPlayer kafSound = MediaPlayer.create(this, R.raw.kaf);
        MediaPlayer lamSound = MediaPlayer.create(this, R.raw.lam);
        MediaPlayer mimSound = MediaPlayer.create(this, R.raw.mim);
        MediaPlayer nunSound = MediaPlayer.create(this, R.raw.nun);
        MediaPlayer wauSound = MediaPlayer.create(this, R.raw.wau);
        MediaPlayer haaSound = MediaPlayer.create(this, R.raw.haa);
        MediaPlayer lamAlifSound = MediaPlayer.create(this, R.raw.lamalif);
        MediaPlayer hamzahSound = MediaPlayer.create(this, R.raw.hamzah);
        MediaPlayer yaSound = MediaPlayer.create(this, R.raw.ya);
//        EndSound

//AnimationOnTouch
        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);
//EndAnimationOnTouch

//        OnTOuch
        alif.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    alif.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    alif.startAnimation(scaleDown);
                }

                return false;
            }
        });

        ba.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ba.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ba.startAnimation(scaleDown);
                }

                return false;
            }
        });

        ta.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ta.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ta.startAnimation(scaleDown);
                }

                return false;
            }
        });

        tsa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    tsa.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    tsa.startAnimation(scaleDown);
                }

                return false;
            }
        });

        jim.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    jim.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    jim.startAnimation(scaleDown);
                }

                return false;
            }
        });

        ha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ha.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ha.startAnimation(scaleDown);
                }

                return false;
            }
        });

        kha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    kha.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    kha.startAnimation(scaleDown);
                }

                return false;
            }
        });

        dal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    dal.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    dal.startAnimation(scaleDown);
                }

                return false;
            }
        });

        dzal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    dzal.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    dzal.startAnimation(scaleDown);
                }

                return false;
            }
        });

        ro.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ro.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ro.startAnimation(scaleDown);
                }

                return false;
            }
        });

        za.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    za.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    za.startAnimation(scaleDown);
                }

                return false;
            }
        });

        sin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    sin.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    sin.startAnimation(scaleDown);
                }

                return false;
            }
        });

        syin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    syin.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    syin.startAnimation(scaleDown);
                }

                return false;
            }
        });

        shad.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    shad.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    shad.startAnimation(scaleDown);
                }

                return false;
            }
        });

        dhad.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    dhad.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    dhad.startAnimation(scaleDown);
                }

                return false;
            }
        });

        tha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    tha.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    tha.startAnimation(scaleDown);
                }

                return false;
            }
        });

        zha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    zha.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    zha.startAnimation(scaleDown);
                }

                return false;
            }
        });

        ain.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ain.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ain.startAnimation(scaleDown);
                }

                return false;
            }
        });

        ghain.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ghain.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ghain.startAnimation(scaleDown);
                }

                return false;
            }
        });

        fa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    fa.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    fa.startAnimation(scaleDown);
                }

                return false;
            }
        });

        qaf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    qaf.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    qaf.startAnimation(scaleDown);
                }

                return false;
            }
        });

        kaf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    kaf.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    kaf.startAnimation(scaleDown);
                }

                return false;
            }
        });

        lam.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    lam.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    lam.startAnimation(scaleDown);
                }

                return false;
            }
        });

        mim.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    mim.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    mim.startAnimation(scaleDown);
                }

                return false;
            }
        });

        nun.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    nun.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    nun.startAnimation(scaleDown);
                }

                return false;
            }
        });

        wau.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    wau.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    wau.startAnimation(scaleDown);
                }

                return false;
            }
        });

        haa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    haa.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    haa.startAnimation(scaleDown);
                }

                return false;
            }
        });

        lamalif.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    lamalif.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    lamalif.startAnimation(scaleDown);
                }

                return false;
            }
        });

        hamzah.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    hamzah.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    hamzah.startAnimation(scaleDown);
                }

                return false;
            }
        });

        ya.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ya.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ya.startAnimation(scaleDown);
                }

                return false;
            }
        });
//        EndTOuch

//        OnClick
        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alifSound.start();
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baSound.start();
            }
        });

        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taSound.start();
            }
        });

        tsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tsaSound.start();
            }
        });

        jim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jimSound.start();
            }
        });

        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                haSound.start();
            }
        });

        kha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                khaSound.start();
            }
        });

        dal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dalSound.start();
            }
        });

        dzal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dzalSound.start();
            }
        });

        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                raSound.start();
            }
        });

        za.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zaSound.start();
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinSound.start();
            }
        });

        syin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                syinSound.start();
            }
        });

        shad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shadSound.start();
            }
        });

        dhad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dhadSound.start();
            }
        });

        tha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thaSound.start();
            }
        });

        zha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zhaSound.start();
            }
        });

        ain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ainSound.start();
            }
        });

        ghain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ghainSound.start();
            }
        });

        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                faSound.start();
            }
        });

        qaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qafSound.start();
            }
        });

        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kafSound.start();
            }
        });

        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lamSound.start();
            }
        });

        mim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mimSound.start();
            }
        });

        nun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nunSound.start();
            }
        });

        wau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wauSound.start();
            }
        });

        haa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                haaSound.start();
            }
        });

        lamalif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lamAlifSound.start();
            }
        });

        hamzah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hamzahSound.start();
            }
        });

        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yaSound.start();
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HijaiyahActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}