package com.example.rkilaparthi.listviewexample;

/**
 * Created by rkilaparthi on 9/26/2016.
 */
public class ListData {

    private String title;
    private String description;
    private int image;

    public ListData(String title, int image, String description) {

        this.title = title;
        this.image = image;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
