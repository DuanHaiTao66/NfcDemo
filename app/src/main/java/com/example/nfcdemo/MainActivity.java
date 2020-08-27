package com.example.nfcdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends BaseNfcActivity {
  private static final String[] strs = new String[]{
            "自动运行程序(NDEF格式)"
            /*"自动打开网页(NDEF格式)",
            "读NFC标签中的文本数据(NDEF格式)",
            "写NFC标签中的文本数据(NDEF格式)",
            "读NFC标签中的Uri数据(NDEF格式)",
            "写NFC标签中的Uri数据(NDEF格式)",
            "读NFC标签非NDEF格式的数据(非NDEF格式)",
            "写NFC标签非NDEF格式的数据(非NDEF格式)"*/
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switchActivity(position);
            }
        });
    }

    private void switchActivity(int position) {
        switch (position) {
            case 0: //自动运行程序
                startActivity(new Intent(this, RunAppActivity.class));
                break;
            default:
                break;
        }
    }
}