package com.ennbou.composite.groups;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;


public class GroupeAbsolute extends ViewGroup {


    public GroupeAbsolute(Context context) {
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
        setMeasuredDimension(maxWidth, maxHeight);
    }


    @Override
    protected void onLayout(boolean changed, int l, int t,
                            int r, int b) {
        int count = getChildCount();

        int childLeft = 0;
        int childTop = 0;

        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            child.layout(childLeft, childTop,
                    childLeft + child.getMeasuredWidth(),
                    childTop + child.getMeasuredHeight());

            childLeft += child.getMeasuredWidth();
        }
    }
}

