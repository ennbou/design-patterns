package com.ennbou.composite.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;


public class ViewCustomized extends View {

    public ViewCustomized(Context context, int width, int height) {
        super(context);
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(width, height);
        lp.setMargins(8, 8, 8, 8);
        setLayoutParams(lp);
    }


}

