package com.github.MaxWilmes1.ObjectOrientation.Interface.Challange;

public class Main {

    public static void main(String[] args) {
        Playable p1 = new MusicPlayer();
        Playable p2 = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(p1);
        mediaController.playMedia(p2);
    }
}
