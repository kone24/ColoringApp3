package com.example.coloringapp2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class BellyView extends  SurfaceView{

    private PenguinModel model;
    Paint belly = new Paint();

    public BellyView(Context context, AttributeSet attrs){
        super(context,attrs);

        model = new PenguinModel();
        belly.setColor(model.bellyColor);
        belly.setStyle(Paint.Style.FILL);

        setWillNotDraw(false);
        setBackgroundColor(Color.TRANSPARENT);

    }

    public void drawBelly(Canvas canvas){
        RectF bodyRect = new RectF(model.bodyLeft+50.0f, model.penguinTop+300.0f, model.bodyLeft+model.bellyWidth+50.0f, model.penguinTop+model.penguinHeight-200.0f);
        canvas.drawOval(bodyRect, belly);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawBelly(canvas);
    }
    public PenguinModel getViewModel() { return this.model; }
}
