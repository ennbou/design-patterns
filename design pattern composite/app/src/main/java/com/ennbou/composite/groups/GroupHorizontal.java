package com.ennbou.composite.groups;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.ennbou.composite.shapes.ViewCustomized;


public class GroupHorizontal extends ViewGroup {

    public GroupHorizontal(Context context) {
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

            maxWidth = maxWidth + childRight;
            maxHeight = Math.max(maxHeight, childBottom);

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

            childLeft += child.getMeasuredWidth();
        }
    }

}
