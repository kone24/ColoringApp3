package com.example.coloringapp2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.graphics.Path;

public class BodyView extends SurfaceView {


    private PenguinModel model;
    Paint body = new Paint();

    public BodyView (Context context, AttributeSet attrs) {
        super(context, attrs);

        model = new PenguinModel();

        body.setColor(model.bodyColor);
        body.setStyle(Paint.Style.FILL);


        setWillNotDraw(false);
        setBackgroundColor(Color.WHITE);
    }


        public void drawBody (Canvas canvas){
            RectF bodyRect = new RectF(model.bodyLeft, model.penguinTop, model.bodyLeft + model.bodyWidth, model.penguinTop + model.penguinHeight);
            canvas.drawOval(bodyRect, body);

        }//drawBody
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawBody(canvas);
    }

    public PenguinModel getViewModel() { return this.model; }
}
