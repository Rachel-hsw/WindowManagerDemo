package com.demo.lijian.windowmanagerdemo.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by 李建 on 2016/9/19.
 */
public class ForeverMarqueeTextView extends TextView {
    public ForeverMarqueeTextView(Context context) {
        super(context);
    }

    public ForeverMarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ForeverMarqueeTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean isFocused() {

        return true;
    }
}
