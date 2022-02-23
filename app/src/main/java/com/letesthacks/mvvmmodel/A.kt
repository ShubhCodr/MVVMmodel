package com.letesthacks.mvvmmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        intent.getStringArrayListExtra("name")
    }
}