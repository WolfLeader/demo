package com.quincy.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 闪烁的TextView
 * @author quincy
 *
 */
public class TwinkleTextView extends TextView{

	private int mViewWidth = 0;
	 private Paint mPaint;
	 private LinearGradient mLinearGradient;
	 private Matrix mGradientMatrix;
	 private int mTranslate = 0;
	
	public TwinkleTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public TwinkleTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public TwinkleTextView(Context context) {
		super(context);
	}
	
	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		if(mViewWidth == 0){//为什么要是为0才执行该方法
			mViewWidth = getMeasuredWidth();
			mPaint = getPaint();
			mLinearGradient = new LinearGradient(0, 0, mViewWidth, 0, new int[]{
                    Color.BLUE, 0xffffffff,
                    Color.BLUE},null, TileMode.CLAMP);
			mPaint.setShader(mLinearGradient);
			mGradientMatrix = new Matrix();
		}
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		if (mGradientMatrix != null) {
            mTranslate += mViewWidth / 5;
            if (mTranslate > 2 * mViewWidth) {
                mTranslate = -mViewWidth;
            }
            mGradientMatrix.setTranslate(mTranslate, 0);
            mLinearGradient.setLocalMatrix(mGradientMatrix);
            postInvalidateDelayed(100);
        }
	}
	
}
