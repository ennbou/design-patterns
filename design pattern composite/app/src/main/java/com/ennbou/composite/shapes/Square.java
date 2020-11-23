package com.ennbou.composite.shapes;

import android.content.Context;
import android.graphics.Canvas;


public class Square extends ViewCustomized {

    public Square(Context context, int width, int color) {
        super(context, width, width);
        setBackgroundColor(color);
    }

}
