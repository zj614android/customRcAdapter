package android.zj.com.rcvheaderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
//https://github.com/zj614android/customRcAdapter.git
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rcv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL,false));
        List arr = new ArrayList();
        for (int i = 0; i < 15; i++) {
            arr.add("" + i);
        }

        MyAdapter mMyAdapter = new MyAdapter(MainActivity.this, R.layout.item_hot_phone_search, arr) {
            @Override
            public void convert(ViewHolder holder, Object position) {

            }
        };

        mRecyclerView.setAdapter(mMyAdapter);
    }

}
