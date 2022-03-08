package com.example.coloringapp2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class BeakView extends SurfaceView {

    private PenguinModel model;
    Paint beak = new Paint();

    public BeakView(Context context, AttributeSet attrs) {
        super(context, attrs);

        model = new PenguinModel();

        setWillNotDraw(false);
        setBackgroundColor(Color.TRANSPARENT);
    }

    public void drawBeak(Canvas canvas){

        beak.setColor(model.beakColor);
        Path path = new Path();
        path.moveTo(model.bodyLeft +(model.bodyWidth/2),580.0f);
        path.lineTo(model.bodyLeft +(model.bodyWidth/2) +70.0f, 580.0f);
        path.lineTo(model.bodyLeft +(model.bodyWidth/2), 650.0f);
        path.lineTo(model.bodyLeft +(model.bodyWidth/2)-70.0f,580.0f);
        path.close();
        canvas.drawPath(path, beak);



    }
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawBeak(canvas);
    }
    public PenguinModel getViewModel() { return this.model; }
}
