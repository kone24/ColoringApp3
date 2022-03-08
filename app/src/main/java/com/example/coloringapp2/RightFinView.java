package com.example.coloringapp2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class RightFinView extends SurfaceView {

    private PenguinModel model;
    Paint rFin = new Paint();


    public RightFinView(Context context, AttributeSet attrs) {
        super(context, attrs);

        model = new PenguinModel();
        rFin.setColor(model.finColor);
        rFin.setStyle(Paint.Style.FILL);

        setWillNotDraw(false);
        setBackgroundColor(Color.TRANSPARENT);
    }

    public void drawRFin(Canvas canvas) {
        RectF rightfinRect = new RectF(model.bodyLeft - 60.0f, model.penguinTop + (model.penguinHeight / 3), model.bodyLeft + 20.0f, model.penguinTop + (model.penguinHeight / 4) * 3);
        canvas.drawOval(rightfinRect, rFin);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawRFin(canvas);
    }
    public PenguinModel getViewModel() { return this.model; }
}
