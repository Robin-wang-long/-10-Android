package com.example.shiyan5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Random;

public class CanvasView extends View {
    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint1 = new Paint();

        for (int i = 0; i < 10; i++) {

            Paint paint = paint1;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            paint.setColor(Color.GREEN);
            paint.setTextSize(24);
            int x = (int) (Math.random()*600+200);
            int y = (int) (Math.random()*1000+100);
            int r = (int) (Math.random()*250 +20);
            canvas.save();
            canvas.translate(x,y);
            canvas.drawLine(0,0,r,0,paint);
            canvas.translate(r,0);
            canvas.rotate(144);
            canvas.drawLine(0,0,r,0,paint);
            canvas.translate(r,0);
            canvas.rotate(144);
            canvas.drawLine(0,0,r,0,paint);
            canvas.translate(r,0);
            canvas.rotate(144);
            canvas.drawLine(0,0,r,0,paint);
            canvas.translate(r,0);
            canvas.rotate(144);
            canvas.drawLine(0,0,r,0,paint);
            canvas.restore();
//            canvas.translate(r,0);
//            canvas.translate(-x,-y);\
        }

//        for (int i = 0; i < 10; i++) {
//
//            int x = (int) (Math.random()*(500-400+1)+400);
//
////            canvas.drawLine(2 * x, 5 * x, 8 * x, 5 * x, paint);
////            canvas.translate(2 * x, 5 * x);
////            canvas.rotate(36);
////            canvas.drawLine(0, 0, 6 * x, 0, paint);
////            canvas.translate(6 * x, 0);
////            canvas.rotate(36);
////            canvas.drawLine(0, 0, -6 * x, 0, paint);
////            canvas.translate(-6 * x, 0);
////            canvas.rotate(36);
////            canvas.drawLine(0, 0, 6 * x, 0, paint);
////            canvas.translate(6 * x, 0);
////            canvas.rotate(36);
////            canvas.drawLine(0, 0, -6 * x, 0, paint);
//        }
//        canvas.drawLine(10,100,300,100,paint);
//        canvas.drawLine(300,100, (float) (10-(Math.cos(36)*290)), (float) (100-(Math.sin(36)*290)),paint);
//        canvas.drawLine(10,100,100,(float) (100-(Math.cos(54)*290)),paint);
//        canvas.drawLine(10,(float) (100-(Math.cos(54)*90)),55,(float) (100-(Math.tan(36)*90))+(float)(Math.tan(72)*45),paint);
//        canvas.drawLine(100,(float) (100-(Math.tan(36)*90)),55,(float) (100-(Math.tan(36)*90))+(float)(Math.tan(72)*45),paint);
    }
    private void zhende(){

    }
}
