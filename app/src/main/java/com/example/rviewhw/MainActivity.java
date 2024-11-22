package com.example.rviewhw;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.elon_musk, "Elon Musk"));
        itemList.add(new Item(R.drawable.jeff_bezos, "Jeff Bezos"));
        itemList.add(new Item(R.drawable.linus_torvalds, "Linus Torvalds"));
        itemList.add(new Item(R.drawable.jensen_huang, "Jensen Huang"));
        itemList.add(new Item(R.drawable.lisa_su, "Lisa Su"));
        itemList.add(new Item(R.drawable.tim_cook, "Tim Cook"));

        adapter = new MyAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}