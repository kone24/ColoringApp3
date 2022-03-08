package com.example.coloringapp2;

import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.util.Log;
import android.widget.SeekBar;

import com.example.coloringapp2.BodyView;


public class ColoringAppController implements View.OnTouchListener, View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    private View v;
    private PenguinModel aPengModel;
    private Object BodyView;


    public ColoringAppController(View s){
        v = s;
       // aPengModel = v.getViewModel()
    }

    @Override
    public void onClick(View view) {
        
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
