package com.example.msi.websocketdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.msi.websocketdemo.websocket.WsManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WsManager.getInstance().init();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        WsManager.getInstance().disconnect();
    }
}
