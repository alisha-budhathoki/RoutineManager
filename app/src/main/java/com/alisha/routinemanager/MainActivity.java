package com.alisha.routinemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alisha.routinemanager.databinding.ActivityMainBinding;
import com.alisha.routinemanager.models.User;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //data binding
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(activityMainBinding.getRoot());
//        activityMainBinding.setMyVariable("sbadbsd");
        User user = new User("Yours truly", 16, true, "https://picsum.photos/250?image=9");
        activityMainBinding.setUser(user);
//        first way of handling onClick in data binding
//        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "123", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}