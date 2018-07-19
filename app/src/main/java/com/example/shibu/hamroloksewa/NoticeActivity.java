package com.example.shibu.hamroloksewa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.shibu.hamroloksewa.Adapter.NoticeAdapter;
import com.example.shibu.hamroloksewa.Model.Notice;

import java.util.ArrayList;
import java.util.List;

public class NoticeActivity extends AppCompatActivity {

    NoticeAdapter noticeAdapter;
    List<Notice> mList;
    ListView noticeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Notices");

        noticeList = findViewById(R.id.topNotice);
        mList = new ArrayList<>();
        noticeAdapter = new NoticeAdapter(this, mList);

        noticeList.setAdapter(noticeAdapter);

        //prepare dummy notice data
        prepateNoticeData();
    }


    private void prepateNoticeData() {
        Notice notice1 = new Notice("B.Sc CSIT 4th sem result has published", "Tribhuwan University", R.drawable.anonym);
        mList.add(notice1);
        Notice notice2 = new Notice("Exam shedule for Lok sewa aayog", "Public Commision Service", R.drawable.tu);
        mList.add(notice2);
        Notice notice3 = new Notice("First paper of PCS exap review", "Anynomous Source", R.drawable.loksewa);
        mList.add(notice3);
        Notice notice4 = new Notice("Second paper of PCS exap review", "Public Commision Service", R.drawable.tu);
        mList.add(notice4);
        Notice notice5 = new Notice("Student Union of Nepal has announced for the strike again", "Anonymous Source", R.drawable.anonym);
        mList.add(notice5);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        finish();
    }


}
