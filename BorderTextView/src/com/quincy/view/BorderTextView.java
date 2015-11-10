package com.quincy.view;

import com.quincy.bordertextview.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * 要实行这种效果可以有3种方式
 * 一种就是现在的自定义TextView
 * 另外一种比较简单，在TextView外边在包一个布局文件，通过resource设置该布局文件的边框
 * 最后一种是制作一个边框的图片，设置TextView的背景为制作好的边框图片
 * 
 * 含有边界框的TextView
 * 功能效果
 * 通过属性
 * 设置有无边界框
 * 设置边界框的宽度
 * 设置边界框的颜色
 * #####设置边界框的形状#####
 * 设置边界框为圆角的时候，可以设置圆角的大小
 * @author quincy
 *
 */
public class BorderTextView extends TextView{

    private Paint mPaint1, mPaint2;
    private boolean isBorderTextView;
    private int borderWidth;//边框的宽度
    private int borderColor;//边框的颜色
    private int roundSize;//圆角的大小
    private int borderTextViewBackGround ;//背景的颜色

    public BorderTextView(Context context) {
        super(context);
        initPaint();
    }

    public BorderTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray styles = context.obtainStyledAttributes(attrs,R.styleable.BorderTextView);
        isBorderTextView = styles.getBoolean(R.styleable.BorderTextView_isBorderTextView, false);
        borderWidth = styles.getInteger(R.styleable.BorderTextView_borderWidth, 1);
        borderColor = styles.getColor(R.styleable.BorderTextView_borderColor, 0);
        roundSize = styles.getInteger(R.styleable.BorderTextView_roundSize, 0);
        borderTextViewBackGround = styles.getColor(R.styleable.BorderTextView_borderTextViewBackGround, 0xFFF0F0F0);
        initPaint();
        styles.recycle();
    }

    public BorderTextView(Context context, AttributeSet attrs,
                      int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    @SuppressLint("InlinedApi")
	private void initPaint() {
        mPaint1 = new Paint();
        mPaint1.setAntiAlias(true);
        mPaint1.setColor(borderColor);//边框的颜色
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint2 = new Paint();
        mPaint2.setAntiAlias(true);
        mPaint2.setStyle(Paint.Style.FILL);
        mPaint2.setColor(borderTextViewBackGround);
    }

    @SuppressLint("DrawAllocation")
	@Override
    protected void onDraw(Canvas canvas) {
    	if(isBorderTextView){
    		roundRect(canvas);
    	}
        // 父类完成的方法，即绘制文本
        super.onDraw(canvas);
        
        if(isBorderTextView){
        	canvas.restore();//调用restore()方法，恢复到调用save()方法之前的状态。
        }
    }
    
    /**
     * 绘制边框
     * @param canvas
     */
    private void roundRect(Canvas canvas){
    	 // 绘制外层矩形
    	RectF rect = new RectF(0,0,getMeasuredWidth(),getMeasuredHeight());
        canvas.drawRoundRect(rect, roundSize, roundSize, mPaint1);
        // 绘制内层矩形
        RectF rect1 = new RectF(borderWidth,borderWidth, getMeasuredWidth() - borderWidth,getMeasuredHeight() - borderWidth);
        canvas.drawRoundRect(rect1, roundSize, roundSize, mPaint2);;
        canvas.save();//save()方法之后，可以对画布进行平移、旋转等操作
        // 绘制文字前平移0像素,可以不设置
        canvas.translate(0, 0);
    }
    
}
