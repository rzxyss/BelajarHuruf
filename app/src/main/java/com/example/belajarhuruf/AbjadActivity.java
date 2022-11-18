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
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AbjadActivity extends AppCompatActivity {

    ImageButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    Animation scaleUp,scaleDown;
    FloatingActionButton btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abjad);

        a = findViewById(R.id.btnA);
        b = findViewById(R.id.btnB);
        c = findViewById(R.id.btnC);
        d = findViewById(R.id.btnD);
        e = findViewById(R.id.btnE);
        f = findViewById(R.id.btnF);
        g = findViewById(R.id.btnG);
        h = findViewById(R.id.btnH);
        i = findViewById(R.id.btnI);
        j = findViewById(R.id.btnJ);
        k = findViewById(R.id.btnK);
        l = findViewById(R.id.btnL);
        m = findViewById(R.id.btnM);
        n = findViewById(R.id.btnN);
        o = findViewById(R.id.btnO);
        p = findViewById(R.id.btnP);
        q = findViewById(R.id.btnQ);
        r = findViewById(R.id.btnR);
        s = findViewById(R.id.btnS);
        t = findViewById(R.id.btnT);
        u = findViewById(R.id.btnU);
        v = findViewById(R.id.btnV);
        w = findViewById(R.id.btnW);
        x = findViewById(R.id.btnX);
        y = findViewById(R.id.btnY);
        z = findViewById(R.id.btnZ);
        btnKembali = findViewById(R.id.btnKembali);

//        Sound
        MediaPlayer aSound = MediaPlayer.create(this, R.raw.a);
        MediaPlayer bSound = MediaPlayer.create(this, R.raw.b);
        MediaPlayer cSound = MediaPlayer.create(this, R.raw.c);
        MediaPlayer dSound = MediaPlayer.create(this, R.raw.d);
        MediaPlayer eSound = MediaPlayer.create(this, R.raw.e);
        MediaPlayer fSound = MediaPlayer.create(this, R.raw.f);
        MediaPlayer gSound = MediaPlayer.create(this, R.raw.g);
        MediaPlayer hSound = MediaPlayer.create(this, R.raw.h);
        MediaPlayer iSound = MediaPlayer.create(this, R.raw.i);
        MediaPlayer jSound = MediaPlayer.create(this, R.raw.j);
        MediaPlayer kSound = MediaPlayer.create(this, R.raw.k);
        MediaPlayer lSound = MediaPlayer.create(this, R.raw.l);
        MediaPlayer mSound = MediaPlayer.create(this, R.raw.m);
        MediaPlayer nSound = MediaPlayer.create(this, R.raw.n);
        MediaPlayer oSound = MediaPlayer.create(this, R.raw.o);
        MediaPlayer pSound = MediaPlayer.create(this, R.raw.p);
        MediaPlayer qSound = MediaPlayer.create(this, R.raw.q);
        MediaPlayer rSound = MediaPlayer.create(this, R.raw.r);
        MediaPlayer sSound = MediaPlayer.create(this, R.raw.s);
        MediaPlayer tSound = MediaPlayer.create(this, R.raw.t);
        MediaPlayer uSound = MediaPlayer.create(this, R.raw.u);
        MediaPlayer vSound = MediaPlayer.create(this, R.raw.v);
        MediaPlayer wSound = MediaPlayer.create(this, R.raw.w);
        MediaPlayer xSound = MediaPlayer.create(this, R.raw.x);
        MediaPlayer ySound = MediaPlayer.create(this, R.raw.y);
        MediaPlayer zSound = MediaPlayer.create(this, R.raw.z);
//        EndSound

//AnimationOnTouch
        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);
//EndAnimationOnTouch

//OnTouch
        a.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    a.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    a.startAnimation(scaleDown);
                }

                return false;
            }
        });

        b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    b.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    b.startAnimation(scaleDown);
                }

                return false;
            }
        });

        c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    c.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    c.startAnimation(scaleDown);
                }

                return false;
            }
        });

        d.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    d.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    d.startAnimation(scaleDown);
                }

                return false;
            }
        });

        e.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    e.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    e.startAnimation(scaleDown);
                }

                return false;
            }
        });

        f.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    f.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    f.startAnimation(scaleDown);
                }

                return false;
            }
        });

        g.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    g.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    g.startAnimation(scaleDown);
                }

                return false;
            }
        });

        h.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    h.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    h.startAnimation(scaleDown);
                }

                return false;
            }
        });

        i.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    i.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    i.startAnimation(scaleDown);
                }

                return false;
            }
        });

        j.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    j.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    j.startAnimation(scaleDown);
                }

                return false;
            }
        });

        k.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    k.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    k.startAnimation(scaleDown);
                }

                return false;
            }
        });

        l.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    l.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    l.startAnimation(scaleDown);
                }

                return false;
            }
        });

        m.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    m.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    m.startAnimation(scaleDown);
                }

                return false;
            }
        });

        n.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    n.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    n.startAnimation(scaleDown);
                }

                return false;
            }
        });

        o.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    o.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    o.startAnimation(scaleDown);
                }

                return false;
            }
        });

        p.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    p.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    p.startAnimation(scaleDown);
                }

                return false;
            }
        });

        q.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    q.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    q.startAnimation(scaleDown);
                }

                return false;
            }
        });

        r.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    r.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    r.startAnimation(scaleDown);
                }

                return false;
            }
        });

        s.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    s.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    s.startAnimation(scaleDown);
                }

                return false;
            }
        });

        t.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    t.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    t.startAnimation(scaleDown);
                }

                return false;
            }
        });

        u.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    u.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    u.startAnimation(scaleDown);
                }

                return false;
            }
        });

        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    v.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    v.startAnimation(scaleDown);
                }

                return false;
            }
        });

        w.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    w.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    w.startAnimation(scaleDown);
                }

                return false;
            }
        });

        x.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    x.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    x.startAnimation(scaleDown);
                }

                return false;
            }
        });

        y.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    y.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    y.startAnimation(scaleDown);
                }

                return false;
            }
        });

        z.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    z.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    z.startAnimation(scaleDown);
                }

                return false;
            }
        });
//EndOnTouch

//OnClick
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aSound.start();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bSound.start();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cSound.start();
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dSound.start();
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eSound.start();
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fSound.start();
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gSound.start();
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hSound.start();
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iSound.start();
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jSound.start();
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kSound.start();
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lSound.start();
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSound.start();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nSound.start();
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oSound.start();
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pSound.start();
            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qSound.start();
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rSound.start();
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sSound.start();
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tSound.start();
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uSound.start();
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vSound.start();
            }
        });

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wSound.start();
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xSound.start();
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ySound.start();
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zSound.start();
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AbjadActivity.this, MainActivity.class));
                finish();
            }
        });
//EndOnClick


//Penutup Default
    }
}