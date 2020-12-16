package com.example.day1215_zuoye_ycvedio2;

import android.app.Application;

import com.yc.kernel.factory.PlayerFactory;
import com.yc.kernel.impl.exo.ExoMediaPlayer;
import com.yc.kernel.impl.exo.ExoPlayerFactory;
import com.yc.kernel.impl.ijk.IjkPlayerFactory;
import com.yc.kernel.impl.ijk.IjkVideoPlayer;
import com.yc.kernel.impl.media.AndroidMediaPlayer;
import com.yc.kernel.impl.media.MediaPlayerFactory;

public class App extends Application {
    @Override
    public void onCreate() {
        PlayerFactory playerFactory = IjkPlayerFactory.create();
        IjkVideoPlayer ijkVideoPlayer = (IjkVideoPlayer) playerFactory.createPlayer(this);
        playerFactory = ExoPlayerFactory.create();
        ExoMediaPlayer exoMediaPlayer = (ExoMediaPlayer) playerFactory.createPlayer(this);
        playerFactory = MediaPlayerFactory.create();
        AndroidMediaPlayer androidMediaPlayer = (AndroidMediaPlayer) playerFactory.createPlayer(this);
        super.onCreate();
    }
}
