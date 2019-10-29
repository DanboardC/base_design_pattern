package com.xyz.design.Adapter.ext;

import com.xyz.design.Adapter.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void palyVlc(String fileName) {

    }


    @Override
    public void palyMp4(String fileName) {
        System.out.println("Playing mp4 file. Name"+fileName);
    }
}
