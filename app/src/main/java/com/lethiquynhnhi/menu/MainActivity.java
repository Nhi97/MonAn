package com.lethiquynhnhi.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ListView lvMonAn;
    public ArrayList<MonAn> mangMonAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonAn = (ListView) findViewById(R.id.lv_menu);
        mangMonAn = new ArrayList<MonAn>();

        mangMonAn.add(new MonAn("Cold Starter",R.drawable.cold_starter));
        mangMonAn.add(new MonAn("Appetizers",R.drawable.appetizers));
        mangMonAn.add(new MonAn("Soup",R.drawable.soup));
        mangMonAn.add(new MonAn("Main Course",R.drawable.main_course));
        mangMonAn.add(new MonAn("Cheese & Biscuits",R.drawable.cheese_and_biscuits));
        mangMonAn.add(new MonAn("Dessert",R.drawable.dessert));

        MonAnAdapter anAdapter = new MonAnAdapter(
                MainActivity.this,
                R.layout.listmenu,
                mangMonAn
        );

        lvMonAn.setAdapter(anAdapter);
    }
}
