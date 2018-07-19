package com.example.shibu.hamroloksewa.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shibu.hamroloksewa.Model.Notice;
import com.example.shibu.hamroloksewa.R;

import java.util.List;

/**
 * Created by Shibu on 4/19/2018.
 */

public class NoticeAdapter extends BaseAdapter {

    private Context _context;
    private List<Notice> _mList;
    private TextView headLine, source;
    private ImageView icon;

    public NoticeAdapter(Context context, List<Notice> mList) {
        this._context = context;
        this._mList = mList;
    }

    @Override
    public int getCount() {
        return _mList.size();
    }

    @Override
    public Object getItem(int position) {
        return _mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(_context).inflate(R.layout.notice_item_view, parent, false);
        }
        headLine = convertView.findViewById(R.id.head);
        source = convertView.findViewById(R.id.source);
        icon = convertView.findViewById(R.id.logo);
        headLine.setText(_mList.get(position).getHeadLine());
        source.setText(_mList.get(position).getSource());
        icon.setImageResource(_mList.get(position).getIcon());
        return convertView;

    }
}
