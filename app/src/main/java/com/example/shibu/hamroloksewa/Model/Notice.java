package com.example.shibu.hamroloksewa.Model;

import android.content.res.Resources;

/**
 * Created by Shibu on 4/19/2018.
 */

public class Notice {
    private String _headLine;
    private String _source;
    private int _icon;

    public Notice(String headLine, String source, int icon) {
        this._headLine = headLine;
        this._source = source;
        this._icon = icon;
    }

    public String getHeadLine() {
        return _headLine;
    }

    public String getSource() {
        return _source;
    }

    public int getIcon() {
        return _icon;
    }
}
