package com.example.coloringapp2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class FeetView extends SurfaceView {

    private PenguinModel model;
    Paint feet = new Paint();


    public FeetView(Context context, AttributeSet attrs){
        super(context,attrs);

        model = new PenguinModel();
        feet.setColor(model.feetColor);
        feet.setStyle(Paint.Style.FILL);

        setWillNotDraw(false);
        setBackgroundColor(Color.TRANSPARENT);
    }
    public void drawFeet(Canvas canvas){
        canvas.drawRect(model.bodyLeft-10.0f,model.penguinTop+model.penguinHeight-15.0f,model.bodyLeft+(model.bodyWidth/2)-3, model.penguinTop+model.penguinHeight+20.0f, feet);
        canvas.drawRect(model.bodyLeft+(model.bodyWidth/2)+3, model.penguinTop+model.penguinHeight-15.0f, model.bodyLeft+model.bodyWidth+10.0f, model.penguinTop+model.penguinHeight+20.0f, feet);
    }//drawFeet
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawFeet(canvas);
    }
    public PenguinModel getViewModel() { return this.model; }
}
