package com.example.day1215_zuoye_ycvedio2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.yc.video.player.VideoPlayer;
import com.yc.video.ui.view.BasisVideoController;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private VideoPlayer vp_play;
    private static final String url = "http://vfx.mtime.cn/Video/2019/02/04/mp4/190204084208765161.mp4";
    private Button bnt_quanping;
    private Button bnt_tuichu;
    private Button bnt_xiaopin;
    private Button bnt_tuichuxiaopin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        vp_play = (VideoPlayer) findViewById(R.id.vp_play);
        //设置控制器
        BasisVideoController controller = new BasisVideoController(this);
        //设置控制器
        vp_play.setController(controller);
        //设置视频播放连接地址
        vp_play.setUrl(url);


        //延时播放
        vp_play.postDelayed(new Runnable() {
            @Override
            public void run() {
                //开始播放-----//注意避免直接start()，因为有可能视频还没有初始化完成……
                vp_play.start();
            }
        }, 3000);


        bnt_quanping = (Button) findViewById(R.id.bnt_quanping);
        bnt_quanping.setOnClickListener(this);
        bnt_tuichu = (Button) findViewById(R.id.bnt_tuichu);
        bnt_tuichu.setOnClickListener(this);
        bnt_xiaopin = (Button) findViewById(R.id.bnt_xiaopin);
        bnt_xiaopin.setOnClickListener(this);
        bnt_tuichuxiaopin = (Button) findViewById(R.id.bnt_tuichuxiaopin);
        bnt_tuichuxiaopin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bnt_quanping://进入全屏
                vp_play.startFullScreen();

                break;
            case R.id.bnt_tuichu://退出全屏
                vp_play.stopFullScreen();

                break;
            case R.id.bnt_xiaopin://开启小屏
                vp_play.startTinyScreen();

                break;
            case R.id.bnt_tuichuxiaopin://退出小屏
                vp_play.stopTinyScreen();
                break;
        }
    }
}