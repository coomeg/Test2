package com.example.hiro.test2;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hiro on 2016/07/10.
 */
public class MyView extends ViewGroup {
    public MyView(Context context) {
        super(context);

        // TODO Auto-generated constructor stub
    }

    @Override
    public void addView(View view) {
        super.addView(view);
        int currentScreen = -1;
//        final int index = indexOfChild(view);
//        if (index > currentScreen) {
//            if (currentScreen > 0) {
//                view.setVisibility(View.GONE);//ÅöîÒï\é¶
//            }
//            currentScreen = index;
//            view.setVisibility(View.VISIBLE);//Åöï\é¶
//        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        // TODO Auto-generated method stub
        final int count = getChildCount();
        final int left = getLeft();
        final int top = getTop();
        final int right = getRight();
        final int bottom = getBottom();

        Log.d("left", new Integer(left).toString());
        Log.d("top", new Integer(top).toString());
        Log.d("right", new Integer(right).toString());
        Log.d("bottom", new Integer(bottom).toString());

        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != View.GONE) {
                view.layout(left, top, right, 1000);
            }
        }

        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int count = getChildCount();

        for(int i = 0; i < count; i++) {
            getChildAt(i).measure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
