package com.dominchan.loopbanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LoopViewPager viewpager;
    private List<View> viewList;
    private ImageView img1,img2,img3,img4,img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = getLayoutInflater();
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);


        img1 = new ImageView(this);
        img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img1.setLayoutParams(params);
        img1.setImageDrawable(getResources().getDrawable(R.drawable.img1));

        img2 = new ImageView(this);
        img2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img2.setLayoutParams(params);
        img2.setImageDrawable(getResources().getDrawable(R.drawable.img2));

        img3 = new ImageView(this);
        img3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img3.setLayoutParams(params);
        img3.setImageDrawable(getResources().getDrawable(R.drawable.img3));

        img4 = new ImageView(this);
        img4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img4.setLayoutParams(params);
        img4.setImageDrawable(getResources().getDrawable(R.drawable.img4));

        img5 = new ImageView(this);
        img5.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img5.setLayoutParams(params);
        img5.setImageDrawable(getResources().getDrawable(R.drawable.img5));

        viewList = new ArrayList<>();
        viewList.add(img1);
        viewList.add(img2);
        viewList.add(img3);
        viewList.add(img4);
        viewList.add(img5);
        viewpager = (LoopViewPager) findViewById(R.id.viewpager);
        viewpager.setAdapter(new LoopPagerAdapter(viewList));
        // 以下两个方法不是必须的，因为有默认值
        viewpager.setDirection(LoopViewPager.Direction.LEFT);// 设置播放方向
        viewpager.setCurrentItem(200); // 设置每个Item展示的时间

        viewpager.start(); // 开始轮播
    }
}
