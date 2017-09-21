package com.bwie.text;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 点击图片跳转进入新的activity展示大图（ImageView左右各留出50dp距离）并添加属性动画
 */
public class ImageActivity extends AppCompatActivity {

    private Button show_click;
    private ImageView imgshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        imgshow = (ImageView) findViewById(R.id.imgshow);
        Intent intent = this.getIntent();
        Bitmap bitmap = intent.getParcelableExtra("image");
        imgshow.setImageBitmap(bitmap);
        final ImageLoadingDialog dialog = new ImageLoadingDialog(this);
        dialog.show();
        // 两秒后关闭后dialog
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
            }
        }, 1000 * 2);
        show_click = (Button) findViewById(R.id.show_click);
        show_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_click_Ok();//点击按钮实现旋转图片
                show_click_Backgrond();//点击背景渐变
            }
        });
    }

    private void show_click_Backgrond() {
        final int RED = 0xffFF8080;
        final int BLUE = 0xff8080FF;
        ValueAnimator colorAnim = ObjectAnimator.ofInt(imgshow, "backgroundColor", RED, BLUE);
        colorAnim.setDuration(3000);
        colorAnim.setEvaluator(new ArgbEvaluator());
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();
    }

    private void show_click_Ok() {
        final RotateAnimation animation = new RotateAnimation(0.0f, 180.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(500);
        imgshow.startAnimation(animation);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        finish();
        return true;
    }
}
