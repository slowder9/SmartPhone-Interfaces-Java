package com.company;

public class SmartPhone implements Spotify, TextMessaging, Comparable<SmartPhone> {

    int totalTexts;
    int size;

    public SmartPhone(int totalTexts, int size) {
        this.totalTexts = totalTexts;
        this.size = size;
    }

    public int compareTo(SmartPhone iPhone) {
        if (this.size > iPhone.size) {
            return -1;
        } else if (this.size < iPhone.size) {
            return 1;
        } else {
            return 0;
        }
    }

    public void playMusic() {
        System.out.println("do re mi");
    }

    public void sendText() {
        totalTexts += 1;
        System.out.println("Send text");
    }

    public void update() {
        System.out.println("Update available");
    }

    @Override
    public String toString() {
        return "This is dumb" + this.size;
    }
}
