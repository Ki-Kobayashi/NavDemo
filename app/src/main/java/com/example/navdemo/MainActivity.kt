package com.example.navdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navdemo.databinding.ActivityMainBinding

//  ======================   【VIewmodel：準備】  ======================
//  TODO:　★ .自作アニメ―ションの作成（例：遷移Animation）
//
//
//
//
//
//
//
//  .


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
