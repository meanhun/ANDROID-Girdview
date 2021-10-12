package com.share4happy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.share4happy.adapter.BanAdapter;
import com.share4happy.model.Ban;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView _girdview;
    BanAdapter banAdapter;
    ArrayList<Ban> dsBan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addEvent();
        addControls();
    }

    private void addControls() {
        //Ánh xạ
        _girdview = findViewById(R.id.gird_view);
        dsBan.add(new Ban("Bàn số: 01",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 02",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 03",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 04",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 05",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 06",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 07",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 08",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 09",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 10",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 11",R.drawable.coffee_table_120px));
        dsBan.add(new Ban("Bàn số: 12",R.drawable.coffee_table_120px));

        banAdapter = new BanAdapter(
                MainActivity.this,R.layout.item_ban,dsBan
        );
        _girdview.setAdapter(banAdapter);
    }

    private void addEvent() {
    }
}