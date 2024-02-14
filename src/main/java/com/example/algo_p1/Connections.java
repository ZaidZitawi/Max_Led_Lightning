package com.example.algo_p1;

import javafx.scene.image.ImageView;

public class Connections {
    private int ledNum;
    private int powerNum;
    private boolean connected;
    private ImageView imageView;

    public Connections() {
    }

    public Connections(int ledNum, int powerNum, boolean connected) {
        this.ledNum = ledNum;
        this.powerNum = powerNum;
        this.connected = connected;
    }
    public Connections(int ledNum, int powerNum, boolean connected, ImageView imageView) {
        this.ledNum = ledNum;
        this.powerNum = powerNum;
        this.connected = connected;
        this.imageView=imageView;
    }

    public int getLedNum() {
        return ledNum;
    }

    public void setLedNum(int ledNum) {
        this.ledNum = ledNum;
    }

    public int getPowerNum() {
        return powerNum;
    }

    public void setPowerNum(int powerNum) {
        this.powerNum = powerNum;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public ImageView getImageView() {return imageView;}

    public void setImageView(ImageView imageView) {this.imageView = imageView;}
}
