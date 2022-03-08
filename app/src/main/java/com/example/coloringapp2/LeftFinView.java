package com.example.coloringapp2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class LeftFinView extends SurfaceView {
    private PenguinModel model;
    Paint lFin = new Paint();


    public LeftFinView(Context context, AttributeSet attrs) {
        super(context, attrs);

        model = new PenguinModel();
        lFin.setColor(model.finColor);
        lFin.setStyle(Paint.Style.FILL);

        setWillNotDraw(false);
        setBackgroundColor(Color.TRANSPARENT);
    }

    public void drawLFin(Canvas canvas) {
        RectF leftfinRect = new RectF(model.bodyWidth + model.bodyLeft - 20.0f, model.penguinTop + (model.penguinHeight / 3), model.bodyWidth + model.bodyLeft + 60.0f, model.penguinTop + (model.penguinHeight / 4) * 3);
        canvas.drawOval(leftfinRect, lFin);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawLFin(canvas);
    }
    public PenguinModel getViewModel() { return this.model; }
}