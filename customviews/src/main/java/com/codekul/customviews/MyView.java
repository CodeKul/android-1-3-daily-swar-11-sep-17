package com.codekul.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by aniruddha on 3/10/17.
 */

public class MyView extends android.support.v7.widget.AppCompatTextView {

    private Paint paint;

    public MyView(Context context) {
        super(context);

        paint = new Paint();
        paint.setStrokeWidth(5.0f);
        paint.setColor(Color.RED);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        paint.setStrokeWidth(5.0f);
        paint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //canvas.drawCircle(200, 50, 100, paint);

        paint.setColor(Color.BLACK);
        for (int i = 10; i < 5000; i += 100) {
            canvas.drawLine(10, i, getWidth(), i, paint);
        }
        paint.setColor(Color.RED);
        canvas.drawLine(200, 0, 200, getHeight(), paint);
    }
}
