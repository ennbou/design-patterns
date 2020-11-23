package com.ennbou.composite.groups;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;

import com.ennbou.composite.shapes.ViewCustomized;

import java.util.ArrayList;
import java.util.List;

public class GroupVertical extends ViewGroup {


    public GroupVertical(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int count = getChildCount();


        int maxHeight = 0;
        int maxWidth = 0;

        measureChildren(widthMeasureSpec, heightMeasureSpec);

        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);

            int childRight;
            int childBottom;

            childRight = child.getMeasuredWidth();
            childBottom = child.getMeasuredHeight();

            maxWidth = Math.max(maxWidth, childRight);
            maxHeight = maxHeight + childBottom;

        }
        setMeasuredDimension(maxWidth+16, maxHeight+16);
    }


    @Override
    protected void onLayout(boolean changed, int l, int t,
                            int r, int b) {
        int count = getChildCount();

        int childLeft = 8;
        int childTop = 8;

        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            child.layout(childLeft, childTop,
                    childLeft + child.getMeasuredWidth(),
                    childTop + child.getMeasuredHeight());

            childTop += child.getMeasuredHeight();
        }
    }
}
