package com.example.rkilaparthi.listviewexample;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    TypedArray profile_pics;
    String[] title;
    String[] description;

    List<ListData> list;
    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<ListData>();
        profile_pics = getResources().obtainTypedArray(R.array.pics);
        title = getResources().getStringArray(R.array.title);
        description = getResources().getStringArray(R.array.description);

        for (int i = 0; i < title.length; i++) {
            ListData item = new ListData(title[i],
                    profile_pics.getResourceId(i,-1), description[i]);
            list.add(item);
        }

        mylistview = (ListView) findViewById(R.id.list_view);
        BaseAdapterActivity adapter = new BaseAdapterActivity(this, (ArrayList) list);
        mylistview.setAdapter(adapter);
        profile_pics.recycle();
    }
}