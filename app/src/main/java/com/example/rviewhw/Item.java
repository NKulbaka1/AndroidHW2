package com.example.rviewhw;

public class Item {
    private int imageResId;
    private String name;

    public Item(int imageResId, String name) {
        this.imageResId = imageResId;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }
}