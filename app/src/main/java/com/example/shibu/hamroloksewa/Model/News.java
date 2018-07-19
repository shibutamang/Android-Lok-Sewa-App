package com.example.shibu.hamroloksewa.Model;

/**
 * Created by Shibu on 4/19/2018.
 */

public class News {
    private String _title;
    private String _post;

    public News(String title, String post) {
        this._title = title;
        this._post = post;
    }

    public String getTitle() {
        return _title;
    }

    public String getPost() {
        return _post;
    }
}
