package com.keven.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.keven.mydrawer.BaseDragLayout;

/**
 * 作者：严旭文 on 2017/2/16 15:37
 * 邮箱：420255048@qq.com
 */
public class TextDragLayout extends BaseDragLayout {
    ImageView iv_cover;
    public TextDragLayout(Context context) {
        super(context);
    }

    public TextDragLayout(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public TextDragLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onViewStatus(boolean isOpen) {

    }

    @Override
    public void onViewOffset(float mOffset) {
        if(iv_cover!=null){
            iv_cover.setAlpha((float) (mOffset*0.5));
        }
    }

    @Override
    public void initView() {
        setContentView(findViewById(R.id.layout_drag));
        iv_cover= (ImageView) findViewById(R.id.iv_cover);
        iv_cover.setAlpha((float) (0));
    }
}
