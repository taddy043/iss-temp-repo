package com.example.pyatnashki;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class GameView extends View {
    private Bitmap circle = BitmapFactory.decodeResource(getResources(), R.drawable.circle);
    private int viewWidth;
    private int viewHeight;
    private int points = 0;
    private float newX = 0;
    private float newY = 0;

    private Paint p;
    private final int timerInterval = 3000;

    private float radius = circle.getWidth()/2;
    public List<CircleHolder> circles;
    public int circleCount=5;


    public GameView(Context context) {
        super(context);
        p = new Paint();
        p.setAntiAlias(true);
        p.setTextSize(55.0f);
        p.setColor(Color.WHITE);
        new Timer().start();

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        viewWidth = w;
        viewHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint(canvas);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int eventAction = event.getAction();
        if (eventAction == MotionEvent.ACTION_UP) {
            newX = event.getX();
            newY = event.getY();
        }
        for(CircleHolder circle:circles) {
            if (!circle.isHit() && isInCircle(circle.getX(),circle.getY())) {
                circle.setHit(true);
                points += 10;
                invalidate();
            }
            else{
                invalidate();
            }

        }
        return true;
    }


    private void paint(Canvas canvas) {
        canvas.drawARGB(250, 127, 199, 255);
        for(CircleHolder circle1: circles){
            if (!circle1.isHit()) {
                canvas.drawBitmap(circle,circle1.getX()-radius,circle1.getY()-radius,p);
            }
            canvas.drawText(points + " tsp", viewWidth - 100, 70, p);
            Log.i("GAME", "painting...");
        }

    }

    private void update() {.
        circles=new ArrayList<CircleHolder>();
        for(int i=0; i<circleCount;i++){
            CircleHolder circle=new CircleHolder();
            circle.setHit(false);
            circle.setX((float) (Math.random()) * viewWidth);
            circle.setY((float) (Math.random()) * viewHeight);
            if(circle.getX()<radius){
                circle.setX(radius);
            }else if(circle.getX()>viewWidth-radius){
                circle.setX(viewWidth - radius);
            }
            if(circle.getY()<radius){
                circle.setY(radius);
            }else if(circle.getY()>viewHeight-radius){
                circle.setY(viewHeight-radius);
            }
            circles.add(circle);


            Log.i("GAME", "tick: x:" + circle.getX() + "; y:" + circle.getY());
        }
        invalidate();
    }




    private boolean isInCircle(float x, float y) {
        return Math.sqrt(Math.pow(x - newX, 2) + Math.pow(y - newY, 2)) <= radius;
    }


    public class Timer extends CountDownTimer {
        public Timer() {
            super(Integer.MAX_VALUE, timerInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            update();
        }

        @Override
        public void onFinish() {
        }
    }
}