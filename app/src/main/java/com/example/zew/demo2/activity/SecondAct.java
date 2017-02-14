package com.example.zew.demo2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zew.demo2.R;

/**
 * Created by zew on 16/11/21.
 */
public class SecondAct extends AppCompatActivity implements View.OnClickListener {

    private Button btn_sec_jum;
    private Activity mainActivity;
    private static String currentTime = "静态变量当前时间"+System.currentTimeMillis();

    private static String currentTimeTemp=currentTime+"/静态变量当前时间"+System.currentTimeMillis();
    private String TAG=SecondAct.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seclayout);
        btn_sec_jum = (Button) findViewById(R.id.btn_sec_jump);
        btn_sec_jum.setOnClickListener(this);
        int code = getIntent().getIntExtra("code",-1);

    }

    @Override
    public void onClick(View view) {
        finish();

          String vacurrentTime = "局部变量当前时间"+System.currentTimeMillis();

          String vacurrentTimeTemp=vacurrentTime+"/局部变量当前时间"+System.currentTimeMillis();
        Toast.makeText(SecondAct.this, currentTime, Toast.LENGTH_SHORT).show();
        Toast.makeText(SecondAct.this, currentTimeTemp, Toast.LENGTH_SHORT).show();
        int j=0;
        for (int i = 0; i < 1000; i++) {
            j=i+2;
        }
        Log.e(TAG,currentTime);
        Log.e(TAG,currentTimeTemp);
        Log.e(TAG,vacurrentTime);
        Log.e(TAG,vacurrentTimeTemp);


//        try {
//            mainActivity = (Activity) Class.forName("MainActivity").newInstance();
//            Log.e("tag",""+mainActivity);
//        } catch (InstantiationException e) {
//
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        Intent intent = new Intent(mainActivity,ThirdAct.class);
//        startActivity(intent);
    }
}
